package tris;

import java.util.Scanner;

public class TrisErratoTest {

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        int dim=3; //riga, colonna;
        String gX ="abc", gO ="agyh"; //next;
        /*
        System.out.println("inserisci giocatore X");
        gX = in.nextLine();
        
        System.out.println("inserisci giocatore O");
        gO = in.nextLine();
        
        System.out.println("inserisci grandezza campo");
        dim = in.nextInt();
        */
        TrisErrato t;
        
        try {
            t = new TrisErrato (dim, gX, gO);
            t.gioca(1,2);
            t.gioca(0,1);
            t.gioca(1,1);
            t.gioca(1,2);
            System.out.print(t.gioca(2,2));
            System.out.print(t.info());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        /*
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
        */
  
    }
    
}

