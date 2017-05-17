import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Bill on 17/5/2017.
 */

public class FizzBuzzTest {

    @Test
    public void provideNumber_when_gets_one_answers_one() {
        final int providedNumber = 1;

        //expected
        final String expected = "1";

        //act
        FizzBuzz SUT = new FizzBuzz();
        final String actual = SUT.provideNumber(providedNumber);


        //Assert
        Assert.assertEquals("Expected value is 1", expected, actual);

    }
}
