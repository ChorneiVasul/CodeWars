package com.stringbuilder;
import java.lang.StringBuilder;
class Solution{

    static String toCamelCase(String s){
        StringBuilder stringBuilder = new StringBuilder(s);
     while (stringBuilder.indexOf("-")!=-1){
         stringBuilder.deleteCharAt(stringBuilder.indexOf("-"));
       }
       while (stringBuilder.indexOf("_")!=-1){
         stringBuilder.deleteCharAt(stringBuilder.indexOf("_"));
       }

        return stringBuilder.toString();
    }
}