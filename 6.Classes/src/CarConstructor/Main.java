package CarConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split(" ");
            Car car;
            String brand = info[0];
            if (info.length == 1) {
                car = new Car(brand);

            } else {
                String model = info[1];
                int power = Integer.parseInt(info[2]);
                car = new Car(brand, model, power);
            }

            cars.add(car);
        }

        for (Car car : cars) {
            System.out.println(car.toString());
        }

    }
}
