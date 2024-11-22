
package verifica;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Ghetta Claudio
 * @version 1.0
 */
public class matriceQuadrata {
    
    private int [][] matrice;
    private int n;
    /**
     * costruttore con parametri
     * @param n 
     */
    public matriceQuadrata(int n) {
        if(n >= 2){
           this.n = n;
           matrice = new int[n][n];
        }else{
            ;
            }
    }
    /**
     * ritorna matrice
     * @return matrice
     */
    public int[][] getMatrice() {
        return matrice;
    }
    
    /**
     * ritorna n
     * @return n
     */
    public int getN() {
        return n;
    }
    
    
    /**
     * metodo per visualizzare la matrice
     * @param matrice
     * @return s
     */
    public String visualizza(int matrice[][]){
        String s = "";
        
        for(int k=0; k < matrice[0].length; k++){
                s += "  - ";          
            }
            s += "\n";
        
        for(int i=0; i < matrice.length; i++){
            s += "| ";
            for(int a=0; a < matrice[0].length; a++){
                s += matrice[i][a] + " ";
            }
         
            s += "| \n";
            
            for(int b=0; b < matrice[0].length; b++){
                s += "  - ";          
            }
            s += "\n";
        }
        return s;
    }
    
    /**
     * metodo per restituire una matrice di numeri casuali
     * @param matrice 
     */
    public void caricaRandom(int matrice[][]){
        Random r = new Random();
        int cont=0;
        int num = r.nextInt(99)+1;
        do{
        
            for(int i=0; i < matrice.length; i++){
                for(int k=0; k < matrice[0].length; k++){
                    if(matrice[i][k] == 0){
                        matrice[i][k] = num;
                        i=0;
                        k=-1;
                        cont++;
                    }else if(matrice [i][k] == num){
                        num = r.nextInt(99)+1;
                        i=0;
                        k=-1;
                    }
                }
            }
        }while(cont != matrice.length*matrice[0].length);
       
    }
       
    /**
     * metodo per ordinare le singole rige della matrice in ordine crescente
     * @param matrice 
     */
    public void ordinaPerRiga(int matrice[][]){
        int temp;
        
        for(int i=0; i < matrice.length; i++){
            for(int k=0; k < matrice[0].length; k++){
                for(int j=i; j < matrice.length; j++){
                    for(int a = (j == i? k:0);  a < matrice[0].length; a++){
                        if(matrice [i][k] < matrice [j][a] ){
                            temp = matrice[i][k];
                            matrice[i][k]= matrice [j][a];
                            matrice[j][a]= temp;
                        }
                        
                    }
                }
                    
            }            
        }

    }
    
    /**
     * metodo per modificare un elemento della matrice
     * @param r
     * @param c
     * @param val
     * @param matrice
     * @return is 
     */
    public boolean modificaElemento(int r, int c, int val, int matrice[][]){
        boolean is = false;
        
        if(r < matrice.length && r >= 0 && c < matrice[0].length && c >= 0 && val < 99 && val > 1 ){
            matrice [r][c] = val;
            is = true;
        }
        
        return is;
                       
    }
    
    /**
     * metodo che restituisce i valori della diagonale principale della matrice
     * @param matrice
     * @return elementi
     */
    public int [] elementiDiagonalePrincipale(int matrice[][]){
        int [] elementi = new int [matrice.length];
        
        for(int i=0; i < matrice.length; i++){
            elementi[i] = matrice[i][i];
        }
        
        return elementi;
    }
    /**
     * metodo che restituisce i valori della diagonale secondaria della matrice
     * @param matrice
     * @return elementi
     */
    public int [] elementiDiagonaleSecondaria(int matrice[][]){
        int [] elementi = new int [matrice.length];
        int d=0;
        
        for(int i=matrice.length-1; i >= 0; i--){
            elementi[d] = matrice[d][i];
            d++;
        }
        return elementi;
    }
    
    /**
     * metodo che restituisce il determinante di una matrice 2x2
     * @param matrice
     * @return det
     */
    public int determinante(int matrice[][]){
        int det;
        
        det = matrice[0][0]*matrice[1][1]+matrice[0][1]*matrice[1][0];

        return det;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int val;
        int riga;
        int colonna;
        
        
        System.out.println("inserisci grandezza della matrice");
        n=in.nextInt();       
        
        matriceQuadrata m = new matriceQuadrata(n);
        int [][] matrice2 = new int [n][n];
          
        m.caricaRandom(matrice2);
        System.out.println(m.visualizza(matrice2));
        System.out.println("principale");
        System.out.println((Arrays.toString(m.elementiDiagonalePrincipale(matrice2))));
        System.out.println("secondaria");
        System.out.println((Arrays.toString(m.elementiDiagonaleSecondaria(matrice2))));
        System.out.println("determinate");
        System.out.println(m.determinante(matrice2));
        System.out.println("ordina");
        m.ordinaPerRiga(matrice2); 
        System.out.println(m.visualizza(matrice2));
        System.out.println("inserisci riga dell elemento da modificare");
        riga=in.nextInt();
        System.out.println("inserisci colonna dell elemento da modificare");
        colonna=in.nextInt();
        System.out.println("inserisci valore da mettere al suo posto");
        val=in.nextInt();
        m.modificaElemento(riga, colonna, val, matrice2);
        System.out.println(m.visualizza(matrice2));
    }
}





