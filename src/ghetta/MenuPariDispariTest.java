
package ghetta;

import java.util.Scanner;

public class MenuPariDispariTest {
  
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        int valore, numero;

        

            System.out.print("MENU");
            System.out.println("1- metodo per stringa di n numeri dispari");
            System.out.println("2- metodo per stringa di n numeri pari");
            System.out.println("3- per uscire dal menu");
            
            System.out.println("inserire il valore desiderato:");
            valore = in.nextInt();
            
            switch (valore) {
                case 1:                
                    System.out.println("inserire numero di numeri");
                    numero = in.nextInt();
                    MenuPariDispari m = new MenuPariDispari(numero);
                    System.out.print(m.dispari());
                    break;
                case 2:
                    System.out.println("inserire numero di numeri");
                    numero = in.nextInt();
                    MenuPariDispari m1 = new MenuPariDispari(numero);
                    System.out.print(m1.pari());
                    break;
                case 3:
                    System.out.println("uscito dal menu");
                    break;
                default:
                    System.out.println("scelta errata!");                   
            }
            
            if(valore < 1 || valore > 3){
                System.out.println("scelta errata!");
            }                

        
    }   
        
}