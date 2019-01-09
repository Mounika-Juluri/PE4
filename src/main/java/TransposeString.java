public class TransposeString {
    public String transposeStr(String str){
        String[] strArray =str.split("\\s");
        String finalStr="";
        for(String a:strArray){
            String reverse="";
               for (int i=a.length()-1;i>=0;i--){
                   reverse=reverse+a.charAt(i);
               }
               finalStr=finalStr+reverse+" ";
        }
        return finalStr;
    }

}
