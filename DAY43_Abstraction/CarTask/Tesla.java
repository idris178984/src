package DAY43_Abstraction.CarTask;

public class Tesla extends Car{

    public Tesla( String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }    @Override
    public void stop() {
        System.out.println("say, start");
    }

    @Override
    public void start() {

    }

}
