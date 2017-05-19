import java.util.List;

/**
 * Created by Bill on 17/5/2017.
 */
public class FizzBuzz {
    public static final Integer FIZZ_VALUE = 3;
    public static final String FIZZ_STR = "fizz";
    public static final Integer BUZZ_VALUE = 5;
    public static final String BUZZ_STR = "buzz";
    public static final Integer FIZZ_BUZZ_VALUE = 15;
    public static final String FIZZ_BUZZ_STR = "fizzbuzz";

    private final List<RulePrintStrategy> rules;

    private final RulePrintStrategy defaultRule;
    public FizzBuzz(List<RulePrintStrategy> rules, RulePrintStrategy defaultRule){
        this.rules = rules;
        this.defaultRule = defaultRule;
    }

    public String provideNumber(int providedNumber) {
        String returnedString;
         ReplyStrategy replyStrategy = ReplyStrategy.getInstance(getRules(),getDefaultRule());
        returnedString = replyStrategy.print(providedNumber);
        return returnedString;
    }
    public List<RulePrintStrategy> getRules() {
        return rules;
    }

    public RulePrintStrategy getDefaultRule() {
        return defaultRule;
    }
}

