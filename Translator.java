/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afvink5;

/**
 *
 * @author Bartdroge
 */
public class Translator {

    static final String[] ONE = {"A", "R", "N", "D", "C", "Q", "E", "G", "H", "I", "L", "K", "M", "F", "P", "S", "T", "W", "Y", "V"};
    static final String[] THREE = {"ALA", "ARG", "ASN", "ASP", "CYS", "GLN", "GLU", "GLY",
        "HIS", "ILE", "LEU", "LYS", "MET", "PHE", "PRO", "SER",
        "THR", "TRP", "TYR", "VAL"};

public static String one2three(String symbol) throws NotAnAA {

        String threeCode = "";

        for (int i = 0; i < ONE.length; i++) {

            if (ONE[i].equals(symbol)) {

                threeCode = THREE[i];

            }
        }

        if (threeCode.equals("")) {

            throw new NotAnAA("Dit is een niet bestaand aminozuur: " + symbol);
        }

        return threeCode;
    }

public static String three2one(String symbol) throws NotAnAA {
    
    String oneCode = "";
    
    for (int i = 0; i < THREE.length; i++) {
        
        if (THREE[i].equals(symbol)) {
            
            oneCode = ONE[i];
            
        }
    }

    if (oneCode.equals("")) {
        
        throw new NotAnAA("Dit is een niet bestaand aminozuur: "+symbol);
    }

    return oneCode;
}

}



class NotAnAA extends Exception {

    /**
    * Overschrijven van de constructor van Exception
    */
    public NotAnAA() {
        /** 
        * call van de constructor van de super class: Exception
        */
        super();
        
    }

    public NotAnAA(String err) {
        
        super(err);
        
    }
    
}