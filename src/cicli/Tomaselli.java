
package cicli;

/**
 *
 * @author claudio.ghetta
 */
public class Tomaselli {
    String testo;
    
    public Tomaselli() {
    }

    public Tomaselli(String testo) {
        this.testo = testo;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }
    
    public String info() {
        String testo;
        
        testo = "testo " + this.testo;
        
        return testo;
    }
    
    public String creaFrase (int n) {
        String testo = "";
        
        for (int i = 0; i < n; i++) {
            testo = this.testo + "\n";
        }
        return testo;
    }

}
