
package cicli;

import java.util.Formatter;
import java.util.Random;

/**
 * classe che calcola frequenza assoluta,relativa,percentuale con random
 * @author claudio.ghetta
 */
public class Frequenze {
    
    public int nEl;
    public int nEl2;
    public int nEl3;
    public int nEl4;
    private int tot;
    
    public Frequenze(){
        
    }

    public Frequenze(int nEl, int nEl2, int nEl3, int nEl4) {
        this.nEl = nEl;
        this.nEl2 = nEl2;
        this.nEl3 = nEl3;
        this.nEl4 = nEl4;
    }

    public int getTot() {
        return tot;
    }

    public void setTot(int tot) {
        this.tot = tot;
    }
    
    
    
    public String frequenzaAssoluta(){
        String testo = "Frequenza assoluta";
        
        testo += nEl + nEl2 + nEl3 + nEl4;
        
        return testo;
    }
    
    public String frequenzaRelativa(){
       String testo = "";
      
       int tot = nEl + nEl2 + nEl3 + nEl4;
       
       double fR1 = (double)nEl/tot;
       double fR2 = (double)nEl2/tot;
       double fR3 = (double)nEl3/tot;
       double fR4 = (double)nEl4/tot;
       
       testo += fR1 + " " + fR2 + " " + fR3 + " " + fR4 + " ";
       
       Formatter f = new Formatter();
       
       f.format(" %.2f %.2f %.2f %.2f", fR1, fR2, fR3, fR4); 
       
       testo += f;
       return testo;
    }
    
    public String frequenzaPercentuale(){
       String testo = "";
       
       double fP1 = ((double)nEl/tot)*100;
       double fP2 = ((double)nEl2/tot)*100;
       double fP3 = ((double)nEl3/tot)*100;
       double fP4 = ((double)nEl4/tot)*100;
       
       testo += fP1 + " " + fP2 + " " + fP3 + " " + fP4 + "% ";
       
       Formatter f = new Formatter();
       
       f.format(" %.2f %.2f %.2f %.2f", fP1, fP2, fP3, fP4); 
       
       testo += f;
       return testo;
    }
       
}

