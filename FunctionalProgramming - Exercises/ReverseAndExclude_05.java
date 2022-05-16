import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(in.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());

        int n = Integer.parseInt(in.nextLine());

        Collections.reverse(numbers);

        Predicate<Integer> checkDivision = number -> number % n == 0;

        numbers.removeIf(checkDivision);

        numbers.forEach(number -> System.out.print(number + " "));
    }
}
