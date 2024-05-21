
package vettori1;

import java.util.Random;

public class Vettore {
    
    int [] vett = new int [10];

    public Vettore() {
        caricaVettoreRandom();
        ordinaVettore();
    }
    

    public int[] getVett() {
        return vett;
    }

    public void setVett(int[] vett) {
        this.vett = vett;
    }

    
    
    public void caricaVettoreRandom(){
        Random r = new Random();
        int i=0;
        while (i < vett.length){
            vett [i] = r.nextInt(99)+1;
            i++;
        }
             
    }
    
    public String visualizzaVettore(){
        String testo= "";
        int i=0;
        while(i < vett.length){
            testo += String.format("%d ", vett[i]);
            i++;
        }
        testo += "\n";
        return testo;
    }
    
    public void ordinaVettore (){
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
    
    public boolean modificaElemento (int posizione, int valore){
        boolean scambio = false;
           
        vett[posizione] = valore;
        scambio = true;
                
        return scambio;
        
    }
    
    public void aggiungiElemento(int valore) {
             
        int[] tempVett = new int[vett.length + 1];
        for (int i = 0; i < vett.length; i++) {
            tempVett[i] = vett[i];
            }
        tempVett[tempVett.length - 1] = valore;
        vett = tempVett;
  
    }
    
    public boolean rimuoviElementoPerPosizione(int posizione) {
        boolean rimosso = false;
        int[] tempVett = new int[vett.length - 1];
        for (int i = 0, j = 0; i < vett.length; i++) {
            if (i != posizione) {
                tempVett[j] = vett[i];
                j++;
                }
        }
        vett = tempVett;
        rimosso = true;
        return rimosso;

    }
    
    public boolean rimuoviElementoPerValore(int valore) {
        boolean rimosso = false;
            for (int i = 0; i < vett.length; i++) {
                if (vett[i] == valore) {
                    int[] tempVett = new int[vett.length - 1];
                    for (int j = 0, k = 0; j < vett.length; j++) {
                        if (j != i) {
                            tempVett[k] = vett[j];
                            k++;
                        }
                    }
                    vett = tempVett;
                    rimosso = true;
                    break;
                }
            }
        return rimosso;
    }
    
    
}
