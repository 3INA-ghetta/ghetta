
package figureGeometriche;

import java.util.Scanner;

public class TriangoloScalenoTest {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        double area;
        double perimetro;
        double altezza;
        double cateto1;
        double cateto2;
        double cateto3;
        
        System.out.println("inserire il valore del primo cateto   : ");
        cateto1 = in.nextDouble();
        
        System.out.println("inserire il valore del secondo cateto : ");
        cateto2 = in.nextDouble();
        
        System.out.println("inserire il valore del terzo cateto   : ");
        cateto3 = in.nextDouble();
        
        TriangoloScaleno triangoloScaleno = new TriangoloScaleno(cateto1,cateto2,cateto3);
        
        cateto1   = triangoloScaleno.c1;
        cateto2   = triangoloScaleno.c2;
        cateto3   = triangoloScaleno.c3;
        area      = triangoloScaleno.calcolaArea();
        altezza   = triangoloScaleno.calcolaAltezza();
        perimetro = triangoloScaleno.calcolaPerimetro();
        
        System.out.println("primo cateto        : " + cateto1);
        System.out.println("secondo cateto      : " + cateto2);
        System.out.println("terzo cateto        : " + cateto3);
        System.out.println("area                : " + area);
        System.out.println("altezza             : " + altezza);
        System.out.println("perimetro           : " + perimetro);  
    }
 
}
