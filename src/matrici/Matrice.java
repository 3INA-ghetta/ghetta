
package matrici;

import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author claudio.ghetta
 */
public class Matrice {
    
    static public int [][] visualizza(int [][] matrice){
        
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                System.out.println(matrice[i][j]);
                
            }
            
        }

        return matrice;  
    }
    
    static public int [][] ordina (int [][] matrice){
        
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                for (int k = i; k < matrice.length; k++) {
                    for (int z = (k == i? j: 0); z < matrice[0].length; z++) {
                        if(matrice[i][j] > matrice[k][z]){
                            int temp = matrice[k][z];
                            matrice[k][z]= matrice [i][j];
                            matrice[i][j]=temp;
                        }
                    }
                }                
            }
            
        }

        return matrice;  
    }
    
    static public int sommaElementi(int [][] matrice){
        
        int somma = 0;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                somma += matrice[i][j];
            }
            
        }

        return somma;  
    }
    
    static public int [][] sommaMatrici(int [][] m, int [][] m1){
        
        int [][] matrice = null;
        
        if (m.length == m1.length && m[0].length == m1[0].length){
            matrice = new int[m.length][m1[0].length];
            
            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m1[0].length; j++) {
                    matrice[i][j] = m[i][j] + m1[i][j];
                }          
            }
        }else{
            ;
        }

        return matrice;  
    }
    
    static public float mediaElementi(int [][] matrice){
        float media=0;
        float somma=0;
        int n = matrice.length*matrice[0].length;
        
        somma = sommaElementi(matrice);
        
        media = somma / n;
        
        return media;
    }
    
    static public int [][] caricaRandom(int [][] matrice){
        Random r = new Random();
        
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                matrice[i][j] = r.nextInt(9)+1;
            }
            
        }
        
        
        
        return matrice;
    }
    
    static public int [][] caricaRandomSenzaRipetizioni(int [][] matrice){
        Random r = new Random();
        int s= 0;
        
        do{
            s = r.nextInt(9)+1;
            for (int i = 0; i < matrice.length; i++) {
                for (int j = 0; j < matrice[0].length; j++) {
                    if(s != matrice[i][j]){
                        matrice [i][j] = s;
                    }
                }                
            }

        }while(matrice[matrice.length][matrice[0].length] == 0);
        
        
        return matrice;
    }
    
    static public int [][] determinante(int [][] matrice){
        
            for (int i = 0; i < matrice.length; i++) {
                for (int j = 0; j < matrice[0].length; j++) {
                    
                        
                }           
            }
 
        return matrice;
    }

    public static void main(String[] args) {
        int [][] matrice = {{9,8,7},{6,5,4},{3,2,1}};
        int [][] matrice2 = new int[3][3];
        
        //System.out.println(Arrays.deepToString(matrice));
        
        //Matrice.visualizza(matrice);
        
        //matrice = Matrice.ordina(matrice);
        
        //matrice2 = caricaRandom(matrice2);
        
        //System.out.println(Arrays.deepToString(matrice));
        
        //System.out.println(Matrice.mediaElementi(matrice));
        
        //System.out.println(Matrice.sommaElementi(matrice));
        
        //System.out.println(Arrays.deepToString(Matrice.sommaMatrici(matrice, matrice2)));
        
        matrice2 = caricaRandom(matrice2);
        System.out.println(Arrays.deepToString(matrice2));
    }
}
