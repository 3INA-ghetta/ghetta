
package figureGeometriche;


public class Rettangolo {
    public float b;
    public float h;
        
    public Rettangolo (float base, float altezza) {
        b = base;
        h = altezza;
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
    
}
