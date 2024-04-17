package vettori1;

import java.util.Scanner;

public class McmTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n1,n=0,i=0;
        int num [] = new int [n];
        
        System.out.println("Inserisci numero di numeri: ");
        n = in.nextInt();
        
        Mcm m = new Mcm();
        
        System.out.println("Inserisci numeri: ");
        
        do{
            num[i] = in.nextInt();
            i++;
        }while(i < n); 
        
        
        System.out.println("Il minimo comune multiplo é : " + m.calMCM());
    }
    
}
