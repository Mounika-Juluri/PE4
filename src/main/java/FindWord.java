import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
