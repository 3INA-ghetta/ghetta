package superEnalotto;

import java.util.Random;

public class SuperEnalottoNew {
    
int [] array = new int [6];

    public SuperEnalottoNew() {
    }

    public int [] superEnalottoArray() {
        int i = 0;   
        Random r = new Random();
        for (i = 0; i <= array.length; i++){
            array[i] = r.nextInt(100);
        }

        return array;
    }
}