import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> contacts = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("search")) {
            String[] arg = input.split("-");
            String name = arg[0];
            String number = arg[1];

            if (contacts.containsKey(name)) {
                contacts.put(name, number);
            }
            contacts.putIfAbsent(name, number);

            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("stop")) {
                String name=input;
                if(contacts.containsKey(name)){
                    System.out.println(name+" -> "+contacts.get(name));
                }
                else {
                    System.out.printf("Contact %s does not exist.",name).println();
                }
            input = scanner.nextLine();
        }

    }
}
