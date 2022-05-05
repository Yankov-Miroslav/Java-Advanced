import java.util.ArrayDeque;
import java.util.Scanner;

public class InfixToPostfix_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayDeque<String> symbols = new ArrayDeque<>();
        String[] input = in.nextLine().split("\\s+");
        for (int i = 0; i < input.length; i++) {
            String currentSymbol = input[i];
            switch (currentSymbol) {
                case "+":
                case "-":
                    symbols.offer(currentSymbol);
                    break;
                case "/":
                case "*":
                    symbols.offer(currentSymbol);
                    break;
                case "(":
                case ")":
                    continue;

                default:
                    System.out.print(currentSymbol + " ");
            }
        }
    }
}



