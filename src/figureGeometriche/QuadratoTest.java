
package figureGeometriche;

import java.util.Scanner;

public class QuadratoTest {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float lato;
        
        
        System.out.println("inserire il lato :");
        lato = in.nextFloat();
        
        Quadrato q = new Quadrato (lato);        
        
        System.out.println("Dati in input:");
        System.out.println(q.info());
        
        System.out.println("Dati di output:");
        System.out.println("Area      : " + q.calcolaArea());
        System.out.println("Perimetro : " + q.calcolaPerimetro());        
    }
}
