package com.stackroute.pe4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
Write a program to find out the multiple occurrences of the given word in a string using Matcher methods.
 Input : She sells seashells by the seashore
 Given word: se
 Output :
        Found at: 4 - 6
        Found at: 10 - 12
       Found at: 27 - 29
*/
public class MultiOccurances {
    public String findword(String givenString){
        Pattern pattern = Pattern.compile("se");
        Matcher matcher = pattern.matcher(givenString);
        //int count = 0;
        String finalString="";
        while (matcher.find()) {
            finalString=finalString+"found at:"+matcher.start()+"-"+matcher.end();
        }
        return finalString;
    }
}
