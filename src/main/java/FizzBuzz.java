/**
 * Created by Bill on 17/5/2017.
 */
public class FizzBuzz {
    public static String FIZZ = "fizz";
    public static int FIZZ_DIVIDER = 3;

    public static String BUZZ = "buzz";
    public static int BUZZ_DIVIDER = 5;

    public String provideNumber(Integer number){
        String result = number.toString();

        if(isDividable(number,FIZZ_DIVIDER))
            result = FIZZ;
        else if(isDividable(number,BUZZ_DIVIDER))
            result = BUZZ;

        return result;
    }

    public boolean isDividable(Integer dividend, Integer divisor){
        boolean result = false;

        if(Math.floorMod(dividend, divisor) == 0){
            result = true;
        }
        return result;
    }

}

