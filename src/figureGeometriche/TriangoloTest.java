
package figureGeometriche;

import java.util.Scanner;

public class TriangoloTest {
    
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float l1;
        float l2;
        float l3;
        System.out.println("inserisci il primo lato:");
        l1 = in.nextFloat();
        System.out.println("inserisci il secondo lato:");
        l2 = in.nextFloat();
        System.out.println("inserisci il terzo lato");
        l3 = in.nextFloat();
        Triangolo t = new Triangolo(l1, l2, l3);
        System.out.println("dati in input:" + t.info());
        System.out.println(t.perimetro());
        System.out.println(t.area());
        System.out.println(t.tipo());
        System.out.println(t.tipo1());
        System.out.println(t.isTriangolo());
        }
    }