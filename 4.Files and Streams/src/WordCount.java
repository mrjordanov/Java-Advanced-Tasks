import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class WordCount {
    public static void main(String[] args) throws IOException {

        String path="C:\\Users\\1Marin1\\Downloads\\SoftUni\\Advanced\\" +
        "4.Streams, Files and Directories\\LAB\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";

        List<String> words= new ArrayList<>();
        BufferedReader reader= new BufferedReader(new FileReader(path));

        Path inPath= Paths.get(path);
        List<String > word=Files.readAllLines(inPath);

        for (String wor:word) {
            String[] arr=wor.toLowerCase(Locale.ROOT).split(" ");
            words.addAll(Arrays.asList(arr));
        }

        String sec="C:\\Users\\1Marin1\\Downloads\\SoftUni\\Advanced\\" +
                "4.Streams, Files and Directories\\LAB\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";

        Path second=Paths.get(sec);
        List<String> lines=Files.readAllLines(second);

        Map<String,Integer> occ= new LinkedHashMap<>();

        for (int i = 0; i < words.size() ; i++) {
            if (lines.toString().toLowerCase(Locale.ROOT).contains(words.get(i))){
                while (lines.toString().toLowerCase(Locale.ROOT).contains(words.get(i))){
                    occ.putIfAbsent(words.get(i),0);
                    int count= occ.get(words.get(i))+1;
                    occ.put(words.get(i),count);
                   String put= lines.toString().replace(words.get(i),"");

                }
            }
        }



    }
}
