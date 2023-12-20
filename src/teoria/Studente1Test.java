
package teoria;

import java.util.Scanner;

public class Studente1Test {


    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        String nome, cognome;
        int matricola;
        
        System.out.println("inserire il nome dello studente: ");
        nome = in.nextLine();
        
        System.out.println("inserire il cognome dello studente: ");
        cognome = in.nextLine();
        
        Studente1 studente1 = new Studente1(nome, cognome);
        
        System.out.println("inserire il nome dello studente: ");
        nome = in.nextLine();
        
        System.out.println("inserire il cognome dello studente: ");
        cognome = in.nextLine();
        Studente1 studente2 = new Studente1(nome, cognome);
        
        System.out.println(studente1.stampaDati());
        System.out.println(studente2.stampaDati());
        
        System.out.println("ridefinire il nome e cognome del primo studente: ");
        studente1.setNome(in.next());
        studente1.setCognome(in.next());
        
        System.out.println(studente1.stampaDati());
        
       

    }
    
    
    
}
