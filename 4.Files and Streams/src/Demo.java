import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String path="C:\\Users\\1Marin1\\Downloads\\SoftUni\\Advanced\\" +
                "4.Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream= new FileInputStream(path);

        int value= inputStream.read();

        while ((value!=-1)){
            System.out.print(Integer.toBinaryString(value)+ " ");
            value= inputStream.read();
        }

    }
}
