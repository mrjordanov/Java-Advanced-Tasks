package CarSalesMan;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Engine> engines = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] arg = scanner.nextLine().split("\\s+");
            String model = arg[0];
            int power = Integer.parseInt(arg[1]);
            Engine engine = null;
            if (arg.length == 2) {
                engine = new Engine(model, power);
            }

            if (arg.length == 3) {
                char cur = arg[2].charAt(0);
                if (Character.isDigit(cur)) {
                    int engineDisplacement = Integer.parseInt(arg[2]);
                    engine = new Engine(model, power, engineDisplacement);
                } else {
                    String engineEfficiency = arg[2];
                    engine = new Engine(model, power, engineEfficiency);
                }
            }

            if (arg.length == 4) {
                int engineDisplacement = Integer.parseInt(arg[2]);
                String engineEfficiency = arg[3];
                engine = new Engine(model, power, engineDisplacement, engineEfficiency);

            }
            engines.put(model, engine);
        }

        List<Car> cars = new ArrayList<>();
        int m = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < m; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String model = input[0];
            String engineModel = input[1];
            Engine carEngine = engines.get(engineModel);
            Car car = null;
            if (input.length == 2) {
                car = new Car(model, carEngine);
            }

            if (input.length == 3) {
                char cur = input[2].charAt(0);
                if (Character.isDigit(cur)) {
                    int weight = Integer.parseInt(input[2]);
                    car = new Car(model, carEngine, weight);
                } else {
                    String color = input[2];
                    car = new Car(model, carEngine, color);
                }
            }

            if (input.length == 4) {
                int weight = Integer.parseInt(input[2]);
                String color = input[3];
                car = new Car(model, carEngine, weight, color);
            }

            cars.add(car);
        }

        for (Car car : cars) {
            System.out.print(car);
        }
    }
}
