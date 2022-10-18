import car.Engine;
import car.EngineType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {
    Engine engine;

    @Before
    public void before(){engine = new Engine("1.4L", EngineType.PETROL);}

    @Test
    public void engineHasSize(){
        assertEquals("1.4L", engine.getEngineSize());
    }
    @Test
    public void engineHasType(){
        assertEquals(EngineType.PETROL, engine.getEngineType());
    }
}
