package dealership;

import car.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class Dealership {

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
}
