import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class AddVAT_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        UnaryOperator<Double> vatCalculator = val -> val * 1.2;

        System.out.println("Prices with VAT:");

        Arrays.stream(in.nextLine().split(", "))
                .map(Double::parseDouble)
                .map(vatCalculator)
                .forEach(p -> System.out.printf("%.2f%n", p));
    }
}
