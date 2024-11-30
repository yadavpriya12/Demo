


package com.mycompany.collectionrevision;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class DataCleaning {

    public static String  removeSymbols(String input) throws FileNotFoundException {
        
        char charArray[] = input.toCharArray();
        ArrayList<Character>charlist = new ArrayList<>();
        
        for (char c : charArray ) {
           charlist.add(c);
           
       ArrayList<Character> symbolList = Files.getSymbols("C:\\SpecialSymbols.txt");
       charlist.removeAll(symbolList);
       
       input = " ";
       
       for (Character character : symbolList) {
               input = input + character;         
            }
            
    }
        return input;
    }
}
