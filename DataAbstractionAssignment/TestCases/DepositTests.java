import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DepositTests {

    @Before
    public void setup(){

    }

    @Test
    public void testToString(){
        Deposit deposit = new Deposit(100, new Date(122, 0, 1, 20, 11, 30), Customer.CHECKING);
        assertEquals(deposit.toString(), "Deposit of: 100.0 Date: Sat Jan 01 20:11:30 PST 2022 into account: Checking");
    }
}
