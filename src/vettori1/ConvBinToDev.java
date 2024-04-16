package vettori1;

public class ConvBinToDev {
    private int bin[];
    private int l;
    private int ind = 0;

    public ConvBinToDev() {
    }

    public ConvBinToDev(int l) {
        bin = new int[l];
    }

    public int[] getBin() {
        return bin;
    }

    public boolean setBin(int[] bit) {
        boolean val = true;
        for(int i = 0; i < bin.length; i++){
            if(isValido(bit[i]) == false){
                val = false;
            }
        }
        if(val == true){
            for(int k = 0; k < bin.length;k++){
                this.bin[k] = bit[k]; 
            }
        }
        return val;
    }

    public int getL() {
        return l;
    }
    
    public boolean riempiBit(int bit){
        boolean vuoto = true;
        if(isValido(bit)){
            bin[ind] = bit;
            ind ++;
            if(ind >= bin.length){
                vuoto = false;
            }
        } else {
            vuoto = false;
        }
        return vuoto;
    }
    
    public boolean isValido(int bit){
        boolean valido = false;
        if(bit == 0 || bit == 1){
            valido = true;
        }
        return valido;
    }
    
    public int binDec(){
        int decimale = 0;
        int a = bin.length - 1;
        for(int i = 0; i < bin.length; i++){
            if(bin[i] == 1){
                decimale += Math.pow(2, a);
            }
            a--;
        }
        return decimale;
    }
}
