
package ghetta;

/**
 * Classe per individuare il tipo di un poligono e il suo perimetro dati in input
 * il lato maggiore e il numero di lati
 * @author Ghetta.Claudio
 * @version 1.0
 */
public class Poligono {
    
    private int numeroLati;
    private float lato;
    
    /**
     * classe senza parametri
     */
    public Poligono (){
        
    }
    /**
     * classe con parametri
     * @param numeroLati
     * @param lato 
     */
    public Poligono(int numeroLati, float lato) {
        this.numeroLati = numeroLati;
        this.lato = lato;
    }
    /**
     * restituisce valore di NumeroLati
     * @return NumeroLati
     */
    public int getNumeroLati() {
        return numeroLati;
    }
    /**
     * imposta/modifica il valore di NumeroLati
     * @param numeroLati 
     */
    public void setNumeroLati(int numeroLati) {
        this.numeroLati = numeroLati;
    }
    /**
     * restituisce valore di lato
     * @return lato
     */
    public float getLato() {
        return lato;
    }
    /**
     * imposta/modifica il valore di lato
     * @param lato
     */
    public void setLato(float lato) {
        this.lato = lato;
    }
    
    public boolean isPoligono(){
        boolean accettabile;
        if (numeroLati > 3 && lato > 0){
            accettabile = true;
        } else {
            accettabile = false;
        }
        return accettabile;        
    }
    /**
     * restituisce la stringa tipo
     * @return tipo
     */
    public String tipoPoligono(){
        String tipo;
        switch (numeroLati) {
            case 3:
                tipo = "triangolo";
                break;
            case 4:
                tipo = "quadrato";
                break;
            case 5:
                tipo = "pentagono";
                break;
            case 6:
                tipo = "esagono";
                break;
            default:
                tipo = " inserito numero di lati non valido";
                
                
            
        }
        return tipo;
    }
    /**
     * restituisce il valore di p, se non è un poligono p è uguale a 0
     * @return p
     */
    public float perimetro (){
        float p;
        
        if (isPoligono() == true){
            p = lato * numeroLati;
        } else {
            p = 0;
        }
          
        return p;
    }
    /**
     * restituisce la stringa testo
     * @return testo
     */
    public String info(){
        String testo;
        
        testo = "numero di lati: " + numeroLati + "\n"
              + "valore del lati maggiore: " + lato;
        
        return testo;
    }
    
}
