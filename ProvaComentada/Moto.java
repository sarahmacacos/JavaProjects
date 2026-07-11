package ProvaComentada;

public class Moto extends VeiculoMotorizado {

    private int cilindradas; // motos têm cilindradas

    public Moto(String placa, String modelo, double valorDiaria, boolean locado, int ano, int cilindradas) {
        super(placa, modelo, valorDiaria, locado, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public String getTipo() {
        return "Moto";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Cilindradas: %dcc | Ano: %d", cilindradas, ano);
    }
}
