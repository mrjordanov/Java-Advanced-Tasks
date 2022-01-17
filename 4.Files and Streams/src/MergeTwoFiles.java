import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {

        String pathFirst = "C:\\Users\\1Marin1\\Downloads\\SoftUni\\Advanced\\" +
                "4.Streams, Files and Directories\\LAB\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";


        PrintWriter writer = new PrintWriter("mergedFiles.txt");
        Path firstPath = Paths.get(pathFirst);
        List<String> allLinesFirst = Files.readAllLines(firstPath);


        String pathSecond = "C:\\Users\\1Marin1\\Downloads\\SoftUni\\Advanced\\" +
                "4.Streams, Files and Directories\\LAB\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";

        Path secondPath = Paths.get(pathSecond);
        List<String> allLinesSecond = Files.readAllLines(secondPath);
        allLinesFirst.forEach(line -> writer.println(line));
        allLinesSecond.forEach(writer::println);
        writer.close();
    }
}
