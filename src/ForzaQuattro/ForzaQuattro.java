
package ForzaQuattro;

import java.util.Scanner;

public class ForzaQuattro {
    private static final int RIGHE = 6;
    private static final int COLONNE = 7;
    private static char[][] campo = new char[RIGHE][COLONNE];
    private static char giocatore;
    
    

    public static void main(String[] args) {
        riempiCampo();
        giocatore = 'X';
        boolean a = true;

        while (a == true) {
            stampaCampo();
            int colonna = mossa();
            int riga = mettiDisco(colonna);
            if (riga == -1) {
                System.out.println("colonna piena.");
            }

            if (vincita(riga, colonna)) {
                stampaCampo();
                System.out.println("Giocatore " + giocatore + " vince!");
                a = false;
            }

            if (giocatore == 'X'){
                
                giocatore = 'O';
            
            }else {
                giocatore = 'X';    
                    }
        }

        System.out.println("fine");
    }

    private static void riempiCampo() {
        for (int r = 0; r < RIGHE; r++) {
            for (int c = 0; c < COLONNE; c++) {
                campo[r][c] = '.';
            }
        }
    }

    private static void stampaCampo() {
        for (int r = 0; r < RIGHE; r++) {
            for (int c = 0; c < COLONNE; c++) {
                System.out.print(campo[r][c] + " ");
            }
            System.out.println();
        }
    }

    private static int mossa() {
        Scanner in = new Scanner(System.in);
        System.out.println("Giocatore " + giocatore + ", scegli una colonna da 0 a 6: ");
        return in.nextInt();
    }

    private static int mettiDisco(int colonna) {
        if (colonna < 0 || colonna >= COLONNE) {
            System.out.println("colonna sbagliata riprova");
            return -1;
        }

        for (int r = RIGHE - 1; r >= 0; r--) {
            if (campo[r][colonna] == '_') {
                campo[r][colonna] = giocatore;
                return r; 
            }
        }
        return -1; 
    }

    private static boolean vincita(int riga, int colonna) {
        return direzione(riga, colonna, 1, 0) || 
               direzione(riga, colonna, 0, 1) || 
               direzione(riga, colonna, 1, 1) || 
               direzione(riga, colonna, 1, -1);  
    }

    private static boolean direzione(int riga, int colonna, int rigaSecondaria, int colonnaSecondaria) {
        char pedina = campo[riga][colonna];
        int conta = 0;


        for (int d = 0; d < 4; d++) {
            int r = riga + d * rigaSecondaria;
            int c = colonna + d * colonnaSecondaria;
            if (r >= 0 && r < RIGHE && c >= 0 && c < COLONNE && campo[r][c] == pedina) {
                conta++;
            } else {
                break;
            }
        }

        for (int d = 1; d < 4; d++) {
            int r = riga - d * rigaSecondaria;
            int c = colonna - d * colonnaSecondaria;
            if (r >= 0 && r < RIGHE && c >= 0 && c < COLONNE && campo[r][c] == pedina) {
                conta++;
            } else {
                break;
            }
        }
        
        return conta >= 4;
    }
}

    

