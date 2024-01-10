
package teoria;

/**
 * classe che data una temperatura restituisca un consiglio in base al suo valore
 * @author claudio.ghetta 3INA 2024
 * @version 1.0
 */
public class Meteo {
    
    private float temperatura;
    
    
    /**
     * costruttore senza parametri
     * {@link #setTemperatura(float) 
     */
    public Meteo() {

    }
    
    /**
     * costruttore con parametri
     * @param temperatura 
     */
    public Meteo(float temperatura) {
        this.temperatura = temperatura;
    }
    
    /**
     * restituisce valore di temperatura
     * @return 
     */
    public float getTemperatura() {
        return temperatura;
    }
    
    /**
     * imposta/modifica valore di temperatura
     * @param temperatura 
     */
    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }
    
    /**
     * restituisce valore di testo
     * @return String
     */
    public String info(){
        String testo;
        
        testo = "la temperatura è: " + temperatura;
        
        return testo;
    }
    
    /**
     * restituisce consiglio in base alla temperatura
     * @return String
     */
    public String consiglio1(){
        String testo = "";
        
        if (temperatura < 0){
            testo = "attenti al ghiaccio!";
        }
        if (temperatura == 0){
            testo = "si va a sciare!";
        }
        if (temperatura > 0 && temperatura <= 5){
            testo = "ci vuole il cappellino!";
        }
        if (temperatura > 5 && temperatura <= 10){
            testo = "basta il piumino!";
        }
        if (temperatura > 10 && temperatura <= 15){
            testo = "solo il maglioncino!";
        }
        if (temperatura > 15 && temperatura <= 20){
            testo = "magari!";
        }
        if (temperatura > 20 && temperatura <= 25){
            testo = "tutti al mare!";
        }
        if (temperatura > 25){
            testo = "condizionatore a manetta!";
        }
        
        return testo;
    }
    
    public String consiglio2(){
        String testo = "";
        
        if (temperatura < 0){
            testo = "attenti al ghiaccio!";
        }
        else if (temperatura == 0){
            testo = "si va a sciare!";
        }
        else if (temperatura > 0 && temperatura <= 5){
            testo = "ci vuole il cappellino!";
        }
        else if (temperatura > 5 && temperatura <= 10){
            testo = "basta il piumino!";
        }
        else if (temperatura > 10 && temperatura <= 15){
            testo = "solo il maglioncino!";
        }
        else if (temperatura > 15 && temperatura <= 20){
            testo = "magari!";
        }
        else if (temperatura > 20 && temperatura <= 25){
            testo = "tutti al mare!";
        }
        else{
            testo = "condizionatore a manetta!";
        }

        return testo;
    }
     
    public String consiglio3(){
        String testo = "";
        
        if (temperatura < 0)
            if(temperatura == 0)
                if (temperatura > 0 && temperatura <= 5)                     
                    if (temperatura > 5 && temperatura <= 10)
                        if (temperatura > 10 && temperatura <= 15)
                            if (temperatura > 15 && temperatura <= 20)
                                if (temperatura > 20 && temperatura <= 25)
                                    if (temperatura > 25)
                                    
        return testo;
    }
     
    public String consiglio4(){
        String testo = "";
        
        
        
        return testo;
    }
    
    
    
}
