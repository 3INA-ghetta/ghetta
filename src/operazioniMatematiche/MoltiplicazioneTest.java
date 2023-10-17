
package operazioniMatematiche;

import java.util.Scanner;

public class MoltiplicazioneTest {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        float numero1;
        float numero2;
        float moltiplicazione;
        
        
        System.out.println("inserire il primo numero :");
        numero1 = in.nextFloat();
        
        System.out.println("inserire il secondo numero :");
        numero2 = in.nextFloat();
        
        Moltiplicazione m = new Moltiplicazione (numero1, numero2);        
        
        System.out.println("Dati in input:");
        System.out.println(m.info());
        
        System.out.println("Dati di output:");
        System.out.println("Moltiplicazione   : " + m.calcolo());

    }
    
}

