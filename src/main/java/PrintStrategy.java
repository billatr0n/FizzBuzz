/**
 * Created by vasilis on 19-5-17.
 */
public interface PrintStrategy {
    boolean strategyApplies(Integer value);

    String printResponse();
}
