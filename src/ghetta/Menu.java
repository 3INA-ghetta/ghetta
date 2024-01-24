
package ghetta;

import java.util.Scanner;

public class Menu {
  
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        int valore, numeroLati;
        float lato;
        Poligono p = null;
        boolean set = false;
        boolean istanza = false;
        
        do {
            System.out.print("MENU");
            System.out.println("1- Costruttore senza parametri");
            System.out.println("2- Costruttore con parametri");
            System.out.println("3- Calcolare il perimetro");
            System.out.println("4- per uscire dal menu");
            System.out.println("5- getLato");
            System.out.println("6- numeroLati");
            
            System.out.println("inserire il valore desiderato:");
            valore = in.nextInt();
            
            switch (valore) {
                case 1:
                    p = new Poligono();  
                    istanza = true;
                    break;
                case 2:
                    System.out.print("inserire numero lati");
                    numeroLati = in.nextInt();
                    System.out.print("inserire lato");
                    lato = in.nextFloat();
                    p = new Poligono(numeroLati,lato); 
                    istanza = true;
                    set = true;
                    break;
                case 3:
                    if (istanza && set)
                       if (istanza && set && p.isPoligono())
                        System.out.println(p.perimetro());
                       else
                        System.out.print("dati errati");
                    else
                        System.out.print("instanziare oggetto");
                    break;
                case 4:
                    System.out.println("uscito dal menu");
                    break;
                case 5:
                    System.out.println(p.getLato());
                    break;
                case 6:
                    System.out.print("inserire numero lati");
                    numeroLati = in.nextInt();
                    p.setNumeroLati(numeroLati);
                    set = true;
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
