package RawData;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        // List<Car> cars = new LinkedList<>();
        List<Engine> engineList = new LinkedList<>();
        List<Tyres> carTyres = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split("\\s+");
            // Car car;
            Engine engine;
            Tyres tyres;
            String model = info[0];
            int engineSpeed = Integer.parseInt(info[1]);
            int enginePower = Integer.parseInt(info[2]);
            int cargoWeight = Integer.parseInt(info[3]);
            String cargoType = info[4];
            double tyreOnePress = Double.parseDouble(info[5]);
            int tyreOneAge = Integer.parseInt(info[6]);
            double tyreTwoPress = Double.parseDouble(info[7]);
            int tyreTwoAge = Integer.parseInt(info[8]);
            double tyreThreePress = Double.parseDouble(info[9]);
            int tyreThreeAge = Integer.parseInt(info[10]);
            double tyreFourPress = Double.parseDouble(info[11]);
            int tyreFourAge = Integer.parseInt(info[12]);

            // car = new Car(model, engineSpeed, enginePower, cargoWeight, cargoType, tyreOnePress, tyreOneAge, tyreTwoPress, tyreTwoAge, tyreThreePress, tyreThreeAge, tyreFourPress, tyreFourAge);
            // cars.add(car);
            engine = new Engine(model, enginePower, cargoType);
            engineList.add(engine);
            tyres = new Tyres(model, cargoType, tyreOnePress, tyreTwoPress, tyreThreePress, tyreFourPress);
            carTyres.add(tyres);

        }
        String last = scanner.nextLine();
        if (last.equals("fragile")) {
            for (Tyres car : carTyres) {
                if (car.getCargoType().equals("fragile")) {
                    if (car.getTyreOnePressure() < 1 | car.getTyreTwoPressure() < 1 | car.getTyreThreePressure() < 1 | car.getTyreFourPressure() < 1) {
                        System.out.println(car.getModel());
                    }
                }
            }

        } else if (last.equals("flamable")) {
            for (Engine car : engineList) {
                if (car.getCargoType().equals("flamable") && car.getEnginePower() > 250) {
                    System.out.println(car.getModel());
                }
            }

        }

    }
}
