import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers= Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(s-> Double.parseDouble(s)).toArray();

        Map<Double,Integer> map= new LinkedHashMap<>();

        for (int i = 0; i < numbers.length ; i++) {
            double number=numbers[i];

            map.putIfAbsent(number,0);
            int count=map.get(number);
            map.put(number,count+1);
        }

        for (Map.Entry<Double,Integer> entry: map.entrySet()) {
            System.out.println( String.format("%.1f -> %d",entry.getKey(),entry.getValue()));
        }

     //   for (Double key: map.keySet()) {
        //    System.out.println(String.format("%.1f -> %d",key,map.get(key)));
     //   }
    }
}
