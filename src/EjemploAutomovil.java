public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil();

        auto.fabricante = "ferrari";
        auto.modelo = "2012";
        auto.cilindrada = 2.0;

        Automovil mazda = new Automovil();

        mazda.fabricante = "Mazda";
        mazda.modelo = "2021";
        mazda.cilindrada = 3.0;
        mazda.color =  "blue";

        System.out.println("auto.fabricante = " + auto.fabricante);
        System.out.println("auto.modelo = " + auto.modelo);
        System.out.println("auto.color = " + auto.color);
        System.out.println("auto.cilindrada = " + auto.cilindrada);

        System.out.println("mazda.fabricante = " + mazda.fabricante);
        System.out.println("mazda.modelo = " + mazda.modelo);
        System.out.println("mazda.color = " + mazda.color);
        System.out.println("mazda.cilindrada = " + mazda.cilindrada);
    }
}
