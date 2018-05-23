import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VanTest {
    Van van;
    Engine engine;

    @Before
    public void before(){
        engine = new Engine();
        van = new Van(200, "White", engine);
    }

    @Test
    public void canGetPrice(){
        assertEquals(200, van.getPrice(), 0.1);
    }

    @Test
    public void canGetColour(){
        assertEquals("White", van.getColour());
    }

    @Test
    public void canGetEngine(){
        assertEquals(engine, van.getEngine());
    }

    @Test
    public void canVrmmm(){
        assertEquals("Vrmmm", engine.rev());
    }

    @Test
    public void canTurnEngineOn(){
        assertEquals("Vrmmm", van.turnOnEngine());
    }
}
