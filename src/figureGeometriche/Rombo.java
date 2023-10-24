
package figureGeometriche;

/**
 * La classe Rombo serve per calcolare il perimetro e area di un rombo
 * @author Ghetta Claudio 3INA 2023
 * @version 1.0
 */
public class Rombo {
    private float lato;
    private float altezza;
    
    /**
     * Costruttore senza parametri<br>
     * {@link #setLato(float)}<br>
     * {@link #setAltezza(float)}<br>
     */
    public Rombo () {
        
    }
    
    /**
     * Costruttore con tutti i parametri
     * @param lato
     * @param altezza
     */
    public Rombo (float lato, float altezza) {
        this.lato    = lato;
        this.altezza = altezza;
        
    }
    
    /**
     * Restituisce il valore del lato
     * @return lato
     */
    public float getLato(){
        return lato;
    }
    /**
     * imposta/modifica il valore del lato
     * @param lato lato
     */
    public void setLato (float lato){
        this.lato = lato; 
    }
    
    /**
     * Restituisce il valore del altezza
     * @return altezza
     */
    public float getAltezza(){
        return altezza;
    }
    
    /**
     * imposta/modifica il valore del altezza
     * @param altezza altezza
     */
    public void setAltezza (float altezza){
        this.altezza = altezza; 
    }
    
    /**
    * Restituisce il valore dell area
    * @return 
    */
    public float calcolaArea () {
        float area;
        area = lato*altezza;
        return area;
    }
    
    /**
    * Restituisce il valore del perimetro
    * @return 
    */
    public float calcolaPerimetro () {
        float perimetro;
        perimetro = lato*4;
        return perimetro;
    }
    
    /**
     * Restituisce il valore degli attributi
     * @return 
     */
    public String info(){
        String testo;
        testo = "altezza: " + altezza + "\n" +
                "lato   : " + lato    + "\n";
        return testo;
    }
}
