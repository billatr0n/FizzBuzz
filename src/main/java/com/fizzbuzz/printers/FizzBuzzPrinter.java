package com.fizzbuzz.printers;

import com.fizzbuzz.strategy.FizzBuzzStrategy;

/**
 * Created by Bill on 17/5/2017.
 */
public class FizzBuzzPrinter {

    public String printResult(Integer number){
        FizzBuzzStrategy fizzBuzzStrategy = new FizzBuzzStrategy();
        return fizzBuzzStrategy.getResult(number);
    }
}
