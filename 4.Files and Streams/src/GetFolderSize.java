import java.io.File;

public class GetFolderSize {
    public static void main(String[] args) {


        File root = new File("C:\\Users\\1Marin1\\Downloads\\SoftUni\\Advanced\\" +
                "4.Streams, Files and Directories\\LAB\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources");


        File[] files = root.listFiles();
        int folderSize = 0;
        if (files != null) {
            for (File f : files) {
                folderSize += f.length();
            }
        }
        System.out.print("Folder size: " + folderSize);
    }
}
