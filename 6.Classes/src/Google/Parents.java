package Google;


import java.util.ArrayList;
import java.util.List;

public class Parents {
    private String name;
    private String birthDay;
    private List<Person> parents;

    public Parents(String name, String birthDay) {
        this.name = name;
        this.birthDay=birthDay;
        this.parents= new ArrayList<>();

    }
}
