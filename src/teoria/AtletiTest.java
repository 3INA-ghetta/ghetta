
package teoria;

import java.util.Scanner;

public class AtletiTest {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int size=0;
        String nomi[] = new String [size];
        String cognomi[] = new String [size];
        float altezza[] = new float [size];
        
        System.out.println("inserisci il numero di atleti");
        size = in.nextInt();
        
        Atleti a = new Atleti (size);
        
        while (a.inserito() == true){
            System.out.println("inserisci il nome");
            a.nomi = in.nextInt();
        
        }

        

    }
    
}
