
package numero;

import java.util.Scanner;

public class Equazione1Test {

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        float a,b;
        
        System.out.println("inserire valore di a:");
        a = in.nextFloat();
        
        System.out.println("inserire valore di b:");
        b= in.nextFloat();
        
        Equazione1 e = new Equazione1 (a,b);
        
        System.out.println("Dati in input:" + e.info());
        System.out.println(e.risultato());
        
        

    }
    
}
