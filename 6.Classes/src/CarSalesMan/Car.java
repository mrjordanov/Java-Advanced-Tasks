package CarSalesMan;


import java.awt.desktop.AboutEvent;

public class Car {
    private String model;
    private Engine engine;
    private int weight;
    private String carColor;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public Car(String model, Engine engine, int weight, String carColor) {
        this(model, engine);
        this.weight = weight;
        this.carColor = carColor;
    }

    public Car(String model, Engine engine, int weight) {
        this(model, engine);
        this.weight = weight;
    }

    public Car(String model, Engine engine, String carColor) {
        this(model, engine);
        this.carColor = carColor;
    }


    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();
        builder.append(model).append(":").append("\n");
        builder.append(engine);
        if (weight!=0){
            builder.append("Weight: ").append(weight).append("\n");
        }
        else {
            builder.append("Weight: n/a").append("\n");
        }
        if (carColor!=null){
            builder.append("Color: ").append(carColor).append("\n");
        }
        else {
            builder.append("Color: n/a").append("\n");
        }
        return builder.toString();
    }
}
