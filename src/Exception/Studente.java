package Exception;

public class Studente extends PersonaA {

    public final String SCUOLA = "I.T.T. Buonarroti";
    private Integer classe;
    private Boolean isRipetente;
    private Float[] voti;

    public Studente() {
    }

    public Studente(Integer classe, Boolean isRipetente, Double altezza, String cognome, String nome, Float peso, String dataDiNascita, String email, String password) throws Exception {
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

    public Float[] getVoti() {
        return voti.clone();
    }

    public void setVoti(Float[] voti) throws Exception {
        if(voti==null){
            throw new Exception("il valorre non può essere nullo");
        }
        
        for(int i =0; i<voti.length; i++){
            if(voti[i]==null){
                throw new Exception("valore"+(i+1) +"nullo");
        }
        }
        this.voti = voti;
        
    }
    
    /*
    public void aggiungiVoto1(Float votoo) throws Exception{
        Float[] v = new Float[voti.lenght+1];
        System.arraycopy(voti,0,v,0,voti.length);
        v[v-length-1] = voti;
        setVoti(v);
    }
    */

    public void aggiungiVoto(Float voto) throws Exception {
        if (voto < 1) {
            throw new Exception("Il voto non può essere minore di 1");
        }

        if (voto > 10) {
            throw new Exception("Il voto non può essere maggiore di 10");
        }

        if (voti == null) {
            voti = new Float[1];
            voti[0] = voto;
        } else {
            Float temp[] = new Float[voti.length + 1];
            for (int i = 0; i < voti.length; i++) {
                temp[i] = voti[i];
            }

            temp[voti.length] = voto;

            voti = temp;
        }
    }

    public void rimuoviVoto(Integer posizione) throws Exception {
        int j = 0;

        if (voti == null) {
            throw new Exception("Per rimuovere un voto deve prima essercene almeno uno");
        }
        if (posizione < 0) {
            throw new Exception("La poszione inserita deve essere minimo 1");
        }
        if (posizione >= voti.length) {
            throw new Exception("La posizione inserita non deve essere maggiore del numero di voti");
        }

        if (voti.length == 1) {
            Float temp[] = new Float[voti.length - 1];
            voti = temp;
        } else {
            Float temp[] = new Float[voti.length - 1];
            for (int i = 0; i < voti.length; i++) {
                if (i != posizione) {
                    temp[j] = voti[i];
                    j++;
                }
            }
            voti = temp;
        }
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
        
        if (mediaVoti() == 6) {
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
    public String info() throws Exception {
        String s = "", vot = "";
        
        if (voti != null && voti.length>1) {
            for (int i = 0; i < voti.length; i++) {
                if(i == 0){
                    vot = vot + voti[0];
                }else{
                    vot = vot + ", " + voti[i];
                }
            }
        } else {
            vot = "Non ci sono voti \n";
        }
        
        if(classe !=null && isRipetente!=null){

        s = SCUOLA + "\n"
                + "Classe         : " + classe + "\n"
                + "Ripetente      : " + isRipetente + "\n"
                + super.info() + "\n"
                + "Voti           : " + vot + "\n"
                + "Voto minore    : " + votoMinore() + "\n"
                + "Voto maggiore  : " + votoMaggiore() + "\n"
                + "Media dei voti : " + mediaVoti();

        return s;
        }else{
            throw new Exception("valori nulli");
        }
        
    }
    
    private Float votoMinore(){
        if(voti == null){
            return 0f;
        }
        if(voti.length == 1){
            return voti[0];
        }
        
        Float min = voti[0];
        
        for(int i = 0; i < voti.length; i++){
            if(voti[i] < min){
                min = voti[i];
                i = -1;
            }
        }
        
        return min;
    }
    
    private Float votoMaggiore(){
        if(voti == null){
            return 0f;
        }
        if(voti.length == 1){
            return voti[0];
        }
        
        Float max = voti[0];
        
        for(int i = 0; i < voti.length; i++){
            if(voti[i] > max){
                max = voti[i];
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
        
        for(int i = 0; i < voti.length; i++){
            media = media + voti[i];
        }
        
        media = media / voti.length;
        
        return media;
    }

    public static void main(String[] args) throws Exception {
        try {
            Studente s = new Studente(1, true, 1.0, "Pompilio", "Matteo", 40f, "17/04/2007", "matteo.pompilio@cico.com", "Bl00dborneL0ver!");
            s.aggiungiVoto(10f);
            s.aggiungiVoto(10f);
            s.aggiungiVoto(10f);
            
            System.out.println(s.promuovi(3));;
            System.out.println(s.info());

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}