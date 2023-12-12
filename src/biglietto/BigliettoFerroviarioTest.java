
package biglietto;

import java.util.Scanner;

public class BigliettoFerroviarioTest {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        float costoBiglietto=5;
        String situazione;
        
        System.out.println("inserire la lettera d se disoccupati, la lettera s se studenti o p se pensionato, altrimenti inserire una qualunque lettera");
        situazione = in.nextLine();
        
        BigliettoFerroviario b = new BigliettoFerroviario (costoBiglietto, situazione);
        
        System.out.println("dati in input:" + b.info());
        System.out.println("costo del biglietto:" + b.importo());
    }
    
}

