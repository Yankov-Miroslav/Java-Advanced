import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Consumer<String> strings = System.out::println;

        Arrays.stream(in.nextLine().split("\\s+"))
                .forEach(strings);

    }
}
