
package figureGeometriche;

/**
 * La classe Rettangolo serve per calcolare il perimetro e area di un rettangolo
 * @author Ghetta Claudio 3INA 2023
 * @version 1.0
 */
public class Rettangolo {
    public float b;
    public float h;
    
    /**
     * Costruttore senza parametri<br>
     * {@link #setH(float)}<br>
     * {@link #setB(float)}<br>
     */
    public Rettangolo () {
        
    }
    
    /**
     * Costruttore con tutti i parametri
     * @param base
     * @param altezza
     */
    public Rettangolo (float base, float altezza) {
        b = base;
        h = altezza;
    }
    /**
     * Restituisce il valore della base
     * @return b
     */
    public float getB (){
        return b;
    }
    /**
     * Restituisce il valore della altezza
     * @return h
     */
    public float getH (){
        return h;
    }
    
    /**
     * imposta/modifica il valore della base
     * @param b b
     */
    public void setB (float b) {
        this.b = b;
    }
    
    /**
     * imposta/modifica il valore della base
     * @param h h
     */
    public void setH (float h) {
        this.h = h;
    }
    
    /**
    * Restituisce il valore dell area
    * @return 
    */
    public float calcolaArea () {
        float area;
        area = b*h;
        return area;    
    }
    /**
    * Restituisce il valore del perimetro
    * @return 
    */
    public float calcolaPerimetro () {
        float perimetro;
        perimetro = (b*2)*(h*2);
        return perimetro;                
    }
    /**
     * Restituisce il valore degli attributi
     * @return 
     */
      public String info(){
        String testo;
        testo = "base      : " + b    + "\n" +
                "altezza   : " + h    + "\n";
        return testo;
    }
    
}

