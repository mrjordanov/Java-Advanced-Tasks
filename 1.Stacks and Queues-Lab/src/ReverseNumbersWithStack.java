import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split("\\s+");
        ArrayDeque<String> stack = new ArrayDeque<>();

        //
       // for (int i = arr.length-1; i >=0 ; i--) {
         //   stack.push(arr[i]);
         //   System.out.printf("%s ",stack.peek());
        //}

        for (String s:arr) {
            stack.push(s);
        }
        while(!stack.isEmpty()){
            System.out.printf("%s ",stack.pop());
        }
    }
}
