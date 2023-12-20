
package teoria;

/**
 *
 * @author claudio.ghetta
 */
public class Studente1 {
    private String nome;
    private String cognome;
    private int matricola;
    private static int ultimaMatricola;
    
    public Studente1 (){
        
    }
    public Studente1 (String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        ultimaMatricola++;
        matricola = ultimaMatricola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public static int getUltimaMatricola() {
        return ultimaMatricola;
    }

    public static void setUltimaMatricola(int ultimaMatricola) {
        Studente1.ultimaMatricola = ultimaMatricola;
    }
    
    public String stampaDati (){
        String testo;
        
        testo = "nome: " + nome + "\n"
              + "cognome: " + cognome + "\n"
              + "matricola: " + matricola + "\n"
              + "prossima matricola: " + ultimaMatricola++;

        return testo;
    }
    
    public static int prossimaMatricola(){
        return Studente1.ultimaMatricola+1;
    }
    
    
}
