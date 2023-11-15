
package numero;

/**
 * La classe serve per riconosce quale fra i due numeri è maggiore
 * @author Ghetta.Claudio 3INA 2023
 * @version 1.0 
 */
public class Numero {
    private float n1;
    private float n2;

    /**
     * costruttore senza parametri
     */
    public Numero () {
        
    }
    /**
     * costruttore con parametri
     * @param n1
     * @param n2 
     */
    public Numero (float n1, float n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    /**
     * restituisce n1
     * @return n1
     */
    public float getN1 () {
        return n1;
    }
    /**
     * imposta/modifica n1
     * @param n1 n1
     */
    public void setN1 (float n1) {
        this.n1 = n1;
    }
    /**
     * restituisce n2
     * @return n2
     */
    public float getN2 () {
        return n2;
    }
    
    /**
     * imposta/modifica n2
     * @param n2 n2 
     */
    public void setN2 (float n2) {
        this.n2 = n2;
    }
    
    /**
     * restituisce differenza
     * @return 
     */
    public float differenza () {
        float d;
        if (n1 > n2) {            
            d = n1 - n2;
        }else {
            d = n2 - n1;            
        }
        return d;
    }
    
    /**
     * restitusce testo
     * @return 
     */
    public String info () {
        String testo;
        testo = "n1: "  + n1     + "\n" +
                "n2: "  + n2     + "\n";
        return testo;  
    }
}

