import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumberWithStack_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split("\\s+");
        ArrayDeque<String> numbers = new ArrayDeque<>();
        for (String number : input) {
            numbers.push(number);
        }
        while (!numbers.isEmpty()) {
            System.out.print(numbers.pop() + " ");
        }
    }
}
