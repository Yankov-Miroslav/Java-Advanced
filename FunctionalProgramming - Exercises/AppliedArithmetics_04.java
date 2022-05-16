import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class AppliedArithmetics_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        int[] numbers = Arrays.stream(input.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = in.nextLine();

        Function<int[], int[]> add = array -> Arrays.stream(array).map(number -> number + 1).toArray();

        Function<int[], int[]> multiply = array -> Arrays.stream(array).map(number -> number * 2).toArray();

        Function<int[], int[]> subtract = array -> Arrays.stream(array).map(number -> number - 1).toArray();

        Consumer<int[]> print = array -> Arrays.stream(array).forEach(number -> System.out.print(number + " "));

        while (!command.equals("end")) {
            switch (command) {
                case "add":
                   numbers = add.apply(numbers);
                    break;
                case "multiply":
                    numbers = multiply.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtract.apply(numbers);
                    break;
                case "print":
                    print.accept(numbers);
                    System.out.println();
                    break;
            }
            command = in.nextLine();
        }
    }
}
