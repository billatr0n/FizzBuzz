package Utils.Rules;

import static Utils.Constants.FizzBuzzConstants.FIZZ_BUZZ_DIVISOR;
import static Utils.Constants.FizzBuzzConstants.FIZZ_BUZZ_STRING;

/**
 * Created by vasilis on 19-5-17.
 */
public class DefaultFizzBuzzStrategy implements RuleReplyStrategy {

    public String printReply(Integer number) {
        return FIZZ_BUZZ_STRING;
    }

    public boolean isApplicable(Integer dividend) {
        boolean result = false;
        if (Math.floorMod(dividend, FIZZ_BUZZ_DIVISOR) == 0)
            result = true;
        return result;
    }
}
