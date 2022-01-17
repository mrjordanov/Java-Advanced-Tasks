import java.io.*;
import java.util.Locale;

public class Capitals {
    public static void main(String[] args) throws IOException {

        String path="C:\\Users\\1Marin1\\Downloads\\SoftUni\\Advanced\\4.Streams, Files and Directories\\LAB\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        FileInputStream inputStream= new FileInputStream(path);
        InputStreamReader inputStreamReader= new InputStreamReader(inputStream);
        BufferedReader reader= new BufferedReader(inputStreamReader);
        BufferedWriter writer= new BufferedWriter(new PrintWriter("Capitals.txt"));

        String line= reader.readLine();

        while ((line!=null)){
            writer.write(line.toUpperCase(Locale.ROOT));
            writer.newLine();
            line= reader.readLine();
        }
        writer.close();

    }
}
