package Utils.Rules;


import static Utils.Constants.FizzBuzzConstants.BUZZ_DIVISOR;
import static Utils.Constants.FizzBuzzConstants.BUZZ_STRING;

/**
 * Created by vasilis on 19-5-17.
 */
public class DefaultBuzzStrategy implements RuleReplyStrategy {


    public String printReply(Integer number) {
        return BUZZ_STRING;
    }

    public boolean isApplicable(Integer dividend) {
        boolean result = false;
        if (Math.floorMod(dividend, BUZZ_DIVISOR) == 0)
            result = true;
        return result;
    }
}
