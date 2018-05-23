import org.junit.Before;

public class CarTest {
    Car car;
    Engine engine;

    @Before
    public void before(){
        engine = new Engine();
        car = new Car(100, "Red", engine);
    }
}
