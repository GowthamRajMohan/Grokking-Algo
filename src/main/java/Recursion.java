public class Recursion {

    public static void main(String[] args) {
        System.out.println(getFactorial(5));
    }

    private static int getFactorial(int number){
        if (number == 1) {
            return 1;
        } else {
            return number * getFactorial(number - 1);
        }

    }
}
