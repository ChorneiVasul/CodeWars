package com.stringbuilder;

public class SolutionTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("the_Stealth-Warrior");
        stringBuilder.deleteCharAt(stringBuilder.indexOf("_"));
        System.out.println(stringBuilder.toString());
    }
}