import com.fizzbuzz.constants.FizzBuzzConstants;

/**
 * Created by Bill on 17/5/2017.
 */
public class FizzBuzz {


    public String provideNumber(Integer number) {
        String result = number.toString();

        if (isDividable(number, FizzBuzzConstants.FIZZBUZZ_DIVIDER))
            result = FizzBuzzConstants.FIZZ + FizzBuzzConstants.BUZZ;
        else if (isDividable(number, FizzBuzzConstants.BUZZ_DIVIDER))
            result = FizzBuzzConstants.BUZZ;
        else if (isDividable(number, FizzBuzzConstants.FIZZ_DIVIDER))
            result = FizzBuzzConstants.FIZZ;

        return result;
    }

    public boolean isDividable(Integer dividend, Integer divisor) {
        boolean result = false;

        if (Math.floorMod(dividend, divisor) == 0) {
            result = true;
        }
        return result;
    }

}

