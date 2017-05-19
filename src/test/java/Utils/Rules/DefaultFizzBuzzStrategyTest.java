package Utils.Rules;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by vasilis on 19-5-17.
 */
@RunWith(JUnitParamsRunner.class)
public class DefaultFizzBuzzStrategyTest {

    /**
     * Created by Bill on 17/5/2017.
     */

    DefaultFizzBuzzStrategy SUT;

    private static final String EXPECTED_FIZZ_BUZZ = "fizzbuzz";

    private static final int POINTED_WITH_THIRTY = 30;
    private static final int POINTED_WITH_FOURTYFIVE = 45;
    private static final int POINTED_WITH_SIXTY = 60;

    @Before
    public void setup() {

        SUT = new DefaultFizzBuzzStrategy();
    }

    private static final Object[] getPointedNumbersAndSayNumbers() {

        return new Object[]{

                new Object[]{POINTED_WITH_THIRTY, EXPECTED_FIZZ_BUZZ},
                new Object[]{POINTED_WITH_FOURTYFIVE, EXPECTED_FIZZ_BUZZ},
                new Object[]{POINTED_WITH_SIXTY, EXPECTED_FIZZ_BUZZ},
        };
    }

    @Test
    @Parameters(method = "getPointedNumbersAndSayNumbers")
    public void provideNumber_When_Gets_Number_Answers_ExpectedValue(int givenNumber, String expectedString) {

        //act
        final String actual = SUT.printReply(givenNumber);

        //Assert
        Assert.assertEquals("Expected value is " + expectedString, expectedString, actual);

    }

}
