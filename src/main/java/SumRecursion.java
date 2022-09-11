import java.util.Arrays;

public class SumRecursion {

    public static void main(String[] args) {
        int [] arr = {1,2,4,8,10};
        System.out.println(sum(arr));
    }

    public static int sum(int [] arr) {
        if (arr.length == 0) {
            return 0;
        } else {
            return arr[0] + sum(Arrays.copyOfRange(arr, 1, arr.length));
        }
    }
}
