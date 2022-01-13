import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> resources = new LinkedHashMap<>();
        String input= scanner.nextLine();


        while(!input.equals("stop")){
            int quantity=Integer.parseInt(scanner.nextLine());
            resources.putIfAbsent(input,0);
            int count=resources.get(input)+quantity;
            resources.put(input,count);

            input= scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
