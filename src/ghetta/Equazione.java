
package ghetta;

/**
 * classe per risolvare l equazione di secondo grado ax^2+bx+c=0
 * sapendo che il discriminante è d = b^2 - 4 ac
 * @author Ghetta.Claudio
 * @version 1.0
 */
public class Equazione {
    
    private float a;
    private float b;
    private float c;

    /**
     * costruttore senza parametri
     */
    public Equazione (){
        
    }
    /**
     * costruttore con parametri
     * @param a
     * @param b
     * @param c 
     */
    public Equazione(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c =c;

    }
    /**
     * restituisce valore di a
     * @return a
     */
    public float getA() {
        return a;
    }
    /**
     * imposta/modifica il valore di a
     * @param a
     */
    public void setA(float a) {
        this.a = a;
    }
    /**
     * restituisce valore di b
     * @return b
     */
    public float getB() {
        return b;
    }
    /**
     * imposta/modifica il valore di b
     * @param b
     */
    public void setB(float b) {
        this.b = b;
    }
    /**
     * restituisce valore di c
     * @return c
     */
    public float getC() {
        return c;
    }
    /**
     * imposta/modifica il valore di c
     * @param c
     */
    public void setC(float c) {
        this.c = c;
    }
    
    public float d (){
        float d;
        d = (b*b) - (4*a*c);
        return d; 
    }
    /**
     * restituisce la stringa imp
     * @return imp
     */
    public String impossibile(){
        String imp = "";
        float d = d();
        if (d < 0) {
            imp = "l'equazione non ha soluzioni reali”.";
        }
        return imp;
    }
    /**
     * restituisce il valore x1
     * @return x1
     */ 
    public float x1 (){
        float x1 = 0;
        float d = d();
        
        if (d > 0)
            x1 =(float) (-b+Math.sqrt(d))/2;
        if (d == 0) 
            x1 =-b/2*a;
    return x1;            
                    
    }
    /**
     * restituisce il valore x2
     * @return x2
     */
    public float x2 (){
        float x2 = 0;
        float d = d();
        
        if (d > 0)
            x2 =(float) (-b-Math.sqrt(d))/2;
        if (d == 0) 
            x2 =-b/2*a;
    return x2;            
                    
    }
    /**
     * restituisce la stringa testo
     * @return testo
     */
    public String info(){
        String testo;
        
        testo = "valore di a: " + a + "\n"
              + "valore di b: " + b + "\n"
              + "valore di c: " + c;
        
        return testo;
    }
    
}

