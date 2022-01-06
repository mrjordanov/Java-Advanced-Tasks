import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<Character> stack = new ArrayDeque<>();

        boolean areBalanced=false;
        for (int i = 0; i <input.length() ; i++) {
            char cur=input.charAt(i);
           if (cur=='('||cur=='{'||cur=='['){
               stack.push(cur);
           }
           else if(cur==')'||cur=='}'||cur==']') {
               if (stack.isEmpty()){
                   areBalanced=false;
                   break;
               }
               char last= stack.pop();
               if ( last=='(' && cur==')' ){
                   areBalanced=true;
               }
               else if (last=='{'&& cur=='}'){
                areBalanced=true;
               }
               else if (last=='['&& cur==']'){
                areBalanced=true;
               }
               else {
                   areBalanced=false;
                   break;
               }
           }
        }
        if (areBalanced){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
