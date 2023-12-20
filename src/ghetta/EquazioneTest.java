    
package ghetta;

import java.util.Scanner;

public class EquazioneTest {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        float a,b,c;
        
        System.out.println("inserire il valore di a:");
        a = in.nextFloat();
        
        System.out.println("inserire il valore di b:");
        b = in.nextFloat();
        
        System.out.println("inserire il valore di c:");
        c = in.nextFloat();
        
        Equazione e = new Equazione (a,b,c);
        
        
        System.out.println("valore della soluzione x1: " + e.x1());
        System.out.println("valore della soluzione x2: " + e.x2());

    }
    
}

