public class BinarySearch {

    public static void main(String[] args) {
        int [] arr = {1,3,5,7,9};
        System.out.println(getPosition(arr,2));
    }

    public static int getPosition(int[] array, int value){
        if (array.length == 0){
            return -1;
        }

        int low = 0;
        int high = array.length-1;

        while(low<=high){
            int mid = (low + high)/2;
            int guess = array[mid];
            if (guess == value) {
                return mid;
            } else if (guess > value) {
                high = mid - 1;
            }else if (guess < value){
                low = mid + 1;
            }
        }
        return -1;
    }

}
