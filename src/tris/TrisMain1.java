/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tris;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author dennis.faes
 */
public class TrisMain1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        /*
        Scanner in = new Scanner(System.in);
        
        String giocatoreX, giocatoreO;
        int dimensione;
        
        System.out.print("Inserisci il primo giocatore (X): ");
        giocatoreX = in.nextLine();
        
        System.out.print("Inserisci il secondo giocatore(O): ");
        giocatoreO = in.nextLine();
        
        System.out.println("Inserisci la dimensione della scacchiera: ");
        dimensione = in.nextInt();
        
        Tris1Errato t = new Tris1Errato(dimensione, giocatoreX, giocatoreO);
        
        boolean vincita = true;
        
        while(vincita){
            System.out.print("Il campo è: " + t.info());
            int x,o;
            
            System.out.println("Inserire la posizione della riga: ");
            x = in.nextInt();
            
            System.out.println("Inserire la posizione della colonna: ");
            o = in.nextInt();
            
            String s = t.gioca(x, o);
            
            if(s.equals("X")){
                System.out.println("Il vincitore è il primo giocatore ");
                vincita = false;
            }else if (s.equals("O")){
                System.out.println("Il vincitore è il secondo giocatore ");
                vincita = false;
            }else if (s.equals("=")){
                System.out.println("Parità ");
                vincita = false;
            }else{
                System.out.println("Non ha ancora vinto nessuno");
            }
            */
        
        Scanner in = new Scanner(System.in);
        
        String giocatoreX = "c", giocatoreO = "veeeeeeeeeeee";
        
        Tris1 t = new Tris1();
        try {
            try{
                t.setDimensione(0);
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            try{
                t.setGiocatoreX(giocatoreX);
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            try{
                t.setGiocatoreO(giocatoreO);
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            boolean vincita = true;

            while(vincita){
                System.out.print("Il campo è: " + t.info());
                int x,o;

                String valori;

                System.out.println("Inserire i valori separati dalla vigola: ");
                valori = in.nextLine();

                String s = t.gioca(valori);

                if(s.equals("X")){
                    System.out.println("Il vincitore è il primo giocatore ");
                    vincita = false;
                }else if (s.equals("O")){
                    System.out.println("Il vincitore è il secondo giocatore ");
                    vincita = false;
                }else if (s.equals("=")){
                    System.out.println("Parità ");
                    vincita = false;
                }else{
                    System.out.println("Non ha ancora vinto nessuno");
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
