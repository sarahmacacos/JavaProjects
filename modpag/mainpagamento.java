package modpag;

public class mainpagamento {
    public static void main(String[] args) {
        pagamento p1 = new pagamentocartao(0.029);
        p1.pagar(200.00);

        System.out.println("\n-----------------\n");

        pagamento p2 = new pagamentopix();
        p2.pagar(20000.000);
    }
}
