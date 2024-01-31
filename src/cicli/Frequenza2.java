

package cicli;


import java.util.Random;



public class Frequenza2 {
    
    private int numeri = 9;
    private int totNumeri;

    public Frequenza2(int totNumeri) {
        this.totNumeri = totNumeri;
    }

    public int getNumeri() {
        return numeri;
    }

    public void setNumeri(int numeri) {
        this.numeri = numeri;
    }

    public int getTotNumeri() {
        return totNumeri;
    }

    public void setTotNumeri(int totNumeri) {
        this.totNumeri = totNumeri;
    }
    
    
    
    public String frequenza1(){
        
        Random r = new Random();
        
        int n;
        
        for (int i = 1; i <= totNumeri; i++){
          n =(int) r.nextInteger(9)+1;
          if (n==1){
              n++;
          }
        }
        return n;
    }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    