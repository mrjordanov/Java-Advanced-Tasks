import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class WordCountV2 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\1Marin1\\Downloads\\SoftUni\\Advanced\\" +
                "4.Streams, Files and Directories\\LAB\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";

        Map<String, Integer> wordCount = new LinkedHashMap<>();

        Path inPath = Paths.get(path);
        List<String> allLinesWords = Files.readAllLines(inPath);
        allLinesWords.forEach(line -> Arrays.stream(line.split("\\s+")).forEach(word -> wordCount.put(word, 0)));


        Path pathText = Path.of("C:\\Users\\1Marin1\\Downloads\\SoftUni\\Advanced\\" +
                "4.Streams, Files and Directories\\LAB\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\text.txt");

        List<String> textAllLines = Files.readAllLines(pathText);
        for (String line : textAllLines) {
            String[] wordsInLine = line.split("\\s+");
            Arrays.stream(wordsInLine).forEach(word -> {
                if (word.contains(",")) {
                    word = word.replaceAll(",", "");
                }
                if (wordCount.containsKey(word)) {
                    int currentCount = wordCount.get(word);
                    wordCount.put(word, currentCount + 1);
                }
            });
        }

        wordCount.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        PrintWriter writer = new PrintWriter("COUNT.txt");
        wordCount.entrySet().forEach(entry -> writer.println(entry.getKey() + " - " + entry.getValue()));
        writer.close();
    }
}
