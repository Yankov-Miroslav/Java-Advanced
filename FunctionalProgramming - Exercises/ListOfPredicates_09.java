import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class ListOfPredicates_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        List<Integer> numbersForDivision = Arrays.stream(in.nextLine()
                .split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        BiFunction<List<Integer>, Integer, Boolean> isDivisible = ((list, number) -> {
            for (int numberInList : list) {
                if (number % numberInList != 0) {
                    return false;
                }
            }
            return true;
        });

        for (int i = 1; i <= n; i++) {
            if (isDivisible.apply(numbersForDivision, i)) {
                System.out.print(i + " ");
            }
        }
    }
}

