
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
    
    public String vCampo() {
        String testo = "";
        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo.length; j++) {
                testo += campo[i][j] + "_";
            }
            testo += "\n";
        }
        return testo;
    }
    
    
    private String giocatore(){
        int i =2;
        if (i % 2 == 0){
            i--;
            return "X";
        }else{
            i++;
            return "O";
        }
    }
    
    private boolean isCellaDisponibile(int riga, int colonna) {
        if (Objects.equals(campo[riga][colonna], "_")) {
            return true;
        } else {
            while (Objects.equals(campo[riga][colonna], "_") && riga < 5){
                riga++;
            }
            if (riga >= 5){
                return false;
            }else{
                return true;
            }
            
        }
    }
    
    public String mettiPezzo(int riga, int colonna){ //fare sottomatrice per diagonale
        
        int i = 0;
        String next = vincita();
        
        while (next.equals("X")){
            if ( i < campo.length && i >= 0 && colonna < campo.length && colonna >= 0 && isCellaDisponibile(riga,colonna)){
                campo[i][colonna]= giocatore();
            }
        }
        
        return vincita();
 
    }
    
    private String vincita (){
        
        int contX = 0;
        int contO = 0;
                
        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo.length; j++) {
                if (Objects.equals(campo[i][j], "X")) {
                    contX++;
                    if (contX == 4) {
                        return "X";
                    }
                }
                
                if (Objects.equals(campo[i][j], "O")) {
                    contO++;
                    if (contO == 4) {
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
                    if (contX == 4) {
                        return "X";
                    }
                }
                
                if (Objects.equals(campo[j][i], "O")) {
                    contO++;
                    if (contO == 4) {
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
                if (contX == 4) {
                    return "X";
                }
            }
            
            if (Objects.equals(campo[i][i], "O")) {
                contO++;
                if (contO == 4) {
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
                if (contX == 4) {
                    return "X";
                }
            }
            
            if (Objects.equals(campo[i][offset], "O")) {
                contO++;
                if (contO == 4) {
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
                    
                    if (cont == 6 * 7) {
                        return "=";
                    }
                }
            }
        }
        
        // Nessuna vincita
        return "";
        
    }
    
    
    
}
