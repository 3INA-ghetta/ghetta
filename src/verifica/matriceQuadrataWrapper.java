
package verifica;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

/**
 * @author Ghetta Claudio
 * @version 1.0
 */
public class matriceQuadrataWrapper {
    
    private Integer [][] matrice;
    private Integer n;
    
    public matriceQuadrataWrapper(){
        
    }
    /**
     * costruttore con parametri
     * @param n 
     * @throws java.lang.Exception 
     */
    public matriceQuadrataWrapper(Integer n) throws Exception {
        if(n != null)
            if( n >= 2){
            this.n = n;
            matrice = new Integer[n][n];
            }else{
                throw new Exception("n deve essere maggiore di 2");
            }
        else
           throw new Exception("n deve essere diverso da null"); 
    }
    /**
     * ritorna matrice
     * @return matrice
     */
    public Integer[][] getMatrice() {
        return matrice;
    }
    
    /**
     * ritorna n
     * @return n
     */
    public Integer getN() {
        return n;
    }

    public void setMatrice(Integer[][] matrice) throws Exception {
        if(matrice.length < 2)
            this.matrice = matrice;
        else 
            throw new Exception("numero deve essere diverso da null e maggiore uguale a 2");
    }

    public void setN(Integer n) throws Exception {
        if(n != null && n <= 2)
            this.n = n;
        else 
            throw new Exception("numero deve essere diverso da null e maggiore uguale a 2");
    }
    
    /**
     * metodo per visualizzare la matrice
     * @return s
     * @throws java.lang.Exception
     */
    public String visualizza() throws Exception{
        if (n != null && n >=2){
            String s = "";
            
            s = "┌";

            for(Integer k=0; k < n*2; k++){
                    s += "─";          
                }
            s += "┐\n";
            
            int i;

            for(i=0; i < matrice.length; i++){
                for(Integer a=0; a < matrice[0].length; a++){
                    if(matrice[i][a] <= 9){
                    s += "|0" + matrice[i][a];
                    }else{
                        s += "|" + matrice[i][a];     
                    }
                }

                s += "|\n";
                
                if(i < matrice.length -1){
                    s += "├";
                    for(Integer b=0; b < matrice[0].length; b++){
                    s += "─";          
                    }
                    s += "┤\n";
                }else{
                    s += "";
                }

                
            s += "└";
                
            for(int d = 0; d < (n*2); d++){
                s += "─";
            }
                
            s += "┘\n";
            }
            return s;
        }else
            throw new Exception("n deve essere diverso da null e >= a 2");
        
    
    }
    
    /**
     * metodo per restituire una matrice di numeri casuali
     * @throws java.lang.Exception 
     */
    public void caricaRandom() throws Exception{
        if (n != null && n >=2){
            Random r = new Random();
            Integer cont=0;
            Integer num = r.nextInt(99)+1;
            do{

                for(Integer i=0; i < matrice.length; i++){
                    for(Integer k=0; k < matrice[0].length; k++){
                        if(matrice[i][k] == 0){
                            matrice[i][k] = num;
                            i=0;
                            k=-1;
                            cont++;
                        }else if(Objects.equals(matrice [i][k], num)){
                            num = r.nextInt(99)+1;
                            i=0;
                            k=-1;
                        }
                    }
                }
        }while(cont != matrice.length*matrice[0].length);
        }else{
            throw new Exception("n deve essere diverso da null e maggiore uguale a 2");
        }
        
    }
       
    /**
     * metodo per ordinare le singole rige della matrice in ordine crescente
     * @throws java.lang.Exception 
     */
    public void ordinaPerRiga() throws Exception{
        if ( n != null && n>2){
            Integer temp;
        
            for(Integer i=0; i < matrice.length; i++){
                for(Integer k=0; k < matrice[0].length; k++){
                    for(Integer j=i; j < matrice.length; j++){
                        for(Integer a = (Objects.equals(j, i)? k:0);  a < matrice[0].length; a++){
                            if(matrice [i][k] < matrice [j][a] ){
                                temp = matrice[i][k];
                                matrice[i][k]= matrice [j][a];
                                matrice[j][a]= temp;
                            }

                        }
                    }

                }            
            }
        }else
            throw new Exception("n deve essere diverso da null");
    }
    
    /**
     * metodo per modificare un elemento della matrice
     * @param r
     * @param c
     * @param val
     * @throws java.lang.Exception
     */
    public void modificaElemento(Integer r, Integer c, Integer val) throws Exception{
        
        if(n != null && n >= 2){
            if(r == null || c == null || val == null)
                throw new Exception("n deve essere diverso da null");
            if(r < matrice.length && r >= 0 && c < matrice[0].length && c >= 0 && val < 99 && val > 1 ){
                matrice [r][c] = val;
            }else
                throw new Exception("n deve essere diverso da null");
        }else
           throw new Exception("n deve essere diverso da null");
                       
    }
    
    /**
     * metodo che restituisce i valori della diagonale principale della matrice
     * @return elementi
     * @throws java.lang.Exception
     */
    public Integer [] elementiDiagonalePrincipale() throws Exception{
        if (n != null && n >= 2){
        Integer [] elementi = new Integer [matrice.length];
        
        for(Integer i=0; i < matrice.length; i++){
            elementi[i] = matrice[i][i];
        }
        
        return elementi;
        }else{
            throw new Exception("n deve essere diverso da null");
        }
          
    }
    /**
     * metodo che restituisce i valori della diagonale secondaria della matrice
     * @return elementi
     * @throws java.lang.Exception
     */
    public Integer [] elementiDiagonaleSecondaria() throws Exception{
        if (n != null && n >= 2){
        Integer [] elementi = new Integer [matrice.length];
        Integer d=0;
        
        for(Integer i=matrice.length-1; i >= 0; i--){
            elementi[d] = matrice[d][i];
            d++;
        }
        return elementi;
        }else{
            throw new Exception("n deve essere diverso da null");
        }
    }
    
    /**
     * metodo che restituisce il determinante di una matrice 2x2
     * @return det
     * @throws java.lang.Exception
     */
    public Integer determinante() throws Exception{
        
        if(matrice.length == 2){
            Integer det = null;
            Integer [] dP = elementiDiagonalePrincipale();
            Integer [] dS = elementiDiagonaleSecondaria();
            Integer pDP = 1, pDS = 1;
            
            for (Integer i = 0; i < dP.length; i++){
                pDP *= dP[i];
            }
            
            for (Integer i = 0; i < dP.length; i++){
                pDS *= dS[i];
            }
            
            det = pDP-pDS;
            return det;
        }else{
            throw new Exception("n deve essere diverso da null");
        }
    }

    public static void main(String[] args) {
        try {
    
        
        matriceQuadrataWrapper m = new matriceQuadrataWrapper(2);
          
        m.caricaRandom();
        System.out.println(m.visualizza());
        System.out.println("principale");
        System.out.println((Arrays.toString(m.elementiDiagonalePrincipale())));
        System.out.println("secondaria");
        System.out.println((Arrays.toString(m.elementiDiagonaleSecondaria())));
        System.out.println("determinate");
        System.out.println(m.determinante());
        System.out.println("ordina");
        m.ordinaPerRiga(); 
        System.out.println(m.visualizza());
        m.modificaElemento(0, 0, 0);
        System.out.println(m.visualizza());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}






