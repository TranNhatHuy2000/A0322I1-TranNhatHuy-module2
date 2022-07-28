package ss17_String_Regex.baitap.ValidateNameClass;

import java.util.regex.Pattern;

public class NameClass {
    public static final String REGEX_NAME ="^[ACP]\\d{4}[GHIKLM]$";
    public static void validateName(String regex){
        Pattern pattern = Pattern.compile(regex);
        if (regex.matches(REGEX_NAME)){
            System.out.println(regex +" : true");
        }else {
            System.out.println(regex +": false");
        }
    }

    public static void main(String[] args) {
        validateName("C0318G");
        validateName("M0318G");
        validateName("P0323A");
    }
}

