/**
 * Created by Bill on 17/5/2017.
 */
public class FizzBuzz {

    public static String FIZZ = "fizz";
    public static int FIZZ_DIVISOR = 3;

    public static String BUZZ = "buzz";
    public static int BUZZ_DIVISOR = 5;

    public String provideNumber(Integer value) {
        String returnedString = "";
        if (Math.floorMod(value, FIZZ_DIVISOR) == 0) {
            returnedString = FIZZ;
        } else if (Math.floorMod(value, BUZZ_DIVISOR) == 0) {
            returnedString = BUZZ;
        } else
            returnedString = String.valueOf(value);

        return returnedString;
    }
}
