package Practic11;

import java.util.Arrays;

public class lesson8 {
    public static void main(String[] args) {
        int array[]= {2,3,3,2,6,3};
        int a=3;
        System.out.println(Arrays.toString(removeElement(array,a)));
    }
    public static  int[] removeElement(int array [],int a){
        int offset=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==a){
                offset++;
            }
            else{array[i-offset]=array[i];}
        }
        return Arrays.copyOf(array,array.length-offset);
    }
}
