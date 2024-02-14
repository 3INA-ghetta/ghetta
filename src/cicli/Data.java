
package cicli;

public class Data {
    private int g;
    private int m;
    private int a;

    public Data() {
    }
    
    public Data(int g, int m, int a) {
        this.g = g;
        this.m = m;
        this.a = a;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    
    public boolean isValida(){
        boolean is = false;
        boolean isAnno = false;
        boolean isData = false;
        boolean isBisestile = false;
        
        if (a % 400 == 0 || (a % 4==0 && !(a%100==0))){
            isBisestile = true;
        }
        
        if (a >= 1000 && a <= 9999){
            isAnno = true;
        }

        if ( m < 1 || m > 12 || g < 1 || g > 31){
            isData = false;
        }else if (g > 28 && m > 2 && m < 2 && isBisestile == false){
            isData = false;
        }else if (g > 30 && m == 11 || m == 12 || m == 4 || m == 6 ){
            isData = false;
        }else if (g > 29 && m > 2 && m < 2 && isBisestile == true){
            isData = false;
        }else if (g > 29 && m > 2 && m < 2 && isBisestile == false){
            isData = false;
        }else{
            is = true;
        }
        
        if (isAnno == true && isData == true){
            is = true;
        }
          
        return is;
    }
    
    
    
    public String info(){
        String testo = "";
        String gTesto = "";
        String mTesto = "";
        
        if (isValida() == true){
            if (g >= 1 && g <= 9){
                gTesto = "0" + g + "/";
            }
            if (m >= 1 && m <= 9){
                mTesto = "0" + m + "/";
            }
        }else{
            testo = "errore" + "\n";
        }
        testo = gTesto + mTesto + a + "\n";
         
        return testo;
    }
    
    public static int nGiorni(){
        int diff=0;
        int g1;
        int g2;
        int m1;
        int m2;
        int a1;
        int a2;
        
        
        
        return diff;
    }
        
    
}
