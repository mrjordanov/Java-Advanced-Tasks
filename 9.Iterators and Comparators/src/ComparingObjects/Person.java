package ComparingObjects;



public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String town;


    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTown() {
        return town;
    }


    @Override
    public int compareTo(Person other) {

        int resultForName=this.name.compareTo(other.getName());
        int resultForAge=Integer.compare(this.age, other.getAge());
        int resultForTown=this.town.compareTo(other.getTown());

        if(resultForName==0 && resultForAge==0 && resultForTown==0){
            return 1;
        }
        return 0;
    }
}
