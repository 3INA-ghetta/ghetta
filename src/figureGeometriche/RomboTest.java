
package figureGeometriche;

import java.util.Scanner;

public class RomboTest {


    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        float a, l;
        
        System.out.println("Altezza:");
        a = in.nextFloat();
        
        System.out.println("Lato   :");
        l = in.nextFloat();
        
        Rombo r = new Rombo (l,a);
        
        System.out.println("Dati in input:");
        System.out.println(r.info());
        
        System.out.println("Dati di output:");
        System.out.println("Area             : " + r.calcolaArea());
        System.out.println("Perimetro        : " + r.calcolaPerimetro());

    }
    
}

