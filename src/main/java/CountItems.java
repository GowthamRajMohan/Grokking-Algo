import java.util.Arrays;

/**
 * @project Grokking_algorithms
 * @name gowtham on 9/11/22
 */
public class CountItems {
    public static void main(String[] args) {
        System.out.println(count(new int[] {1,3,5,9,6,5}));
    }

    public static int count(int [] arr){
        if (arr.length == 0) {
            return 0;
        } else {
            return 1 + count(Arrays.copyOfRange(arr, 1, arr.length));
        }
    }
}
