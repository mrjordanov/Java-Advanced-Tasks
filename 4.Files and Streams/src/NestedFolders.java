import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class NestedFolders {
    public static void main(String[] args) {

        File root = new File("C:\\Users\\1Marin1\\Downloads\\SoftUni\\Advanced\\4.Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        Deque<File> queue = new ArrayDeque<>();
        queue.offer(root);

        int count = 1;
        while (!queue.isEmpty()) {
            File file = queue.poll();
            File[] files = file.listFiles();
            for (File f : files) {
                if (f.isDirectory()) {
                    queue.offer(f);
                    count++;
                    System.out.println(f.getName());
                }
            }
        }

        System.out.println(count + " folders");
    }
}
