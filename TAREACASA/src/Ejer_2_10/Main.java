package Ejer_2_10;

public class Main {
    public static void main(String[] args) {
        Pedido pedido1 =new Pedido();
        pedido1.calcularPedido("Sancocho",5000,"gaseosa",2000);
        Pedido pedido2 =new Pedido();
        pedido2.calcularPedido("cremaverdura",5000,"churrasco",6000,"gaseosa",2000);
   Pedido pedido3 = new Pedido();
   pedido3.calcularPedido("crema espinacas",5000,"salmon",10000,"Tiramisu",5000,"Gaseosa",2000);

   Suma sum1 = new Suma();
   sum1.calcularSuma(115,52);
   Suma sum2 = new Suma();
   sum2.calcularSuma(10.5,52.5);
   Suma sum3 = new Suma();
   sum3.calcularSuma(52.5,78,785);
    }

}
