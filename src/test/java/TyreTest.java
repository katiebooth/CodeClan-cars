import car.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyre tyre;

    @Before
    public void before(){tyre = new Tyre("GoodYear", 3);}

    @Test
    public void tyreHasBrand(){
        assertEquals("GoodYear", tyre.getBrand());
    }
    @Test
    public void tyreHasTread(){
        assertEquals(3, tyre.getTread());
    }

}
