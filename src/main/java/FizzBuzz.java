/**
 * Created by Bill on 17/5/2017.
 */
public class FizzBuzz {

    public static String FIZZ = "fizz";
    public static int FIZZ_DIVISOR = 3;

    public String provideNumber(Integer value) {
        String returnedString = "";
        if (Math.floorMod(value, FIZZ_DIVISOR) == 0) {
            returnedString = FIZZ;
        } else
            returnedString = String.valueOf(value);

            return returnedString;
    }
}

