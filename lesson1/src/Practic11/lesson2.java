package Practic11;

public class lesson2 {
    public static void main(String[] args) {

        line.chetny(5,33);
    }

}
class line{

   static void  chetny(int x,int y){
        for (int i=x;i<=y;i++) {


            if (i % 2 == 0) {
                System.out.print(i+" ");
            }

        }

    }
}