package conta;

public class conta {
    private String numero;
    private String titular;
    private double saldo;

    public conta(String numero, String titular, double saldoInicial) {
        if (numero == null || numero.isBlank()) {
            throw new IllegalArgumentException("Número da conta inválido");
        }
        if (titular == null || titular.isBlank()) {
            throw new IllegalArgumentException("Titular inválido");
        }
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("Saldo inicial não pode ser negativo");
        }
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    public String getNumero() {
        return numero;
    }
    public String getTitular() {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Depósito inválido. O valor tem que ser positivo.");
            return;
        }
        saldo += valor;
    }
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Saque inválido. Valor deve ser positivo.");
            return;
        }
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para o saque.");
            return;
        }
        saldo -= valor;
    }
    @Override
    public String toString() {
        return "Conta " + numero + " - Titular: " + titular + " - Saldo: R$ " + saldo;
    }
}
