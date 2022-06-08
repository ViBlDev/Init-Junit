
package com.poe.demotestunitaire.games;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FizzBuzzTest {
    
    @Test
    public void FizzBuzzTestFizz() {
        assertEquals("fizz", FizzBuzz.play(3));
    }
    
    @Test
    public void FizzBuzzTestBuzz() {
        assertEquals("buzz", FizzBuzz.play(5));
    }
    
        @Test
    public void FizzBuzzTestFizzBuzz() {
        assertEquals("fizzbuzz", FizzBuzz.play(15));
    }
    
    @Test
    public void FizzBuzzTestOtherNumber() {
        assertEquals("7", FizzBuzz.play(7));
    }
}
