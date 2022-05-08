import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split("\\s+");

        Map<Double, Integer> counter = new LinkedHashMap<>();

        int count = 1;
        for (String s : input) {
            double key = Double.parseDouble(s);
            if (!counter.containsKey(key)) {
                counter.put(key, count);
            } else {
                int newCount = counter.get(key) + 1;
                counter.put(key, newCount);
            }
        }
        counter.forEach((key, value) -> System.out.printf("%.1f -> %d%n", key, value));
    }
}
