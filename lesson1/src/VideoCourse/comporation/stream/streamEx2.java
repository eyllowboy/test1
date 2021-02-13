package VideoCourse.comporation.stream;

import java.util.Arrays;

public class streamEx2 {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};
        Arrays.stream(array).forEach(el->{el*=2;
            System.out.println(el);});
    }
}
