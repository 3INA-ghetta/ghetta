
package ghetta;


public class MenuPariDispari {
    private int numero;
    
    public MenuPariDispari() {
        
    }
    
    public MenuPariDispari(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String info(){
        String testo;
        
        testo = "numero numeri: " + numero;
        
        return testo;
        
    }
    
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
