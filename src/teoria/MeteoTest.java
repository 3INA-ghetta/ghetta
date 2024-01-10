
package teoria;

import java.util.Scanner;

public class MeteoTest {


    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        float temperatura;
        
        System.out.println("inserire la temperatura");
        temperatura = in.nextFloat();
        
        Meteo m = new Meteo (temperatura);
        
        System.out.print("dati in input: " + m.info());
        System.out.print("consiglio: " + m.consiglio1());
        System.out.print("consiglio: " + m.consiglio2());
        System.out.print("consiglio: " + m.consiglio3());
        System.out.print("consiglio: " + m.consiglio4());

    }
    
}
