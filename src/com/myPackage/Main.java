package com.myPackage;


public class Main {
    public static void main(String... a) {

    }
    public static String calc(String expression){
        if(!expression.matches("([0-9]|10) ?[-+*/] ?([0-9]|10)"))
            throw new MyException("You have entered an invalid expression.");

        String[] chars = {"+", "-", "*", "/"};
        String[] regexChars = {"\\+", "-", "\\*", "/"};
        int charIndex = -1;
        int result = 0;

        for (int i = 0; i < regexChars.length; i++){
            if(expression.contains(chars[i])){
                charIndex = i;
                break;
            }
        }

        String[] data = expression.split("\\s*" + regexChars[charIndex] + "\\s*");
        int firstNum = Integer.parseInt(data[0]);
        int secondNum = Integer.parseInt(data[1]);

        if(secondNum == 0 && chars[charIndex].equals("/"))
            throw new MyException("You cannot divide by zero.");

        switch(chars[charIndex]){
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "/":
                result = firstNum / secondNum;
                break;
        }
        return String.valueOf(result);
    }
}
class MyException extends RuntimeException{
    public MyException(String message) {
        super(message);
    }
}


