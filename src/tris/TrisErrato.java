package tris;

import java.util.Objects;

public final class TrisErrato {
    private String[][] campoDaGioco;    
    private int dimensione;
    private String giocatoreX;
    private String giocatoreO;
    
    
    /**
     * costruttore senza parametri
     */
    public TrisErrato(){      
    }
    
    /**
     * Costruttore
     * @param dimensione
     * @param giocatoreX
     * @param giocatoreO
     * @throws Exception 
     */
    public TrisErrato(int dimensione, String giocatoreX, String giocatoreO) throws Exception {
        
        setDimensione(dimensione);
        setGiocatoreX(giocatoreX);
        setGiocatoreO(giocatoreO);
     
    }
    /**
     * 
     * @return 
     */
    public String[][] getCampoDaGioco() {
        return this.campoDaGioco;
    }    
    /**
     * 
     * @return 
     */
    public int getDimensione() {
        return dimensione;
    }
    /**
     * 
     * @param dimensione
     * @throws Exception 
     */
    public void setDimensione(int dimensione) throws Exception {
        if(dimensione >= 3){
            this.dimensione = dimensione;
            campoDaGioco = new String[dimensione][dimensione];
            inizializzaCampoDaGioco();
        }else
            throw new Exception ("la dimensione deve essere magiore o uguale a 3");
    }
    /**
     * restituisce il giocatoreX
     * @return 
     */
    public String getGiocatoreX() {
            return giocatoreX;
    }
    /**
     * imposta nome giocatore X
     * @param giocatoreX String
     * @throws java.lang.Exception 
     */
    public void setGiocatoreX(String giocatoreX) throws Exception { 
        if (giocatoreX.length() >= 2)
            if(giocatoreX.length() <= 10)
                this.giocatoreX = giocatoreX;
            else
                throw new Exception("nome del giocatore x troppo lungo");
        else
            throw new Exception("nome del giocatore x troppo corto");
        
    }        
    /**
     * restituisce il giocatoreO
     * @return 
     */
    public String getGiocatoreO() {
  
            return giocatoreO;

    }
    /**
     * imposta nome del giocatoreO
     * @param giocatoreO
     * @throws Exception 
     */
    public void setGiocatoreO(String giocatoreO) throws Exception{
        if (giocatoreO.length() >= 2)
            if(giocatoreX.length() <= 10)
                this.giocatoreO = giocatoreO;
            else 
                throw new Exception("nome del giocatore o troppo lungo");
        else
            throw new Exception("nome del giocatore o troppo corto");
        
    }
    /**
     * iniziallizza il campo
     */
    private void inizializzaCampoDaGioco() {
        for (int i = 0; i < campoDaGioco.length; i++) {
            for (int j = 0; j < campoDaGioco.length; j++) {
                campoDaGioco[i][j] = " ";
            }
        }
    }
    /**
     * controlla se la cella è libera
     * @param riga
     * @param colonna
     * @return 
     */
    private boolean isCellaDisponibile(int riga, int colonna) {
        if (Objects.equals(campoDaGioco[riga][colonna], " ")) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * controlla il turno dei giocatore
     * @return 
     */
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
    /**
     * inserisce il segno
     * @param segno
     * @param riga
     * @param colonna 
     */
    private void piazzaSegno(String segno, int riga, int colonna) {
        if (isCellaDisponibile(riga, colonna))
            campoDaGioco[riga][colonna] = segno;
    }
    /**
     * verifica la vincita
     * @return 
     */
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
    /**
     * 
     * @param riga
     * @param colonna
     * @return
     * @throws Exception 
     */
    public String gioca(int riga, int colonna) throws Exception {
        if(campoDaGioco != null)
            if( riga < campoDaGioco.length && riga >= 0 && colonna < campoDaGioco.length && colonna >= 0)
                if (Objects.equals(verificaTurnoDiGioco(), "X"))
                    piazzaSegno("X", riga, colonna);
                else
                    piazzaSegno("O", riga, colonna);
            else
                throw new Exception("coordinate errate");
        else
            throw new Exception("non è stata impostata la dimensione del campo");
        return verificaVincitaOParita();        
    }
    /**
     * stampa i bordi del campo
     * @return 
     */
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


