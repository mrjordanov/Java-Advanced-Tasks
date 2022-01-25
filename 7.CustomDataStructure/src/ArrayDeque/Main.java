package ArrayDeque;

public class Main  {
    public static void main(String[] args) {
        Stack stack= new Stack();


        stack.push(13);
        stack.push(42);
        stack.push(73);


        /*while (stack.size()>0){
            System.out.println(stack.pop());
        }*/

        stack.forEach(System.out::println);
    }
}
