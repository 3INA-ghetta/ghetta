
package cicli;

import java.util.Scanner;

public class QuadratiTest {


    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int num;
        
        System.out.print("inserisci un numero fra 1 e 20: ");
        num = in.nextInt();
        
        Quadrati q = new Quadrati (num);
        
        if (num > 0 && num <= 20){
        System.out.println( q.quadrato() + "\n");
        }else{
        System.out.println("errore");    
        }

    }
    
}
