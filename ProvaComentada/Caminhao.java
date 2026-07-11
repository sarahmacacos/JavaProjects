package ProvaComentada;

public class Caminhao extends VeiculoMotorizado {

    private double capacidadeToneladas; // caminhão tem capacidade em toneladas

    public Caminhao(String placa, String modelo, double valorDiaria, boolean locado, int ano, double capacidadeToneladas) {
        super(placa, modelo, valorDiaria, locado, ano);
        this.capacidadeToneladas = capacidadeToneladas;
    }

    @Override
    public String getTipo() {
        return "Caminhão";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Capacidade: %.1f ton | Ano: %d", capacidadeToneladas, ano);
    }
}
