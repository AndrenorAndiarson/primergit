package Ejercicio2_4;

public class Cuadrado {
    int lado;
// constructor
    public Cuadrado(int lado) {
        this.lado = lado;
    }
    //metodos
    double calcularArea (){
        return lado*lado;
    }
    double calcularPeri () {
        return (4*lado);
    }

}
