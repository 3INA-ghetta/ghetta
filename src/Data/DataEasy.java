package Data;

import static Data.DataEasy.differenzaInAnni;
import static Data.DataEasy.differenzaInGiorni;
import static Data.DataEasy.differenzaInGiorniMesiAnni;
import static Data.DataEasy.differenzaInMesi;
import static Data.DataEasy.differenzaInSettimane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DateTimeException;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.temporal.ChronoUnit;
import java.time.Period;

public class DataEasy {

    private String data;
    private Integer giorno;
    private Integer mese;
    private Integer anno;

    public DataEasy() {
    }

    public DataEasy(String data) {
        DateTimeFormatter l = DateTimeFormatter.ofPattern("dd/M/yyyy");
        LocalDate lD = LocalDate.parse(data, l);

        this.giorno = lD.getDayOfMonth();
        this.mese = lD.getMonthValue();
        this.anno = lD.getYear();
    }

    public DataEasy(Integer giorno, Integer mese, Integer anno) {
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
    }

    public DataEasy(DataEasy data) {
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
        String g;

        LocalDate l = LocalDate.of(anno, mese, giorno);
        g = l.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALY);

        return g;
    }

    public static Integer differenzaInGiorni(DataEasy dataAntecedente, DataEasy dataSuccessiva) throws Exception {
        Integer diff = 0;
        LocalDate dAntecedente = LocalDate.of(dataAntecedente.getAnno(), dataAntecedente.getMese(), dataAntecedente.getGiorno());
        LocalDate dSuccessiva = LocalDate.of(dataSuccessiva.getAnno(), dataSuccessiva.getMese(), dataSuccessiva.getGiorno());

        diff = (int) ChronoUnit.DAYS.between(dAntecedente, dSuccessiva);

        if (diff < 0) {
            throw new Exception("Inserire le date in ordine cronologico");
        }

        return diff;
    }

    public static Integer differenzaInSettimane(DataEasy dataAntecedente, DataEasy dataSuccessiva) throws Exception {
        Integer diff = 0;

        LocalDate dAntecedente = LocalDate.of(dataAntecedente.getAnno(), dataAntecedente.getMese(), dataAntecedente.getGiorno());
        LocalDate dSuccessivo = LocalDate.of(dataSuccessiva.getAnno(), dataSuccessiva.getMese(), dataSuccessiva.getGiorno());

        diff = (int) ChronoUnit.WEEKS.between(dAntecedente, dSuccessivo);

        if (diff < 0) {
            throw new Exception("Inserire le date in ordine cronologico");
        }

        return diff;
    }

    public static Integer differenzaInMesi(DataEasy dataAntecedente, DataEasy dataSuccessiva) throws Exception {
        Integer diff = 0;

        LocalDate dAntecedente = LocalDate.of(dataAntecedente.getAnno(), dataAntecedente.getMese(), dataAntecedente.getGiorno());
        LocalDate dSuccessivo = LocalDate.of(dataSuccessiva.getAnno(), dataSuccessiva.getMese(), dataSuccessiva.getGiorno());

        diff = (int) ChronoUnit.MONTHS.between(dAntecedente, dSuccessivo);

        if (diff < 0) {
            throw new Exception("Inserire prima la data più vecchia e dopo la data più recente");
        }

        return diff;
    }

    public static Integer differenzaInAnni(DataEasy dataAntecedente, DataEasy dataSuccessiva) throws Exception {
        Integer diff = 0;

        LocalDate dAntecedente = LocalDate.of(dataAntecedente.getAnno(), dataAntecedente.getMese(), dataAntecedente.getGiorno());
        LocalDate dSuccessivo = LocalDate.of(dataSuccessiva.getAnno(), dataSuccessiva.getMese(), dataSuccessiva.getGiorno());

        diff = (int) ChronoUnit.YEARS.between(dAntecedente, dSuccessivo);

        if (diff < 0) {
            throw new Exception("Inserire prima la data più vecchia e dopo la data più recente");
        }

        return diff;
    }

    public static String differenzaInGiorniMesiAnni(DataEasy dataAntecedente, DataEasy dataSuccessiva) {
        String s;
        int g, m, y;

        Period p = Period.between(LocalDate.of(dataAntecedente.getAnno(), dataAntecedente.getMese(), dataAntecedente.getGiorno()), LocalDate.of(dataSuccessiva.getAnno(), dataSuccessiva.getMese(), dataSuccessiva.getGiorno()));
        g = p.getDays();
        m = p.getMonths();
        y = p.getYears();

        s = y + " anni " + m + " mesi " + g + " giorni";

        return s;
    }

    @Override
    public String toString() {
        String s = "", m;
        int g, y;

        LocalDate l = LocalDate.of(anno, mese, giorno);

        g = l.getDayOfMonth();
        m = l.getMonth().getDisplayName(TextStyle.FULL, Locale.ITALY);
        y = l.getYear();

        s = giornoDellaSettimana() + " " + g + " " + m + " " + y;

        return s;
    }

    public static void main(String[] args) {
        DataEasy d = new DataEasy(1, 12, 2024);
        DataEasy d1 = new DataEasy(12, 2, 2022);
        //DataEasy d = new DataEasy("1/12/2024"); 

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