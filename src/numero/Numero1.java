
/*
costruire una classe che, dato un numero intero, stabilisca se è pari o dispari
e se maggiore, minore o uguale a zero
*/
package numero;

/**
 * Classe per determinare se un numero è pari o dispari e maggiore/minore o uguale a zero
 * @author Ghetta.Claudio 3INA 2023
 * @version 1.0
 */
public class Numero1 {
    
    private int n1;
    
    /**
     * classe senza parametri
     */
    public Numero1 () {
        
    }
    
    /** 
     * classe con parametri
     * @param n1 
     */
    public Numero1 (int n1) {
        this.n1 = n1;        
    }
    
    /**
     * restituisce n1
     * @return n1
     */
    public int getN1 () {
        return n1;
    }
    
    /**
     * imposta/modifica n1
     * @param n1 n1
     */
    public void setN1 (int n1) {
        this.n1 = n1;
    }
    
    /**
     * restituisce testo
     * @return  
     */
    public String pariODispari () {
        String testo;
        
        if (n1%2 == 0) {
            testo = "il numero è pari";
            
        } else {
            testo = "il numero è dispari";
            
        }
            
        return testo;
        
    }
    
    /**
     * restituisce testo
     * @return 
     */
    public String maggioreMinoreUgualeZero () {
        String testo;
        
        if (n1 > 0) {
            testo = " maggiore di zero";
          
        } else if (n1 < 0) {
            
            testo = "minore di zero";
            }
            else {
                testo = "uguale a zero";
            }
           
    return testo;    
    }
    
    /**
     * restituisce valore testo
     * @return 
     */
    public String info () {
        String testo;
        
        testo = "il numero è : " + n1 + "\n";
        
        return testo;
    }
    
}


