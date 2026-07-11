package DesingPatern;


class Compra {
    private Pagamento estrategia;

    public void setEstrategia(Pagamento estrategia) {
        this.estrategia = estrategia;
    }

    public void finalizar(double valor) {
        estrategia.pagar(valor);
    }
}