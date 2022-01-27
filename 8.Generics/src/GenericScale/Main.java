package GenericScale;


public class Main {
    public static void main(String[] args) {

        Scale<Integer> genericScale = new Scale<Integer>(5, 8);
        int heavier = genericScale.getHeavier();
        System.out.println(heavier);
        Scale<String> genericScale1 = new Scale<String>("S", "A");
        String heavier1 = genericScale1.getHeavier();
        System.out.println(heavier1);

        System.out.println(new Scale<>(13, 42).getHeavier());
        System.out.println(new Scale<>("A", "Z").getHeavier());
        System.out.println(new Scale<>(14.5, 15.5).getHeavier());
        System.out.println(new Scale<>(14, 14).getHeavier());
    }
}