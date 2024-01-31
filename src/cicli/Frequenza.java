
package cicli;

import java.util.Formatter;
import java.util.Random;

public class Frequenza {
    public static String frequenza(){
        
        Formatter f = new Formatter();
        
        Random r = new Random();
    
        String testo = "N. - FA -  FR  -  FP\n";

        int totElementi = 99;

        int nElementi = 3;

        int contatore = 0;

        int differenza = totElementi;

        for (int i = 1; i <= nElementi; i++) {
            if (i < nElementi)
                contatore = r.nextInt(differenza);
            else
                contatore = differenza;

            double fR =(double)contatore/totElementi;
            double fP = fR * 100;

            f.format("%d  %2d  &4.2f   %5.2f\n", i, contatore, fR, fP);

            differenza = differenza - contatore;
        }

        testo += f;
        
        return testo;

    } 
    
    public static void main(String[] args){
        System.out.println(Frequenza.frequenza());
    }

}
