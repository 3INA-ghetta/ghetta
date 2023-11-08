
package teoria;

import java.util.Scanner;

/**
 *
 * @author claudio.ghetta
 */
public class PersonaTest {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        String n, c, e;
               
        System.out.println("nome   :");
        n = in.nextLine();
        
        System.out.println("cognome   :");
        c = in.nextLine();
        
        System.out.println("email:");
        e = in.nextLine();
        
        Persona p = new Persona (n,c,e);
        
        System.out.println("Dati in input:");
        System.out.println(p.info());
        
        System.out.println("Dati di output:");
        System.out.println("registrazione    : " + p.registrazioneAvvenuta());
    }
    
}
