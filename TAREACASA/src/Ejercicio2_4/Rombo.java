package Ejercicio2_4;

public class Rombo {
    double diago;
    double diagonal;

    //constructor

    public Rombo(double diago, double diagonal) {
        this.diago = diago;
        this.diagonal = diagonal;
    }
    //metodos
    double calcularArea(){
        return (diago*diagonal)/2;
    }
double calcularPeri (){
        return (2*diago)+(2*diagonal);
}

}
