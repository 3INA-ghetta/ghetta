
package Exception;

import java.time.Year;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Calendar;
import java.util.regex.*;

public class Persona7 {
    
    private Double altezza;
    private String nome;
    private String dataDiNascita;
    private static int numeroIstanze;
    private String cognome;
    private Double peso;
    private String email;
    private String password; 

    public Persona7() {
        numeroIstanze++;
    }    

    public Persona7(Double altezza, String nome, String dataDiNascita, String cognome, Double peso, String email, String password) throws Exception {
        setAltezza(altezza);
        setNome(nome);
        setDataDiNascita(dataDiNascita);
        setCognome(cognome);
        setPeso(peso);
        setEmail(email);
        setPassword(password);
        numeroIstanze++;
    }

    Persona7(Persona7 sindaco, Persona7 sindaco0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) throws Exception {
        Pattern pattern = Pattern.compile("[a-z]{2,16}$", Pattern.CASE_INSENSITIVE);
        if(pattern.matcher(cognome).matches() && cognome != null)
            if(Character.isUpperCase(cognome.charAt(0)))
                this.cognome = cognome;
            else
                throw new Exception ("manca la maiuscola");
        else
            throw new Exception ("il cognome non è stato inserito correttamente");
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) throws Exception {
        if(peso >0 && peso != null){
            this.peso = peso;
        }else{
            throw new Exception("il peso deve essere maggiore di 0");        
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}");
        if(pattern.matcher(email).matches() && email != null)
            this.email= email;
        else
            throw new Exception("email errata"); 
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws Exception {
        Pattern pattern = Pattern.compile("(?=.*[@#$%])([a-z])(?=.*[A-Z])(?=.*\\d){8,16}");
        if(pattern.matcher(password).matches() && password != null)
            this.password = password;
        else
            throw new Exception("password errata");  
    }   
  
    public Persona7(Persona7 p){
        this.altezza = p.altezza;
        this.nome = p.nome;
        this.dataDiNascita = p.dataDiNascita;
        this.cognome = p.cognome;
        this.peso = p.peso;
        this.email = p.email;
        this.password = p.password;
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
        if(altezza < 3 && altezza >0 && altezza != null){
            if(altezza > 1){
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
        Pattern pattern = Pattern.compile("[a-z ]{2,16}$" , Pattern.CASE_INSENSITIVE);    
        
        if(pattern.matcher(nome).matches())
            if(Character.isUpperCase(nome.charAt(0)))
                this.nome=nome;
            else
                throw new Exception("manca la maiscola iniziale");
        else
            throw new Exception("inserito in modo scorretto");
                            

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
        if(dataDiNascita.charAt(2) == '/' && dataDiNascita.charAt(5) == '/' && dataDiNascita.length()>9 && dataDiNascita != null){
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
                "dataDiNascita: " + dataDiNascita + "peso: " + peso + "password: " + password + "email: " + email + "cognome: " + cognome;
        
        return testo;
    }
    
    public boolean verificaOmonimia (Persona7 p){
        if(p.nome.equals(nome) && p.cognome.equals(cognome) && p.nome != null && p.cognome != null){
            return true;
        }else{
            return false;
        }       
    }
    
    public static void main(String[] args) {
        
        try{
            
            Persona7 pe = new Persona7 (1.4, "Marco", "22/12/2000", "Rossi", 2.1 , "ciao@afff.net", "Termo$123%aaaaa");
            
        }catch(Exception ex){
           System.out.println(ex.getMessage());
        }

    }
    
    
}
