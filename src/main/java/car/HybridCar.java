package car;

public class HybridCar extends Car{

    public HybridCar(int price, String colour, Engine engine, Tyre tyre) {
        super(price, colour, engine, tyre);
    }

    @Override
    public String fuel() {
        return "Away and visit the charge point and or fuel station mate.";
    }

}
