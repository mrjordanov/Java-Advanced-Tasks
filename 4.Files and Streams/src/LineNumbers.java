import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LineNumbers   {
    public static void main(String[] args) throws IOException {

        String path="C:\\Users\\1Marin1\\Downloads\\SoftUni\\Advanced\\" +
                "4.Streams, Files and Directories\\LAB\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";


        BufferedWriter writer= new BufferedWriter(new PrintWriter("line numbers.txt"));
        Path inPath= Paths.get(path);
        List<String > read= Files.readAllLines(inPath);

        int count=1;
        for (String l:read) {
            writer.write(count+" ."+l);
            writer.newLine();
            count++;
        }


        /*
        BufferedReader reader= new BufferedReader(new FileReader(path));
        String line= reader.readLine();
        int countForLine=0;
        while (line!=null){
            countForLine++;
            writer.write(countForLine+". "+line);
            writer.newLine();
            line= reader.readLine();
        }*/

        writer.close();
    }

}
