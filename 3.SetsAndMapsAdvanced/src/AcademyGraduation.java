import com.sun.source.tree.LiteralTree;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, LinkedList<Double>> graduationList = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String[] info = scanner.nextLine().split(" ");

            LinkedList<Double> first = new LinkedList<>();
            for (int j = 0; j < info.length; j++) {
                first.add(Double.parseDouble(info[j]));
            }

            graduationList.putIfAbsent(name, first);

        }

        for (var entry : graduationList.entrySet()) {
                    LinkedList<Double> grades= entry.getValue();
                    double avv= grades.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
                    String pattern="#.###############";
                    DecimalFormat decimalFormat= new DecimalFormat(pattern);
                    String format= decimalFormat.format(avv);
            System.out.printf("%s is graduated with %s",entry.getKey(),format).println();
        }
    }
}
