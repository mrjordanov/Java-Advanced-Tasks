import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class SumBytes {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\1Marin1\\Downloads\\SoftUni\\Advanced\\4.Streams, Files and Directories\\LAB\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        Path inPath = Paths.get(path);
        byte[] allBytes = Files.readAllBytes(inPath);

        long sumTotal = 0;
        for (int i = 0; i < allBytes.length; i++) {
            if (allBytes[i] != 10 && allBytes[i] != 13) {
                sumTotal += allBytes[i];
            }
        }
        System.out.println(sumTotal);

        /* 2вариант
        List<String> lines= Files.readAllLines(inPath);

        long totalSum=0;
        for (String line:lines) {
            long sum=0;
            for (int i = 0; i <line.length() ; i++) {
                char symbol=line.charAt(i);
                sum+=symbol;
            }
            totalSum+=sum;
        }
        System.out.println(totalSum);
            */
    }
}
