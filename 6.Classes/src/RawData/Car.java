package RawData;

public class Car {
    private String model;
    private int engineSpeed;
    private int enginePower;
    private int cargoWeight;
    private String cargoType;
    private double tyreOnePressure;
    private int tyreOneAge;
    private double tyreTwoPressure;
    private int tyreTwoAge;
    private double tyreThreePressure;
    private int tyreThreeAge;
    private double tyreFourPressure;
    private int tyreFourAge;


    public Car(String model, int engineSpeed, int enginePower, int cargoWeight, String cargoType, double tyreOnePressure
            , int tyreOneAge, double tyreTwoPressure, int tyreTwoAge, double tyreThreePressure, int tyreThreeAge, double tyreFourPressure, int tyreFourAge) {
        this.model = model;
        this.engineSpeed = engineSpeed;
        this.enginePower = enginePower;
        this.cargoWeight = cargoWeight;
        this.cargoType = cargoType;
        this.tyreOnePressure = tyreOnePressure;
        this.tyreOneAge = tyreOneAge;
        this.tyreTwoPressure = tyreTwoPressure;
        this.tyreTwoAge = tyreTwoAge;
        this.tyreThreePressure = tyreThreePressure;
        this.tyreThreeAge = tyreThreeAge;
        this.tyreFourPressure = tyreFourPressure;
        this.tyreFourAge = tyreFourAge;
    }


    public double getTyreOnePressure() {
        return tyreOnePressure;
    }

    public double getTyreTwoPressure() {
        return tyreTwoPressure;
    }

    public double getTyreThreePressure() {
        return tyreThreePressure;
    }

    public double getTyreFourPressure() {
        return tyreFourPressure;
    }

    public String getCargoType(){
        return cargoType;
    }

    public String getModel(){
        return model;
    }

    public int getEnginePower(){
        return enginePower;
    }

}
