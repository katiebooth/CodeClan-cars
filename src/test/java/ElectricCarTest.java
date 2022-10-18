import car.ElectricCar;
import car.Engine;
import car.EngineType;
import car.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {
    ElectricCar electricCar;
    Engine engine;
    Tyre tyre;

    @Before
    public void before(){
        engine = new Engine("1.7L", EngineType.ELECTRIC);
        tyre = new Tyre("Pirelli", 2);
        electricCar = new ElectricCar(40000, "blue", engine, tyre);
    }
    @Test
    public void electricCarHasPrice(){
        assertEquals(40000, electricCar.getPrice());
    }

    @Test
    public void electricCarHasColour(){
        assertEquals("blue", electricCar.getColour());
    }
    @Test
    public void electricCarHasEngine(){
        assertEquals(EngineType.ELECTRIC, electricCar.getEngine().getEngineType());
    }
    @Test
    public void electricCarHasTyreTread(){
        assertEquals(2, electricCar.getTyre().getTread());
    }
    @Test
    public void canFillElectricCar(){
        assertEquals("Plug me in and charge me up... baby!", electricCar.fuel());
    }
    @Test
    public void canStartElectricCar(){
        assertEquals("Push button... subdued vroom vroom!", electricCar.start());
    }

}
