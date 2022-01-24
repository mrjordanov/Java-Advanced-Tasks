package Google;

import java.util.ArrayList;
import java.util.List;

public class Children {
    private String name;
    private String birthDay;
    private List<Person> children;

    public Children(String name, String birthDay) {
        this.name = name;
        this.birthDay=birthDay;
        this.children=new ArrayList<>();
    }

}
