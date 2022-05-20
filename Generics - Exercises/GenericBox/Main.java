package GenericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        Box<Double> box = new Box();

        for (int i = 0; i < n; i++) {
            Double value = Double.parseDouble(in.nextLine());
            box.add(value);
        }
        Double element = Double.parseDouble(in.nextLine());
        int greaterElementsCount = box.countOfGreaterItems(element);
        System.out.println(greaterElementsCount);
    }

}
