import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String path = "input.txt";
        FileInputStream inputStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream("CopyByBytes.txt");
        PrintStream out = new PrintStream(outputStream);

        int value = inputStream.read();
        while (value != -1) {
            if (value != 10 && value != 32) {
                out.print(value);

            } else {
                out.print((char) value);
            }
            value = inputStream.read();
        }

        inputStream.close();
        outputStream.close();

    }
}
