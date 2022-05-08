import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String guest = in.nextLine();

        Set<String> guests = new TreeSet<>();

        while (!guest.equals("PARTY")) {
            guests.add(guest);
            guest = in.nextLine();
        }
        guest = in.nextLine();
        while (!guest.equals("END")) {
            guests.remove(guest);
            guest = in.nextLine();
        }
        System.out.println(guests.size());
        System.out.println(String.join(System.lineSeparator(), guests));
    }
}
