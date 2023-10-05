package Ejer2_9;

public class ConversorMetros {
    double metros;
    final int FACTOR_METROS_CM=100;
    final int FACTOR_METROS_MILIM=1000;
    final double FACTOR_METROS_PULGADAS=39.37;
    final double FACTOR_METROS_PIES=3.28;
    final double FACTOR_METROS_YARDAS=1.09361;

    //CONSTRUCTORES
    public ConversorMetros(double metros){
        this.metros=metros;
    }
    public double convertirMetrosToCentimetros(){
        double centimetros;
        centimetros=FACTOR_METROS_CM*metros;
        return centimetros;
        }
    public double convertirMetrosToMilimetros(){
        double milimetros;
        milimetros=FACTOR_METROS_MILIM*metros;
        return milimetros;
    }
    public double convertirMetrosToPulgadas(){
        double pulgadas;
        pulgadas=FACTOR_METROS_PULGADAS*metros;
        return pulgadas;
    }

    public double convertirMetrosToPies(){
        double pies;
        pies=FACTOR_METROS_PIES*metros;
        return pies;
    }
    public double convertirMetrosToYardas(){
        double yardas;
        yardas=FACTOR_METROS_YARDAS*metros;
        return yardas;
        }

}

