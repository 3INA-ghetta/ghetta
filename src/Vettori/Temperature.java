
package Vettori;

/**
 * scrivere classe che date temperature di una settimana, ne calcoli la media e 
 * restituisca i giorni con la temperatura più alta e più bassa
 * @author claudio.ghetta
 */
public class Temperature {
    
    private final int [] temp = {2,1,3,4,6,7,5};
    final private String giorni [] = {"lunedi", "martedi", "mercoledi","giovedi","venerdi","sabato","domenica" };

    public Temperature() {
    }
    
    public int [] getTemp(){
        return temp;
    }
    
    public String [] getGiorni(){
        return giorni;
    }
    
    public boolean isValido(){
        boolean is = false;
        
        for (int i = 0; i <= temp.length; i++){
            if(temp[i] <= 60 && temp[i] >= -90){
                is = true;      
            }
        }
        return is;
    }
    
    public String media(){
        float m = 0;
        String testo;
        
        for (int i=0; i < temp.length; i++){
            m += temp [i];
            
        }
        
        m = m / 7;
        
        testo = "la media è: " + m;
    
        return testo;
    }
    
    public String minMax(){
        int max = 0;
        int min = 60;
        int g = 0;
        String testo;
        
        for (int i = 0; i < temp.length; i++){
            
            if (temp[i] > max){
                max = temp[i];  
                g = i;
            }else if (temp[i] <= min){
                min = temp[i]; 
                g = i;
            }
            
        }
        testo = "la temperatura maggiore è: " + max + " durante " + giorni[g] + 
                "\n"+ "la temperatura minore è: " + min + " durante " + giorni[g];
    
        return testo;
    }
    
}
