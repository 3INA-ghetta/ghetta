
package verifica;

import java.time.LocalTime;

/**
 * Progettare, implementare e curare la documentazione di una classe che, 
 * dato un orario composto da ore, minuti e secondi, preveda metodi, 
 * oltre quelli di default, per effettuare le seguenti operazioni:
   - secondi equivalenti;
   - minuti equivalenti;
   - ore equivalenti;
   - differenza in secondi con un altro orario.
 * @author Claudio.Ghetta 3INA
 * @version 1.0
 */
public class Orario1 {
    
    private int s,h,m;
    
    /**
     * costruttore senza parametri
     */
    public Orario1(){
        LocalTime adesso = LocalTime.now();
        
        s = adesso.getSecond();
        m = adesso.getMinute();
        h = adesso.getHour();
        
    }
    /**
     * costruttore con parametri
     * @param s
     * @param m
     * @param h
     */
    public Orario1(int s, int m, int h) {
        setS(s);//this.s = s;
        setM(m);//this.m = m;
        setH(h);//this.h = h;

    }
    
    /**
     * restituisce il valore di s
     * @return s 
     */
    public int getS() {
        return s;
    }
    
    /**
     * imposta/modifica il valore di s
     * @param s 
     */
    public final void setS(int s) {
        if(isValido()){
            this.s = s;           
        }
    }
    
    /**
     * restituisce il valore di m
     * @return m 
     */
    public int getM() {
        return m;
    }
    
    /**
     * imposta/modifica il valore di m
     * @param m 
     */
    public final void setM(int m) {
        if(isValido()){
            this.m = m;
        }
    }
    
    /**
     * restituisce il valore di h
     * @return h 
     */
    public int getH() {
        return h;
    }
    
    /**
     * imposta/modifica il valore di h
     * @param h
     */
    public final void setH(int h) {
        if(isValido()){
            this.h = h;
        }
    }
    
    public boolean isValido(){
        boolean is = false;
        
        is =isValido(s,m,h);
           
        return is;
    }
    
    public boolean isValido(int s, int m, int h){
        boolean is = false;
        
        if (h >= 0 && s <= 23)
            if(m >= 0 && m <= 59)
                if(s >= 0 && s <= 59)
                    is = true;
        
        //if ((h >= 0 && s <= 23) && (m >= 0 && m <= 59) && (s >= 0 && s <= 59))
        return is;
    }
    
    /**
     * scrive orario in ore:minuti:secondi
     * restituisce testo
     * @return testo 
     */
    public String info(){
        String testo;
        String hT="";
        String sT="";
        String mT="";
        
        if(isValido()== true){
            if (h < 10 ){
                hT ="0"+h+":";           
            }else {
                hT =h+":";   
            }
            if (m < 10){
                mT ="0"+m+":";
            }else{
                mT =m+":";            
            }             
            if (s < 10){
                sT ="0"+s + "\n";
            }else{
                sT =s + "\n";          
            }     
        }
        testo = ("primo orario è:" +"\n"+hT+mT+sT);
     
        return testo;
    }
    
    /**
     * calcola l'orario in secondi
     * restituisce orario
     * @return orario
     */
    public int orarioInSec(){
        int orario;
        
        orario = s + m*60 + h*3600;
        
        return orario;
    }
    
    public int orarioInSec(int s, int m, int h){
        int orario=0;
        if(isValido(s,m,h)== true){
            orario = s + m*60 + h*3600;
        }
        
        return orario;
    }
    
    /**
     * calcola l'orario in minuti
     * restituisce orario
     * @return orario
     */
    public int orarioInMin(){
        int orario=0;
        if(isValido()== true){
        orario = orarioInSec()/60;
        }
        //orario = m + h*60;
        
        return orario;
    }
    
    /**
     * calcola l'orario in ore
     * restituisce orario
     * @return orario
     */
    public int orarioInH(){
        int orario=0;
        if(isValido()== true){
        orario = orarioInMin()/60;
        }
        //orario = m/60 + h;
        
        return orario;
    }
    
    /**
     * calcola la differenza fra due orari
     * restituisce differenza
     * @param s
     * @param m
     * @param h
     * @return diff
     */
    public int diff(int s, int m, int h){
        int diff=0;
        
        if (isValido() == true && isValido(s,m,h) == true){
        
            diff =Math.abs(orarioInSec() - orarioInSec(s,m,h));

        }
        
        return diff;
    }
    
    public int diffNew(Orario o){
        int diff=0;
        
        int s = o.getS();
        int m = o.getM();
        int h = o.getH();
        
        if (isValido() == true && isValido(s,m,h) == true){
        
            diff =Math.abs(orarioInSec() - orarioInSec(s,m,h));

        }
        return diff;    
    }
        
}