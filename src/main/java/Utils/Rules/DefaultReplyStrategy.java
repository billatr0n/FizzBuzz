package Utils.Rules;

import static Utils.Constants.FizzBuzzConstants.FIZZ_DIVISOR;
import static Utils.Constants.FizzBuzzConstants.BUZZ_DIVISOR;

/**
 * Created by vasilis on 19-5-17.
 */
public class DefaultReplyStrategy implements RuleReplyStrategy {

    public String printReply(Integer number) {
        return String.valueOf(number);
    }

    public boolean isApplicable(Integer dividend) {
        boolean result = false;
        if (Math.floorMod(dividend, FIZZ_DIVISOR) != 0 && Math.floorMod(dividend, BUZZ_DIVISOR) != 0 )
            result = true;
        return result;
    }
}
