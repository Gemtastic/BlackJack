package com.gemtastic.blackjack;

import java.util.Random;

/**
 * This is the card object. On creation it generates its own random value.
 * 
 * @author Aizic Moisen
 */
public class Card {
    private final int value;
    
    Card(){
        value = randomCard();
    }
    
    public int getValue(){
        return value;
    }
    
    /**
     * This method randomizes a value between 2 and 11.
     * 
     * @return 
     */
    private int randomCard(){
        int min = 2;
        int max = 11;
        int range = (max - min);
        
        int random = new Random().nextInt(range + 1) + min;
        
        return random;
    }
}
