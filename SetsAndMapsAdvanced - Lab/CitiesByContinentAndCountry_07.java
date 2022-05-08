import java.util.*;

public class CitiesByContinentAndCountry_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        Map<String, Map<String, List<String>>> countries = new LinkedHashMap<>();

        while (n > 0) {
            String[] tokens = in.nextLine().split("\\s+");
            countries.putIfAbsent(tokens[0], new LinkedHashMap<>());
            Map<String, List<String>> map = countries.get(tokens[0]);
            map.putIfAbsent(tokens[1], new ArrayList<>());
            List<String> cities = map.get(tokens[1]);
            cities.add(tokens[2]);
            n--;
        }
        countries.forEach((key, value) -> {
            System.out.println(key + ":");
            value.forEach((key1, value1) -> System.out.println("  " + key1 + " -> "
                    + String.join(", ", value1)));
        });
    }
}
