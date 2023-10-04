
package figureGeometriche;

public class Quadrato {    
    public float l;
    
    
    public Quadrato(float lato) {
        l = lato;
               
    }
    
    public float calcolaArea () {
        float area;        
        area=l*l;
        return area;
        
    }
    public float calcolaPerimetro () {
        float perimetro;        
        perimetro=l+l+l+l;
        return perimetro;        
    }    
}

