package Data;

public class DataHard {

    private String data;
    private Integer giorno;
    private Integer mese;
    private Integer anno;

    public DataHard() {
    }

    public DataHard(String data) {

        setGiorno(giorno);
        setMese(mese);
        setAnno(anno);
    }

    public DataHard(Integer giorno, Integer mese, Integer anno) {
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
    }

    public DataHard(DataHard data) {
        this.giorno = data.getGiorno();
        this.mese = data.getMese();
        this.anno = data.getAnno();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getGiorno() {
        return giorno;
    }

    public void setGiorno(Integer giorno) {
        this.giorno = giorno;
    }

    public Integer getMese() {
        return mese;
    }

    public void setMese(Integer mese) {
        this.mese = mese;
    }

    public Integer getAnno() {
        return anno;
    }

    public void setAnno(Integer anno) {
        this.anno = anno;
    }

    public String giornoDellaSettimana() {
        String g="";
        
        Integer mese1=mese;
        Integer anno1=anno;
        Integer giorno1=giorno;
        
        if (mese1 < 3) {
            mese1 += 12;
            anno1--;
        }

        Integer K = anno1 % 100; 
        Integer J = anno1 / 100; 

        Integer giornoSettimana = 7 % (giorno1 + (13 * (mese1 + 1)) / 5 + K + K / 4 + J / 4 + 5 * J);

        switch (giornoSettimana){
            case 0:
                g ="Il giorno della settimana è sabato";
            case 1:
                g ="Il giorno della settimana è domenica";
            case 2:
                g ="Il giorno della settimana è lunedi";
            case 3:
                g ="Il giorno della settimana è martedi";
            case 4:
                g ="Il giorno della settimana è mercoledi";
            case 5:
                g ="Il giorno della settimana è giovedi";
            case 6:
                g ="Il giorno della settimana è venerdi";
        }
        
        return g;
    }

    public static Integer differenzaInGiorni(DataHard dataAntecedente, DataHard dataSuccessiva) throws Exception {
        Integer diff = 0;
        Integer mese1=dataAntecedente.getMese();
        Integer anno1=dataAntecedente.getAnno();
        Integer giorno1=dataAntecedente.getGiorno();
        Integer mese2=dataSuccessiva.getMese();
        Integer anno2=dataSuccessiva.getAnno();
        Integer giorno2=dataSuccessiva.getGiorno();
        Integer anni = (anno2-anno1)*365;
        
        boolean bisestile = (anno2 % 4 == 0 && anno2 % 100 != 0) || (anno2% 400 == 0);
        Integer diffmesi=0;

        Integer giorniMese [] = {31,28,31,30,31,30,31,31,30,31,30,31};
        Integer giorniMese1 [] = {31,29,31,30,31,30,31,31,30,31,30,31};
        
        for(int i=0; i<=(mese2-mese1); i++){
            if(bisestile){
                diffmesi =+ giorniMese1[i];
            }else{
                diffmesi =+ giorniMese[i];
            }
        }
        diff= diffmesi+giorno2-giorno1+anni;
        
        if (diff < 0) {
            throw new Exception("Inserire le date in ordine cronologico");
        }

        return diff;
    }

    public static Integer differenzaInSettimane(DataHard dataAntecedente, DataHard dataSuccessiva) throws Exception {
        Integer diff = 0;
        Integer mese1=dataAntecedente.getMese();
        Integer anno1=dataAntecedente.getAnno();
        Integer giorno1=dataAntecedente.getGiorno();
        Integer mese2=dataSuccessiva.getMese();
        Integer anno2=dataSuccessiva.getAnno();
        Integer giorno2=dataSuccessiva.getGiorno();
        Integer anni = (anno2-anno1)*365;
        
        boolean bisestile = (anno2 % 4 == 0 && anno2 % 100 != 0) || (anno2% 400 == 0);
        Integer diffmesi=0;

        Integer giorniMese [] = {31,28,31,30,31,30,31,31,30,31,30,31};
        Integer giorniMese1 [] = {31,29,31,30,31,30,31,31,30,31,30,31};
        
        for(int i=0; i<=(mese2-mese1); i++){
            if(bisestile){
                diffmesi =+ giorniMese1[i];
            }else{
                diffmesi =+ giorniMese[i];
            }
        }
        diff= (diffmesi+giorno2-giorno1+anni)/7;

        if (diff < 0) {
            throw new Exception("Inserire le date in ordine cronologico");
        }

        return diff;
    }

    public static Integer differenzaInMesi(DataHard dataAntecedente, DataHard dataSuccessiva) throws Exception {
        Integer diff = 0;
        Integer mese1=dataAntecedente.getMese();
        Integer anno1=dataAntecedente.getAnno();
        Integer mese2=dataSuccessiva.getMese();
        Integer anno2=dataSuccessiva.getAnno();
        
        Integer anni = (anno2-anno1)*12;
        
        diff=anni+(mese2-mese1);

        if (diff < 0) {
            throw new Exception("Inserire prima la data più vecchia e dopo la data più recente");
        }

        return diff;
    }

    public static Integer differenzaInAnni(DataHard dataAntecedente, DataHard dataSuccessiva) throws Exception {
        Integer diff = 0;
        Integer anno1=dataAntecedente.getAnno();
        Integer anno2=dataSuccessiva.getAnno();
        diff = anno2-anno1;

        if (diff < 0) {
            throw new Exception("Inserire prima la data più vecchia e dopo la data più recente");
        }

        return diff;
    }

    public static String differenzaInGiorniMesiAnni(DataHard dataAntecedente, DataHard dataSuccessiva) {
        String s;
        Integer mese1=dataAntecedente.getMese();
        Integer anno1=dataAntecedente.getAnno();
        Integer giorno1=dataAntecedente.getGiorno();
        Integer mese2=dataSuccessiva.getMese();
        Integer anno2=dataSuccessiva.getAnno();
        Integer giorno2=dataSuccessiva.getGiorno();
        Integer anni=anno2-anno1;
        Integer m=anni+(mese2-mese1);
        boolean bisestile = (anno2 % 4 == 0 && anno2 % 100 != 0) || (anno2% 400 == 0);
        Integer diffmesi=0;

        Integer giorniMese [] = {31,28,31,30,31,30,31,31,30,31,30,31};
        Integer giorniMese1 [] = {31,29,31,30,31,30,31,31,30,31,30,31};
        
        for(int i=0; i<=(mese2-mese1); i++){
            if(bisestile){
                diffmesi =+ giorniMese1[i];
            }else{
                diffmesi =+ giorniMese[i];
            }
        }
        Integer g= diffmesi+giorno2-giorno1+anni;                
        s = anni + " anni " + m + " mesi " + g + " giorni";

        return s;
    }

    @Override
    public String toString() {
        String s;

        s = "giorno" + getGiorno() + "mese" + getMese() + "anno" + getAnno();

        return s;
    }

    public static void main(String[] args) {
        DataHard d = new DataHard(1, 12, 2024);
        DataHard d1 = new DataHard(12, 2, 2022);
        //DataHard d = new DataHard("1/12/2024"); 

        try {
            System.out.println(d.toString());
            System.out.println(differenzaInGiorni(d1, d));
            System.out.println(differenzaInSettimane(d1, d));
            System.out.println(differenzaInMesi(d1, d));
            System.out.println(differenzaInAnni(d1, d));

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(differenzaInGiorniMesiAnni(d1, d));

    }
}

