package com.stackroute.pe4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
Write a program with the implementation of Regular Expression to find the presence of the name Harry in a string.
Input: This is Harry.
Output: Is Harry here ? true
Input : This is Henry.
Output: Is Harry here ? false
*/
public class FindWord {
    public Boolean findHarry(String str){
        Pattern pattern = Pattern.compile("Harry");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        if(count>0){
            return true;
        }else{
            return false;
        }
    }
}
