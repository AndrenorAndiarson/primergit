package Ejercicio2_4;

public class Circulo {

int radio;
//const


    public Circulo(int radio) {
        this.radio = radio;
    }
    double calcuArea (){
        return Math.PI*Math.pow(radio,2);
    }

    double calcularPerimetro (){
        return 2*Math.PI*radio;
    }
}
