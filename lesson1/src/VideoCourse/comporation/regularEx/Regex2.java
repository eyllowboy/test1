package VideoCourse.comporation.regularEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
    //String s1="ABCD ABCE ABCFABCGABCH";
        String s1="ABLCOO5UKJH  ABC& ABCF ANBF";
    Pattern pattern1=Pattern.compile("\\w{4}");
    Matcher matcher=pattern1.matcher(s1);

    while (matcher.find()){
        System.out.println("Position "+matcher.start()+" "+matcher.group());
    }



    }
}
