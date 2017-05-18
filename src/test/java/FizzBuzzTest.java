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
    private static final String EXPECTED_BUZZ = "buzz";
    private static final String EXPECTED_FIZZBUZZ = "fizzbuzz";

    private static final int POINTED_WITH_ONE = 1;
    private static final int POINTED_WITH_TWO = 2;
    private static final int POINTED_WITH_THREE = 3;
    private static final int POINTED_WITH_FIVE = 5;
    private static final int POINTED_WITH_FIFTEEN = 15;
    private static final int POINTED_WITH_SIXTY = 60;

    @Before
    public void setup() {

        SUT = new FizzBuzz();
    }

    //In gogle drive there is a good book that explain this practical unit testing with junit and mockito
    private static final Object[] getPointedNumbersAndSayNumbers() {

        return new Object[]{

                new Object[]{POINTED_WITH_ONE, EXPECTED_ONE},
                new Object[]{POINTED_WITH_TWO, EXPECTED_TWO},
                new Object[]{POINTED_WITH_THREE, EXPECTED_FIZZ},
                new Object[]{POINTED_WITH_FIVE, EXPECTED_BUZZ},
                new Object[]{POINTED_WITH_FIFTEEN, EXPECTED_FIZZBUZZ},
                new Object[]{POINTED_WITH_SIXTY, EXPECTED_FIZZBUZZ},
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
