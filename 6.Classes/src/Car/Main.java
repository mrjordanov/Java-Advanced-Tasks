package Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split(" ");
            String brand = info[0];
            String model = info[1];
            int power = Integer.parseInt(info[2]);

            Car car = new Car(brand, model, power);
            System.out.println(car.getClass());
            String s = car.toString();
            System.out.println(s);
        }

        /*Car car = new Car("Lada", "Niva", 1000);
        car.setHorsePower(500);
        String s = car.toString();
        System.out.print(s);
            */
    }
}
