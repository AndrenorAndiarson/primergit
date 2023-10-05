package Ejer_2_10;

import java.util.*;


public class Pedido {
    public void calcularPedido(String primerPlato, double costoPrimerPLato, String bebida, double costoBebida) {
        double total = costoPrimerPLato + costoBebida;
        System.out.println("El costo de " + primerPlato + " y " + bebida + " es: " + total + " Bs.");
    }

    public void calcularPedido(String primerPlato, double costoPrimerPLato, String segundoPlato, double costoSegundoPlato, String bebida, double costoBebida){
        double total = costoPrimerPLato + costoSegundoPlato + costoBebida;
        System.out.println("El costo de " + primerPlato + " + " + segundoPlato + " y " + bebida + " es: " + total + " Bs.");
    }

    public void calcularPedido(String primerPlato, double costoPrimerPlato, String segundoPlato, double costoSegundoPlato, String bebida, double costoBebida) {

        double total = costoPrimerPlato + costoSegundoPlato + costoBebida;
        System.out.println("El costo de " + primerPlato + " + " + segundoPlato + " y " + bebida + " es: " + total + " Bs.");
    }


}
