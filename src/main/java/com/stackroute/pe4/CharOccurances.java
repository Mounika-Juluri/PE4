package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
Write a java program to count the total number of occurrences
of a given character in a string without using any loop?
For Example- Java is java again java again count number of
occurrence of a in the given string
*/
public class CharOccurances {
    public int checkChar(String givenString,String testChar){
        Pattern pattern = Pattern.compile(testChar);
        Matcher matcher = pattern.matcher(givenString);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
