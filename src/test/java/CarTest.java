import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    Car car;
    Engine engine;

    @Before
    public void before(){
        engine = new Engine();
        car = new Car(100, "Red", engine);
    }

    @Test
    public void canGetPrice(){
        assertEquals(100, car.getPrice(), 0.1);
    }

    @Test
    public void canGetColour(){
        assertEquals("Red", car.getColour());
    }

    @Test
    public void canGetEngine(){
        assertEquals(engine, car.getEngine());
    }

    @Test
    public void canVrmmm(){
        assertEquals("Vrmmm", engine.rev());
    }

    @Test
    public void canTurnEngineOn(){
        assertEquals("Vrmmm", car.turnOnEngine());
    }
}
