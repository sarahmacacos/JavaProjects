package Prova;

public abstract class Veiculo implements Identificavel, Locavel {
    protected String placa;
    protected String modelo;
    protected double valorDiaria;
    protected boolean locado;

    public Veiculo(String placa, String modelo, double valorDiaria, boolean locado) {
        this.placa = placa;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
        this.locado = locado;
    }
    public String getPlaca() {
        return placa;
    }
    public String getModelo() {
        return modelo;
    }
    public double getValorDiaria() {
        return valorDiaria;
    }
    public boolean isLocado() {
        return locado;
    }
    public void reajustarDiaria(double percentual) {
        if (percentual <= 0) {
            throw new IllegalArgumentException("Percentual inválido");
        }
        valorDiaria = valorDiaria + (valorDiaria * percentual / 100);
    }
    @Override
    public void alugar() {
        if (locado) {
            throw new IllegalStateException("Já foi locado");
        }
        locado = true;
    }
    @Override
    public void devolver() {
        if (!locado) {
            throw new IllegalStateException("Não está locado");
        }
        locado = false;
    }
    @Override
    public double calcularValorAluguel(int dias) {
        if (dias <= 0) {
            throw new IllegalArgumentException("Dias errado");
        }
        return valorDiaria * dias;
    }
    public abstract String getTipo();

    @Override
    public String toString() {
        return getTipo() + " - Placa: " + placa + ", Modelo: " + modelo +
                ", Diária: " + valorDiaria + ", Locado: " + locado;
    }
}
