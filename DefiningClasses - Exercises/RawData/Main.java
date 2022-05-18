package RawData;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        Map<String, Car> carInformation = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = in.nextLine().split("\\s+");
            String model = input[0];
            int engineSpeed = Integer.parseInt(input[1]);
            int enginePower = Integer.parseInt(input[2]);
            int cargoWeight = Integer.parseInt(input[3]);
            String cargoType = input[4];
            double tire1Pressure = Double.parseDouble(input[5]);
            int tire1Age = Integer.parseInt(input[6]);
            double tire2Pressure = Double.parseDouble(input[7]);
            int tire2Age = Integer.parseInt(input[8]);
            double tire3Pressure = Double.parseDouble(input[9]);
            int tire3Age = Integer.parseInt(input[10]);
            double tire4Pressure = Double.parseDouble(input[11]);
            int tire4Age = Integer.parseInt(input[12]);

            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Tire tire = new Tire(tire1Pressure, tire1Age, tire2Pressure, tire2Age, tire3Pressure, tire3Age, tire4Pressure, tire4Age);

            Car car = new Car(model, engine, cargo, tire);

            carInformation.putIfAbsent(model, car);

        }
        String command = in.nextLine();
        if (command.equals("fragile")) {

            carInformation
                    .entrySet()
                    .stream()
                    .filter(e -> e.getValue().getCargo().getCargoType().equals("fragile"))
                    .filter(e -> e.getValue().getTire().getTire1Pressure() < 1 ||
                            e.getValue().getTire().getTire2Pressure() < 1 ||
                            e.getValue().getTire().getTire3Pressure() < 1 ||
                            e.getValue().getTire().getTire4Pressure() < 1)
                    .forEach(e -> System.out.println(e.getValue().getModel()));

        } else {


            carInformation
                    .entrySet()
                    .stream()
                    .filter(e -> e.getValue().getCargo().getCargoType().equals("flamable"))
                    .filter(e -> e.getValue().getEngine().getEnginePower() > 250)
                    .forEach(e -> System.out.println(e.getValue().getModel()));
        }


    }

    public boolean tirePressure(Car car) {
        double tire1Pressure = car.getTire().getTire1Pressure();
        double tire2Pressure = car.getTire().getTire2Pressure();
        double tire3Pressure = car.getTire().getTire3Pressure();
        double tire4Pressure = car.getTire().getTire4Pressure();
        return tire1Pressure < 1 ||
                tire2Pressure < 1 ||
                tire3Pressure < 1 ||
                tire4Pressure < 1;
    }
}
