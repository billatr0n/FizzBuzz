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

    @Test
    public void provideNumber_when_gets_dividable_by_three_answers_fizz() {
        final int providedNumber = 3;

        //expected
        final String expected = "fizz";

        //act
        FizzBuzz SUT = new FizzBuzz();
        final String actual = SUT.provideNumber(providedNumber);


        //Assert
        Assert.assertEquals("Expected value is fizz", expected, actual);

    }

    @Test
    public void provideNumber_when_gets_dividable_by_five_answers_buzz() {
        final int providedNumber = 5;

        //expected
        final String expected = "buzz";

        //act
        FizzBuzz SUT = new FizzBuzz();
        final String actual = SUT.provideNumber(providedNumber);


        //Assert
        Assert.assertEquals("Expected value is buzz", expected, actual);

    }

    @Test
    public void provideNumber_when_gets_dividable_by_both_answers_fizzbuzz() {
        final int providedNumber = 15;

        //expected
        final String expected = "fizzbuzz";

        //act
        FizzBuzz SUT = new FizzBuzz();
        final String actual = SUT.provideNumber(providedNumber);


        //Assert
        Assert.assertEquals("Expected value is fizzbuzz", expected, actual);

    }
}
