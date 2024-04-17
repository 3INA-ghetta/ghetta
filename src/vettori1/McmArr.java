
package vettori1;


public class McmArr {
    
    private String num;

    public McmArr(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
    
    public int calMCM(){
        int MCM = 0;
        for(int i = 1; i > 0; i++){
            if((n1*i) % n2 == 0 && (n1*i) % n2 == 0 ){
                MCM = n1*i;
                break;
            }
        }
        return MCM;
    }
    
}
