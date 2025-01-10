
package Exception;

import java.util.regex.Pattern;

public class Citta {
    private String nome;
    private String superficie;
    private Persona7 sindaco;
    private Persona7[] abitanti;

    public Citta() {
    }

    public Citta(String nome, String superficie, Persona7 sindaco, Persona7[] abitanti) throws Exception {
        setNome(nome);
        setSuperficie(superficie);
        setSindaco(sindaco);
        setAbitanti(abitanti);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        Pattern pattern = Pattern.compile("[a-z]{2,16}$", Pattern.CASE_INSENSITIVE);
        if(nome != null)
            if(pattern.matcher(nome).matches())
                if(Character.isUpperCase(nome.charAt(0)))
                    this.nome=nome;
                else 
                   throw new Exception ("non può essere null");
            else
                throw new Exception ("non può essere null");
        else
            throw new Exception ("non può essere null");
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) throws Exception {
        if(superficie != null)
            if(superficie.matches("[0-9\\,\\.]+[km,m]+"))
                this.superficie = superficie;
            else
                throw new Exception ("sintassi errata");
        else            
            throw new Exception ("non può essere null");
    }

    public Persona7 getSindaco() {
        return sindaco;
    }

    public void setSindaco(Persona7 sindaco) throws Exception {
        if(sindaco != null)
            this.sindaco = sindaco;
        else
            throw new Exception ("non può essere null");
    }

    public Persona7[] getAbitanti() {
        return abitanti;
    }

    public void setAbitanti(Persona7[] abitanti) throws Exception {
        if(abitanti != null)
            this.abitanti = new Persona7[abitanti.length+1];
            this.abitanti[0] = sindaco;
            for(int i =0; i < abitanti.length; i++){
                this.abitanti[i] = abitanti[i];
            }
        else
            throw new Exception ("non può essere null");
    }
    
    public Integer densitaPopolazione(){
        
        return null;
    }
    
    public Integer etaMedia(){
        Integer a =0;
        for(int i =0; i < abitanti.length; i++){
                a+=abitanti[i].calcolaEta();
            }
        a=a/abitanti.length;
        return a;
    }
    
    public String info(){
        String testo;
        
        testo="sindaco:" + sindaco + "abitanti:" + abitanti ;
        
        return testo;
    }
    
    public Integer numeroOmonimi(){
        return null;
    }
    
    public static void main(String[] args) throws Exception {
        
        try{
            Persona7 sindaco = new Persona7(1.4, "Marco", "22/12/2000", "Rossi", 2.1 , "ciao@afff.net", "Termo$123%aaaaa");
            Persona7[] abitanti={sindaco,sindaco};
            Citta c = new Citta ("Trento", "157,8km", sindaco, abitanti);
            for(int i =0; i < abitanti.length; i++){
                System.out.println(c.getAbitanti()[i].info());
            }
            
        }catch(Exception ex){
           System.out.println(ex.getMessage());
        }

    }
    
    
}

