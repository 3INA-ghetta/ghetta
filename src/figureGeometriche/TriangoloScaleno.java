
package figureGeometriche;

// calcolare anche altezza
// formula erone
//Math.sqrt (num) radice quadrata


public class TriangoloScaleno {
    
    public double c1;
    public double c2;
    public double c3;
    
    public TriangoloScaleno (double cateto1, double cateto2, double cateto3) {
      c1 = cateto1;
      c2 = cateto2;
      c3 = cateto3;
    }
    public double calcolaSemiperimetro() {
      double semiperimetro;
      semiperimetro = (c1+c2+c3)/2;
      return semiperimetro; 
    }
    public double calcolaArea() {
      double sp = calcolaSemiperimetro();
      double area;
      area = Math.sqrt(sp*(sp-c1)*(sp-c2)*(sp-c3));
      return area;
    }
    public double calcolaAltezza() {
      double a = calcolaArea();
      double altezza;
      altezza = (a*2)/c1;
      return altezza;
    }
    public double calcolaPerimetro() {
      double perimetro;
      perimetro = c1+c2+c3;
      return perimetro;
    }
 }
