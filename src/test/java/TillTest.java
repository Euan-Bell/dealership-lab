import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TillTest {
    Till till;

    @Before
    public void before(){
        till = new Till(500);
    }

    @Test
    public void getMoney(){
        assertEquals(500, till.getMoney(), 0.1);
    }

    @Test
    public void canAddMoney(){
        till.increaseMoney(50);
        assertEquals(550, till.getMoney(), 0.1);
    }

    @Test
    public void canRemoveMoney(){
        till.decreaseMoney(50);
        assertEquals(450, till.getMoney(), 0.1);
    }
}
