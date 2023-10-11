
package figureGeometriche;


public class TriangoloRettangolo {
    private double base;
    private double altezza;
    private double lato;
    
    public TriangoloRettangolo (double base, double altezza, double lato) {
        this.base    = base;
        this.altezza = altezza;
        this.lato    = lato;
        
    }
    
    public double getBase(){
        return base;
    }
    
    public double getAltezza(){
        return altezza;
    }
    
    public double getLato(){
        return lato;
    }
    
    public void setBase (double base){
        this.base = base; 
    }
    
    public void setAltezza (double altezza){
        this.altezza = altezza; 
    }
    
    public void setLato (double lato){
        this.lato = lato; 
    }
    
    public double perimetro () {
        double perimetro;
        perimetro = base + altezza + lato;
        return perimetro;
    }
    
    public double area () {
        double area;
        area =(base * altezza) /2;
        return area;
    }
    
    public String info(){
        String testo;
        testo = "base   : " + base    + "\n" +
                "altezza: " + altezza + "\n" +
                "lato   : " + lato    + "\n";
        return testo;
    }
    
}
