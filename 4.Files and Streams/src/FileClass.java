import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class FileClass {
    public static void main(String[] args) {

        /*Алгоритъм за намиране на броя на файлове и директории с ОПАШКА - BFS търсене по широчина*/
        File root = new File("C:\\Users\\1Marin1\\Downloads\\SoftUni\\Advanced\\" +
                "4.Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        Deque<File> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            File file = queue.poll();
            System.out.println(file.getName());
            File[] files = file.listFiles();

            if (files != null) {
                for (File f : files) {
                    if (f.isDirectory()) {
                        queue.offer(f);
                    } else {
                        System.out.println(f.getName());
                    }
                }
            }
        }

       /*DFS с рекурсия
        dfs(root);

    private static void dfs(File file) {
        System.out.println(file.getName());

        File[] files = file.listFiles();

        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    dfs(f);
                } else {
                    System.out.println(f.getName());
                }
            }
        }
    }*/

    }
}