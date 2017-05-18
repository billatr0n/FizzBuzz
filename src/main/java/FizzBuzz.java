/**
 * Created by Bill on 17/5/2017.
 */
public class FizzBuzz {

    public static String FIZZ = "fizz";
    public static int FIZZ_DIVISOR = 3;

    public static String BUZZ = "buzz";
    public static int BUZZ_DIVISOR = 5;
    public static int FIZZBUZZ_DIVISOR = 15;

    private static final String NOT_A_NUMBER = "This is not a number";


    public String provideNumber(Object value) {
        String returnedString = "";
        if (Integer.class != value.getClass()) {
            returnedString = NOT_A_NUMBER;
        } else {
            Integer intValue = (Integer) value;

            if (Math.floorMod(intValue, FIZZBUZZ_DIVISOR) == 0) {
                returnedString = FIZZ + BUZZ;
            } else if (Math.floorMod(intValue, FIZZ_DIVISOR) == 0) {
                returnedString = FIZZ;
            } else if (Math.floorMod(intValue, BUZZ_DIVISOR) == 0) {
                returnedString = BUZZ;
            } else
                returnedString = String.valueOf(value);
        }
            return returnedString;

    }
}
