import car.Engine;
import car.EngineType;
import car.PetrolCar;
import car.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolCarTest {
    PetrolCar petrolCar;
    Engine engine;
    Tyre tyre;

    @Before
    public void before(){
        engine = new Engine("1.4L", EngineType.PETROL);
        tyre = new Tyre("Yokohama", 1);
        petrolCar = new PetrolCar(500, "maroon", engine, tyre);}

    @Test
    public void petrolCarHasPrice(){
        assertEquals(500, petrolCar.getPrice());
    }
    @Test
    public void petrolCarHasColour(){
        assertEquals("maroon", petrolCar.getColour());
    }
    @Test
    public void petrolCarHasEngine(){
        assertEquals(EngineType.PETROL, petrolCar.getEngine().getEngineType());
    }
    @Test
    public void petrolCarHasTyreTread(){
        assertEquals(1, petrolCar.getTyre().getTread());
    }
    @Test
    public void canFillPetrolCar(){
        assertEquals("Go to petrol station.", petrolCar.fuel());
    }
    @Test
    public void canStartPetrolCar(){
        assertEquals("Turn key in ignition... vroom vroom!", petrolCar.start());
    }

}
