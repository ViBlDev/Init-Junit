
package com.poe.demotestunitaire;


public class Calculator {
    
    public int add (int a, int b){
        return a + b;
    }
    public int max(int a, int b) {
        // return a > b ? a : b; (version refactoré)
        if( a > b){
        return a;
        }
        else if ( b > a){
        return b;
        }
        else 
        return b = a;
    }
    
    public float divide (float a, float b){
    return a / b;
    }
    
}