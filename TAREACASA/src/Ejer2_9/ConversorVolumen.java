package Ejer2_9;

public class ConversorVolumen {
    double litros;
    final double FACTOR_LITROS_GALON=4.41;
    final double FACTOR_LITROS_PINTAS=0.46;
    final double FACTOR_LITROS_BARRILES=158.99;
    final double FACTOR_LITROS_MTS3=1000;
    final double FCATOR_LITROS_HECTOLITROS=100;


    //CONST
      public ConversorVolumen(double i) {
          this.litros=i;
    }

    public void conversorlitros(double litros){this.litros=litros;}


    public double conversorLitrosGalon (){
        double galon;
        galon=FACTOR_LITROS_GALON*litros;
        return galon;
        }
    public double conversorLitrosPintas(){
        double pintas;
        pintas=FACTOR_LITROS_PINTAS*litros;
        return pintas;
    }
    public double conversorLitrosBarriles(){
        double barriles;
        barriles=FACTOR_LITROS_BARRILES*litros;
        return barriles;
    }
    public double conversorLitrosMts3(){
        double mts3;
        mts3=FACTOR_LITROS_MTS3*litros;
        return mts3;
    }
    public double conversorLitrosHectolitros(){
        double hecto;
        hecto=FCATOR_LITROS_HECTOLITROS*litros;
        return hecto;
    }

}
