import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Set<String> plates = new LinkedHashSet<>();

        while (!input.equals("END")) {
            String[] command = input.split(", ");
            String licensePlate = command[1];
            if (command[0].equals("IN")) {
                if (plates.contains(licensePlate)) {
                    input = scanner.nextLine();
                    continue;
                } else {
                    plates.add(licensePlate);
                }
            }
            if (command[0].equals("OUT")) {
                plates.remove(licensePlate);
            }

            input = scanner.nextLine();
        }

        String output = plates.isEmpty() ? "Parking Lot is Empty" :
                plates.stream().collect(Collectors.joining(System.lineSeparator()));
        System.out.println(output);
        // if (plates.isEmpty()){
        // System.out.println("Parking Lot is Empty");
        //  }
        //  else {
        // for (String plate:plates) {
        //     System.out.println(plate);
        // }
        // }
    }
}
