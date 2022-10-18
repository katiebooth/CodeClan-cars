package customer;

import behaviours.IBuyable;
import car.Car;

import java.util.ArrayList;

public class Customer implements IBuyable {
    private int wallet;
    private ArrayList<Car> customerCars;

    public Customer(int wallet){
        this.wallet = wallet;
        this.customerCars = new ArrayList<>();
    }
    public int getWallet(){
        return wallet;
    }
    public ArrayList getCustomerCars(){
        return customerCars;
    }
    public void buy(Car car){
        if(wallet > car.getPrice()){
            wallet -= car.getPrice();
            customerCars.add(car);
        }
    }
}
