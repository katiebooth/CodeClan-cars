import car.Engine;
import car.EngineType;
import car.PetrolCar;
import car.Tyre;
import customer.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Engine engine;
    Tyre tyre;
    PetrolCar petrolCar;

    @Before
    public void before(){
        engine = new Engine("3L", EngineType.PETROL);
        tyre = new Tyre("Goodyear", 2);
        petrolCar = new PetrolCar(6000, "white", engine, tyre);
        customer = new Customer(7000);
    }
    @Test
    public void customerHasWallet(){
        assertEquals(7000, customer.getWallet());
    }
    @Test
    public void customerCarListStartsEmpty(){
        assertEquals(0, customer.getCustomerCars().size());
    }
    @Test
    public void customerCanBuyCar(){
        customer.buy(petrolCar);
        assertEquals(1, customer.getCustomerCars().size());
        assertEquals(1000, customer.getWallet());
    }
}
