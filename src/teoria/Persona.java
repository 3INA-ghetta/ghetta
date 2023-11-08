
package teoria;

/**
 * La classe Persona serve per sapere se una persona si è registrata
 * @author Ghetta Claudio 3INA 2023
 * @version 1.0
 */
public class Persona {
    private String nome;
    private String cognome;
    private String email;
    
    /**
     * classe senza parametri
     */
    public Persona () {
        
    }
    /**
     * classe con parametri
     * @param nome
     * @param cognome
     * @param email 
     */
    public Persona (String nome ,String cognome, String email) {
       this.nome=nome;
       this.cognome=cognome;
       this.email=email;           
    }
    /**
     * restituisce nome
     * @return nome 
     */
    public String getNome () {
        return nome;
    }
    public void setNome (String nome) {
      this.nome=nome;
    }
    
    /**
     * restituisce cognome
     * @return cognome
     */
    public String getCognome () {
        return cognome;
    }
    public void setCognome (String cognome) {
      this.cognome=cognome;
    /**
     * restituisce email
     * @return email 
     */
    }
    public String getEmail () {
        return email;
    }
    public void setEmail (String email) {
      this.email=email;
    }
    
    /**
     * 
     * @return registrazione 
     */
    public boolean registrazioneAvvenuta () {
        boolean registrazione;
        
        if (email.equals("")) {
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

