
package cicli;

/**
 * classe che calcola frequenza assoluta,relativa,percentuale con random
 * @author claudio.ghetta
 */
public class Frequenze {
    double frequenza = Math.random();
    double frequenza1 = Math.random();
    double frequenza2 = Math.random();
    double frequenza3 = Math.random();
    int intero;
    int intero1;
    int intero2;
    int intero3;
   
   public String frequenzaAssoluta(){

       String testo;
       
       intero = (int)frequenza;
       intero1 = (int)frequenza1;
       intero2 = (int)frequenza2;
       intero3 = (int)frequenza3;
       
       testo = "frequenza 1:" + intero +"\n"
               + "frequenza 2:" + intero1 +"\n"
               + "frequenza 3:" + intero2 +"\n"
               + "frequenza 4:" + intero3;
       
       return testo;
   }
   
   public String frequenzaRelativa(){

       String testo;
       
       intero = (int)frequenza;
       intero1 = (int)frequenza1;
       intero2 = (int)frequenza2;
       intero3 = (int)frequenza3;
       
       testo = "frequenza 1:" + intero +"\n"
               + "frequenza 2:" + intero1 +"\n"
               + "frequenza 3:" + intero2 +"\n"
               + "frequenza 4:" + intero3;
       
       return testo;
   }
       
}
