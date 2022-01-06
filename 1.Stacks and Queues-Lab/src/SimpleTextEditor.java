import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder currentText= new StringBuilder();
        ArrayDeque<String> wordStates = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(" ");
            if (command[0].equals("1")) {
                String add = command[1];
                currentText.append(add);
                wordStates.push(currentText.toString());
            }
            if (command[0].equals("2")) {
                int eraseChars = Integer.parseInt(command[1]);
                int end=currentText.length()-eraseChars;
                currentText.delete(end,end+eraseChars);
                wordStates.push(currentText.toString());
            }
            if (command[0].equals("3")) {
                int printIndex = Integer.parseInt(command[1]);
                System.out.println(currentText.charAt(printIndex-1));
            }
            if (command[0].equals("4")) {
                if (wordStates.size()>1){
                    wordStates.pop();
                    currentText=new StringBuilder(wordStates.peek());
                }
                else {
                    currentText=new StringBuilder();
                }
            }
        }
    }
}
