
package Data;

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
        this.data = data;
    }

    public DataEasy(Integer giorno, Integer mese, Integer anno) {
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
    }
    
    public DataEasy(DataEasy d){
        this.data = d.data;
        this.giorno = d.giorno;
        this.mese = d.mese;
        this.anno = d.anno;
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
    
    public String giornoDellaSettimana(){
        
    }
    
    public static Integer differenzaInGiorni(DataEasy dataAntecedente,DataEasy dataSuccessiva ){
        
    }
    public static Integer differenzaInMesi(DataEasy dataAntecedente,DataEasy dataSuccessiva ){
        
    }
    public static Integer differenzaInAnni(DataEasy dataAntecedente,DataEasy dataSuccessiva ){
        
    }
    public static String differenzaInGiorniMesiAnni(DataEasy dataAntecedente,DataEasy dataSuccessiva ){
        
    }
    //@override
    public String ToString(){
        
    }
            
    
}
