package GenericBox;

public class BoxOption<T> {
    private T input;


    public BoxOption (T input){
        this.input=input;
    }

    @Override
    public String toString() {
        return String.format("%s: %s",input.getClass().getName(), this.input);
    }
}
