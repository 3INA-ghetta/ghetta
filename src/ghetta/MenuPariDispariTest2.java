package ghetta;

import java.util.Scanner;

public class MenuPariDispariTest2 {
  
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        int valore, numero;
        boolean verifica = false;
        int uscita = 1;
        
        
        do{
            System.out.print("MENU");
            System.out.println("1 instanzia oggetto");
            System.out.println("3- per uscire dal menu");
            System.out.println("4- metodo per stringa di n numeri dispari(con static)");
            System.out.println("5- metodo per stringa di n numeri pari(con static)");
            
            System.out.println("inserire il valore desiderato:");
            valore = in.nextInt();
            
        switch (valore) {
                case 1:
                    MenuPariDispari m = new MenuPariDispari();
                    verifica = true;
                    break;
                case 3:
                    System.out.println("uscito dal menu");
                    uscita = 0;
                    break;
                case 4:
                    if (verifica = true) {
                    System.out.println(MenuPariDispari.dispari1());
                    }else{
                        System.out.println("instanzia oggetto con 1");                        
                    }
                    break;
                case 5:
                    if (verifica = true) {
                    System.out.println(MenuPariDispari.pari1());
                    }else {
                        System.out.println("instanzia oggetto con 1");
                    }
                    break;
                default:
                    System.out.println("scelta errata!");                   
            }
            
            if(valore < 1 || valore > 3){
                System.out.println("scelta errata!");
            }                
        }while (uscita != 0);
        
    }   
        
}