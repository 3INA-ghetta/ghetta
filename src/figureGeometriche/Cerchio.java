
package figureGeometriche;


public class Cerchio {
    public float raggio;
    
    public Cerchio (float raggio){
        this.raggio = raggio;
        //this distingue parametro da attributo
    }
    
    public float getRaggio() {
        return raggio;
    }
    
    public void setRaggio(float raggio) {
        this.raggio = raggio;
    }
    
    public float calcolaArea () {
        float area;
        area=3.14f*(raggio*raggio);
        return area;
    }
    
    public float calcolaPerimetro () { // funzione per calcolare circonferenza
        float perimetro;
        perimetro=(raggio*2)*3.14f;
        return perimetro;                
    } 
    
    public String info(){
        String testo;
        testo = "raggio: " + raggio;
        return testo;
    }
        
    }
        
    
