
package operazioniMatematiche;

public class Somma {
    public float numero1;
    public float numero2;
    
    public Somma (float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
                 
    }
    
    public float getNumero1 (){
        return numero1;
    }
    
    public float getNumero2 (){
        return numero2;
    }
    
    public void setNumero1 (float numero1) {
        this.numero1 = numero1;
    }
    
      public void setNumero2 (float numero2) {
        this.numero2 = numero2;
    }
    public float calcolo () {
        float somma;
        somma = numero1 + numero2;
        return somma;
        
    }
    
    public String info () {
        String testo;
        testo = "numero1: " + numero1 + "\n" +
                "numero2: " + numero2 + "\n";
        return testo;
    }
    
}
