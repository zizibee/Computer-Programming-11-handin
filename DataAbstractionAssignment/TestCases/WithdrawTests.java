import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WithdrawTests {

    @Before
    public void setup(){

    }

    @Test
    public void testToString(){
        Withdraw withdraw = new Withdraw(100, new Date(122, 0, 1, 20, 11, 30), Customer.SAVING);
        assertEquals(withdraw.toString(), "Withdraw of: 100.0 Date: Sat Jan 01 20:11:30 PST 2022 into account: Saving");
    }
}
