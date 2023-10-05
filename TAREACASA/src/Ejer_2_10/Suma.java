package Ejer_2_10;

public class Suma {
    int sument1,sument2;
    double sumdou1,sumdou2,sumdou3,total;

    public Suma() {

    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getSument1() {
        return sument1;
    }

    public void setSument1(int sument1) {
        this.sument1 = sument1;
    }

    public int getSument2() {
        return sument2;
    }

    public void setSument2(int sument2) {
        this.sument2 = sument2;
    }

    public double getSumdou1() {
        return sumdou1;
    }

    public void setSumdou1(double sumdou1) {
        this.sumdou1 = sumdou1;
    }

    public double getSumdou2() {
        return sumdou2;
    }

    public void setSumdou2(double sumdou2) {
        this.sumdou2 = sumdou2;
    }

    public double getSumdou3() {
        return sumdou3;
    }

    public void setSumdou3(double sumdou3) {
        this.sumdou3 = sumdou3;
    }

    public Suma(int sument1, int sument2, double sumdou1, double sumdou2, double sumdou3,double total) {
        this.sument1 = sument1;
        this.sument2 = sument2;
        this.sumdou1 = sumdou1;
        this.sumdou2 = sumdou2;
        this.sumdou3 = sumdou3;
    this.total= total;
    }

    public void calcularSuma(int sument1,int sument2){
    total=sument1+sument2;
        System.out.println("La suma de los enteros es: "+ total);
    }
    public void calcularSuma(double sumdou1,double sumdou2){
        total=sumdou1+sumdou2;
        System.out.println("La suma de los dos valores es: "+total);
    }
    public void calcularSuma(double sumdou1,double sumdou2, double sumdou3){
        total=sumdou1+sumdou2+sumdou3;
        System.out.println("La suma de los tres valores es: "+total);
    }
}
