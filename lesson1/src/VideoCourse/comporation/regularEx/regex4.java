package VideoCourse.comporation.regularEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex4 {
    public static void main(String[] args) {
        String s1="2342323453459873923845989899";
        Pattern pat=Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})");
        Matcher mat=pat.matcher(s1);
        String newString=mat.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");
        System.out.println(newString);
    }
}
