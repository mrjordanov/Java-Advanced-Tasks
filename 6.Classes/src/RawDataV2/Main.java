package RawDataV2;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Car> cars = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] token = scanner.nextLine().split("\\s+");
            String model = token[0];
            int engineSpeed = Integer.parseInt(token[1]);
            int enginePower = Integer.parseInt(token[2]);
            Engine engine = new Engine(engineSpeed, enginePower);
            int cargoWeight = Integer.parseInt(token[3]);
            String cargoType = token[4];
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Tyre[] tiers = new Tyre[4];
            int count = 0;
            for (int j = 5; j < token.length - 1; j += 2) {
                double tierPress = Double.parseDouble(token[j]);
                int tierAge = Integer.parseInt(token[j + 1]);
                tiers[count] = new Tyre(tierPress, tierAge);
                count++;
            }
            Car car = new Car(model, engine, cargo, tiers);
            cars.putIfAbsent(model, car);
        }

        String type = scanner.nextLine();

        for (Car car : cars.values()) {
            if (type.equals("fragile")
                    && "fragile".equals(car.getCargo().getType())
                    && car.hasTierWithLittlePressure()) {
                System.out.println(car.getModel());
            } else if (type.equals("flamable") && car.getCargo().getType().equals("flamable") && car.getEngine().getEnginePower() > 250) {
                System.out.println(car.getModel());
            }

        }


    }
}
