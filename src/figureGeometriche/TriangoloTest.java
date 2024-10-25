
package figureGeometriche;

public class TriangoloTest {
    
  
    public static void main(String[] args) {
        Triangolo t;
        try {
            t = new Triangolo(2, 12, 14);           
            t.setUnitàMisura("cm");
            System.out.println("dati in input:" + t.info());
            System.out.println(t.perimetro() + t.getUnitàMisura());
            System.out.println(t.area());
            System.out.println(t.tipo());
            
            
            String testo;
            testo = t.isTriangolo() == true? "si" : "no";
            
            System.out.println(testo);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
     
    }
}