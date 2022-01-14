import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Integer> numbers =new ArrayList<>();

        numbers.add(13);
        numbers.add(42);
        numbers.add(69);
        numbers.add(73);

        ObjectOutputStream outputStream= new ObjectOutputStream(new FileOutputStream("serialization.txt"));

        outputStream.writeObject(numbers);

        ObjectInputStream inputStream= new ObjectInputStream(new FileInputStream("serialization.txt"));
        List<Integer> number2=(List<Integer>) inputStream.readObject();
        System.out.println(number2);
    }
}
