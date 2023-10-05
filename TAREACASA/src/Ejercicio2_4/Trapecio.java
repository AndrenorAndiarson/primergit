package Ejercicio2_4;

public class Trapecio {
double lado1,lado2,altura;

//construc


    public Trapecio(double lado1, double lado2, double altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;

    }
// metodos

    double calcularArea (){
        return ((lado1+lado2)*altura)/2;
    }
double calculardiagonal (){
        return ((lado2-lado1)/2) ;
}
double calcularhipotenusa (){
    return Math.sqrt(Math.pow(calculardiagonal(), 2) + Math.pow(altura, 2));
}
double calcularPeri(){
        return (calcularhipotenusa()*2)+lado1+lado2;
}
}
