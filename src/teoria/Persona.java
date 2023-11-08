
package teoria;

/**
 *
 * @author claudio.ghetta
 */
public class Persona {
    private String nome;
    private String cognome;
    private String email;
    
    public Persona () {
        
    }
    
    public Persona (String nome ,String cognome, String email) {
       this.nome=nome;
       this.cognome=cognome;
       this.email=email;           
    }
    
    public String getNome () {
        return nome;
    }
    public String getCognome () {
        return cognome;
    }
    public String getEmail () {
        return email;
    }
    
    public boolean registrazioneAvvenuta () {
        boolean registrazione;
        if (email.equals(" ")) {
        registrazione = false;
        } else {
        registrazione = true;
        }
        return registrazione;
    }
    
    public String info () {
        String testo;
        testo = "nome          : " + nome    + "\n" +
                "cognome       : " + cognome + "\n" +
                "email         : " + email   + "\n";
        return testo;
        
    }
    
}
