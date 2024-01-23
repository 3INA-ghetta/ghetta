
package ghetta;

/**
 * Scrivere una classe e il relativo test con menù che, dato un numero n, 
 * preveda due metodi: crea una stringa con i primi n numeri dispari (for),
 * crea una stringa con i primi n numeri pari (while)
 * @author claudio.ghetta
 * @version 1.0
 */
public class MenuPariDispari {
    private int numero;
    /**
     * costruttore senza parametri
     */
    public MenuPariDispari() {
        
    }
    /**
     * costruttore con parametri
     * @param numero 
     */
    public MenuPariDispari(int numero) {
        this.numero = numero;
    }
    /**
     * restituisce numero
     * @return 
     */
    public int getNumero() {
        return numero;
    }
    /**
     * imposta/modifica numero
     * @param numero 
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    /**
     * restituisce info
     * @return 
     */
    public String info(){
        String testo;
        
        testo = "numero numeri: " + numero;
        
        return testo;
        
    }
    /**
     * restituisce una stringa di valore
     * @return 
     */
    public int dispari(){
        int valore=0;
        
        for (int i = 0; i <= (numero+1); i++){
            if (valore%2 != 0 ){
                System.out.println(valore);
                valore++; 
            }else{
                valore++;
            }
                
        }
        
        return valore;
        
    }
    /**
     * restituisce una stringa di valore
     * @return 
     */
    public int pari(){
        int valore=0;
        int contatore =0;
        
        while (contatore <= numero){
            if (valore%2 == 0 ){
                System.out.println(valore);
                valore = valore + 2;
            }else{
                valore++;
            }
                
        }
        
        return valore;
    }
    

    
    
}
