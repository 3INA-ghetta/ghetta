
package biglietto;

/**
 * classe per calcolare l importo da pagare per un biglietto 
 * @author claudio.ghetta
 * @version 1.0
 */
public class BigliettoFerroviario {
    private float costoBiglietto = 5;
    private String situazione;
    
    /**
     * costruttore senza paramtri
     */
    
    public BigliettoFerroviario(){
        
    }
    /**
     * costruttore con parametri
     * @param costoBiglietto
     * @param situazione 
     */
    public BigliettoFerroviario( float costoBiglietto, String situazione) {
        this.costoBiglietto = costoBiglietto;
        this.situazione = situazione;
    }
    /**
     * restituisce il valore di costoBiglietto
     * @return costoBiglietto
     */
    public float getCostoBiglietto() {
        return costoBiglietto;
    }
    /**
     * imposta/modifica il valore di costoBiglietto
     * @param costoBiglietto 
     */
    public void setCostoBiglietto(float costoBiglietto) {
        this.costoBiglietto = costoBiglietto;
    }
    /**
     * restituisce il valore di situazione
     * @return 
     */
    public String getSituazione() {
        return situazione;
    }
    /**
     * imposta/modifica il valore di situazione
     * @param situazione 
     */
    public void setSituazione (String situazione) {
        this.situazione = situazione;
    }      
       
    /**
     * restituisce valore di importo
     * @return 
     */
    public float importo() {
        float importo;
        switch (situazione) {
            case "p": 
            case "P":
                importo = costoBiglietto - (costoBiglietto*10/100);
            break;
            
            case "s":
            case "S":
                importo = costoBiglietto - (costoBiglietto*15/100);
            break;
            
            case "d":
            case "D":
                importo = costoBiglietto - (costoBiglietto*25/100);
            break;
            
            default:
                importo = costoBiglietto;
              
        }        
        return importo;        
        }
    /**
     * restituisce il valore di testo
     * @return 
     */
    public String info() {
        
        String testo;
        
        testo= "costo del biglietto:" + costoBiglietto + "\n"
              +"situazione " + situazione +"\n";
        
        return testo;
    }    
    
    

        

}
    
    
        

