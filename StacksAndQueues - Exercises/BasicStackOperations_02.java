import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();
        int x = in.nextInt();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            int currentNumber = in.nextInt();
            stack.push(currentNumber);
        }
        for (int i = 0; i < s; i++) {
            stack.pop();
        }
        if (stack.contains(x)) {
            System.out.println(true);
        } else {
            if (stack.isEmpty()) {
                System.out.println("0");
            } else {
                System.out.println(Collections.min(stack));
            }
        }
    }
}