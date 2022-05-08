import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class ParkingLot_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        Set<String> parkingLot = new LinkedHashSet<>();

        while (!input.equals("END")) {
            String[] tokens = input.split(", ");
            String action = tokens[0];
            String registration = tokens[1];
            if (action.equals("IN")) {
                parkingLot.add(registration);
            } else {
                parkingLot.remove(registration);
            }
            input = in.nextLine();
        }

        String output = parkingLot.isEmpty()
                ? "Parking Lot is Empty"
                : parkingLot.stream()
                .collect(Collectors.joining(System.lineSeparator()));

        System.out.println(output);
    }
}

