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
public class DefaultFizzStrategyTest {

    /**
     * Created by Bill on 17/5/2017.
     */

    DefaultFizzStrategy SUT;

    private static final String EXPECTED_FIZZ = "fizz";

    private static final int POINTED_WITH_FIVE = 5;
    private static final int POINTED_WITH_TEN = 10;
    private static final int POINTED_WITH_TWENTY = 20;
    private static final int POINTED_WITH_TWENTYFIVE = 25;

    @Before
    public void setup() {

        SUT = new DefaultFizzStrategy();
    }

    private static final Object[] getPointedNumbersAndSayNumbers() {

        return new Object[]{

                new Object[]{POINTED_WITH_FIVE, EXPECTED_FIZZ},
                new Object[]{POINTED_WITH_TEN, EXPECTED_FIZZ},
                new Object[]{POINTED_WITH_TWENTY, EXPECTED_FIZZ},
                new Object[]{POINTED_WITH_TWENTYFIVE, EXPECTED_FIZZ},
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
