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
public class DefaultBuzzStrategyTest {

    /**
     * Created by Bill on 17/5/2017.
     */

    DefaultBuzzStrategy SUT;

    private static final String EXPECTED_BUZZ = "buzz";

    private static final int POINTED_WITH_THREE = 3;
    private static final int POINTED_WITH_SIX = 6;
    private static final int POINTED_WITH_NINE = 9;
    private static final int POINTED_WITH_SIXTY = 60;

    @Before
    public void setup() {

        SUT = new DefaultBuzzStrategy();
    }

    private static final Object[] getPointedNumbersAndSayNumbers() {

        return new Object[]{

                new Object[]{POINTED_WITH_THREE, EXPECTED_BUZZ},
                new Object[]{POINTED_WITH_SIX, EXPECTED_BUZZ},
                new Object[]{POINTED_WITH_NINE, EXPECTED_BUZZ},
                new Object[]{POINTED_WITH_SIXTY, EXPECTED_BUZZ},
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
