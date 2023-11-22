
package numero;

import java.util.Scanner;

public class Numero1Test {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int n1;
        
        System.out.println("inserisci il valore del numero");
        n1 = in.nextInt();
        
        Numero1 n = new Numero1 (n1);
        
        System.out.println("Dati in input:");
        System.out.println(n.info());
        
        System.out.println("Dati in output:");
        System.out.println(n.pariODispari());
        System.out.println(n.maggioreMinoreUgualeZero());
        

    }
    
}
