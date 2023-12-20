
package ghetta;

import java.util.Scanner;

public class PoligonoTest {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int numeroLati;
        float lato;
        
        System.out.println("inserire il numero di lati:");
        numeroLati = in.nextInt();
        
        System.out.println("inserire il valore del lato maggiore:");
        lato = in.nextFloat();
        
        Poligono p = new Poligono (numeroLati, lato);
        
        System.out.println("dati in input: " + p.info());
        System.out.println("il tuo poligono è: " + p.tipoPoligono());
        System.out.println("il perimetro del tuo poligono è: " + p.perimetro());
        

    }
    
}

