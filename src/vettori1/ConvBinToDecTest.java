package vettori1;

import java.util.Scanner;

public class ConvBinToDecTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int bit, l;
        
        System.out.println("Inserisci il numero bit: ");
        l = in.nextInt();
        
        ConvBinToDev c = new ConvBinToDev(l);
        
        System.out.println("Inserisci uno alla volta i bit a partire da sinistra: ");
        
        do{
            bit = in.nextInt();
        }while(c.riempiBit(bit));
        
        System.out.println("Il valore in decimale è: " + c.binDec());
    }
    
}
