
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
    
    public double quadrato(){
        double ris=0;
        
        if (num <= 20 && num > 0){
            for (double i = 0; i < num; i++ ){
            ris = Math.sqrt(i);
            System.out.println(ris);
            }
        }
        
        return ris;
    }
    
    
    
    
    
}
