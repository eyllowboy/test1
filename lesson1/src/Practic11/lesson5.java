package Practic11;

public class lesson5 {
    public static void main(String[] args) {
        System.out.println(chisla.summaChisel(4,8));
    }

}
class chisla{
    static int summaChisel(int a,int b){
        int sum=0;
        for(int i=a; i<b;i++){
            sum+=i;
        }
        return sum;
    }
}