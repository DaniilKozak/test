package com.babaev.myPackage;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String... args){
        List<String> nums = Arrays.asList("one", "two", "three");
        printList(nums);
    }
    
    public static void printList(List<?> list){
        System.out.println(list);
    }
}
