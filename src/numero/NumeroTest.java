
package numero;

import java.util.Scanner;

public class NumeroTest {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        float n1, n2;
        
        System.out.println("Inserisci primo numero");
        n1 = in.nextFloat();
        
        System.out.println("Inserisci secondo numero");
        n2 = in.nextFloat();
        
        Numero n = new Numero (n1, n2);
        
        System.out.println("Dati in input:");
        System.out.println(n.info());
        
        System.out.println("Dati di output:");
        System.out.println("differenza fra minore e maggiore: " + n.differenza());

    }
    
}

