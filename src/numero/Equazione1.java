
package numero;

/**
 * classe per eseguire un equazione del tipo ax = b per determinare la sua soluzione
 * sapendo che se a è maggiore di zero x = b/a, a uguale a zero = indeterminata o  a minore di zero = impossibile
 * @author claudio
 * @version 1.0
 */
public class Equazione1 {
    
    private float a;
    private float b;
    
    /**
     * costruttore senza variabili
     */
    public Equazione1 () {
        
    }
    /**
     * costruttore con variabili
     * @param a
     * @param b 
     */
    public Equazione1( float a, float b) {
        this.a = a;
        this.b = b;
    }
    /**
     * restituisce valore di a
     * @return a
     */
    public float getA() {
        return a;
    }
    /**
     * imposta/modifica valore di a
     * @param a 
     */
    public void setA(float a) {
        this.a = a;
    }
    /**
     * restituisce valore di b
     * @return b
     */
    public float getB() {
        return b;
    }
    /**
     * imposta/modifica valore di b
     * @param b 
     */
    public void setB(float b) {
        this.b = b;
    }
    /**
     * restituisce valore di risultato
     * @return 
     */
    public String risultato() {
        String risultato;
        
        if (a > 0) {
            risultato = "risultato : " + b / a;
        }
        else if (a == 0) {
            risultato = "equazione è indeterminata";
        }
        else {
            risultato = "equazione è impossibile";
        }
        return risultato;
    }
    /**
     * restituisce il valore di testo
     * @return 
     */
    public String info() {
        String testo;
        
        testo = "valore di a:" + a + "\n"
              + "valore di b:"  + b;
        
        return testo;
        
    }
    
}

