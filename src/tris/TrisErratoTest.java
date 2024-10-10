package tris;

import java.util.Scanner;

public class TrisErratoTest {

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        int dim, riga, colonna;
        String gX, gO, next;
        
        System.out.println("inserisci giocatore X");
        gX = in.nextLine();
        
        System.out.println("inserisci giocatore O");
        gO = in.nextLine();
        
        System.out.println("inserisci grandezza campo");
        dim = in.nextInt();
        
        TrisErrato t = new TrisErrato (dim, gX, gO);
        System.out.print(t.info());
        
        do {
            System.out.println("inserisci riga");
            riga = in.nextInt();
            
            System.out.println("inserisci colonna");
            colonna = in.nextInt();

            next = t.gioca(riga,colonna);
            System.out.print(t.info());
            
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

