import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<String> usernames = new LinkedHashSet<>();
        int n = Integer.parseInt(in.nextLine());
        for (int i = 0; i < n; i++) {
            String username = in.nextLine();
            usernames.add(username);
        }

        usernames.forEach(System.out::println);

    }
}