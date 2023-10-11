
package figureGeometriche;

import java.util.Scanner;

public class TriangoloRettangoloTest {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        double b, a, l;
    
        System.out.println("Base   :");
        b = in.nextDouble();
        
        System.out.println("Altezza:");
        a = in.nextDouble();
        
        System.out.println("Lato   :");
        l = in.nextDouble();
        
        TriangoloRettangolo t = new TriangoloRettangolo (b,a,l);
        
        t.setAltezza(9);
        
        System.out.println("Dati in input:");
        System.out.println(t.info());
        
        System.out.println("dati di output:");
        System.out.println("perimetro     : " + t.perimetro());
        System.out.println("area          : " + t.area());
              
    }   
}
