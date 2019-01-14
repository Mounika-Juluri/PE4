package com.stackroute.pe4;
/*
Write a program to transpose the given string.
Input String : a quick brown fox jumps over the lazy dog
Output String: a  kciuq  nworb  xof  spmuj  revo  eht  yzal  god
*/
public class TransposeString {
    public String transposeStr(String givenString){
        String[] stringArray =givenString.split("\\s");
        String finalString="";
        for(String a:stringArray){
            String reverse="";
               for (int i=a.length()-1;i>=0;i--){
                   reverse=reverse+a.charAt(i);
               }
               finalString=finalString+reverse+" ";
        }
        return finalString;
    }
}
