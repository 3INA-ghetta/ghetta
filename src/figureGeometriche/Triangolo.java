//dati i lati di un triangolo stabilire il tipo perimetro e area
//è possibile costruitre un triangolo solo se ciascun lato è minore della somma degli altri due
package figureGeometriche;


/**
 *Classe per stabilire il tipo, perimetro e area di un triangolo
 * @author claudio.ghetta
 * @version 1.0
 */
public class Triangolo {
    final private float NF_TE;
    private float l1;
    private float l2;
    private float l3;
    private String unitàMisura;
    
    /**
     * classe senza parametri
     */
    public Triangolo () {
        NF_TE = 0.289f;
        unitàMisura = "";
    }
    /**
     * classe con parametri
     * @param NF_TE
     * @param l1
     * @param l2
     * @param l3 
     * @param unitàMisura
     */
    public Triangolo(float NF_TE, float l1, float l2, float l3, String unitàMisura) {
        this.NF_TE = NF_TE;
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.unitàMisura = unitàMisura;
    }
    /**
     * restituisce NF_TE
     * @return NF_TE
     */
    public float getNF_TE(){
        return NF_TE;
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
     * restituisce unitàMisura
     * @return unitàMisura
     */
    public String getUnitàMisura(){
        return unitàMisura;
    }
    /**
     * imposta/modifica unitàMisura
     * @param unitàMisura 
     */
    public void setUnitàMisura(String unitàMisura){
        this.unitàMisura = unitàMisura;
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
        float p=0;
        if (isTriangolo()==true)
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
      float area=0;
      if (isTriangolo()==true)
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
    
    public float apotema() {
        float a=0;
        //add condizione
        if (tipo().equals("equilatero"))
         a = l1 * NF_TE;        
        return a;    
    }
    // altezza lato* (math.sqrt(3) /2)
    
    public float altezza() {
        float h=0;
        if (tipo().equals("equilatero"))
         h = (float) (l1 * Math.sqrt(3)/2);
        else
         h = 0;
        return h;    
    }
 
}
