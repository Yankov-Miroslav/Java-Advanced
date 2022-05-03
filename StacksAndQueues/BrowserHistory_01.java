import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String command = in.nextLine();
        ArrayDeque<String> history = new ArrayDeque<>();
        String currentURL = "";
        while (!command.equals("Home")) {
            if (command.equals("back")) {
                if (history.isEmpty()) {
                    System.out.println("no previous URLs");
                    command = in.nextLine();
                    continue;
                }
                String prevURL = history.pop();
                currentURL = prevURL;
            } else {
                if (currentURL.length() > 0) {
                    history.push(currentURL);
                }
                currentURL = command;
            }

            System.out.println(currentURL);

            command = in.nextLine();
        }
    }
}
