package StackIterator;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Stack<Integer> stack = new Stack<>();
        while (!command.equals("END")) {
            String[] tokens = command.split("[, ]+");
            if (tokens[0].equals("Push")) {
                for (int i = 1; i < tokens.length; i++) {
                    stack.push(Integer.parseInt(tokens[i]));
                }
            }
            if (tokens[0].equals("Pop")) {
                try {
                    stack.pop();
                } catch (Exception e) {
                    System.out.println("No elements");
                }
            }
            command = scanner.nextLine();
        }

        for (int i = 1; i <= 2; i++) {
            for (Integer number : stack) {
                System.out.println(number);
            }
        }
    }

}
