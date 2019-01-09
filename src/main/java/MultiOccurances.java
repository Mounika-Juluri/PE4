import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultiOccurances {
    public String findword(String str){
        Pattern pattern = Pattern.compile("se");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        String finalStr="";
        while (matcher.find()) {
            finalStr=finalStr+"found at:"+matcher.start()+"-"+matcher.end();
        }

        return finalStr;
    }
}
