package car;

public class PetrolCar extends Car{

    public PetrolCar(int price, String colour, Engine engine, Tyre tyre) {
        super(price, colour, engine, tyre);
    }

    @Override
    public String fuel() {
        return "Go to petrol station.";
    }
}
