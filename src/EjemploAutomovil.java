public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil();

        subaru.fabricante = "Subaru";
        subaru.modelo = "2012";
        subaru.cilindrada = 2.0;

        Automovil mazda = new Automovil();

        mazda.fabricante = "Mazda";
        mazda.modelo = "2021";
        mazda.cilindrada = 3.0;
        mazda.color =  "blue";

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
    }
}
