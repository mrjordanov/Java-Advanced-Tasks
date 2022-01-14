import javax.sound.midi.Soundbank;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class WriteToFile {
    public static void main(String[] args) throws IOException {

        String path="input.txt";

        FileInputStream inputStream= new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream("out.txt");

        int value= inputStream.read();

        Set<Character> punctuations= Set.of( ',', '.', '!', '?');

        while (value!=-1){
            char cur= (char) value;
          if (!punctuations.contains(cur)){
              outputStream.write(cur);
            //  System.out.print(cur);
          }
            value= inputStream.read();
        }

        inputStream.close();
        outputStream.close();

    }
}
