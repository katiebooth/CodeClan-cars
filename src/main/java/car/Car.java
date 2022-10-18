package car;

import behaviours.IFuelable;
import behaviours.IStartable;

public abstract class Car implements IStartable, IFuelable {
    private int price;
    private String colour;
    private Engine engine;
    private Tyre tyre;

    public Car(int price, String colour, Engine engine, Tyre tyre){
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.tyre = tyre;
    }

    public int getPrice(){
        return price;
    }

    public String getColour(){
        return colour;
    }

    public Engine getEngine(){
        return engine;
    }

    public Tyre getTyre(){
        return tyre;
    }

    public String start(){
        return "Turn key in ignition... vroom vroom!";
    }
}
