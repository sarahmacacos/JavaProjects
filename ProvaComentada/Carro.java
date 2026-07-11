package ProvaComentada;

public class Carro extends VeiculoMotorizado {

    private int quantidadePortas; // carros têm portas

    public Carro(String placa, String modelo, double valorDiaria, boolean locado, int ano, int portas) {
        super(placa, modelo, valorDiaria, locado, ano);
        this.quantidadePortas = portas;
    }

    @Override
    public String getTipo() {
        return "Carro";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Portas: %d | Ano: %d", quantidadePortas, ano);
    }
}
