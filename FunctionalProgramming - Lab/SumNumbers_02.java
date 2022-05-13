import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class SumNumbers_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        Function<String, Integer> countIntegersInString = str -> str.split(", ").length;

        Function<String, Integer> sumIntegersInString = str ->
                Arrays.stream(str.split(", "))
                        .mapToInt(Integer::parseInt)
                        .sum();

        System.out.println("Count = " + countIntegersInString.apply(input));
        System.out.println("Sum = " + sumIntegersInString.apply(input));

    }
}
