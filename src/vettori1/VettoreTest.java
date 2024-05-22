
package vettori1;

import java.util.Scanner;

public class VettoreTest {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int valore,posizione,posizione1,valore1;
        
        Vettore v = new Vettore ();
                
        System.out.print(v.visualizzaVettore());
        
        System.out.print("inserisci posizione da modificare: ");
        posizione = in.nextInt();
        
        System.out.print("inserisci valore da mettere nella posizione "
                + "da modificare: ");
        valore = in.nextInt();
        
        System.out.print("inserisci posizione dell' elemento da rimuovere: ");
        posizione1 = in.nextInt();
        
        System.out.print("inserisci valore dell' elemento da rimuovere: ");
        valore1 = in.nextInt();
        
        System.out.printf("%b \n", v.modificaElemento(posizione, valore));
        System.out.printf("%b \n", v.rimuoviElementoPerPosizione(posizione1));
        System.out.printf("%b \n", v.rimuoviElementoPerValore(valore1));
        System.out.print(v.visualizzaVettore());

        
        
        
    }
    
}
