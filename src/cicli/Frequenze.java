
package cicli;

/**
 * classe che calcola frequenza assoluta,relativa,percentuale con random
 * @author claudio.ghetta
 */
public class Frequenze {
    
    private int cont = 0;

    public Frequenze() {
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    public String frequenza(){
       String testo = "";
       double frequenza;
       double frePer;
       double freRe;
       double oggetto;
       
       while (cont <= 4){
       frequenza = Math.random();
       oggetto = Math.random();
       
       System.out.println ( "frequenza assoluta n " + cont + " é: " + frequenza);
       
       freRe = frequenza + oggetto;
       
       System.out.println("frequenza relativa n " + cont + ": " + "\n"+ "é: " +freRe );
       
       frePer = freRe * 100;
       
       System.out.println("frequenza percentuale n " + cont + ": " + "\n" + " é: " +frePer + "%" );
       
       cont++;
       
       }
       
       return testo;
    }
       
}

