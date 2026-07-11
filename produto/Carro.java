package produto;
import Prova.VeiculoMotorizado;

public class Carro extends VeiculoMotorizado {
    private int quantidadePortas;

    public Carro(String placa, String modelo, double valorDiaria, boolean locado, int ano, int quantidadePortas) {
        super(placa, modelo, valorDiaria, locado, ano);
        this.quantidadePortas = quantidadePortas;
    }
    @Override
    public String getTipo() {
        return "Carro";
    }
    @Override
    public String toString() {
        return super.toString() + ", Portas: " + quantidadePortas + ", Ano: " + ano;
    }
}
