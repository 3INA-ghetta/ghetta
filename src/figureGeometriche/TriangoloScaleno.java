
package figureGeometriche;

// calcolare anche altezza
// formula erone
//Math.sqrt (num) radice quadrata

/**
 * La classe TriangoloScaleno serve per calcolare il perimetro, altezza e area di un triangolo scaleno
 * @author Ghetta Claudio 3INA 2023
 * @version 1.0
 */
public class TriangoloScaleno {
    
    public double c1;
    public double c2;
    public double c3;
    
    /**
     * Costruttore senza parametri<br>
     * {@link #setC1(double)}<br>
     * {@link #setC2(double)}<br>
     * {@link #setC3(double)}<br>
     */
    public TriangoloScaleno() {
        
        
    }
    
    /**
     * Costruttore con tutti i parametri
     * @param cateto1
     * @param cateto2
     * @param cateto3
     */
    public TriangoloScaleno (double cateto1, double cateto2, double cateto3) { 
      c1 = cateto1;
      c2 = cateto2;
      c3 = cateto3;
    }
    
    /**
     * Restituisce il valore del cateto1
     * @return c1
     */
    public double getC1 (){
      return c1;  
    }
    
    /**
     * Restituisce il valore del cateto2
     * @return c2
     */
     public double getC2 (){
      return c2;  
    }
    
    /**
     * Restituisce il valore del cateto3
     * @return c3
     */
    public double getC3 (){
      return c3;  
    }
    
    /**
     * imposta/modifica il valore del cateto1
     * @param cateto1 c1
     */
    public void setC1 (double cateto1) {
      c1 = cateto1;  
    }
    
    /**
     * imposta/modifica il valore del cateto2
     * @param cateto2 c2
     */
    public void setC2 (double cateto2) {
      c1 = cateto2;  
    }
    /**
     * imposta/modifica il valore del cateto3
     * @param cateto3 c3
     */
    public void setC3 (double cateto3) {
      c1 = cateto3;  
    }
    /**
    * Restituisce il valore del semi-perimetro
    * @return 
    */
    public double calcolaSemiperimetro() {
      double semiperimetro;
      semiperimetro = (c1+c2+c3)/2;
      return semiperimetro; 
    }
    
    /**
    * Restituisce il valore dell area
    * @return 
    */
    public double calcolaArea() {
      double sp = calcolaSemiperimetro();
      double area;
      area = Math.sqrt(sp*(sp-c1)*(sp-c2)*(sp-c3));
      return area;
    }
    /**
    * Restituisce il valore dell altezza
    * @return 
    */
    public double calcolaAltezza() {
      double a = calcolaArea();
      double altezza;
      altezza = (a*2)/c1;
      return altezza;
    }
    
    /**
    * Restituisce il valore del perimetro
    * @return 
    */
    public double calcolaPerimetro() {
      double perimetro;
      perimetro = c1+c2+c3;
      return perimetro;
    }
    /**
     * Restituisce il valore degli attributi
     * @return 
     */
    public String info() {
      String testo;
      testo = "primo cateto  : " + c1 + "\n" +
              "secondo cateto: " + c2 + "\n" +
              "terzo cateto  : " + c3 + "\n";
      return testo;
    }
 }
