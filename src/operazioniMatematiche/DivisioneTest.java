
package operazioniMatematiche;

import java.util.Scanner;

public class DivisioneTest {


    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        float numero1;
        float numero2;
        float divisione;
        
        
        System.out.println("inserire il primo numero :");
        numero1 = in.nextFloat();
        
        System.out.println("inserire il secondo numero :");
        numero2 = in.nextFloat();
        
        Divisione d = new Divisione (numero1, numero2);        
        
        System.out.println("Dati in input:");
        System.out.println(d.info());
        
        System.out.println("Dati di output:");
        System.out.println("Divisione   : " + d.calcolo());

    }
    
}


