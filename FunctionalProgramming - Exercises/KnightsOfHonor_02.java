import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Consumer<String> stringConsumer = p -> System.out.println("Sir " + p);

        Arrays.stream(in.nextLine().split("\\s+"))
                .forEach(stringConsumer);

    }
}
