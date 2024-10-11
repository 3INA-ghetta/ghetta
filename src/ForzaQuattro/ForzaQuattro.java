
package ForzaQuattro;

import java.util.Objects;


public class ForzaQuattro {
    
    private static final int Righe = 6;
    private static final int Colonne = 7;
    private String [][] campo = new String [Righe][Colonne];

    public ForzaQuattro() {
        riempiCampo();
    }

    public String[][] getCampo() {
        return campo;
    }

    public void setCampo(String[][] campo) {
        this.campo = campo;
    }
 
    public void riempiCampo() {
        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo.length; j++) {
                if (campo[i][j] != "X" && campo[i][j] != "O") {
                    campo[i][j] = "_";
                }
            }

        }
    }
    
    private void stampaCampo(){
        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo.length; j++) {
                System.out.print(campo[i][j]);
            }
            System.out.println();

        }
        
    }
    
    private String giocatore(){
        int i =2;
        if (i % 2 == 0){
            i--;
            return "x";
        }else{
            i++;
            return "o";
        }
    }
    
    private boolean isCellaDisponibile(int riga, int colonna) {
        if (Objects.equals(campo[riga][colonna], "_")) {
            return true;
        } else {
            return false;
        }
    }
    
    private String mettiPezzo(int colonna){ //fare sottomatrice per diagonale
        
        int i = 0;
        
        while (vincita() == ""){
            if (campo[i][colonna]== )
            if ( i < campo.length && i >= 0 && colonna < campo.length && colonna >= 0){
                campo[i][colonna]= giocatore();
            }
        }
        
        return vincita();
 
    }
    
    private String vincita (int colonna){
        
        int contX = 0;
        int contO = 0;
                
        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo.length; j++) {
                if (Objects.equals(campo[i][j], "X")) {
                    contX++;
                    if (contX == campo.length) {
                        return "X";
                    }
                }
                
                if (Objects.equals(campo[i][j], "O")) {
                    contO++;
                    if (contO == campo.length) {
                        return "O";
                    }
                }
            }
            
            contX = 0;
            contO = 0;
        }

        // Colonne    
        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo.length; j++) {
                if (Objects.equals(campo[j][i], "X")) {
                    contX++;
                    if (contX == campo.length) {
                        return "X";
                    }
                }
                
                if (Objects.equals(campo[j][i], "O")) {
                    contO++;
                    if (contO == campo.length) {
                        return "O";
                    }
                }
            }
            
            contX = 0;
            contO = 0;
        }

        // Diagonale principale
        
        for (int i = 0; i < campo.length; i++) {
            if (Objects.equals(campo[i][i], "X")) {
                contX++;
                if (contX == campo.length) {
                    return "X";
                }
            }
            
            if (Objects.equals(campo[i][i], "O")) {
                contO++;
                if (contO == campo.length) {
                    return "O";
                }
            }
        }                

        // Diagonale secondaria
        int riga = campo.length-1;
        for (int i = riga; i >= 0; i--) {
            int offset = riga-1;
            
            if (Objects.equals(campo[i][offset], "X")) {
                contX++;
                if (contX == campo.length) {
                    return "X";
                }
            }
            
            if (Objects.equals(campo[i][offset], "O")) {
                contO++;
                if (contO == campo.length) {
                    return "O";
                }
            }
        }            
        
        // Parità
        int cont = 0;
        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo.length; j++) {
                if (Objects.equals(campo[i][j], "X") || 
                                      Objects.equals(campo[i][j], "O")) {
                    cont++;
                    
                    if (cont == campo.length * campo.length) {
                        return "=";
                    }
                }
            }
        }
        
        // Nessuna vincita
        return "";
        
    }
    
    
    
}
