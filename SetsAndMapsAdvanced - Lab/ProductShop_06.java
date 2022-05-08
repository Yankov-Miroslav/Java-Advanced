import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Map<String, Map<String, Double>> shopsWithPrices = new TreeMap<>();
        while (!input.equals("Revision")) {
            String[] tokens = input.split(", ");
            String shopName = tokens[0];
            String productName = tokens[1];
            double price = Double.parseDouble(tokens[2]);
            shopsWithPrices.putIfAbsent(shopName, new LinkedHashMap<>());
            Map<String, Double> productsAndPrices = shopsWithPrices.get(shopName);
            productsAndPrices.put(productName, price);

            input = in.nextLine();
        }
        for (String shop : shopsWithPrices.keySet()) {
            System.out.println(shop + "->");
            for (var entry : shopsWithPrices.get(shop).entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n", entry.getKey(), entry.getValue());
            }
        }
    }
}
