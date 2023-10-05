package Ejercicio2_4;

public class Main {
    public static void main(String[] args) {
Circulo cir1 = new Circulo(2);
Rectangulo rec1= new Rectangulo(1,2);
Cuadrado cua1= new Cuadrado(3);
TrianguloRectangulo tiran1 = new TrianguloRectangulo(3,5);
Rombo rom1 = new Rombo(2,2);
Trapecio tra1 = new Trapecio(4,8,3);

        System.out.println("El area del circulo es: "+ cir1.calcuArea());
        System.out.println("El perimetro del circulo es: "+ cir1.calcularPerimetro());
        System.out.println();

        System.out.println("El area del rectangulo es: "+rec1.calcularArea());
        System.out.println("El perimetro del rectangulo es: "+rec1.calcularPeri());
        System.out.println();

        System.out.println("El area del cuadrado es: "+ cua1.calcularArea());
        System.out.println("El perimetro del cuadrado es: "+ cua1.calcularPeri());
        System.out.println();

        System.out.println("El area del triangulo es: "+tiran1.calcularArea());
        System.out.println("El perimetro del triangulo es: "+ tiran1.calcularPeri());
        tiran1.derminarTipoTrian();

        System.out.println("El area del rombo es: "+ rom1.calcularArea());
        System.out.println("El perimetro del rombo es: " + rom1.calcularPeri() );
        System.out.println();

        System.out.println("El area del trapecio es: "+tra1.calcularArea());
        System.out.println("El perimetro del trapecio es:"+tra1.calcularPeri());
        System.out.println();
    }

}
