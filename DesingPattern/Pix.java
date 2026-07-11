package DesingPatern;

class Pix implements Pagamento {
    public void pagar(double valor) {
        System.out.println("Pagando com Pix: " + valor);
    }
}