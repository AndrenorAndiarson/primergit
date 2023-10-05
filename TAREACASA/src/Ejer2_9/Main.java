package Ejer2_9;

public class Main {
    public static void main(String[] args) {
        //Convierte en metros a cm, pl,
        ConversorMetros conver= new ConversorMetros(3.5);
        System.out.println("Metros= "+conver.metros+" m");
        System.out.println("Metros a cm= "+conver.convertirMetrosToCentimetros()+" cm");
        System.out.println("Metros a milimetros: "+ conver.convertirMetrosToMilimetros()+" mm");
        System.out.println("Metros a pulgadas: "+ conver.convertirMetrosToPulgadas()+" in");
        System.out.println("Metros a pies: "+conver.convertirMetrosToPies()+" ft");
        System.out.println("Metros a yardas: "+conver.convertirMetrosToYardas()+" yd");

        System.out.println();
        //Convierte en area
        ConversorArea area1= new ConversorArea(22.5);
        System.out.println("Metros cuadrados= "+area1.metroscua+" m2");
        System.out.println("Metros cuadrados a area= "+area1.convertirMetroscuaArea()+" a");
        System.out.println("Metrso cuadrados a hectarea= "+area1.convertirMetroscuaHectarea()+" h");
        System.out.println("Metros cuadrados a Kilometros cuadrados= "+area1.convertirMetroscuaKilometros()+" km2");
        System.out.println("Metros cuadrados a fanegas= "+area1.convertirMetroscuaFanega()+" fanega");
        System.out.println("Metros cuadrados a acres= "+area1.convertirMetroscuaAcre()+" acre");
        System.out.println();

        //Volumen
        ConversorVolumen vol1= new ConversorVolumen(20);
        System.out.println("Litros: "+vol1.litros+" l");
        System.out.println("Litros a galones= "+vol1.conversorLitrosGalon()+" gal");
        System.out.println("Litros a pintas= "+vol1.conversorLitrosPintas()+" pintas");
        System.out.println("Litros a barriles= "+vol1.conversorLitrosBarriles()+" barriles");
        System.out.println("Litros a metros cubicos= "+vol1.conversorLitrosMts3()+" mts3");
        System.out.println("Litros a hectolitros= "+ vol1.conversorLitrosHectolitros()+" hectolitros");
    }
}
