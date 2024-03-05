package superEnalotto;

import java.util.Scanner;

public class SuperEnalottoTestNew {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, c = 0;
        boolean condizione = true;

        SuperEnalottoNew s2 = new SuperEnalottoNew();

        if (condizione == true){
            for (int i = 0; i < 6; i++) {
            System.out.print("inserisci un numero: ");
            n = in.nextInt();
            for (int a = 0; a < 6; a++){
                if (n != s2.superEnalottoArray()[a] && a < 6){
                System.out.println("hai sbagliato");
                condizione = false;
                }                    
            }
            c++;
            }
            if (c < 6){
                condizione = false;
            }

           
        }

        
    }
}
