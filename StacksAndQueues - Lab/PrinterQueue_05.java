import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String command = in.nextLine();
        ArrayDeque<String> queue = new ArrayDeque<>();
        while (!command.equals("print")) {

            if (command.equals("cancel")) {
                if (queue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + queue.pollFirst());
                }
            } else {
                queue.offer(command);
            }


            command = in.nextLine();
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.pollFirst());
        }
    }
}
