package Google;

public class Person {
    private String name;
    private String company;
    private String department;
    private double salary;
    private String car;
    private int speed;
    private Pokemon pokemon;
    private Children children;
    private Parents parents;

    public Person(String name, String company, String department,double salary ) {
        this.name = name;
       this.company=company;
       this.department=department;
       this.salary=salary;
    }

    public Person (String name, String car, int speed){
        this.name=name;
        this.car=car;
        this.speed=speed;
    }

    public Person (String name, Pokemon pokemon){
        this.name=name;
        this.pokemon=pokemon;
    }

    public Person (String name, Parents parents){
        this.name=name;
        this.parents=parents;
    }

    public Person(String name, Children children){
        this.name=name;
        this.children=children;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public Children getChildren() {
        return children;
    }

    public void setChildren(Children children) {
        this.children = children;
    }

    public Parents getParents() {
        return parents;
    }

    public void setParents(Parents parents) {
        this.parents = parents;
    }

    @Override
    public String toString() {
        return ""+this.name+"\\nCompany:\\n"+company+ " "+department+" "+ String.format("%.2f",salary)+
                "\nCar: " + car + " "+ speed +
                "\nPokemon:\n" + pokemon +
                ", children=" + children +
                ", parents=" + parents +
                '}';
    }
}
