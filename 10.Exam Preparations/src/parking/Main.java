package parking;

public class Main {
    public static void main(String[] args) {
        // Initialize the repository
        Parking parking = new Parking("Underground parking garage", 5);

        // Initialize entity
        Car volvo = new Car("Volvo", "XC70", 2010);

        // Print Car
        System.out.println(volvo); // Volvo XC70 (2010)

        parking.add(volvo);

        System.out.println(parking.remove("Volvo", "XC90")); // false
        System.out.println(parking.remove("Volvo", "XC70")); // true

        Car peugeot = new Car("Peugeot", "307", 2011);
        Car audi = new Car("Audi", "S4", 2005);

        parking.add(peugeot);
        parking.add(audi);

        Car latestCar = parking.getLatestCar();
        System.out.println(latestCar);

        Car car = parking.getCar("Audi", "S4");
        System.out.println(car);

        System.out.println(parking.getCount());
        System.out.print(parking.getStatistic());
    }
}
