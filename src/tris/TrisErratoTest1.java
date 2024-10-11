package tris;

import java.util.Scanner;

public class TrisErratoTest1 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        int dim, riga, colonna;
        String gX, gO, next, s;
        
        System.out.println("inserisci giocatore X");
        gX = in.nextLine();
        
        System.out.println("inserisci giocatore O");
        gO = in.nextLine();
        
        System.out.println("inserisci grandezza campo");
        dim = in.nextInt();
        
        TrisErrato1 t = new TrisErrato1 (dim, gX, gO);
        System.out.print(t.info());
        
        do {
            System.out.println("inserisci riga e colonna separate da una virgola");
            s = in.nextLine();
            s = in.nextLine();
            
            next = t.gioca(s);
            
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

