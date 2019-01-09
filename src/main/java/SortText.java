
import java.util.Arrays;


public class SortText {

    public String stringSort(String str){
        String[] strArray=str.split("\\s");
        String sortedStr="";
        Arrays.sort(strArray);
        for(int i = 0; i < strArray.length; i++)
            sortedStr=sortedStr+strArray[i]+" ";
        return sortedStr;
    }

}
