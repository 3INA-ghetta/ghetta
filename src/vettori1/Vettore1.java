package vettori1;

import java.util.Random;
import java.util.Arrays;

public class Vettore1 {
    
    private int [] vett;

    public Vettore1() {

    }
    
    public Vettore1(int [] vett) {
        //this.vett=vett;
        setVett(vett);
    }
    

    public int[] getVett() {
        //return vett.clone();
        
        if (vett == null){
            return null;
        }
        
        int [] temp = new int[vett.length];
        
        System.arraycopy(vett,0,temp,0,temp.length); 
        
        return temp;
    }

    public final void setVett(int[] vett) {
        if(isValido(vett)){
            //this.vett = vett.clone(); crea copia
            
            this.vett = new int [vett.length]; // altro modo per copia
            
            for(int i=0; i < vett.length; i++)
               this.vett[i] = vett[i];
            
        }
    }
    
    private boolean isValido(int [] vett){
        boolean valido = false;
        
        if (vett != null && vett.length > 0){
            valido = true;
        }
        return valido;
    }
    
    public void caricaVettoreRandom(){
        if(vett != null){
            
            Random r = new Random();
            int i=0;
            while (i < vett.length){
                vett [i] = r.nextInt(100)+1;
                i++;
        }
            
        }  
             
    }
    
    public String visualizzaVettore(){
        String testo= "";
        
        if(vett != null){
            testo = "[";
        
            for (int i = 0; i < vett.length; i++){
                if( i == (vett.length-1)){
                    testo += vett[i];
                }else{
                    testo += vett[i] + ", ";
            }
            }
            testo += "]";
               
        // return Arrays.toString(vett)
        
        }
        return testo;
    }
    
    public void ordinaVettore (){
        if (vett != null){
        
            int j;
            for (int i =1;i<vett.length;i++){
                int temp = vett[i];
                j=i;
                while(j>0 && vett[j-1]>temp){
                    vett[j]=vett[j-1];
                    j--;
                }           
                vett[j]=temp;
        }
        }
    }
    
    public boolean modificaElemento (int posizione, int valore){
        boolean modifica = false;
        
        if (vett != null){
            if(posizione >= 0 && posizione < vett.length){
                vett[posizione] = valore;
                modifica = true;
            }
        }
           
        return modifica;       
    }
    
    public void aggiungiElemento(int valore) {
        if (vett == null){
            vett = new int [1];
            
            vett [0] = valore;
        }else{
             
            int[] tempVett = new int[vett.length + 1];
            
            for (int i = 0; i < vett.length; i++) {
                tempVett[i] = vett[i];
                }
            
            tempVett[tempVett.length - 1] = valore;
            
            vett = tempVett;
        }
    }
    
    public boolean rimuoviElementoPerPosizione(int posizione) {
        if ( vett == null || posizione < 0 || posizione > vett.length){
            return false;
        }

        int[] tempVett = new int[vett.length - 1];
        for (int i = 0; i < vett.length; i++) {
            if (i < posizione) {
                tempVett[i] = vett[i];

            }else{
                tempVett[i] = vett [i+1];
            }
                
        }
        vett = tempVett;
        return true;

    }
    
    public boolean rimuoviElementoPerValore(int valore) {
        boolean trovato = false;
        if ( vett == null ){
            return false;
        }
        for (int i = 0; i < vett.length; i++) {
            if (vett[i] == valore) {
                rimuoviElementoPerPosizione(i);
                i=0;
                trovato = true;
                }
            }
        return trovato;
    }
    
    public boolean shift(int valore, int sposta){
        if(vett == null || sposta-vett.length > 0){
            return false;           
        }
        int val = 0;
        int newVett [] = new int [vett.length];
        
        for (int i =1;i<vett.length;i++){
                int temp = vett[i];
        }
        for (int i = 0; i < vett.length; i++){
            if (vett [i] == valore){
                val = i;
            }
                  
        }
        int valFin = vett[vett.length];
        for (int k = 0; k <= sposta; k++){
            
            vett [k+1] = vett [val];
            
            
            
            
        }
        boolean scambio = false;
        return scambio;
        
    }
    
    
}
