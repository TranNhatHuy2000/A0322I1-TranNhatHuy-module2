package ss17_String_Regex.baitap.ValidatePhone;

import java.util.regex.Pattern;

public class PhoneRegex {
    public static final String REGEX_PHONE ="^840+\\d{9}$";
    public static void validatePhone(String regex){
      //  Pattern pattern = Pattern.compile(regex);
        if (regex.matches(REGEX_PHONE)){
            System.out.println(regex +" : true");
        }else {
            System.out.println(regex +": false");
        }
    }

    public static void main(String[] args) {
        validatePhone("84065484587");
        validatePhone("840978489648");
        validatePhone("789546546545");
    }
}
