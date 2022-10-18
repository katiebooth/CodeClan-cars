package dealership;

import behaviours.IBuyable;
import behaviours.ISellable;
import car.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class Dealership implements IBuyable, ISellable {

    private int till;
    private ArrayList<Car> dealershipCars;

    public Dealership(int till){
        this.till = till;
        this.dealershipCars = new ArrayList<>();
    }

    public int getTill(){
        return till;
    }

    public ArrayList getDealershipCars(){
        return dealershipCars;
    }

    public void buy(Car car){
        dealershipCars.add(car);
    }

    public void sell(Car car){
        dealershipCars.remove(car);
        till += car.getPrice();
    }
}
