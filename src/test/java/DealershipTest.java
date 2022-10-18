import car.Engine;
import car.EngineType;
import car.PetrolCar;
import car.Tyre;
import customer.Customer;
import dealership.Dealership;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {
    Customer customer;
    Engine engine;
    Tyre tyre;
    PetrolCar petrolCar;
    Dealership dealership;

    @Before
    public void before(){
        engine = new Engine("3L", EngineType.PETROL);
        tyre = new Tyre("Goodyear", 2);
        petrolCar = new PetrolCar(6000, "white", engine, tyre);
        customer = new Customer(7000);
        dealership = new Dealership(5000000);
    }

    @Test
    public void dealershipHasTill(){
        assertEquals(5000000, dealership.getTill());
    }
    @Test
    public void dealershipCarsStartsEmpty(){
        assertEquals(0, dealership.getDealershipCars().size());
    }

}
