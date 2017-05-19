/**
 * Created by Bill on 17/5/2017.
 */
public class FizzBuzz {
    public static final Integer FIZZ_VALUE = 3;
    public static final String FIZZ_STR = "fizz";
    public static final Integer BUZZ_VALUE = 5;
    public static final String BUZZ_STR = "buzz";

    public String provideNumber(int providedNumber) {
        String result = String.valueOf(providedNumber);
        if(isFizz(providedNumber)){
            result = FIZZ_STR;
        }else if(isBuzz(providedNumber)){
            result = BUZZ_STR;
        }
        return result;
    }

    public boolean isFizz(int provideNumber) {
        boolean result = false;
        if (Math.floorMod(provideNumber, FIZZ_VALUE) == 0) {
            return true;
        }
        return result;
    }

    public boolean isBuzz(int provideNumber) {
        boolean result = false;
        if (Math.floorMod(provideNumber, BUZZ_VALUE) == 0) {
            return true;
        }
        return result;
    }
}

