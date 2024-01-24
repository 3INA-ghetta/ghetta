
package cicli;

import java.util.Random;

public class TestRandom {
    
    public static void main(String[] args) {
        
        double numero;
        int intero;
        
        Random r = new Random();
        
        /*for (int i = 0; i < 10; i++){
        
        numero = (Math.random()*6)+1;
        
        intero = (int)numero;        
        System.out.println("numero:" + numero);
        }*/
        
        for (int i = 0; i < 100; i++){
            intero = r.nextInt(4);
            System.out.println("numero:" + intero);
        }
        
        for (int i = 0; i < 100; i++){
            numero = r.nextDouble();
            System.out.println("numero:" + numero);
        }       
        
    }
    
}
