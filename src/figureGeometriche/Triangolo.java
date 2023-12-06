//dati i lati di un triangolo stabilire il tipo perimetro e area
//è possibile costruitre un triangolo solo se ciascun lato è minore della somma degli altri due
package figureGeometriche;

/**
 *Classe per stabilire il tipo, perimetro e area di un triangolo
 * @author claudio.ghetta
 * @version 1.0
 */
public class Triangolo {
    private float l1;
    private float l2;
    private float l3;
    
    /**
     * classe senza parametri
     */
    public Triangolo () {
        
    }
    /**
     * classe con parametri
     * @param l1
     * @param l2
     * @param l3 
     */
    public Triangolo(float l1, float l2, float l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }
    /**
     * restituisce l1
     * @return l1
     */
    public float getL1() {
        return l1;
    }
    /**
     * imposta/modifica l1
     * @param l1 
     */
    public void setL1(float l1) {
        this.l1 = l1;
    }
    /**
     * restituisce l2
     * @return l2
     */
    public float getL2() {
        return l2;
    }
    /**
     * imposta/modifica l2
     * @param l2 
     */
    public void setL2(float l2) {
        this.l2 = l2;
    }
    /**
     * restituisce l3
     * @return l3
     */
    public float getL3() {
        return l3;
    }
    /**
     * imposta/modifica l3
     * @param l3 
     */
    public void setL3(float l3) {
        this.l3 = l3;
    }
    /**
     * restituisce testo
     * @return 
     */
    public String info (){
        String testo;
        testo = "l1: " + l1 +"\n" +
                "l2: " + l2 +"\n" +
                "l3: " + l3;
        return testo;
    }
    /**
     * restituisce il valore del perimetro
     * @return 
     */
    public float perimetro () {
        float p;
        
        p = l1+l2+l3;
        
        return p;    
    }
    
    /**
    * Restituisce il valore del semi-perimetro
    * @return 
    */
    public float calcolaSemiperimetro() {
      float semiperimetro;
      
      semiperimetro = perimetro()/2;
      
      return semiperimetro; 
    }
    
    /**
    * Restituisce il valore dell area
    * @return 
    */
    public float area() {
      float area;
      
      area = (float) Math.sqrt(calcolaSemiperimetro()*(calcolaSemiperimetro()-l1)
              *(calcolaSemiperimetro()-l2*(calcolaSemiperimetro()-l3)));
    
      return area;
    }
    /**
     * restituisce il valore tipo
     * @return 
     */
    public String tipo() {
        String tipo ="";
        
        if ((l1 == l2 && l2==l3))
            tipo = "equilatero";
        if (l1 != l2 && l1 != l3 && l2 != l3)
            tipo = "scaleno";
        if ((l1 == l2 && l2 != l3) || (l2 == l3 && l2 != l1) || (l1 == l3 && l1 != l2))
            tipo = "isoscele";
        
        return tipo;
    }
    /**
     * restituisce il valore tipo
     * @return 
     */
    public String tipo1() {
        String tipo ="";
        
        if ((l1 == l2 && l2==l3)){
            tipo = "equilatero";
        }else if (l1 != l2 && l1 != l3 && l2 != l3){
            tipo = "scaleno";
        }else {
            tipo = "isoscele";
        }
        return tipo;
    }
    /**
     * restituisce il valore v
     * @return 
     */
    public boolean isTriangolo() {
        boolean v = false;
        if ((l1 > l2 + l3) && (l2 > l1 + l3) && (l3 > l1 + l2)) {
            v = true;
        }
        
        return v;
        
    }
  
}
