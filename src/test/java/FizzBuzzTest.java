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

    private static final int POINTED_WITH_ONE = 1;
    private static final int POINTED_WITH_TWO = 2;

    @Before
    public void setup() {

        SUT = new FizzBuzz();
    }

    //In gogle drive there is a good book that explain this practical unit testing with junit and mockito
    private static final Object[] getPointedNumbersAndSayNumbers() {

        return new Object[]{

                new Object[]{POINTED_WITH_ONE, EXPECTED_ONE},
                new Object[]{POINTED_WITH_TWO, EXPECTED_TWO},
        };
    }


    @Test
    @Parameters(method = "getPointedNumbersAndSayNumbers")
    public void provideNumber_when_gets_one_answers_one(int givenNumber, String expectedString) {

        //act
        final String actual = SUT.provideNumber(givenNumber);

        //Assert
        Assert.assertEquals("Expected value is " + expectedString, expectedString, actual);

    }
}
