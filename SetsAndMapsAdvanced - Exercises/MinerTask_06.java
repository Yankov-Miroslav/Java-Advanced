import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> resources = new LinkedHashMap<>();
        while (true) {
            String resource = in.nextLine();
            if (resource.equals("stop")) {
                break;
            }
            int quantity = Integer.parseInt(in.nextLine());

            if (resources.containsKey(resource)) {
                int currentCount = resources.get(resource);
                resources.put(resource, currentCount + quantity);
            } else {
                resources.put(resource, quantity);
            }

        }

        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}


