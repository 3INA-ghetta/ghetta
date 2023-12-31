
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
    /**
     * imposta/modifica valore nome
     * @param nome nome 
     */
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
    /**
     * imposta/modifica valore cognome
     * @param cognome cognome
     */
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
    /**
     * imposta/modifica valore email
     * @param email email 
     */
    public void setEmail (String email) {
      this.email=email;
    }
    
    /**
     * restituisce valore sulla registrazione
     * @return  
     */
    public boolean isRegistrazioneAvvenuta () {
        boolean isRegistrazione;
        
        if (email.equals("")) {
            isRegistrazione = false;
        } else {
            isRegistrazione = true;
        }
        
        return isRegistrazione;
    }
    /**
     * restituisce valore testo
     * @return 
     */
    public String info () {
        String testo;
        testo = "nome          : " + nome    + "\n" +
                "cognome       : " + cognome + "\n" +
                "email         : " + email   + "\n";
        return testo;        
    }    
}

