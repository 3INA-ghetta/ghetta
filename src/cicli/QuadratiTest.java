
package cicli;

import java.util.Scanner;

public class QuadratiTest {


    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int num;
        
        System.out.print("inserisci un numero: ");
        num = in.nextInt();
        
        Quadrati q = new Quadrati (num);
        
        System.out.println( q.quadrato() + "\n");

    }
    
}
