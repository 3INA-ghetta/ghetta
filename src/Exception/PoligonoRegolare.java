/*
 * Scrivere una classe che, dato in ingresso il numero n dei lati di un poligono regolare 
 * (con n compreso tra 3 e 6) e la lunghezza l del lato del poligono maggiore di 0 (zero), 
 * stabilire di che tipo di poligono si tratta e calcolarne il perimetro.
 * N.B.: dimostrare di saper usare gli operatori logici; dimostrare di saper usare il 
 * costrutto condizionale alternativo all’if.
 */
package Exception;

public class PoligonoRegolare {
    private Integer n;
    private Float l;

    public PoligonoRegolare() {
    }

    public PoligonoRegolare(Integer n, Float l) throws Exception {
        setN(n);
        setL(l);
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) throws Exception {
        if(n >= 3 && n <= 6)
            this.n = n;
        else 
            throw new Exception("numero deve essere compreso fra tre e sei");
    }

    public Float getL() {
        return l;
    }

    public void setL(Float l) throws Exception {
        if(l > 0)
            this.l = l;
        else 
            throw new Exception ("la lunghezza deve essere maggiore di zero");
    }
            
    public String info() {
        String testo;
        
        testo = "n: " + n + "\n" +
                "l: " + l + "\n";
        
        return testo;
    }     
    
    /**
     * 
     * @return 
     */
    public String tipo() {
        String tipo = ""; //null
                      
            switch(n){ //dimostrare di saper usare il costrutto condizionale alternativo all’if
                case 3:
                    tipo = "triangolo";
                    break;
                case 4:
                    tipo = "quadrato";
                    break;
                case 5:
                    tipo = "pentagono";
                    break;
                case 6:
                    tipo = "esagono";
            }
        
        return tipo;
    }    
    
    /**
     * 
     * @return 
     */
    public float perimetro(){
        float p;
        
            p = l * n;
        
        return p;
    }    
}