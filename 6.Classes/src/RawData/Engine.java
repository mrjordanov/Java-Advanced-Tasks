package RawData;

public class Engine {
    private String model;
    private int enginePower;
    private String cargoType;


    public Engine(String model,int enginePower,String cargoType){
        this.model=model;
        this.enginePower=enginePower;
        this.cargoType=cargoType;
    }


    public int getEnginePower() {
        return enginePower;
    }

    public String getModel() {
        return model;
    }

    public String getCargoType(){
        return cargoType;
    }
}
