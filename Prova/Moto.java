package Prova;

public class Moto extends VeiculoMotorizado {
    private int cilindradas;

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
        return super.toString() + ", Cilindradas: " + cilindradas + ", Ano: " + ano;
    }
}
