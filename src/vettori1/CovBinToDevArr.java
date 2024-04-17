
package vettori1;
// usare string

public class CovBinToDevArr {
    private String num ="101";
    private String [] arr = new String [9999999];

    public CovBinToDevArr() {
    }
    
    public CovBinToDevArr(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }
    
    
    
    public int binDec(){
        String num1;
        int num2=0;
        int decimale = 0;
        int a = num.length() - 1;
        for(int i = 0; i < num.length(); i++){
            arr = num.split("1");
            if(arr[i].equals("1")){
                num2 = Integer.parseInt(arr[i]);
                num2 += Math.pow(2, a);
            }
            a--;
        }
        return num2;
    }   
}

