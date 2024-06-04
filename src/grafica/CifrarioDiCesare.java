
package grafica;

public class CifrarioDiCesare {
    
    char [] car = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    char [] carC = {'d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c'};

    public CifrarioDiCesare() {
    }

    public char[] getCar() {
        return car;
    }

    public void setCar(char[] car) {
        this.car = car;
    }

    public char[] getCarC() {
        return carC;
    }

    public void setCarC(char[] carC) {
        this.carC = carC;
    }
    
    
    public String converti (String testo){
        
        char[] testo1 = testo.toCharArray();
        
        for(int i = 0; i < testo1.length; i++){
            for(int k = 0; k < car.length; k++){
                
                if(testo1[i] == car[k]){
                    testo1[i] = carC[k];
                }
        }
            
        }
        
        testo = testo1.toString();
        
        return testo;
    }
    
}
