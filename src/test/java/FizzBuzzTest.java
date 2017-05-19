import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Bill on 17/5/2017.
 */

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzTest {
    FizzBuzz SUT;
    private static final String EXPECTED_ONE = "1";
    private static final String EXPECTED_TWO = "2";
    private static final String EXPECTED_FIZZ = "fizz";
    private static final int POINTED_WITH_ONE = 1;
    private static final int POINTED_WITH_TWO = 2;
    private static final int POINTED_WITH_THREE = 3;

    @Before
    public void setup() {

        SUT = new FizzBuzz();
    }

    @Test
    public void provideNumber_when_gets_number_answers_expectedValue() {
        final int providedNumber = 1;

        //expected
        final String expected = "1";

        //act
        SUT = new FizzBuzz();
        final String actual = SUT.provideNumber(providedNumber);


        //Assert
        Assert.assertEquals("Expected value is 1", expected, actual);

    }

    private static final Object[] getPointedNumbersAndSayNumbers() {

        return new Object[]{

                new Object[]{POINTED_WITH_ONE, EXPECTED_ONE},
                new Object[]{POINTED_WITH_TWO, EXPECTED_TWO},
                new Object[]{POINTED_WITH_THREE, EXPECTED_FIZZ},
        };
    }


    @Test
    @Parameters(method = "getPointedNumbersAndSayNumbers")
    public void provideNumber_When_Gets_Number_Answers_ExpectedValue(int givenNumber, String expectedString) {

        //act
        final String actual = SUT.provideNumber(givenNumber);

        //Assert
        Assert.assertEquals("Expected value is " + expectedString, expectedString, actual);

    }
}
