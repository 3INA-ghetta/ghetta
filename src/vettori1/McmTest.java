package vettori1;

import java.util.Scanner;

public class McmTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n1, n2;
        
        System.out.println("Inserisci primo numero: ");
        n1 = in.nextInt();
        
        System.out.println("Inserisci secondo numero: ");
        n2 = in.nextInt();
        
        Mcm m = new Mcm(n1, n2);
        
        System.out.println("Il minimo comune multiplo é : " + m.calMCM());
    }
    
}
