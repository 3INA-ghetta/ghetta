package tris;

import java.util.Objects;

public final class TrisErrato1 {
    private String[][] campoDaGioco;    
    private String giocatoreX;
    private String giocatoreO;

    public TrisErrato1(int dimensione, String giocatoreX, String giocatoreO) {
        campoDaGioco = new String[dimensione][dimensione];
        setGiocatoreX(giocatoreX);
        setGiocatoreO(giocatoreO);
        
        inizializzaCampoDaGioco();
    }
    
    public String[][] getCampoDaGioco() {
        return this.campoDaGioco;
    }    
    
    public String getGiocatoreX() {
            return giocatoreX;
    }

    public void setGiocatoreX(String giocatoreX) { 
        if (giocatoreX.length() >= 2)
        this.giocatoreX = giocatoreX;
    }        
    
    public String getGiocatoreO() {
  
            return giocatoreO;

    }

    public void setGiocatoreO(String giocatoreO) {
        if (giocatoreO.length() >= 2)
        this.giocatoreO = giocatoreO;
    }
    
    private void inizializzaCampoDaGioco() {
        for (int i = 0; i < campoDaGioco.length; i++) {
            for (int j = 0; j < campoDaGioco.length; j++) {
                campoDaGioco[i][j] = " ";
            }
        }
    }

    private boolean isCellaDisponibile(int riga, int colonna) {
        if (Objects.equals(campoDaGioco[riga][colonna], " ")) {
            return true;
        } else {
            return false;
        }
    }

    private String verificaTurnoDiGioco() {
        int contX = 0;
        int contO = 0;
        
        for (int i = 0; i < campoDaGioco.length; i++) {
            for (int j = 0; j < campoDaGioco.length; j++) {
                if (Objects.equals(campoDaGioco[i][j], "X")) {
                    contX++;
                }
                if (Objects.equals(campoDaGioco[i][j], "O")) {
                    contO++;
                }
            }
        }
        
        if (contX > contO)
            return "O";
        else
            return "X";
    }

    private void piazzaSegno(String segno, int riga, int colonna) {
        if (isCellaDisponibile(riga, colonna) && riga < campoDaGioco.length && riga >= 0 && colonna < campoDaGioco.length && colonna >= 0)
            campoDaGioco[riga][colonna] = segno;
    }

    private String verificaVincitaOParita() {
        // Righe       
        int contX = 0;
        int contO = 0;
                
        for (int i = 0; i < campoDaGioco.length; i++) {
            for (int j = 0; j < campoDaGioco.length; j++) {
                if (Objects.equals(campoDaGioco[i][j], "X")) {
                    contX++;
                    if (contX == campoDaGioco.length) {
                        return "X";
                    }
                }
                
                if (Objects.equals(campoDaGioco[i][j], "O")) {
                    contO++;
                    if (contO == campoDaGioco.length) {
                        return "O";
                    }
                }
            }
            
            contX = 0;
            contO = 0;
        }

        // Colonne    
        for (int i = 0; i < campoDaGioco.length; i++) {
            for (int j = 0; j < campoDaGioco.length; j++) {
                if (Objects.equals(campoDaGioco[j][i], "X")) {
                    contX++;
                    if (contX == campoDaGioco.length) {
                        return "X";
                    }
                }
                
                if (Objects.equals(campoDaGioco[j][i], "O")) {
                    contO++;
                    if (contO == campoDaGioco.length) {
                        return "O";
                    }
                }
            }
            
            contX = 0;
            contO = 0;
        }

        // Diagonale principale
        contX = 0;
        contO = 0;
        for (int i = 0; i < campoDaGioco.length; i++) {
            if (Objects.equals(campoDaGioco[i][i], "X")) {
                contX++;
                if (contX == campoDaGioco.length) {
                    return "X";
                }
            }
            
            if (Objects.equals(campoDaGioco[i][i], "O")) {
                contO++;
                if (contO == campoDaGioco.length) {
                    return "O";
                }
            }
        }                

        // Diagonale secondaria
        contX = 0;
        contO = 0;
        int riga = campoDaGioco.length-1;
        for (int i = riga; i >= 0; i--) {
            int offset = riga-1;
            
            if (Objects.equals(campoDaGioco[i][offset], "X")) {
                contX++;
                if (contX == campoDaGioco.length) {
                    return "X";
                }
            }
            
            if (Objects.equals(campoDaGioco[i][offset], "O")) {
                contO++;
                if (contO == campoDaGioco.length) {
                    return "O";
                }
            }
        }            
        
        // Parità
        int cont = 0;
        for (int i = 0; i < campoDaGioco.length; i++) {
            for (int j = 0; j < campoDaGioco.length; j++) {
                if (Objects.equals(campoDaGioco[i][j], "X") || 
                                      Objects.equals(campoDaGioco[i][j], "O")) {
                    cont++;
                    
                    if (cont == campoDaGioco.length * campoDaGioco.length) {
                        return "=";
                    }
                }
            }
        }
        
        // Nessuna vincita
        return "";
    }
    
    public String gioca(String s) {
        String [] ris;
        ris = s.split(",");
        int riga = Integer.parseInt(ris[0]), colonna = Integer.parseInt(ris[0]);
        if (Objects.equals(verificaTurnoDiGioco(), "X"))
            piazzaSegno("X", riga, colonna);
        else
            piazzaSegno("O", riga, colonna);

        return verificaVincitaOParita();        
    }

    public String info() {
        String matrice = "\n┌──────┐\n";

        for (int i = 0; i < campoDaGioco.length; i++) {

            for (int j = 0; j < campoDaGioco.length; j++) {
                matrice += "│ " + campoDaGioco[i][j];

            }
            matrice += "│" + "\n";
        }
        matrice += "└──────┘\n";
        return matrice;
    }
}


