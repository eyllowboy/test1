package Practic12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ReadInFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file =new File("testFile");
        PrintWriter pw=new PrintWriter(file);
        pw.println("Hello");
        pw.println("World");
        pw.println("trollolo");
        pw.close();
    }
}
