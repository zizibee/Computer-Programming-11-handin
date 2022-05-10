import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CustomerTests {
    Customer customer;
    Date firstDate = new Date(122, 0, 1, 20, 11, 30);
    Date secondDate = new Date(122, 1, 1, 20, 11, 30);

    @Before
    public void setup(){
        customer = new Customer("Jobe", 123, 1000, 2000);
    }

    @Test
    public void testDeposit(){
        assertEquals(customer.deposit(500, firstDate, Customer.CHECKING), 1500, 0);
        assertEquals(customer.deposit(1000, secondDate, Customer.CHECKING), 2500, 0);
        assertEquals(customer.deposit(500, firstDate, Customer.SAVING), 2500, 0);
        assertEquals(customer.deposit(1000, secondDate, Customer.SAVING), 3500, 0);
        customer.displayDeposits();
    }

    @Test
    public void testWithdraw(){
        assertEquals(customer.withdraw(700, firstDate, Customer.CHECKING), 300, 0);
        assertEquals(customer.withdraw(1000, secondDate, Customer.CHECKING), 300, 0); //test ovd
        assertEquals(customer.withdraw(900, firstDate, Customer.SAVING), 1100, 0);
        assertEquals(customer.withdraw(1500, secondDate, Customer.SAVING), 1100, 0); //test over d
        customer.displayWithdraws();
    }
}
