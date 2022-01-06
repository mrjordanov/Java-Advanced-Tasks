import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditorV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> wordStates = new ArrayDeque<>();

        String first = "";
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(" ");
            if (command[0].equals("1")) {
                String add = command[1];
                first += add;
                wordStates.push(first);
            }
            if (command[0].equals("2")) {
                int eraseChars = Integer.parseInt(command[1]);
                int end=first.length()-eraseChars;
                first = first.substring(0,end);
                wordStates.push(first);
            }
            if (command[0].equals("3")) {
                int printIndex = Integer.parseInt(command[1]);
                char print = first.charAt(printIndex - 1);
                System.out.printf("%c", print).println();
            }
            if (command[0].equals("4")) {
                if (wordStates.size()>1){
                    wordStates.pop();
                    first=wordStates.peek();
                }
                else {
                    first="";
                }
            }
        }
    }
}