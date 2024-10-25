
package Exception;

import java.util.logging.Level;
import java.util.logging.Logger;


public class PoligonoRegolareTest {

    public static void main(String[] args) {
        /*1
        PoligonoRegolare p = null;
        */
        try {
            PoligonoRegolare p = new PoligonoRegolare (3, 10f);
            System.out.println(p.perimetro());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        /*1
        try{
            System.out.println(p.perimetro());
        } catch(NullPointerException ex){
            System.out.println ("l' oggetto non esiste");
        }
        */
    }
    
}
