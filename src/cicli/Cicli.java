
package cicli;

import java.util.Scanner;

/**
 *
 * @author claudio.ghetta
 */
public class Cicli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // precondizionali
        Scanner in = new Scanner(System.in);
        
        String testo;
        for (int i = 0; i < 10; i++) {
            System.out.println("inserire testo: ");
            testo = in.next();
            System.out.println(testo);
            
        }
        int i = 0;
        final int N = 10;
        while (i < N){
            System.out.println(i);
            i++;           
        }
        
        int numero = 1;
        
        while (numero != 0){
            System.out.println("inserisci il numero: ");
            numero = in.nextInt();
            
        }
        
        //postcondizionali
        int numero1;
        do {
            System.out.println("inserisci il numero: ");
            numero1 = in.nextInt();
        } while (numero != 0);
            
    }
    
}
