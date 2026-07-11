package DesingPatern;

class Cartao implements Pagamento {
    public void pagar(double valor) {
        System.out.println("Pagando com cartão: " + valor);
    }
}