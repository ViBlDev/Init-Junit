
package com.poe.demotestunitaire.calculator;




import com.poe.demotestunitaire.Calculator;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


public class CalculatorTest {
    
     @Test
    public void testAdd3plus2retourne5() {
        Calculator calculator = new Calculator();
        
        int result = calculator.add(3, 2);
        
        assertEquals(5, result);
    }
    
    @Test
    public void testAdd2plus1retourne3() {
        Calculator calculator = new Calculator();
        
        int result = calculator.add(2, 1);
        
        assertEquals(3, result);
    }
    
    
    @Test
    public void testAdd0plus0retourne0() {
        Calculator calculator = new Calculator();
        
        int result = calculator.add(0, 0);
        
        assertEquals(0, result);
    }
    
    @Test
    public void testAddMoinsCinqAndMoins4retourneMoinsNeuf() {
        Calculator calculator = new Calculator();
        
        int result = calculator.add(-5, -4);
        
        assertEquals(-9, result);
    }
    
    @Test
    public void testGrandNombres() {
         Calculator calculator = new Calculator();
        
        int result = calculator.add(5000, 10000);
        
        assertTrue(result == 15000);
    }
    
    @Test
    public void testDeuxObjets() {
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();
        
        c1 = c2;
        
        assertSame(c1, c2);
    }
    @Test
    public void testMaxBetweenOneAndTwo()
    {
        Calculator calculator = new Calculator();
        
        int result = calculator.max(1, 2);
        
        assertEquals(2, result);
    }
    @Test
    public void testMaxBetweenMinusOneAndMinusTwo()
    {
        Calculator calculator = new Calculator();
        
        int result = calculator.max(-1, -2);
        
        assertEquals(-1, result);
    }
    @Test
    public void testMaxBetweenSameValues(){
        Calculator calculator = new Calculator();
        
        int result = calculator.max(2, 2);
        
        assertEquals(2, result);   
    }
        @Test
    public void testDivideWithIntResult(){
        Calculator calculator = new Calculator();
        
        int result = calculator.divide(10, 5);
        
        assertEquals(2, result);        
    }
    @Test
    public void testDivideWithFloatResult(){
        Calculator calculator = new Calculator();
        
        int result = calculator.divide(10, 3);
        System.out.println(result);
        
        assertEquals(10/3, result);
    }
    @Test
    public void testDivideWithDividerAsZero(){
        Calculator calculator = new Calculator();
                
        assertThrows(ArithmeticException.class, () -> {
           calculator.divide(10, 0);
        });
    }
    @Test
    public void testGetNombresImpairs(){
        Calculator calculator = new Calculator();
        
        ArrayList<Integer> result = calculator.getNombresImpairs(5);
        
        //Ce sont des exemples que j'ai essay??s, ils font sensiblement la m??me chose
        //les utiliser ensemble n'apporte rien en plus.
        assertEquals(3, result.size());
        
        assertTrue(result.contains(3));
        assertFalse(result.contains(2));
        
        assertTrue(result.containsAll(Arrays.asList(1, 3, 5)));
    }
    //EXEMPLES avec des PARAMS
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4})
    void testParametreAvecValueSource(int valeur) {
        assertEquals(valeur + valeur, valeur * 2);
    }

    @ParameterizedTest
    @CsvSource({"1, 1", "1, 2", "2, 3"})
    void testAdditioner(int a, int b) {
        int attendu = a + b;
        assertEquals(attendu, a + b);
    }
    
    @ParameterizedTest
    @CsvSource({"1, 1, 2", "1, 2, 3", "2, 3, 5"})
    void testAdditionerAvecResultat(int a, int b, int result) {
        assertEquals(result, a + b);
    }
        
    @ParameterizedTest
    @CsvSource({"1, 1, 1", "1, 2, 2", "5, 3, 5", "-1, -4, -1"})
    void testMaxAvecJeuDeDonnees(int a, int b, int result) {
        Calculator calculator = new Calculator();
        
        assertEquals(result, calculator.max(a, b));
    }
}
