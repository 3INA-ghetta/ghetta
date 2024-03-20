/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verifica;

/**
 * Implementare una classe che abbia i seguenti metodi statici:
   - dato un numero intero n, calcolare il numero dei suoi divisori positivi. (while)
   - dato un numero intero n, calcolare la somma dei primi m multipli di n. (for)
 * @author Claudio.Ghetta 3INA
 * @version 1.0
 */
public class DivisoriMultipli {
    //private static int n;
    //private static int m;
    
    /**
     * costruttore senza parametri
     */
    public DivisoriMultipli (){
    
        
    }
    
    /**
     * calcola il numero di divisori di n
     * @param n
     * @return div
     */
    public static int numeroDivisori(int n){
        int i=1;
        int div =0;
        while(i <= n){
            if (n % i == 0){
                div ++;
            }
        i++;    
        }
        
        return div;
    }
    /**
     * fa la somma fra i primi multipli m di un determinato numero
     * restituisce il valore di m
     * @param n
     * @param m
     * @return m
     */
    public static int sommaMultipli(int n, int m){
        int i;
        
        for (i = 1; i < n; i++){
            if (m % n == 0){
                m += m;
            }
            
        }
        return m;
    }
    
}
