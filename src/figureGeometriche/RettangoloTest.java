
package figureGeometriche;

import java.util.Scanner;

public class RettangoloTest {


    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        float area;
        float perimetro;
        float base;
        float altezza;
        
        System.out.println("inserire il valore della base   : ");
        base = in.nextFloat();
        
        System.out.println("inserire il valore dell altezza : ");
        altezza = in.nextFloat();
        
        Rettangolo rettangolo = new Rettangolo (base,altezza);
        
        base      = rettangolo.b;
        altezza   = rettangolo.h;
        area      = rettangolo.calcolaArea();
        perimetro = rettangolo.calcolaPerimetro();
        
        System.out.println("base       : " + base);
        System.out.println("altezza    : " + altezza);
        System.out.println("perimetro  : " + perimetro);  
        System.out.println("area       : " + area);
    }
    
}
