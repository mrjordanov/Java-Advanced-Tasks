import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ListFiles {
    public static void main(String[] args) throws IOException {

        File root = new File("C:\\Users\\1Marin1\\Downloads\\SoftUni\\Advanced\\" +
                "4.Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        Path outPath = Paths.get("C:\\Users\\1Marin1\\Desktop\\Java-Advanced-Tasks\\4.Files and Streams\\Lits-Files.txt");

        File[] files = root.listFiles();
        List<String> info = new LinkedList<>();
        for (File f : files) {
            if (f.isFile()) {
                String name = f.getName();
                long size = f.length();
                String sizeOfFile = "" + size + "";
                String format = name + ": [" + sizeOfFile + "]";
                info.add(format);
            }
        }

        Files.write(outPath, info);

    }
}
