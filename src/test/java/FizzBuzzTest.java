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
    private static final String EXPECTED_NotANumber = "This is not a number";

    private static final int POINTED_WITH_ONE = 1;
    private static final int POINTED_WITH_TWO = 2;
    private static final int POINTED_WITH_THREE = 3;
    private static final int POINTED_WITH_FIVE = 5;
    private static final int POINTED_WITH_FIFTEEN = 15;
    private static final int POINTED_WITH_SIXTY = 60;
    private static final String POINTED_WITH_A_GUN = "This is a gun";

    @Before
    public void setup() {

        SUT = new FizzBuzz();
    }

    private static final Object[] getPointedNumbersAndSayNumbers() {

        return new Object[]{

                new Object[]{POINTED_WITH_FIFTEEN, EXPECTED_FIZZBUZZ},
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
    @Test
    public void provideNumber_When_Gets_NonInteger_Answers_NotANumber(){

        //act
        final String actual = SUT.provideNumber(POINTED_WITH_A_GUN);

        //Assert
        Assert.assertEquals(EXPECTED_NotANumber,EXPECTED_NotANumber, actual);

    }
}
