package modpag;

public class pagamentocartao implements pagamento {
    private double taxa; // entre 0 e 1

    public pagamentocartao(double taxa) {
        if (taxa < 0 || taxa > 1) throw new IllegalArgumentException("Taxa inválida (0 a 1).");
        this.taxa = taxa;
    }

    @Override
    public void pagar(double valor) {
        if (valor <= 0) throw new IllegalArgumentException("Valor deve ser maior que zero.");
        System.out.println(recibo(valor));
    }

    @Override
    public double taxaAplicada() {
        return taxa;
    }
}
