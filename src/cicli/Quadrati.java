
package cicli;

public class Quadrati {
    
    private int num;
    
    public Quadrati() {

    }

    public Quadrati(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public String quadrato(){
        double ris=0;
        String testo= "numeri" + "\t" + "quadrato" + "\n";
        int cont= 0;
        if (num <= 20 && num > 0){
            while (cont < num){
                
                ris = cont*cont;
                System.out.println(ris);
                testo += cont + "\t" + ris + "\n";
                cont++;
            }
        }
        return testo;    
    }
       
}
