import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name= scanner.nextLine();

        Map<String,String> users= new LinkedHashMap<>();


        while(!name.equals("stop")){
            String email= scanner.nextLine();
            String out=email.substring(email.length()-2);
            String outSecond=email.substring(email.length()-3);
            if(out.equals("us")|| out.equals("uk")||outSecond.equals("com")){
                name= scanner.nextLine();
                continue;
            }
            else {
                users.putIfAbsent(name,email);
            }
            name= scanner.nextLine();
        }
        users.entrySet().forEach(entry-> System.out.println(entry.getKey()+" -> "+entry.getValue()));
    }
}
