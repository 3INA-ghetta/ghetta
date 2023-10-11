
package figureGeometriche;


public class Rombo {
    public float lato;
    public float altezza;
    
    public Rombo (float lato, float altezza) {
        this.lato    = lato;
        this.altezza = altezza;
        
    }
    
    public float calcolaArea () {
        float area;
        area = lato*altezza;
        return area;
    }
}
