
package figureGeometriche;

import java.util.Scanner;

public class QuadratoTest {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float area;
        float perimetro;
        float lato;
        
        
        System.out.println("inserire il lato :");
        lato = in.nextFloat();
        
        Quadrato quadrato = new Quadrato (lato);        
        
        lato = quadrato.l;
        area = quadrato.calcolaArea();
        perimetro = quadrato.calcolaPerimetro();
        
        System.out.println("lato :" + lato);
        System.out.println("perimetro :" + perimetro);  
        System.out.println("area :" + area);                       
    }
}
