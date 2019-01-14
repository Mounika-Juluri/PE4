package com.stackroute.pe4;
import java.util.Arrays;
/*
Write a program that sets up a String variable containing a paragraph of text of your choice.
a. Extract the words from the text and sort them into alphabetical order.
b. Display the sorted list of words.
*/
public class SortText {
    public String stringSort(String givenString){
        String[] stringArray=givenString.split("\\s");
        String sortedStr="";
        Arrays.sort(stringArray);
        for(int i = 0; i < stringArray.length; i++)
            sortedStr=sortedStr+stringArray[i]+" ";
        return sortedStr;
    }
}
