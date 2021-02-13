package Task3;



public class Task34 {
    public static void main(String[] args) {
        int array[]= {1,2,3,10,5,6,8};
        int element=4;
        int result;
        try {
           result=binarySearch(array,element);
            System.out.println(result);
        } catch (CheckException e) {
            e.printStackTrace();
        }
    }

    static int binarySearch(int[] array, int element) throws CheckException {
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                throw new CheckException();
            }
        }
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;
        while (startIndex <= endIndex) {
            middleIndex = startIndex + (endIndex - startIndex) / 2;
            if (array[middleIndex] == element) {
                return middleIndex;
            }
            if (array[middleIndex] > element) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }


        }
        return -1;

    }
}

