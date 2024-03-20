
package teoria;

public class Atleti {
    private int size;
    private String nomi [] = new String [size];
    private String cognomi [] = new String [size];
    private float altezze [] = new float [size];

    public Atleti() {
    }

    public Atleti(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String[] getNomi() {
        return nomi;
    }

    public void setNomi(String[] nomi) {
        this.nomi = nomi;
    }

    public String[] getCognomi() {
        return cognomi;
    }

    public void setCognomi(String[] cognomi) {
        this.cognomi = cognomi;
    }

    public float[] getAltezze() {
        return altezze;
    }

    public void setAltezze(float[] altezze) {
        this.altezze = altezze;
    }
    
    public boolean inserito (){
        boolean inserito = false;
        int ind = 0;
        if (ind > size){
            inserito = false;
        }else {
            inserito = true;
        }
        return inserito;
    }
    
    public String atleta() {
        float max = 0;
        int ind = 0;
        String testo = "";
        
        for (int i = 0; i <= nomi.length; i++){
            
            if ( altezze[i] > max){
                max = altezze[i];
                ind = i;                               
            }
            testo += "nome" + nomi[ind] + "cognome" + cognomi[ind] + "altezza"+
                    altezze[ind];
            
        }
        return testo;
    }
    
}
