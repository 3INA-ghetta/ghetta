
package figureGeometriche;


public class Rombo {
    private float lato;
    private float altezza;
    
    public Rombo (float lato, float altezza) {
        this.lato    = lato;
        this.altezza = altezza;
        
    }
    
    public double getLato(){
        return lato;
    }
    
    public double getAltezza(){
        return altezza;
    }
    
    public void setLato (float lato){
        this.lato = lato; 
    }
    
    public void setAltezza (double base){
        this.altezza = altezza; 
    }
    
    public float calcolaArea () {
        float area;
        area = lato*altezza;
        return area;
    }
    
    public float calcolaPerimetro () {
        float perimetro;
        perimetro = lato*4;
        return perimetro;
    }
    
     public String info(){
        String testo;
        testo = "altezza: " + altezza + "\n" +
                "lato   : " + lato    + "\n";
        return testo;
    }
}
