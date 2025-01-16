package Exception;

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
        if (nome != null) {
            if (Character.isUpperCase(nome.charAt(0)) == true) {
                if (nome.matches("\\D+")) {
                    this.nome = nome;
                } else {
                    throw new Exception("Il nome della città deve contenere SOLO lettere");
                }
            } else {
                throw new Exception("La prima lettera del nome della città DEVE essere maiuscola");
            }
        } else {
            throw new Exception("Il nome della città NON deve essere null");
        }
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) throws Exception {
        if (superficie != null) {
            if (superficie.matches("[0-9\\,]+[km,m]+")) {
                this.superficie = superficie;
            } else {
                throw new Exception("Scrivere prima il numero e dopo l'untità di misura");
            }
        } else {
            throw new Exception("La superficie NON deve essere null");
        }
    }

    public Persona7 getSindaco() {
        return sindaco;
    }

    public void setSindaco(Persona7 sindaco) throws Exception {
        if (sindaco != null) {
            this.sindaco = sindaco;
        } else {
            throw new Exception("Il nome del sindaco NON può essere null");
        }
    }

    public Persona7[] getAbitanti() {
        return abitanti;
    }

    public void setAbitanti(Persona7[] abitanti) {
        this.abitanti = new Persona7[abitanti.length + 1];
        this.abitanti[0] = sindaco;
        for (int i = 1; i < abitanti.length; i++) {
            this.abitanti[i] = abitanti[i - 1];
        }
    }

    public Integer densitaPopolazione() {
        Integer dens = 0;
        int temp = superficie.indexOf(',');
        String s = superficie.substring(0, temp - 1);

        dens = abitanti.length / Integer.parseInt(s);

        return dens;
    }

    public Integer etaMedia() throws Exception {
        Integer eta = 0;

        for (int i = 0; i < abitanti.length; i++) {
            eta = eta + abitanti[i].calcolaEta();
        }
       
        eta = eta / abitanti.length;

        return eta;
    }
    
    public String info(){
        String testo;
        
        testo = "nome: " + nome + "\n" + "superficie:" + superficie + "\n" +
                "sindaco: " + sindaco + "abitanti: " + abitanti;
        
        return testo;
    }
    
    public Integer numeroOmonimi(){
        Integer n = 0;
        
        for (int i = 0; i < abitanti.length; i++) {
            for (int j = i + 1; j < abitanti.length; j++) {
                if (abitanti[i].getNome().equals(abitanti[j].getNome())) {
                    n++; 
                }
            }
        }
        return n;
    }

    public static void main(String[] args) throws Exception {
        try {
            Persona7 sindaco = new Persona7(1.0, "Pompilio", "22/12/1950", "Rossi", 123f, "gianni.compitio@cico.com", "Termo$123%aaaaa");
            Persona7 p1 = new Persona7(1.0, "Ghetta", "22/12/1950", "Rossi", 123f, "gianni.compitio@cico.com", "Termo$123%aaaaa");
            Persona7 p2 = new Persona7(1.0, "Tamaontop", "22/12/1950", "Rossi", 123f, "gianni.compitio@cico.com", "Termo$123%aaaaa");
            Persona7 p3 = new Persona7(1.0, "Tomaonline", "22/12/1950", "Rossi", 123f, "gianni.compitio@cico.com", "Termo$123%aaaaa");
            Persona7[] abitanti = {p1, p2, p3, sindaco};
            Citta c = new Citta("Trento", "157,9km", sindaco, abitanti);
            for (int i = 0; i < abitanti.length; i++) {
                System.out.println(c.getAbitanti()[i].info());
            }
            c.etaMedia();
            c.info();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}


