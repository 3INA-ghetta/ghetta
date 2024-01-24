
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
    static int cont = 0;
    static int num = 0;
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
     * restituisce valore
     * @return 
     */
    public String dispari(){
        int valore=0;
        String testo="";
        
        for (int i = 0; i <= (numero+1); i++){
            if (valore%2 != 0 ){
                testo = valore + "\n";
                valore++; 
            }else{
                valore++;
            }
                
        }
        
        return testo;
        
    }
    /**
     * restituisce valore
     * @return 
     */
    public String pari(){
        int valore=0;
        int contatore =0;
        String testo="";
        
        while (contatore <= numero){
            if (valore%2 == 0 ){
                testo = valore + "\n";
                valore = valore + 2;
            }else{
                valore++;
            }
                
        }
        
        return testo;
    }
    
    /**
     * restituisce valore
     * @return 
     */
    public static String dispari1(){
        int valore=0;
        String testo="";
        
        for (int i = 0; i <= (num+1); i++){
            if (valore%2 != 0 ){
                testo = valore + "\n";
                valore++; 
            }else{
                valore++;
            }
                
        }
        
        return testo;
        
    }
    /**
     * restituisce valore
     * @return 
     */
    public static String pari1(){
        int valore=0;
        String testo="";
        
        while (cont <= num){
            if (valore%2 == 0 ){
                testo = valore + "\n";
                valore = valore + 2;
            }else{
                valore++;
            }
                
        }
        
        return testo;
    }
    

    
    
}
