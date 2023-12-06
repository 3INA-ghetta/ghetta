
package biglietto;

/**
 * classe per calcolare l importo da pagare per un biglietto 
 * @author claudio.ghetta
 * @version 1.0
 */
public class BigliettoFerroviario {
    private String p;
    private String s;
    private String d;
    private float costoBiglietto;
    private String situazione;
    
    public BigliettoFerroviario(){
        
    }

    public BigliettoFerroviario(String p, String s, String d, float costoBiglietto, String situazione) {
        this.p = p;
        this.s = s;
        this.d = d;
        this.costoBiglietto = costoBiglietto;
        this.situazione = situazione;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public float getCostoBiglietto() {
        return costoBiglietto;
    }

    public void setCostoBiglietto(float costoBiglietto) {
        this.costoBiglietto = costoBiglietto;
    }
    
    public float importo() {
        float importo;
        switch (situazione) {
           if  "pensionato":
                importo = costoBiglietto*10/100+costoBiglietto;
                break;
            case "studente":
                importo = costoBiglietto*15/100+costoBiglietto;
                break;
            case "disoccupato": 
                importo = costoBiglietto*25/100+costoBiglietto;
                break;
            default:
                importo = costoBiglietto;
        }
        return importo;
    }
    
    
    
    
}
