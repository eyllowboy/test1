package Task;

/*Программа должна выводить слово Yes для симметрич-
ного массива и слово No – для несимметричного. Симме-
тричным считается массив, в котором значения элементов с
конца равно значению элементов с начала. Массив задается
и инициализируется в начале программы.Примеры значений для симметричного массива:
1, 2, 3, 2, 1
2, 2, 3, 2, 2
1, 3, 2, 3, 1
5, 4, 3, 4, 5*/
public class Task12 {
    public static void main(String[] args) {
        int array[][] = {{1, 2, 3, 2, 1}, {1, 3, 4, 3, 1}, {1, 2, 3, 2, 1}, {2, 3, 4, 3, 2}};
        boolean bool = true;
        for (int i = 0; i < array.length; i++) {


            for (int k = 0, j = array[i].length - 1; k < (array[i].length / 2); k++, j--) {

                if (array[i][k] != array[i][j]){
                    bool = false;
                break;}
            }
            if (bool == false) break;
        }


        System.out.println(bool);
    }
}

