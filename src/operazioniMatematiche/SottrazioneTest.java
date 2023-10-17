
package operazioniMatematiche;

import java.util.Scanner;

public class SottrazioneTest {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        float numero1;
        float numero2;
        float sottrazione;
        
        
        System.out.println("inserire il primo numero :");
        numero1 = in.nextFloat();
        
        System.out.println("inserire il secondo numero :");
        numero2 = in.nextFloat();
        
        Sottrazione so = new Sottrazione (numero1, numero2);        
        
        System.out.println("Dati in input:");
        System.out.println(so.info());
        
        System.out.println("Dati di output:");
        System.out.println("Sottrazione   : " + so.calcolo());

    }
    
}
