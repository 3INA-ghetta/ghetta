
package figureGeometriche;

/**
 * La classe Cerchio serve per calcolare il perimetro e area di un cerchio
 * @author Ghetta Claudio 3INA 2023
 * @version 1.0
 */
public class Cerchio {
    public float raggio;
    
    /**
     * Costruttore senza parametri<br>
     * {@link #setRaggio(float)}<br>
     */
    public Cerchio () {
        
    }
    
    /**
     * Costruttore con tutti i parametri
     * @param raggio
     */
    public Cerchio (float raggio){
        this.raggio = raggio;
        //this distingue parametro da attributo
    }
    
    /**
     * Restituisce il valore del raggio
     * @return raggio
     */
    public float getRaggio() {
        return raggio;
    }
    
    /**
     * imposta/modifica il valore del raggio
     * @param raggio raggio
     */
    public void setRaggio(float raggio) {
        this.raggio = raggio;
    }
    
    /**
    * Restituisce il valore dell area
    * @return 
    */
    public float calcolaArea () {
        float area;
        area=3.14f*(raggio*raggio);
        return area;
    }
    
    /**
    * Restituisce il valore del perimetro
    * @return 
    */
    public float calcolaPerimetro () { // funzione per calcolare circonferenza
        float perimetro;
        perimetro=(raggio*2)*3.14f;
        return perimetro;                
    } 
    
    /**
     * Restituisce il valore degli attributi
     * @return 
     */
    public String info(){
        String testo;
        testo = "raggio: " + raggio + "\n";
        return testo;
    }
        
}
        
    
