
package operazioniMatematiche;

/**
 * La classe Moltiplicazione serve per calcolare la moltiplicazione fra due numeri
 * @author Ghetta Claudio 3INA 2023
 * @version 1.0
 */
public class Moltiplicazione {
    public float numero1;
    public float numero2;
    
    /**
     * Costruttore senza parametri<br>
     * {@link #setNumero1(float)}<br>
     * {@link #setNumero2(float)}<br>
     */
    public Moltiplicazione () {
        
    }
    
    /**
     * Costruttore con tutti i parametri
     * @param numero1
     * @param numero2
     */
    public Moltiplicazione (float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
                 
    }
    
    /**
     * Restituisce il valore del primo numero
     * @return numero1
     */
    public float getNumero1 (){
        return numero1;
    }
    
    /**
     * Restituisce il valore del secondo numero
     * @return numero2
     */
    public float getNumero2 (){
        return numero2;
    }
    
    /**
     * imposta/modifica il valore del primo numero
     * @param numero1 numero1
     */
    public void setNumero1 (float numero1) {
        this.numero1 = numero1;
    }
    
    /**
     * imposta/modifica il valore del secondo numero
     * @param numero2 numero2
     */
    public void setNumero2 (float numero2) {
        this.numero2 = numero2;
    }
    
    /**
     * Restituisce il valore della moltiplicazione
     * @return 
     */
    public float calcolo () {
        float moltiplicazione;
        moltiplicazione = numero1 * numero2;
        return moltiplicazione;
        
    }
    
    /**
     * Restituisce il valore degli attributi
     * @return 
     */
    public String info () {
        String testo;
        testo = "numero1: " + numero1 + "\n" +
                "numero2: " + numero2 + "\n";
        return testo;
    }
    
}
