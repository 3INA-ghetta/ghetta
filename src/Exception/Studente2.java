package Exception;

import java.util.ArrayList;
import java.util.Collections;

public class Studente2 extends PersonaA {

    public final String SCUOLA = "I.T.T. Buonarroti";
    private Integer classe;
    private Boolean isRipetente;
    private ArrayList <Float> voti = new ArrayList<>();

    public Studente2() {
    }

    public Studente2(Integer classe, Boolean isRipetente, Double altezza, String cognome, String nome, Float peso, String dataDiNascita, String email, String password) throws Exception {
        super(altezza, cognome, nome, peso, dataDiNascita, email, password);
        setClasse(classe);
        setIsRipetente(isRipetente);
        setVoti(voti);
    }

    public String getSCUOLA() {
        return SCUOLA;
    }

    public Integer getClasse() {
        return classe;
    }

    public void setClasse(Integer classe) throws Exception {
        if (classe == null) {
            throw new Exception("La classe non può essere null");
        }

        if (classe >= 1) {
            if (classe <= 5) {
                this.classe = classe;
            } else {
                throw new Exception("La classe deve essere minore o uguale di 5");
            }
        } else {
            throw new Exception("La classe deve essere maggiore o uguale di 1");
        }
    }

    public Boolean getIsRipetente() {
        return isRipetente;
    }

    public void setIsRipetente(Boolean isRipetente) throws Exception {
        if (isRipetente == null) {
            throw new Exception("Il valore di ripetente non può essere null");
        }

        this.isRipetente = isRipetente;
    }

    public ArrayList<Float> getVoti() {
        return (ArrayList<Float>) voti.clone();
    }

    public void setVoti(ArrayList<Float> voti) {
        this.voti = (ArrayList<Float>) voti.clone();
    }

    public void aggiungiVoto(Float voto) throws Exception {
        if (voto < 3) {
            throw new Exception("Il voto non può essere minore di 3");
        }
        
        if ((voto%0.25)!=0) {
            throw new Exception("Il voto non può avere decimali diversi da 0,25-0,50-0,75");
        }

        if (voto > 10) {
            throw new Exception("Il voto non può essere maggiore di 10");
        }

        voti.add(voto);
    }
    
    public void rimuoviVoto(int index) throws Exception {

        if (voti == null) {
            throw new Exception("Per rimuovere un voto deve prima essercene almeno uno");
        }
        if (index < 0) {
            throw new Exception("La posizione inserita deve essere minimo 1");   
        }

        if (index >= voti.size()) {
            throw new Exception("La posizione inserita non deve essere maggiore del numero di voti");
        }

        voti.remove(index);
    }
    /*
    public void rimuoviVoto(Integer posizione) throws Exception {
        if (voti == null) {
            throw new Exception("Per rimuovere un voto deve prima essercene almeno uno");
        }
        if (posizione < 0) {
            throw new Exception("La posizione inserita deve essere minimo 1");
        }
        if (posizione >= voti.size()) {
            throw new Exception("La posizione inserita non deve essere maggiore del numero di voti");
        }

        voti.remove( (int) posizione);
    }
    */
    
    public void rimuoviVoto(Float voto) throws Exception {

        if (voti == null) {
            throw new Exception("Per rimuovere un voto deve prima essercene almeno uno");
        }
        if (voto < 3) {
            throw new Exception("Il voto non può essere minore di 3");
        }
        
        if ((voto%0.25)!=0) {
            throw new Exception("Il voto non può avere decimali diversi da 0,25-0,50-0,75");
        }

        if (voto > 10) {
            throw new Exception("Il voto non può essere maggiore di 10");
        }

        voti.remove(voto);
    }
    
    
    public void rimuoviUltimoVoto() throws Exception {

        if (voti.isEmpty()) {
            throw new Exception("Per rimuovere un voto deve prima essercene almeno uno");
        }

        voti.remove(voti.size()-1);
    }
    
    public void ordinaVotoCrescente(){
        voti.sort(null);
    }
    
    public void ordinaVotoDecrescente(){
        Collections.sort(voti, Collections.reverseOrder());
    }

    public Boolean promuovi() {
        Boolean is = false;
        
        if (classe + 1 <= 5) {
            if(mediaVoti() >= 6){
                classe++;
                is = true;
            }
        }
        
        return is;
    }

    public Boolean promuovi(Integer numeroClassi) {
        Boolean is = false;
        
        if (mediaVoti() == 10) {
            if(classe + numeroClassi <= 5){
                classe = classe + numeroClassi;
                is = true;
            }else{
                classe = 5;
                is = true;
            }
        }
        
        return is;
    }
    
    @Override
    public String toString(){
        String s = "", vot = "";
        
        if (voti != null) {
            for (int i = 0; i < voti.size(); i++) {
                if(i == 0){
                    vot = vot + voti.get(i);
                }else{
                    vot = vot + ", " + voti.get(i);
                }
            }
        } else {
            vot = "Non ci sono voti";
        }

        try {
            s = SCUOLA + "\n"
                    + "Classe         : " + classe + "\n"
                    + "Ripetente      : " + isRipetente + "\n"
                    + super.info() + "\n"
                    + "Voti           : " + vot + "\n"
                    + "Voto minore    : " + votoMinore() + "\n"
                    + "Voto maggiore  : " + votoMaggiore() + "\n"
                    + "Media dei voti : " + mediaVoti();
        } catch (Exception ex) {

        }

        return s;
    } 
    
    private Float votoMinore(){
        if(voti == null){
            return 0f;
        }
        if(voti.size() == 1){
            return voti.get(0);
        }
        
        Float min = voti.get(0);
        
        for(int i = 0; i < voti.size(); i++){
            if(voti.get(i) < min){
                min = voti.get(i);
                i = -1;
            }
        }
        
        return min;
    }
    
    private Float votoMaggiore(){
        if(voti == null){
            return 0f;
        }
        if(voti.size() == 1){
            return voti.get(0);
        }
        
        Float max = voti.get(0);
        
        for(int i = 0; i < voti.size(); i++){
            if(voti.get(i) > max){
                max = voti.get(i);
                i = -1;
            }
        }
        
        return max;
    }
    
    /*
    private Float VotoMaggiore(){
        Float[] v = voti.clone();
        Arrays.sort(v);
        return v[voti.length -1]
    }
    
    private Float VotoMinore(){
        Float[] v = voti.clone();
        Arrays.sort(v);
        return v[0]
    }
    */
    
    private Float mediaVoti(){
        Float media = 0f;
        if(voti == null){
            media = 0f;
        }
        
        for(int i = 0; i < voti.size(); i++){
            media = media + voti.get(i);
        }
        
        media = media / voti.size();
        
        return media;
    }

    public static void main(String[] args) throws Exception {
        try {
            Studente2 s = new Studente2(1, true, 1.0, "Pompilio", "Matteo", 40f, "17/04/2007", "matteo.pompilio@cico.com", "Bl00dborneL0ver!");
            s.aggiungiVoto(8f);
            s.aggiungiVoto(1f);
            s.aggiungiVoto(10f);
            
            System.out.println(s.promuovi(3));
            System.out.println(s.toString());

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}