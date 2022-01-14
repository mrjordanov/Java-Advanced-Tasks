import java.io.*;

public class WriteEvery3thLine {
    public static void main(String[] args) throws IOException {

        String path="input.txt";
        FileInputStream inputStream = new FileInputStream(path);
        InputStreamReader inputStreamReader= new InputStreamReader(inputStream);
        BufferedReader reader= new BufferedReader(inputStreamReader);


        BufferedWriter writer= new BufferedWriter(new PrintWriter("Print #th Line.txt"));

        String line=reader.readLine();
        int count=1;

        while (line!=null){
            if (count%3==0){
                writer.write(line+System.lineSeparator());
                System.out.println(line);
            }
            line= reader.readLine();
            count++;
        }

        writer.close();
    }
}
