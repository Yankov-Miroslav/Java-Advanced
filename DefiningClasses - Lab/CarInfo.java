import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String[] input = in.nextLine().split("\\s+");

            String carName = input[0];
            Car car;
            if (input.length == 1) {
                car = new Car(carName);
            } else {
                String carModel = input[1];
                int horsePower = Integer.parseInt(input[2]);

                car = new Car(carName, carModel, horsePower);
            }
            cars.add(car);

        }
        for (Car car:cars){
            System.out.print(car.toString());
        }

    }
}