package RawData;

public class Tyres {
    private String model;
    private String cargoType;
    private double tyreOnePressure;
    private double tyreTwoPressure;
    private double tyreThreePressure;
    private double tyreFourPressure;


    public Tyres (String model,String cargoType, double tyreOnePressure, double tyreTwoPressure,double tyreThreePressure, double tyreFourPressure){
        this.model=model;
        this.cargoType=cargoType;
        this.tyreOnePressure=tyreOnePressure;
        this.tyreTwoPressure=tyreTwoPressure;
        this.tyreThreePressure=tyreThreePressure;
        this.tyreFourPressure=tyreFourPressure;
    }

    public String getCargoType(){
        return cargoType;
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

    public String getModel(){
        return model;
    }

}
