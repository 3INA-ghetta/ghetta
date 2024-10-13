
package ForzaQuattro;

import java.util.Scanner;

public class ForzaQuattroTest {

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        int colonna, riga = 0;
        String next;
        
        ForzaQuattro f = new ForzaQuattro ();
        System.out.print(f.vCampo());
        
        do {
            
            System.out.println("inserisci colonna");
            colonna = in.nextInt();

            next = f.mettiPezzo(riga,colonna);
            System.out.print(f.vCampo());
            
            if (next.equals("X")){
                
                System.out.println("ha vinto giocatore x");
                
            }
            
            if (next.equals("O")){
                
                System.out.println("ha vinto giocatore o");
                
            }
            
            if (next.equals(" ")){
                
                System.out.println("parità");
                
            }
   
        }while(next.equals(""));
        
  
    }
    
}

