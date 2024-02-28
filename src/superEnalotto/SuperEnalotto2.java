package superEnalotto;

import java.util.Random;

public class SuperEnalotto2 {
    
       
    public SuperEnalotto2() {
    }

    public String superEnalotto() {
        String testo = "";
        int risultato;
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            risultato = (int) r.nextInt(10);
            testo += " " + risultato;
        }

        return testo;
    }

    public int [] superEnalottoSenzaNumeriRipetuti() {
        int i = 0;   
        int [] array = new int [6];
        Random r = new Random();
        for (i = 0; i <= array.length; i++){
            array[i] = r.nextInt(100);
        }

        return array;
    }
}