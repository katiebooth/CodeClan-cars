package car;

public class ElectricCar extends Car{

    public ElectricCar(int price, String colour, Engine engine, Tyre tyre) {
        super(price, colour, engine, tyre);
    }

    @Override
    public String fuel() {
        return "Plug me in and charge me up... baby!";
    }
    @Override
    public String start(){
        return "Push button... subdued vroom vroom!";
    }
}
