import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountCharType {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\1Marin1\\Downloads\\SoftUni\\Advanced\\4.Streams, Files and Directories\\LAB\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        BufferedWriter writer= new BufferedWriter(new PrintWriter("Count Char Types.txt"));

        Path inPath= Paths.get(path);
        List<String> allLines= Files.readAllLines(inPath);

        int countVowels=0;
        int countConsonants=0;
        int countPunctuation=0;

        for (String line : allLines) {
            for (int i = 0; i < line.length(); i++) {
                char current = line.charAt(i);
                if (current==' '){
                    continue;
                }
                if (current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u') {
                    countVowels++;
                } else if (current == '!' ||current == ',' || current == '.' || current == '?') {
                    countPunctuation++;
                }
                else {
                    countConsonants++;
                }
            }
        }

        String one="Vowels: "+countVowels;
        writer.write(one);
        writer.newLine();
        writer.write("Consonants: "+countConsonants);
        writer.newLine();
        writer.write("Punctuation: "+countPunctuation);

        writer.close();
    }
}
