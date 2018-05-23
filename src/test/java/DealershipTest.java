import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {
    Dealership dealership;
    Dealer dealer;
    Till till;
    Customer customer;
    ArrayList<Vehicle> vehicles;

    @Before
    public void before(){
        dealer = new Dealer();
        till = new Till(500);
        customer = new Customer(800);
        vehicles = new ArrayList<>();

        dealership = new Dealership(dealer, till, customer, vehicles);
    }

    @Test
    public void canGetDealer(){
        assertEquals(dealer, dealership.getDealer());
    }

    @Test
    public void canGetTill(){
        assertEquals(till, dealership.getTill());
    }

    @Test
    public void canGetCustomer(){
        assertEquals(customer, dealership.getCustomer());
    }

    @Test
    public void canGetVehicleCount(){
        assertEquals(0, dealership.vehiclesCount());
    }

    @Test
    public void canAddVehicle(){
        Engine engine = new Engine();
        Car car = new Car(100, "Red", engine);
        vehicles.add(car);
        assertEquals(1, dealership.vehiclesCount());
    }

    @Test
    public void canRemoveVehicle(){
        Engine engine = new Engine();
        Car car = new Car(100, "Red", engine);
        vehicles.add(car);
        vehicles.remove(car);
        assertEquals(0, dealership.vehiclesCount());
    }

    @Test
    public void canBuyVehicle(){
        Engine engine = new Engine();
        Van van = new Van(100, "White", engine);
        dealership.buyNewVehicle(van);
        assertEquals(1, dealership.vehiclesCount());
        assertEquals(400, till.getMoney(), 0.1);
    }
}
