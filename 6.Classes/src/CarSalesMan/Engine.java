package CarSalesMan;

public class Engine {
    private String model;
    private int power;
    private int displacement;
    private String efficiency;

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
    }


    public Engine(String model, int power, int displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public Engine(String model, int power, int displacement) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
    }

    public Engine(String model, int power, String efficiency) {
        this.model = model;
        this.power = power;
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();
        builder.append(model).append(":").append("\n");
        builder.append("Power: ").append(power).append("\n");
        if (displacement!=0){
            builder.append("Displacement: ").append(displacement).append("\n");
        }
        else {
            builder.append("Displacement: n/a").append("\n");
        }
        if (efficiency!=null){
            builder.append("Efficiency: ").append(efficiency).append("\n");
        }
        else {
            builder.append("Efficiency: n/a").append("\n");
        }
        return builder.toString();
    }
}
