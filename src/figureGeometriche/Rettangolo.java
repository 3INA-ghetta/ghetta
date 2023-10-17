
package figureGeometriche;


public class Rettangolo {
    public float b;
    public float h;
        
    public Rettangolo (float base, float altezza) {
        b = base;
        h = altezza;
    }
    
    public float getB (){
        return b;
    }
    
    public float getH (){
        return h;
    }
    
    public void setB (float b) {
        this.b = b;
    }
    
    public void setH (float h) {
        this.h = h;
    }
    
    public float calcolaArea () {
        float area;
        area = b*h;
        return area;    
    }
    
    public float calcolaPerimetro () {
        float perimetro;
        perimetro = (b*2)*(h*2);
        return perimetro;                
    }
    
      public String info(){
        String testo;
        testo = "base      : " + b    + "\n" +
                "altezza   : " + h    + "\n";
        return testo;
    }
    
}

