package tris;

public class TrisErratoTest2 {

    public static void main(String[] args) {
        
        Integer dimensione=3;
        String gX= "AX", gO= "BACaaaaaaaaaaaa";
        
        Tris tris = new Tris();
        
        TrisErrato t;
        
        try {


            t = new TrisErrato (dimensione, gX, gO);
            try{
            t.setDimensione(dimensione);
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
            try{
            t.setGiocatoreX(gX);
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
            try{
            t.setGiocatoreO(gO);
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
            t.gioca(0,0);
            t.gioca(0,1);
            t.gioca(1,1);
            t.gioca(1,2);
            System.out.print(t.gioca(2,2));
            System.out.print(t.info());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
  
    }
    
}

