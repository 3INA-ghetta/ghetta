
package cicli;

import java.util.Scanner;

public class DataTest {


    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int g,m,a;
        
        System.out.println("g");
        g = in.nextInt();
        System.out.println("m");
        m = in.nextInt();
        System.out.println("a");
        a = in.nextInt();
        
        Data d = new Data (g,m,a);
        
        System.out.println(d.info());
        System.out.println(d.nGiorni());
                
    }
    
}
