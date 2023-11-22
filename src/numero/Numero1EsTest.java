package numero;

public class Numero1EsTest {

    public static void main(String[] args) {
        
        Numero1Es n = new Numero1Es (1);
        
        System.out.println("Dati in input:");
        System.out.println(n.info());
        
        System.out.println("Dati in output:");
        System.out.println(n.pariODispari());
        System.out.println(n.maggioreMinoreUgualeZero());
        System.out.println(n.maggioreMinoreUgualeZero1());
        System.out.println(n.maggioreMinoreUgualeZero2());
        

    }
    
}
