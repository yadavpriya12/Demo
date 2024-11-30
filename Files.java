
package com.mycompany.collectionrevision;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Files {
    
    public static String getFileContent(String Filepath) throws FileNotFoundException {
        
        File file = new File(Filepath);
        Scanner sc =  new Scanner(file);
        
        String msg = " ";
        
        while (sc.hasNext()) {
            msg =  msg + sc.next() + " ";

        }
        return msg.toLowerCase();
    }
    
    
    public static ArrayList<Character> getSymbols(String Filepath) throws FileNotFoundException{

        File file = new File(Filepath);
        Scanner sc =  new Scanner(file);
       
        ArrayList<Character>Symbols = new ArrayList<>();
        while (sc.hasNext()) {
            
            Symbols.add(sc.next().charAt(0));
            
        }
        return Symbols;
    }



    public static ArrayList<String> getStopwords(String Filepath) throws FileNotFoundException{

        File file = new File(Filepath);
        Scanner sc =  new Scanner(file);
       
        ArrayList<String>Stopwords = new ArrayList<>();
        while (sc.hasNext()) {
            
          Stopwords.add(sc.next());
            
        }
        return Stopwords;
    }
}
