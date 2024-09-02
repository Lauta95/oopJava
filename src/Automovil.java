public class Automovil {
    String fabricante;
    String modelo;
    String color = "red";
    double cilindrada;

    public String verDetalle(){
        return "auto.fabricante = " + this.fabricante +
        "\nauto.modelo = " + this.modelo +
        "\nauto.color = " + this.color +
        "\nauto.cilindrada = " + this.cilindrada;
    }

}                                                  
