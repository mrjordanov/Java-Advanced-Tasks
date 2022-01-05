import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        if (number==0){
            System.out.print("0");
        }
        else {
            while (number!=0) {
                int curDigit = number/2;
                stack.push(number%2);
                number=curDigit;
            }
            while (!stack.isEmpty()){
                System.out.print(stack.pop());
            }
        }
    }
}
