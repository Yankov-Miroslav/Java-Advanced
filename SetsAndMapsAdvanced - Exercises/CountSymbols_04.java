import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        TreeMap<Character, Integer> symbolsCount = new TreeMap<>();
        for (int index = 0; index < text.length(); index++) {
            char currentSymbol = text.charAt(index);

            if (symbolsCount.containsKey(currentSymbol)) {
                int currentCount = symbolsCount.get(currentSymbol);
                symbolsCount.put(currentSymbol, currentCount + 1);
            } else {
                symbolsCount.put(currentSymbol, 1);
            }
        }
        symbolsCount.forEach((key, value) -> System.out.println(key + ": " + value + " time/s"));
    }
}
