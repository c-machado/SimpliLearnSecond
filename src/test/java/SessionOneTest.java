import org.testng.Assert;
import org.testng.annotations.Test;

public class SessionOneTest {

    public SessionOne sessionOne = new SessionOne();

    @Test
    public void itIsAnArmstrongNumber(){

        final String armstrongNumber = "371";
        Assert.assertTrue(sessionOne.isAnArmstrongNumber(armstrongNumber));
    }

    @Test
    public void itIsNotAnArmstrongNumber(){
        final String notArmstrongNumber = "377";
        Assert.assertFalse(sessionOne.isAnArmstrongNumber(notArmstrongNumber));
    }

    @Test
    public void itIsAStrongNumber(){
        final String strongNumber = "145";
        Assert.assertTrue(sessionOne.isAStrongNumber(strongNumber));
    }

    @Test
    public void itIsAPerfectNumber(){
        final int perfectNumber = 28;
        Assert.assertTrue(sessionOne.isAPerfectNumber(perfectNumber));
    }

    @Test
    public void itIsNotAPerfectNumber(){
        final int notPerfectNumber = 33 ;
        Assert.assertFalse(sessionOne.isAPerfectNumber(notPerfectNumber));
    }



}
