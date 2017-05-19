package Utils.Rules;

/**
 * Created by vasilis on 19-5-17.
 */
public interface RuleReplyStrategy {

    boolean isApplicable(Integer dividend);

    String printReply(Integer number);

}
