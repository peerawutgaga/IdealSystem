package driver.actor;
/*--- AUTO IMPORT START HERE ---*/
import P1.A5;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*--- AUTO IMPORT END HERE ---*/
public class ActorDriver{
    @Test
    public void testCalculateInA5(){
        A5 a5 = new A5();
        int actualResult = a5.calculate(1339456148,11023214);
        assertEquals(1151021163,actualResult);
    }
    @Test
    public void testProcessInA5(){
        A5 a5 = new A5();
        double actualResult = a5.process(1.4008005032988,16.973471225187);
        assertEquals(0.78601256230361,actualResult,0.893);
    }
    @Test
    public void testProcessInA51(){
        A5 a5 = new A5();
        double actualResult = a5.process(1.4553432853457,0.10311132243053,2.8924950480855);
        assertEquals(0.11374702565775,actualResult,0.153);
    }
}

