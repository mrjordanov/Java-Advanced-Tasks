import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class WordCount {
    public static void main(String[] args) throws IOException {

        String path="C:\\Users\\1Marin1\\Downloads\\SoftUni\\Advanced\\" +
        "4.Streams, Files and Directories\\LAB\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";

        BufferedReader reader= new BufferedReader(new FileReader(path));
        BufferedWriter writer= new BufferedWriter(new PrintWriter("Result.txt"));
        Path inPath= Paths.get(path);
        List<String > word=Files.readAllLines(inPath);

        List<String> wordsToFind= new ArrayList<>();
        for (String wor:word) {
            String[] arr=wor.split(" ");
            wordsToFind.addAll(Arrays.asList(arr));
        }

        String sec="C:\\Users\\1Marin1\\Downloads\\SoftUni\\Advanced\\" +
                "4.Streams, Files and Directories\\LAB\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";

        Path second=Paths.get(sec);
        List<String> linesOfText=Files.readAllLines(second);
        List<String > wordsOfText=new ArrayList<>();
        for (String oneWord:linesOfText) {
            String[] arrWithWords=oneWord.split(" ");
                    wordsOfText.addAll(Arrays.asList(arrWithWords));
        }


        Map<String,Integer> occ= new LinkedHashMap<>();

        for (int i = 0; i < wordsToFind.size() ; i++) {
            String putInMap=wordsToFind.get(i);

            for (String s : wordsOfText) {
                String current = s;
                if (current.equals(putInMap)){
                    occ.putIfAbsent(putInMap, 0);
                    int totalCount = occ.get(putInMap) + 1;
                    occ.put(putInMap, totalCount);
                }
            }
        }



       occ.entrySet().stream().sorted((s1,s2)-> s2.getValue().compareTo(s1.getValue()))
               .forEach(e-> {
                   try {
                       writer.write(e.getKey()+" - "+e.getValue());
                       writer.newLine();
                   } catch (IOException ex) {
                       ex.printStackTrace();
                   }
               });

        writer.close();
    }
}
