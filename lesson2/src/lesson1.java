import javax.swing.*;
import java.sql.SQLOutput;
import java.io.IOException;
public class lesson1 {

        public static void main(String[] args) throws IOException {
            int[] inputArray = { 4, 4, 4, 2, 3, 1, 1, 4, 0, 0 };
            for (int i = 0; i < inputArray.length; i++) {
                int currentElementCount = 1;
                for (int j = i + 1; j < inputArray.length; j++) {
                    if (inputArray[i] != inputArray[j]) {
                        break;
                    }
                    currentElementCount++;
                }
                System.out.print(inputArray[i] + " - " + currentElementCount + "; ");
                i += currentElementCount - 1;
            }
        }

}
