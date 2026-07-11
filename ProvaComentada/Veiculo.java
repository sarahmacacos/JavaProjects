package ProvaComentada;

public abstract class Veiculo implements Identificavel, Locavel {

    protected String placa; // todos têm placa
    protected String modelo; // todos têm modelo
    protected double valorDiaria; // valor de aluguel por dia
    protected boolean locado; // se está ou não alugado

    public Veiculo(String placa, String modelo, double valorDiaria, boolean locado) {
        this.placa = placa;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
        this.locado = locado;
    }

    public String getPlaca() { return placa; }
    public String getModelo() { return modelo; }
    public double getValorDiaria() { return valorDiaria; }
    public boolean isLocado() { return locado; }

    // reajusta o valor da diária
    public void reajustarDiaria(double percentual) throws IllegalArgumentException {
        if (percentual <= 0)
            throw new IllegalArgumentException("Percentual deve ser maior que zero.");

        valorDiaria += valorDiaria * (percentual / 100);
    }

    // tentar alugar algo já alugado dá erro
    public void alugar() {
        if (locado)
            throw new IllegalStateException("Veículo já está locado.");
        locado = true;
    }

    // tentar devolver algo que não está locado dá erro
    public void devolver() {
        if (!locado)
            throw new IllegalStateException("Veículo não estava locado.");
        locado = false;
    }

    public double calcularValorAluguel(int dias) {
        if (dias <= 0)
            throw new IllegalArgumentException("Dias deve ser maior que zero.");
        return dias * valorDiaria;
    }

    // cada classe filha (Carro, Moto, Caminhao) vai retornar seu tipo aqui
    public abstract String getTipo();

    // formato padrão de texto para exibir o veículo
    @Override
    public String toString() {
        return String.format("[%s] Placa: %s | Modelo: %s | Diária: %.2f | Locado: %s",
                getTipo(), placa, modelo, valorDiaria, locado ? "Sim" : "Não");
    }
}
