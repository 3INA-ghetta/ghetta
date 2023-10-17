
package figureGeometriche;

import java.util.Scanner;

public class CerchioTest {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        float raggio;
        
        System.out.println("inserire il valore del raggio: ");
        raggio = in.nextFloat();
        
        Cerchio c = new Cerchio (raggio);
        
        System.out.println("Dati in input:");
        System.out.println(c.info());
        
        System.out.println("Dati di output:");
        System.out.println("Area      : " + c.calcolaArea());
        System.out.println("Perimetro : " + c.calcolaPerimetro());
    }    
}

