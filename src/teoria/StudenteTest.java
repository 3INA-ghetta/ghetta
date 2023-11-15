
package teoria;

import java.util.Scanner;

public class StudenteTest {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        String n,c;
        float v;
        String e= "positivo o negativo";
        
        
        System.out.println("nome   :");
        n = in.nextLine();
        
        System.out.println("cognome   :");
        c = in.nextLine();
        
        System.out.println("voto   :");
        v = in.nextFloat();
        
        Studente s = new Studente (n,c,v,e);
        
        System.out.println("Dati in input:");
        System.out.println(s.info());
        
        System.out.println("Dati di output:");
        System.out.println("esito verifica    : " + s.esitoVerifica());

    }
    
}
