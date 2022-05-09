import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElements_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        LinkedHashSet<Integer> firstSet = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondSet = new LinkedHashSet<>();

        String input = in.nextLine();//"4 3".SPLIT -> ["4", "3"]
        int countFirstSet = Integer.parseInt(input.split("\\s+")[0]);
        int countSecondSet = Integer.parseInt(input.split("\\s+")[1]);

        for (int i = 0; i < countFirstSet; i++) {
            int number = Integer.parseInt(in.nextLine());
            firstSet.add(number);
        }

        for (int i = 0; i < countSecondSet; i++) {
            int number = Integer.parseInt(in.nextLine());
            secondSet.add(number);
        }

        LinkedHashSet<Integer> duplicatedElements = new LinkedHashSet<>();
        for (int number : firstSet) {
            if (secondSet.contains(number)) {
                duplicatedElements.add(number);
            }
        }

        duplicatedElements.forEach(number -> System.out.print(number + " "));

    }
}
