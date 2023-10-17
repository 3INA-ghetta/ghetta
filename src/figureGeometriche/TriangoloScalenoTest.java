
package figureGeometriche;

import java.util.Scanner;

public class TriangoloScalenoTest {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        double cateto1;
        double cateto2;
        double cateto3;
        
        System.out.println("inserire il valore del primo cateto   : ");
        cateto1 = in.nextDouble();
        
        System.out.println("inserire il valore del secondo cateto : ");
        cateto2 = in.nextDouble();
        
        System.out.println("inserire il valore del terzo cateto   : ");
        cateto3 = in.nextDouble();
        
        TriangoloScaleno t = new TriangoloScaleno(cateto1,cateto2,cateto3);
        
        System.out.println("Dati in input:");
        System.out.println(t.info());
        
        System.out.println("Dati di output:");
        System.out.println("Area             : " + t.calcolaArea());
        System.out.println("Altezza          : " + t.calcolaAltezza());
        System.out.println("Perimetro        : " + t.calcolaPerimetro());
        
 
    }
 
}

