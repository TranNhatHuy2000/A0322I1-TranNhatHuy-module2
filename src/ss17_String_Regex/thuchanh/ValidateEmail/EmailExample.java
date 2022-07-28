package ss17_String_Regex.thuchanh.ValidateEmail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {

    private static Pattern pattern;

    public static final String EMAIL_REGEX = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";

    public EmailExample(){
         pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex){
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
