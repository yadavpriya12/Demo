

package com.mycompany.collectionrevision;

import java.io.FileNotFoundException;


public class CollectionRevision {

    public static void main(String[] args) throws FileNotFoundException {
       
        System.out.println("************ INPUT STRING LIST ************");
        String inputString = Files.getFileContent("C:\\Inputfile.txt");
        System.out.println(inputString);
        
    }
}
