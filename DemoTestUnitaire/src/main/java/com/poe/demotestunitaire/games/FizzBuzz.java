
package com.poe.demotestunitaire.games;


public class FizzBuzz {
    
    public static String play (int number){
        
        if (number%3 == 0 && number%5 == 0){
                return "fizzbuzz";
                    }
        
            else if(number%3 == 0){
                return "fizz";
                    } 
            
            else if(number%5 == 0){
                return "buzz";
                    }
            
            else{
        return Integer.toString(number);
    }
}
}
