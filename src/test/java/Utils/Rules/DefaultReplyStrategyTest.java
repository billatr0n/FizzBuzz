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
public class DefaultReplyStrategyTest {

    /**
     * Created by Bill on 17/5/2017.
     */

    DefaultReplyStrategy SUT;

    private static final String EXPECTED_ONE = "1";
    private static final String EXPECTED_TWO = "2";
    private static final String EXPECTED_FOUR = "4";

    private static final int POINTED_WITH_ONE = 1;
    private static final int POINTED_WITH_TWO = 2;
    private static final int POINTED_WITH_FOUR = 4;

    @Before
    public void setup() {

        SUT = new DefaultReplyStrategy();
    }

    private static final Object[] getPointedNumbersAndSayNumbers() {

        return new Object[]{

                new Object[]{POINTED_WITH_ONE, EXPECTED_ONE},
                new Object[]{POINTED_WITH_TWO, EXPECTED_TWO},
                new Object[]{POINTED_WITH_FOUR, EXPECTED_FOUR},
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
