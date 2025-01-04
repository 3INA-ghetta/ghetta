
package verifica;

import java.time.Year;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Calendar;

public class Persona5 {
    
    private Double altezza;
    private String nome;
    private String dataDiNascita;
    private static int numeroIstanze;

    public Persona5() {
        numeroIstanze++;
    }

    public Persona5(Double altezza, String nome, String dataDiNascita) throws Exception {
        setAltezza(altezza);
        setNome(nome);
        setDataDiNascita(dataDiNascita);
        numeroIstanze++;
    }
    
    public Persona5(Persona5 p){
        this.altezza = p.altezza;
        this.nome = p.nome;
        this.dataDiNascita = p.dataDiNascita;   
        numeroIstanze++;
    }

    public Double getAltezza() {
        return altezza;
    }

    public void setAltezza(Double altezza) throws Exception {
        Random r = new Random();
        float magg = r.nextInt(2)+1;
        float min = r.nextInt(2)+1;
        while(magg < min){
            magg = r.nextInt(2)+1;   
        }
        if(altezza < magg && altezza >0 && altezza != null){
            if(altezza > min){
                this.altezza = altezza;
            }else{
                throw new Exception("L'altezza deve essere maggiore del valore minimo");
            }
        }else{
            throw new Exception("L'altezza deve essere minore del valore massimo");        
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) throws Exception {
        int cont=0;
        String [] temp = nome.split(" ");
        for(int i =0; i <nome.length(); i++){
            if( nome.charAt(i) == ' ' && cont < 1){
                cont++;
            }else if(nome.charAt(i) == ' ' && cont >= 2){
                throw new Exception("Ci possono essere al massimo due nomi");
            }
            if(Character.isLetter(nome.charAt(i)) || nome.charAt(i) == ' '){ 
                if(Character.isUpperCase(nome.charAt(0))){
                    if(Character.isLetter(nome.charAt(0)) && Character.isLetter(nome.charAt(1)) && Character.isLetter(nome.charAt(2))){
                        if(Character.isUpperCase(temp[1].charAt(0))){
                                this.nome = nome;
                            }else{
                                throw new Exception("LE MAIUSCOLE"); 
                        }    
                    }else{
                        throw new Exception("deve essere di minimo tre lettere");  
                    }
                    
                }else{
                   throw new Exception("le maiuscole!!!"); 
                }
                
            }else if (!Character.isLetter(nome.charAt(i)) && !(nome.charAt(i) == ' ')){ 
                throw new Exception("devono essere lettere");
            }
        }
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(String dataDiNascita) throws Exception {
        String [] temp = dataDiNascita.split("/");          
        GregorianCalendar dataOdierna = new GregorianCalendar();
        int i= Integer.parseInt(temp[0]);
        int annoAttuale = dataOdierna.get(Calendar.YEAR);
        int a= Integer.parseInt(temp[1]);
        int b= Integer.parseInt(temp[2]);
        if(dataDiNascita.charAt(2) == '/' && dataDiNascita.charAt(5) == '/' && dataDiNascita.length()>9){
            if( b < annoAttuale){
                if(b >= 0 ){
                    if(a <= 12){
                        if(a >= 1){
                            if(i >= 0){
                                if(i <= 31 && (a == 12 || a ==10 || a==3 || a==5 || a==7 || a==8) || (a==2 || a==1 || a==4 || a==6 || a == 11 || a == 9)){
                                    if((a == 2 && Year.isLeap(b) && i <=29) || (a==2 || (a<=12 && a>3 ))){
                                        if((a == 2 && !Year.isLeap(b) && i <=28) || (a==1 || (a<=12 && a>3 ))){
                                            if(i <= 30 && (a == 11 || a == 9) || (a == 2 || a == 12 || a ==10 || a==3 || a==5 || a==7 || a==8) ){
                                                this.dataDiNascita = dataDiNascita;
                                            }else{
                                                throw new Exception("mese da 30");
                                            }
                                        }else{
                                           throw new Exception("mese da 28"); 
                                        }
                                    }else{
                                        throw new Exception("mese da 29");
                                    } 
                                }else{
                                    throw new Exception("mese da 31"); 
                                }
                                
                            }else{
                               throw new Exception("giorni sotto 0");  
                            }

                        }else{
                           throw new Exception("mese sotto 0"); 
                        }

                    }else{
                        throw new Exception("mese sopra 12");
                    }
                }else{
                    throw new Exception("anno sotto lo 0");
                }
            }else{
                throw new Exception("anno errato");
            }  
        }else{
            throw new Exception("la data deve essere scritta in gg/mm/aaaa");
        }
        
    }

    public static int getNumeroIstanze() {
        return numeroIstanze;
    }
    
    public Integer calcolaEta(){
        Integer d=0;
        String [] temp = dataDiNascita.split("/");
        int i= Integer.parseInt(temp[0]);
        int a= Integer.parseInt(temp[1]);
        int b= Integer.parseInt(temp[2]);
        GregorianCalendar dataOdierna = new GregorianCalendar();
        int annoAttuale = dataOdierna.get(Calendar.YEAR);
        int meseAttuale =dataOdierna.get(Calendar.MONTH) + 1;
        int giornoAttuale=dataOdierna.get(Calendar.DAY_OF_MONTH);
        int diff = annoAttuale-b;  
        if(meseAttuale == a && giornoAttuale == i ){
            diff++;
        }
        d = diff;
        return d; 
    }
    
    public String info(){
        String testo;
        
        testo = "nome: " + nome + "\n" + "altezza:" + altezza + "\n" +
                "dataDiNascita: " + dataDiNascita;
        
        return testo;
    }
    
    public boolean verificaOmonimia (Persona5 p){
        if(p.altezza.equals(altezza) && p.nome.equals(nome) && p.dataDiNascita.equals(dataDiNascita)){
            return true;
        }else{
            return false;
        }       
    }
    
    public static void main(String[] args) {
        
        try{
            Persona5 pe = new Persona5(1.4, "Marco M", "22/12/2000");
            
        }catch(Exception ex){
           System.out.println(ex.getMessage());
        }

    }
    
    
}
