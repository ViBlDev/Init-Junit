
package com.poe.demotestunitaire.games;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FizzBuzzTest {
    
    @Test
    public void FizzBuzzTest() {
        assertEquals("fizz", FizzBuzz.play(3));
        assertEquals("buzz", FizzBuzz.play(5));
        assertEquals("fizzbuzz", FizzBuzz.play(15));
        assertEquals("7", FizzBuzz.play(7));
    }
    
}
