
package ghetta;

import java.util.Scanner;

public class Menu {
  
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        int valore, numeroLati;
        float lato;
        
        do {
            System.out.print("MENU");
            System.out.println("1- Costruttore senza parametri");
            System.out.println("2- Costruttore con parametri");
            System.out.println("3- Calcolare il perimetro");
            System.out.println("4- per uscire dal menu");
            
            System.out.println("inserire il valore desiderato:");
            valore = in.nextInt();
            
            switch (valore) {
                case 1:
                    Poligono p = new Poligono();                   
                    break;
                case 2:
                    System.out.print("inserire numero lati");
                    numeroLati = in.nextInt();
                    System.out.print("inserire lato");
                    lato = in.nextFloat();
                    Poligono p1 = new Poligono(numeroLati,lato); 
                    break;
                case 3:
                    System.out.print("inserire numero lati");
                    numeroLati = in.nextInt();
                    System.out.print("inserire lato");
                    lato = in.nextFloat();
                    Poligono p2 = new Poligono(numeroLati,lato); 
                    System.out.println(p2.perimetro());                    
                    break;
                case 4:
                    System.out.println("uscito dal menu");
                    break;
                default:
                    System.out.println("scelta errata!");                   
            }
            
            if(valore < 1 || valore > 4){
                System.out.println("scelta errata!");
            }                
        }while (valore != 4);
        
    }   
        
}
