package vettori1;

import java.util.Random;
import java.util.Scanner;

public class VettoreNew {
    
    private int [] vett = {1,2,3,4};

    public VettoreNew() {

    }
    
    public VettoreNew(int [] vett) {
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
    /*
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
    */
    
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
    
    public void shiftDestro(int nPosizioni){
        if(vett != null || nPosizioni-vett.length <= 0){
            
            int [] vett1 = new int [vett.length];

            for (int i = 0; i < vett.length; i++) {  
                
                int j = (i+nPosizioni) % vett.length;
                
                vett1[j] = vett[i];
                        
            }
            
            vett = vett1;
           
        }

        
    }
    
    public void shiftSinistro(int nPosizioni){
        if(vett != null || nPosizioni-vett.length <= 0){ 
            
            int [] vett1 = new int [vett.length];
                
            while (nPosizioni > vett.length){
                nPosizioni = nPosizioni%vett.length;
            }

            for (int i = 0; i < vett.length; i++) {  
                
                int j =(i+(vett.length-nPosizioni)) % vett.length;
                
                vett1[j] = vett[i];
                        
            }
            
            vett = vett1;
           
        }                   
        
    }
    
    public boolean ricercaElementoPerValore(int valore) {
        boolean trovato = false;
        if ( vett == null ){
            return false;
        }
        for (int i = 0; i < vett.length; i++) {
                if (vett[i] == valore) {
                    trovato = true;
                    break;
                }
            }
        return trovato;
    }
    
    public void ordinaCrescente (){
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
    
    public void ordinaDecrescente (){
        if (vett != null){
            
            for (int i = 0; i < vett.length-1; i++){
                
                int min = i;
                
                for (int k = i+1; i < vett.length-1; i++){
                    
                    if (vett[min]>vett[k]){
                        
                        min = k;
                        
                    }
                    
                }
                
                if(min == i){
                    
                    int j = vett[min];
                    vett[min] = vett[min+1];
                    vett[min+1] = j;
                
                }
                    
                
            }
        
            
        }
        
    }
    
    public static void main(String[] args) {
        
       Scanner in = new Scanner(System.in);
       int valore,posizione,posizione1,valore1,Npos,Npos1;
        
       VettoreNew v = new VettoreNew();
                
       System.out.print(v.visualizzaVettore());
       System.out.print("\n");
       
       /*
       System.out.print("inserisci posizione da modificare: ");
       posizione = in.nextInt();
        
       System.out.print("inserisci valore da mettere nella posizione "
               + "da modificare: ");
       valore = in.nextInt();
        
       System.out.print("inserisci posizione dell' elemento da rimuovere: ");
       posizione1 = in.nextInt();
        
       System.out.print("inserisci valore dell' elemento da rimuovere: ");
       valore1 = in.nextInt();
        
       System.out.printf("%b \n", v.modificaElemento(posizione, valore));
       System.out.printf("%b \n", v.rimuoviElementoPerPosizione(posizione1));
       System.out.printf("%b \n", v.rimuoviElementoPerValore(valore1));
       System.out.print(v.visualizzaVettore());
       */
        
       System.out.print("inserisci numero di shift a destra: ");
       Npos = in.nextInt();
       
       if (Npos < 0 ){
           System.out.print("errore, mettere numeri non negativi: ");
       }
       
       v.shiftDestro(Npos);
       
       
       System.out.print(v.visualizzaVettore());
       System.out.print("\n");
        
       System.out.print("inserisci numero di shift a sinistra: ");
       Npos1 = in.nextInt();
       
       if (Npos < 0 ){
           System.out.print("errore, mettere numeri non negativi: ");
       }
       
       v.shiftSinistro(Npos);
       
       System.out.print(v.visualizzaVettore());
        
        
    }
    
    
}

