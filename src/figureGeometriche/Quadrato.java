
package figureGeometriche;

/**
 * La classe Quadrato serve per calcolare il perimetro e area di un quadrato
 * @author Ghetta Claudio 3INA 2023
 * @version 1.0
 */
public class Quadrato {    
    public float l;
    
    /**
     * Costruttore senza parametri<br>
     * {@link #setL(float)}<br>
     */
    public Quadrato () {
        
    }
    
    /**
     * Costruttore con tutti i parametri
     * @param lato
     */
    public Quadrato(float lato) {
        l = lato;
               
    }
    
    /**
     * Restituisce il valore del lato
     * @return l
     */
    public float getL () {
        return l;
    }
    
    /**
     * imposta/modifica il valore del lato
     * @param l l
     */
    public void setL (float l) {
        this.l = l;
    }
    
    /**
    * Restituisce il valore dell area
    * @return 
    */
    public float calcolaArea () {
        float area;        
        area=l*l;
        return area;
        
    }
    /**
    * Restituisce il valore del perimetro
    * @return 
    */
    public float calcolaPerimetro () {
        float perimetro;        
        perimetro=l+l+l+l;
        return perimetro;        
    }  
    
    /**
     * Restituisce il valore degli attributi
     * @return 
     */
    public String info(){
        String testo;
        testo = "lato: " + l + "\n";
        return testo;
    }
}

