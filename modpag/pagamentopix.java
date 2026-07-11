package modpag;

public class pagamentopix implements pagamento {
    @Override
    public void pagar(double valor) {
        if (valor <= 0) throw new IllegalArgumentException("Valor deve ser maior que zero.");
        System.out.println(recibo(valor));
    }
}
