package VideoCourse.comporation.work_with_files;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("D:\\playstation5.jpg"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("java_play.jpg"));) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
//            String line;
//            while((line= reader.readLine())!=null){
//                writer.write(line);
//            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
