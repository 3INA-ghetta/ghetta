
package teoria;

/**
 * La classe Studente serve per verificare se uno studente ha avuto un esito 
 * positivo o negativo alla verifica
 * @author Ghetta.Cladio 3INA 2023
 * @version 1.0
 */
public class Studente {
    private String nome;
    private String cognome;
    private float voto;
    private String esito;
    
    /**
     * classe senza parametri
     */
    public Studente () {
        
    }
    
    /**
     * classe con parametri
     * @param nome
     * @param cognome
     * @param voto
     * @param esito 
     */
        
    public Studente (String nome, String cognome, float voto, String esito ) {
        this.nome = nome;
        this.cognome = cognome;
        this.voto = voto;
        this.esito = esito;
               
    }
    /**
     * resituisce nome
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
        this.nome = nome;
    }
    
    /**
     * restuituisce cognome
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
        this.cognome = cognome;
    }
    
    /**
     * restituisce voto
     * @return voto
     */
    public float getVoto () {
        return voto;
    }
    
    /**
     * imposta/modifica voto
     * @param voto voto
     */
    public void setVoto (float voto) {
        this.voto = voto;
    }
    
    /**
     * restituisce esito
     * @return esito 
     */
    public String getEsito () {
        return esito;
    }
    
    /**
     * imposta/modifica esito
     * @param esito esito 
     */
    public void setEsito (String esito) {
        this.esito = esito;
    }
    
    /** 
     * restituisce il valore esitoVerifica
     * @return 
     */
    public String esitoVerifica () {
        
        if (voto >= 6) {
            esito="positivo";
        } else {
            esito="negativo";
        }
        return esito;
    }
    /**
     * restituisce il valore testo
     * @return 
     */
    public String info () {
        String testo;
        testo = "nome          : " + nome    + "\n" +
                "cognome       : " + cognome + "\n" +
                "voto       : " + voto + "\n" +
                "esito         : " + esito  + "\n";
        return testo;        
    }    
    
    
    
    
}
