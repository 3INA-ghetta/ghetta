package superEnalotto;

import java.util.Random;

public class SuperEnalottoNew {
    
int [] array = new int [6];

    public SuperEnalottoNew() {
    }

    public int[] superEnalottoArray() {
        int[] valori = new int[6];
        int i = 0;
        Random r = new Random();
        do {
            valori[i] = r.nextInt(99)+1;
            i++;
        } while (valori[0] == valori[1] || valori[0] == valori[2] || valori[0] == valori[3] || valori[0] == valori[4] || valori[0] == valori[5]
        || valori[1] == valori[2] || valori[1] == valori[3] || valori[1] == valori[4] || valori[1] == valori[5]
        || valori[2] == valori[3] || valori[2] == valori[4] || valori[2] == valori[5]
        || valori[3] == valori[4] || valori[3] == valori[5]
        || valori[4] == valori[5] || valori[5] == 0);

  

        return valori;
    }
    
    
}