import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer;

    @Before
    public void before(){
        customer = new Customer(800);
    }

    @Test
    public void canGetWallet(){
        assertEquals(800, customer.getWallet(), 0.1);
    }

    @Test
    public void canAddMoney(){
        customer.increaseWallet(50);
        assertEquals(850, customer.getWallet(), 0.1);
    }

    @Test
    public void canRemoveMoney(){
        customer.decreaseWallet(50);
        assertEquals(750, customer.getWallet(), 0.1);
    }
}
