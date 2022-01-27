package Jar;

public class Main {
    public static void main(String[] args) {

        Jar<Integer> integerJar = new Jar<Integer>();

        Jar<Character> characterJar = new Jar<Character>();

        integerJar.add(10);

        characterJar.add('a');
        characterJar.add('b');
        characterJar.remove();


    }
}
