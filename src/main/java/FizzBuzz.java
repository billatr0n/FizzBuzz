import com.fizzbuzz.printers.FizzBuzzPrinter;

/**
 * Created by Bill on 17/5/2017.
 */
public class FizzBuzz {
    FizzBuzzPrinter fizzBuzzPrinter;

    public String provideNumber(Integer number) {
        fizzBuzzPrinter = new FizzBuzzPrinter();
        return fizzBuzzPrinter.printResult(number);
    }


}

