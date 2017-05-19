package Utils;

import Utils.Constants.FizzBuzzConstants;
import Utils.Rules.*;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by vasilis on 19-5-17.
 */
public class ReplyStrategy {
    public static ReplyStrategy singleton;

    private List<RuleReplyStrategy> rules;
    private RuleReplyStrategy defaultRule;

    public String print(Integer number){
        String reply = FizzBuzzConstants.INVALID_NUMBER;
        if(rules.isEmpty()){
            reply = defaultRule.printReply(number);
        }
        for(RuleReplyStrategy rule : rules){
            if(rule.isApplicable(number)){
                reply =  rule.printReply(number);
                break;
            }
        }
        return reply;
    }

    private ReplyStrategy() {
        defineRules();
    }

    private void defineRules() {
        rules = new ArrayList<RuleReplyStrategy>();
        rules.add(new DefaultFizzBuzzStrategy());
        rules.add(new DefaultFizzStrategy());
        rules.add(new DefaultBuzzStrategy());
        rules.add(new DefaultReplyStrategy());

        defaultRule = new DefaultReplyStrategy();

    }

    public static ReplyStrategy getInstance() {
        if (singleton == null) {
            singleton = new ReplyStrategy();
        }
        return singleton;
    }

}
