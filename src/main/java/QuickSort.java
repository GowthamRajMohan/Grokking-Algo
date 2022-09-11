import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @project Grokking_algorithms
 * @name gowtham on 9/11/22
 */
public class QuickSort {
    public static void main(String[] args) {
        System.out.println(quickSort(Arrays.asList(10,5,2,3,7,0,1,9,8,1)));
    }

    public static List<Integer> quickSort(List<Integer> numbers) {
        if (numbers.size()< 2) {
            return numbers;
        } else {
            int pivot = numbers.get(0);

            List<Integer> smallList = numbers
                    .stream()
                    .skip(1)
                    .filter(e -> e <= pivot)
                    .collect(Collectors.toList());
            List<Integer> bigList =numbers
                    .stream()
                    .skip(1)
                    .filter(e -> e > pivot)
                    .collect(Collectors.toList());
            return Stream.of(
                    quickSort(smallList).stream(),
                    Stream.of(pivot),
                    quickSort(bigList).stream())
                    .flatMap(Function.identity()).collect(Collectors.toList());

        }
    }
}
