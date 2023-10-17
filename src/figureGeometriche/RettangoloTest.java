
package figureGeometriche;

import java.util.Scanner;

public class RettangoloTest {


    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        float base;
        float altezza;
        
        System.out.println("inserire il valore della base   : ");
        base = in.nextFloat();
        
        System.out.println("inserire il valore dell altezza : ");
        altezza = in.nextFloat();
        
        Rettangolo r = new Rettangolo (base,altezza);
        
         System.out.println("Dati in input:");
        System.out.println(r.info());
        
        System.out.println("Dati di output:");
        System.out.println("Perimetro     : " + r.calcolaArea());
        System.out.println("Area          : " + r.calcolaPerimetro());
    }
    
}

