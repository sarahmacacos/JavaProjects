package DesingPatern;

import java.util.ArrayList;
import java.util.List;

public class CompraSite implements RegraFinanceiro {

    private double ultimoValorProcessado;
    private List<String> produtos = new ArrayList<>();
    private double valorTotal = 0;
    private String enderecoEntrega;

    // strategy de pagamento (define como o pagamento será feito: Pix, Cartão, etc)
    private Pagamento formaPagamento;

    // define forma de pagamento
    public void setFormaPagamento(Pagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    // adiciona produto ao carrinho
    public void adicionarProduto(String nome, double preco) {
        produtos.add(nome + " - R$ " + preco);
        valorTotal += preco;
        System.out.println("[SITE] Produto adicionado: " + nome + " (R$ " + preco + ")");
    }

    // define endereço de entrega
    public void setEnderecoEntrega(String endereco) {
        this.enderecoEntrega = endereco;
        System.out.println("[SITE] Endereço de entrega definido: " + endereco);
    }

    // finaliza a compra
    public void finalizarCompra() {
        System.out.println("\n[SITE] === Finalizando Compra ===");
        System.out.println("[SITE] Total de itens: " + produtos.size());
        System.out.println("[SITE] Valor total: R$ " + valorTotal);
        System.out.println("[SITE] Endereço: " + enderecoEntrega);
        System.out.println("[SITE] Compra finalizada com sucesso!\n");
    }

    @Override
    public void pagar(double valor) {

        if (formaPagamento == null) {
            System.out.println("[SITE] Forma de pagamento não definida");
            return;
        }

        this.ultimoValorProcessado = valor;

        System.out.println("[SITE] Processando pagamento online...");

        // strategy pagamento
        formaPagamento.pagar(valor);
    }

    @Override
    public double calcularDesconto(double valorBruto, double percentual) {
        return valorBruto * (percentual / 100);
    }

    @Override
    public double calcularValorTotal(double valorBruto, double desconto, double taxas) {
        return (valorBruto - desconto) + taxas;
    }

    @Override
    public void exibirResumoFinanceiro() {
        System.out.println("--- Relatório Web ---");
        System.out.println("Último valor: R$ " + ultimoValorProcessado);
        System.out.println("Status: Finalizada");
    }

    @Override
    public double calcularLucroLiquido() {
        double taxaGateway = ultimoValorProcessado * 0.05;
        double impostos = ultimoValorProcessado * 0.10;
        return ultimoValorProcessado - taxaGateway - impostos;
    }

    @Override
    public void realizarEstorno(String transacaoId, double valor) {
        System.out.println("[SITE] Estorno da transação: " + transacaoId);
        System.out.println("[SITE] Valor: R$ " + valor);
    }
}