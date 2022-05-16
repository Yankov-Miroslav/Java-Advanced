import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class FindTheSmallestElement_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(in.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Consumer<List<Integer>> printMinElement = list -> {
            int min = Collections.min(list);
            System.out.println(list.lastIndexOf(min));
        };

        printMinElement.accept(numbers);
    }
}
