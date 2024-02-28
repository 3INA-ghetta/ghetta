package superEnalotto;

import java.util.Scanner;

public class SuperEnalottoTest3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int [] array = new int [6];
        SuperEnalotto2 s2 = new SuperEnalotto2();

        int [] numeroCorretto = s2.superEnalottoSenzaNumeriRipetuti();
        for (int i = 0; i <= array.length; i++){
            System.out.println("inserisci un numero: ");
            n = in.nextInt();
            array[i] = n;
        }
        
        System.out.println("la tua combinazione: ");
        for (int i = 0; i <= array.length; i++){
            System.out.println(numeroCorretto[i]+ " ");
        }
        System.out.println("\n");
    }
}