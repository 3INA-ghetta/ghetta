package vettori1;

public class Mcm {
    private int n1, n2;

    public Mcm(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Mcm() {
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    
    public int calMCM(){
        int MCM = 0;
        for(int i = 1; i > 0; i++){
            if((n1*i) % n2 == 0){
                MCM = n1*i;
                break;
            }
        }
        return MCM;
    }
    
}
