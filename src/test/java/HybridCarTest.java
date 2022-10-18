import car.Engine;
import car.EngineType;
import car.HybridCar;
import car.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridCar hybridCar;
    Engine engine;
    Tyre tyre;

    @Before
    public void before(){
        engine = new Engine("2L", EngineType.HYBRID);
        tyre = new Tyre("Phillips", 4);
        hybridCar = new HybridCar(20000, "silver", engine, tyre);
    }

    @Test
    public void hybridCarHasPrice(){
        assertEquals(20000, hybridCar.getPrice());
    }

    @Test
    public void hybridCarHasColour(){
        assertEquals("silver", hybridCar.getColour());
    }
    @Test
    public void hybridCarHasEngine(){
        assertEquals(EngineType.HYBRID, hybridCar.getEngine().getEngineType());
    }
    @Test
    public void petrolCarHasTyreTread(){
        assertEquals(4, hybridCar.getTyre().getTread());
    }
    @Test
    public void canFillHybridCar(){
        assertEquals("Away and visit the charge point and or fuel station mate.", hybridCar.fuel());
    }
    @Test
    public void canStartHybridCar(){
        assertEquals("Turn key in ignition... vroom vroom!", hybridCar.start());
    }

}
