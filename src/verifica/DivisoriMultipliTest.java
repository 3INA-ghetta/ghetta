
package verifica;

import java.util.Scanner;

public class DivisoriMultipliTest {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int val;
        int n, m;
        
        do {
            System.out.println("1 - calcola il numero dei divisori positivi di un numero");
            System.out.println("2 - calcola la somma dei primi n multipli di un numero.");
            System.out.println("3 - esci dal menù");
            System.out.println("a quale funzione vuole accedere?");
            val = in.nextInt();
            
            switch (val){
                
                case 1:
                    System.out.println("inserisci il numero");
                    n = in.nextInt();
                    DivisoriMultipli d = new DivisoriMultipli();                   
                    System.out.println("il numerodi divisori positivi è: " + d.numeroDivisori(n));
                    break;
                case 2:
                    System.out.println("inserisci il numero");
                    n = in.nextInt();
                    System.out.println("inserisci il numero di multipli");
                    m = in.nextInt();
                    DivisoriMultipli d1 = new DivisoriMultipli();

                    System.out.println("la somma dei multipli è: " + d1.sommaMultipli(n,m));
                    break;
                case 3:
                    System.out.println("uscita dal menù");
                    break;
                default:
                    System.out.println("inserito valore errato, inserisca solo"
                                      + " valori fra 1 e 3");                 
            }
        }while (val != 3 );

        

    }
    
}
