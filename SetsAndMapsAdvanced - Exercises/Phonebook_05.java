import java.util.LinkedHashMap;
import java.util.Scanner;

public class Phonebook_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedHashMap<String, String> phonebook = new LinkedHashMap<>();
        String input = in.nextLine();

        while (!input.equals("search")) {

            String name = input.split("-")[0];
            String phoneNumber = input.split("-")[1];
            phonebook.put(name, phoneNumber);
            input = in.nextLine();
        }

        String name = in.nextLine();
        while (!name.equals("stop")) {

            if (phonebook.containsKey(name)) {
                System.out.printf("%s -> %s%n", name, phonebook.get(name));
            } else {
                System.out.printf("Contact %s does not exist.%n", name);
            }
            name = in.nextLine();
        }
    }
}
