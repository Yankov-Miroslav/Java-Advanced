import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateForNames_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        Predicate<String> checkForLength = number -> number.length() > n;

        List<String> names = Arrays.stream(in.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        names.removeIf(checkForLength);

        names.forEach(System.out::println);
    }
}
