package VideoCourse.comporation.regularEx;

import java.util.regex.*;

public class regex1 {
    public static void main(String[] args) {


    String s = "Hitman Absolution — это 5-я часть знаменитого стелс-экшена об Агенте 47" +
            ". Согласно сюжету, он впервые в жизни идет на задание в компании с " +
            "совестью... Просто ему поручили убить Диану, координатора организации," +
            " в которую rdfdfd@yandex.ru входит 47-й. Если так можно сказать, у киллера сложились с " +
            "+786543456 дружеские отношения, и ему не хочется отнимать у нее жизнь. " +
            "Однако она подозревается в предательстве, поэтому делать нечего." +
            " Также герою нужно забрать у Дианы девочку-подростка Викторию. " +
            "И вот здесь тоже все не так-то просто. Предсмертным пожеланием " +
            "коллеги было не отдавать Викторию агентству. И это только начало... " +
            "История сложная, интересная, местами драматичная";
        Pattern pat= Pattern.compile("\\w+@\\w+\\.(ru|com)");
        Matcher mat=pat.matcher(s);
        while(mat.find()){
            System.out.println(mat.group());
        }

}}