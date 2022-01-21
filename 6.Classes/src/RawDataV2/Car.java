package RawDataV2;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tyre[] tiers;

    public Car(String model, Engine engine, Cargo cargo, Tyre[] tiers) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tiers = tiers;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Tyre[] getTiers() {
        return tiers;
    }

    public void setTiers(Tyre[] tiers) {
        this.tiers = tiers;
    }

    public Engine getEngine() {
        return engine;
    }

    public boolean hasTierWithLittlePressure(){
        for (Tyre tire:tiers) {
            if (tire.getPressure()<1){
                return true;
            }
        }
        return false;
    }

}
