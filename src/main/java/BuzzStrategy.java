/**
 * Created by vasilis on 19-5-17.
 */
public class BuzzStrategy implements PrintStrategy{

    public static final Integer BUZZ_VALUE = 5;
    public static final String BUZZ_STR = "buzz";

    public boolean strategyApplies(Integer value) {
        boolean result = false;
        if(Math.floorMod(value, BUZZ_VALUE) == 0){
            result = true;
        }
        return result;
    }

    public String printResponse() {
        return BUZZ_STR;
    }
}
