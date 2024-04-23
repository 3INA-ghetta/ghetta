
package vettori1;

import java.util.Scanner;

public class CovBinToDevStringTest {

    public static void main(String[] args) {       
        Scanner in = new Scanner(System.in);
        
        String testo;
        
        System.out.println("Inserisci il numero in binario");
        testo = in.nextLine();
        
        CovBinToDevString c = new CovBinToDevString(testo);

        System.out.println("Il valore in decimale è: " + c.binDec());
    }
    
}
    
