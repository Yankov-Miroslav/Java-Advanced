import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeSet<String> elements = new TreeSet<>();
        int n = Integer.parseInt(in.nextLine());

        for (int i = 0; i < n; i++) {
            String input = in.nextLine();
            String[] inputElements = input.split("\\s+");

            elements.addAll(Arrays.asList(inputElements));
        }

        elements.forEach(el -> System.out.print(el + " "));

    }
}