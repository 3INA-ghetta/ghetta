
package figureGeometriche;

import java.util.Scanner;

public class CerchioTest {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        float area;
        float raggio;
        float perimetro;
        
        System.out.println("inserire il valore del raggio: ");
        raggio = in.nextFloat();
        
        Cerchio cerchio = new Cerchio (raggio);
        
        raggio= cerchio.raggio;
        area = cerchio.calcolaArea ();
        perimetro = cerchio.calcolaPerimetro ();
        
        System.out.println("raggio    : " + raggio);
        System.out.println("perimetro : " + perimetro);  
        System.out.println("area      : " + area);
    }    
}
