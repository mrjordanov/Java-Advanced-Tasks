import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        ArrayDeque<Integer> stack= new ArrayDeque<>();

            for (int i = 0; i <input.length() ; i++) {
                char current=input.charAt(i);
               if (current=='('){
                   stack.push(i);
               }
               else if (current==')'){
                   int beginIndex=stack.pop();
                   System.out.println(input.substring(beginIndex,i+1));
               }
            }
    }
}
