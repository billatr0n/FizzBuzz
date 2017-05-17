import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Bill on 17/5/2017.
 */

public class FizzBuzzTest {

    @Test
    public void provideNumber_when_gets_one_answers_one() {
        //expected
        final String expected = "1";

        //act
        FizzBuzz myFz = new FizzBuzz();
        final String actual = myFz.provideNumber(expected);


        //Assert
        Assert.assertEquals("Expected value is 1", expected, actual);

    }
}
