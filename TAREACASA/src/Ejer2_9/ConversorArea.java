package Ejer2_9;

public class ConversorArea {

    double metroscua;
    final double FACTOR_MET_AREA=100;
    final double FACTOR_MET_HECTAREA=10000;
    final double FACTOR_MET_KILOMETROS=1000000;
    final double FACTOR_MET_FANEGA=6460;
    final double FACTOR_MET_ACRE=4046.85;

    public ConversorArea(double v) {
        this.metroscua = v;
    }

    //CONST
     public void conversorMetcua(double metroscua){
         this.metroscua=metroscua;
     }

     public double convertirMetroscuaArea(){
         double area;
         area=FACTOR_MET_AREA*metroscua;
         return area;
     }
    public double convertirMetroscuaHectarea(){
         double hectarea;
         hectarea=FACTOR_MET_HECTAREA*metroscua;
         return hectarea;
    }
    public double convertirMetroscuaKilometros(){
         double kilometros;
         kilometros=FACTOR_MET_KILOMETROS*metroscua;
         return kilometros;
    }
    public double convertirMetroscuaFanega(){
         double fanegas;
         fanegas=FACTOR_MET_FANEGA*metroscua;
         return fanegas;
    }
    public double convertirMetroscuaAcre(){
         double acre;
         acre=FACTOR_MET_ACRE*metroscua;
         return acre;
    }

}
