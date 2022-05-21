package Froggy;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] stonesArray = in.nextLine().split(", ");

        Lake lake = new Lake(Arrays
                .stream(stonesArray)
                .map(Integer::parseInt)
                .collect(Collectors.toList()));

        List<String> output = new ArrayList<>();

        for (Integer stone : lake) {
            output.add(stone + "");
        }
        System.out.println(String.join(", ", output));
    }
}
