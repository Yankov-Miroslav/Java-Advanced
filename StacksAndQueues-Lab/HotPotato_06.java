import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] names = in.nextLine().split("\\s+");
        int count = Integer.parseInt(in.nextLine());
        ArrayDeque<String> queues = new ArrayDeque<>();
        for (String currentName : names) {
            queues.offer(currentName);
        }
        while (queues.size() >= 2) {
            for (int i = 0; i < count; i++) {
                if ((i + 1) != count) {
                    String name = queues.pollFirst();
                    queues.offer(name);
                } else {
                    String removed = queues.pollFirst();
                    System.out.println("Removed " + removed);
                }
            }
        }
        System.out.println("Last is " + queues.pollFirst());
    }
}
