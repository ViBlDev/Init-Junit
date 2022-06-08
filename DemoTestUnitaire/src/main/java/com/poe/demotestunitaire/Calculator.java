
package com.poe.demotestunitaire;

import java.util.ArrayList;


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
    public int divide(int dividende, int diviseur){
        return dividende/diviseur;
    }
    
    public ArrayList<Integer> getNombresImpairs(int max){
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i=0; i<=max; i++){
            if (i%2 != 0){
                result.add (i);
            }
        }
        
        return result;
    }
    
}