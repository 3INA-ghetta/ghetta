
package Exception;

import java.util.ArrayList;

import Exception.PersonaA;

public class Array {
    
    private Object[] pompi = new Object[10];

    public Array() {
    }
    
    public int calcoloTarocco(PersonaA a){
        int ris=0;
        String temp = a.getNome();
        for(int i=0; i< temp.length(); i++){
            ris = ris + (int) temp.charAt(i);
        }        
        ris = ris% pompi.length;
        return ris;
    }
    
    public void riempi(PersonaA a){
        int temp=calcoloTarocco(a);
        pompi[temp]=a;     
    }
    
    public void riempi1(PersonaA a){
        int cont=0;
        int temp = a.getNome().hashCode();
        temp = temp%pompi.length;
        if(pompi[temp] == null){
            pompi[temp]= a;
        }else{
            while(pompi[temp] != null && cont != pompi.length){
                cont++;
                temp++;
                if(temp >= pompi.length && cont != pompi.length){
                    temp=0;
                }
            }
        }
                  
    }
    
    public void riempi2(PersonaA a){
        int temp = a.getNome().hashCode();
        temp = temp%pompi.length;
        
        if(pompi[temp] == null){
            ArrayList<Object> temp1 = new ArrayList<>();
            temp1.add(a);
            pompi[temp]=temp1;
        }else{
            ArrayList<Object> temp1 = (ArrayList<Object>) pompi[temp];
            temp1.add(a);
        }
    }
    
    public static void main(String[] args) {
        Array a = new Array();
        
        try{
            
            PersonaA pe = new PersonaA (1.4, "Rossi", "Marco", 21f, "22/12/2000", "ciao@afff.net", "Termo$123%aaaaa");
            PersonaA pe1 = new PersonaA (1.4, "Roiss", "Marco", 21f, "22/12/2000", "ciao@afff.net", "Termo$123%aaaaa");
            PersonaA pe2 = new PersonaA (1.4, "Bossi", "Marco", 21f, "22/12/2000", "ciao@afff.net", "Termo$123%aaaaa");
            //a.riempi(pe);
            //a.riempi(pe1);
            a.riempi1(pe);
            a.riempi1(pe1);
            //a.riempi2(pe);
            //a.riempi2(pe1);
            
            for(int i = 0; i < a.pompi.length; i++){
           
        }
            
        }catch(Exception ex){
           System.out.println(ex.getMessage());
        }
        
    }
        
        
    }
    
}
