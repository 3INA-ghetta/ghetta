
package verifica;

import java.util.Scanner;

public class OrarioTest {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int s,m,h;
        
        System.out.println("inserire i secondi del primo orario: ");
        s = in.nextInt();
        System.out.println("inserire i minuti del primo orario: ");
        m = in.nextInt();
        System.out.println("inserire le ore del primo orario: ");
        h = in.nextInt();
        
        Orario o = new Orario(s,m,h);
        System.out.println(o.info());
        System.out.println("il primo orario in secondi è: " + o.orarioInSec());
        System.out.println("il primo orario in minuti è: " + o.orarioInMin());
        System.out.println("il primo orario in ore è: " + o.orarioInH());
        System.out.println("la differenza tra i due orari è: " + o.diff(2,2,2));
        System.out.println(o.info());
        //o.diff (2,2,2)    
    }
    
}
