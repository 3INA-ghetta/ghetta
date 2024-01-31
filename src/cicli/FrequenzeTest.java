
package cicli;

import java.util.Random;

public class FrequenzeTest {

    public static void main(String[] args) {
        
        Random r = new Random();
        int n1 = r.nextInt(11);
        int n2 = r.nextInt(11);
        int n3 = r.nextInt(11);
        int n4 = r.nextInt(11);
        Frequenze f = new Frequenze(n1,n2,n3,n4);
        
        System.out.println(f.frequenzaAssoluta());
        System.out.println(f.frequenzaRelativa());
        System.out.println(f.frequenzaPercentuale());

    }
    
}
