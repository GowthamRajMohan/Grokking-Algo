import java.util.Arrays;

/**
 * @project Grokking_algorithms
 * @name gowtham on 9/11/22
 */
public class MaxNumberInList {
    public static void main(String[] args) {
        System.out.println(maxNumber(new int [] {1,5,10,25,16,1}));
    }

    public static int maxNumber(int [] arr) {
        if (arr.length == 2) {
            return arr [0] > arr [1] ? arr [0] : arr [1];
        } else {
            int subMax = maxNumber(Arrays.copyOfRange(arr, 1, arr.length));
            return arr[0] > subMax ? arr[0] : subMax;
        }
    }
}
