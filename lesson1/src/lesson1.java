import java.util.*;

public class lesson1 {


        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            String c = scanner.nextLine();
            String a = scanner.nextLine();

            String d =scanner.nextLine ();
            char[] array = a.toCharArray();

            int b=Integer.parseInt(d);

            if(c.equals("enc")){
                encryption( array,b);
            }
            else{decryption(array,b);}


        }
        static void encryption (char[] array,int b){


            for (int i = 0; i < array.length; i++) {

                if ((int) array[i] + b > 122) {
                    int q = ((int) array[i] + b) - 122;
                    array[i] = (char) (96 + q);
                } else array[i] = (char) ((int) (array[i] + b));
            }
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
            }
        }
        static void decryption (char[] array,int b){

            for (int i = 0; i < array.length; i++) {

                if ((int) array[i] - b < 97) {
                    int q = (97 - (int) array[i] - b);
                    array[i] = (char) (122 - q);
                } else array[i] = (char) ((int) array[i] - b);
            }
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
            }
        }

    }

