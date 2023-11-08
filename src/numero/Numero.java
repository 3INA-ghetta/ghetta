
package numero;

/**
 *
 * @author claudio.ghetta
 */
public class Numero {
    private float n1;
    private float n2;
    
    public Numero () {
        
    }
    
    public Numero (float n1, float n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public float getN1 () {
        return n1;
    }
    
    public void setN1 (float n1) {
        this.n1 = n1;
    }
    
    public float getN2 () {
        return n2;
    }
    
    public void setN2 (float n2) {
        this.n2 = n2;
    }
    
    public float differenza () {
        float d;
        if (n1 > n2) {            
            d = n1 - n2;
        }else {
            d = n2 - n1;            
        }
        return d;
    }
    
    public String info () {
        String testo;
        testo = "n1: "  + n1     + "\n" +
                "n2: "  + n2     + "\n";
        return testo;  
    }
}

