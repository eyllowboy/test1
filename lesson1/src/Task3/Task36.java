package Task3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemAlreadyExistsException;

public class Task36 {
    static void testing(XmlReader[]reader) throws IOException {
        for (XmlReader r:reader){
            try {
                r.read();
            } catch (FileSystemAlreadyExistsException e) {
                throw new FileNotFoundException();
            }
        }
    }

    public static void main(String[] args) {
        XmlReader [] r={new XmlReader(),new XmlReader(),new XmlReader()};
        try {
            testing(r);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
