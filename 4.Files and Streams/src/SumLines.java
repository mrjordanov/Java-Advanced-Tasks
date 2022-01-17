import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class SumLines {
    public static void main(String[] args) throws IOException {

        String path="C:\\Users\\1Marin1\\Downloads\\SoftUni\\Advanced\\4.Streams, Files and Directories\\LAB\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        Path inPath= Path.of(path);
        List<String> allLines= Files.readAllLines(inPath);

        allLines.stream().map(String::toCharArray).forEach(
                charArray-> {
                    int sum=0;
                    for (char symbol:charArray) {
                        sum+=symbol;
                    }
                    System.out.println(sum);
                }
        );

        /*
        for (String line:allLines) {
            int sum=0;
            for (int i = 0; i <line.length() ; i++) {
                char currentSymbol=line.charAt(i);
                sum+=currentSymbol;
            }
            System.out.println(sum);
        }*/

    }
}
