
package cicli;

import java.util.Formatter;
import java.util.Random;
import java.util.Scanner;

public class Frequenza1 {
    
    private int totElementi;

    private int nElementi;

    public Frequenza1(int totElementi,int nElementi) {
        this.totElementi = totElementi;
        this.nElementi = nElementi;
    }
    
    public int getTotElementi() {
        return totElementi;
    }

    public void setTotElementi(int totElementi) {
        this.totElementi = totElementi;
    }

    public int getnElementi() {
        return nElementi;
    }

    public void setnElementi(int nElementi) {
        this.nElementi = nElementi;
    }
       
    public String frequenza(){
        
        Formatter f = new Formatter();
        
        Random r = new Random();
    
        String testo = "N. - FA -  FR  -  FP \n";

        int contatore = 0;

        int differenza = totElementi;

        for (int i = 0; i < 100000; i++) {
            if (i < nElementi - 1){
                contatore = r.nextInt(differenza);
            }else{
                contatore = differenza;
            }
            
            double fR =(double)contatore/totElementi;
            double fP = fR * 100;

            f.format("%d  %2d  &4.2f   %5.2f\n", (i+1), contatore, fR, fP);

            differenza = differenza - contatore;
        }

        testo += f;
        
        return testo;

    } 
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int tEl, nEl;
        
        System.out.println("inserisci il numero totale degli elementi: ");
        tEl = in.nextInt();
        System.out.println("inserisci il numero di un elemento: ");
        nEl = in.nextInt();
        
        Frequenza1 f = new Frequenza1(nEl, tEl);
        System.out.println(f.frequenza());
    }
}
