import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharOccurances {
    public int checkChar(String str,String testChar){
        Pattern pattern = Pattern.compile(testChar);
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;


    }

}
