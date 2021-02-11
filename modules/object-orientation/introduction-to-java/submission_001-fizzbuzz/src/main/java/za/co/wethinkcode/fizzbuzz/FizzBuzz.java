package za.co.wethinkcode.fizzbuzz;

import java.util.Arrays;

/**
 * <h1>FizzBuzz</h1>
 * This FizzBuzz program applies 2 methods that have 1 int number as a parameter
 * and return "Fizz" if the number is divisible by 3, "Buzz" if the number is
 * divisible by 5 and "FizzBuzz" if the number is divisible by 3 and 5.
 *
 * @author Roodt Brummer
 * @since 2021-02-11
 */
public class FizzBuzz {
    /**
     * This method is used to check if a number is divisible by 3, 5, or 3 and 5
     * and return "Fizz" for 3, "Buzz" for 5 and "FizzBuzz" for 3 and 5.
     * @param number This is the parameter to the checkNumber method
     * @return String This returns "Fizz", "Buzz", or "FizzBuzz".
     */
    public String checkNumber(int number) {
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;

        if ( divisibleBy3 && divisibleBy5 ) {
            return "FizzBuzz";
        }
        if ( divisibleBy3 ) {
            return "Fizz";
        }
        if ( divisibleBy5 ) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
    /**
     * This method is used to check if all the numbers below the given parameter
     * are divisible by 3, 5, or 3 and 5, and return a String of an array
     * with the numbers replaced with "Fizz", "Buzz" or "FizzBuzz" if they are
     * divisible by 3, 5, or 3 and 5.
     * @param number This is the parameter to the countTo method
     * @return String This returns a string of an array with replaced numbers.
     */
    public String countTo(int number) {
        String[] fizzBuzzSeq = new String[number];

        for ( int i=0; i<fizzBuzzSeq.length; i++ ) {
            fizzBuzzSeq[i] = checkNumber(i+1);
        }
        return Arrays.toString(fizzBuzzSeq);
    }
}
