package com.stackroute.pe4;
/*
Write a program to replace all d with f and all l with t in the given String
Input: daily dry
Output: faity fry
Original string: daily dry
New String: faity fry
*/
public class ReplaceChar {
    public String charReplace(String givenString) {
        String newStr = givenString.replace('d', 'f');
        String newString = newStr.replace('l', 't');
        return newString;
    }
}
