import java.util.ArrayDeque;
import java.util.Scanner;

public class MathPotato_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] names = in.nextLine().split("\\s+");
        int cycle = 1;
        int count = Integer.parseInt(in.nextLine());
        ArrayDeque<String> queues = new ArrayDeque<>();
        for (String currentName : names) {
            queues.offer(currentName);
        }
        while (queues.size() >= 2) {
            for (int i = 1; i <= count; i++) {
                if (count == i) {
                    if (isPrime(cycle)) {
                        System.out.println("Prime " + queues.peek());
                    } else {
                        System.out.println("Removed " + queues.pop());
                    }
                    cycle++;
                } else {
                    String name = queues.pop();
                    queues.offer(name);
                }
            }
        }

        System.out.println("Last is " + queues.pollFirst());
    }

    public static boolean isPrime(int number) {
        int count = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return number > 1 & count == 0;
    }
}


