package VideoCourse.comporation.work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лут размышлял я над жизню зимной. Непонятного нет для меня под луной.\n" +
                "Мне известно, что мне ничего не известно! Вот последняя правда, открытая мной.";
        String s="privet";
        FileWriter writer=null;
        try {
            writer = new FileWriter("D:\\test1.txt",true);
            for (int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }
    }
}
