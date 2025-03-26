package org.example;

public class PerecheNumere {
    private int nr1;
    private int nr2;

    public PerecheNumere(){}
    public PerecheNumere(int n1, int n2){
        this.nr1=n1;
        this.nr2=n2;
    }

    public int getNr1() {
        return nr1;
    }

    public void setNr1(int nr1) {
        this.nr1 = nr1;
    }

    public int getNr2() {
        return nr2;
    }

    public void setNr2(int nr2) {
        this.nr2 = nr2;
    }

    public boolean suntConsecutiveFibonacci(int a, int b){
        int n1=0, n2=1;
        while(n2<b){
            int temp=n2;
            n2=n1+n2;
            n1=temp;

            if((n1==a && n2==b) || (n1==b && n2==a)){
                return true;
            }
        }
        return false;
    }

    public int cmmmc(int a, int b){
        int max;
        if(a>b){
            max=a;
        }
        else{
            max=b;
        }
        while(true){
            if(max%a==0 && max%b==0){
                return max;
            }
            max++;
        }
    }

    public boolean verificaSumaEgala(int a, int b){
        int cifra;
        int sumaA=0, sumaB=0;
        while(a!=0){
            cifra=a%10;
            a=a/10;
            sumaA=sumaA+cifra;
        }
        while(b!=0){
            cifra=b%10;
            b=b/10;
            sumaB=sumaB+cifra;
        }

        if(sumaA==sumaB){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "PerecheNumere{" +
                "nr1=" + nr1 +
                ", nr2=" + nr2 +
                '}';
    }
}
