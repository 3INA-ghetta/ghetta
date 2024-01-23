
package ghetta;

import java.util.Scanner;

public class PoligonoRegolareTest {
  
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        Poligono p = new Poligono ();
        
        int numeroLati;
        float lato;
        do {
            System.out.print("inserire il numero dei lati: ");
            numeroLati = in.nextInt();
            p.setNumeroLati(numeroLati);
            System.out.print("inserire il lato: ");
            lato = in.nextFloat();
            p.setLato(lato);
            
            if (!p.isPoligono())
                System.out.println("errore nei dati inseriti");                             
        }while (!p.isPoligono());
        
        System.out.println(p.info());
        System.out.println(p.tipoPoligono());
        System.out.println(p.perimetro()); 
        
    }   
        
}
