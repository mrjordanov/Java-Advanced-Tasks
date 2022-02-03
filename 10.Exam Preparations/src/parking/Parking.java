package parking;


import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;



public class Parking {
    private String type;
    private int capacity;
    private List<Car> collection;

    public Parking(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.collection = new LinkedList<>();
    }

    public void add(Car car) {
        if (capacity > collection.size()) {
            collection.add(car);
        }
    }

    public boolean remove(String manufacturer, String model) {
        for (Car car : collection) {
            if (car.getManufacturer().equals(manufacturer) && car.getModel().equals(model)) {
                return collection.remove(car);
            }
        }
        return false;
    }

    public Car getLatestCar() {
        if (collection.isEmpty()) {
            return null;
        } else {
            Car latest;
            latest = collection.stream().max(Comparator.comparingInt(Car::getYear)).orElse(null);
            return latest;
        }
    }

    public Car getCar(String manufacturer, String model) {
        if (collection.isEmpty()) {
            return null;
        }
            else {
            for (Car car : collection) {
                if (car.getManufacturer().equals(manufacturer) && car.getModel().equals(model)) {
                    return car;
                }
            }
            return null;
        }
    }

    public int getCount() {
        return collection.size();
    }

    public String getStatistic() {
        StringBuilder sb = new StringBuilder();
        sb.append("The cars are parked in ").append(type).append(":").append("\n");
        for (Car car : collection) {
            sb.append(car).append("\n");
        }
        return sb.toString().trim();
    }

}
