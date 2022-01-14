import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class SortLines {
    public static void main(String[] args) throws IOException {

        Path path= Paths.get("C:\\Users\\1Marin1\\Desktop\\Java-Advanced-Tasks\\4.Files and Streams\\input.txt");
        Path outPath= Paths.get("C:\\Users\\1Marin1\\Desktop\\Java-Advanced-Tasks\\4.Files and Streams\\6thTask.txt");

        List<String > lines= Files.readAllLines(path);
        Collections.sort(lines);
        Files.write(outPath, lines);

    }
}
