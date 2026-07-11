package produto;

public class produto {
    private String nome;
    private double preco;
    private int quantidade;

    public produto(String nome, double preco, int quantidade) {
        this.nome = nome;          // use this.
        this.preco = preco;        // use this.
        this.quantidade = quantidade; // use this.
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getQuantidade() { return quantidade; }
    public double valorTotal() { return preco * quantidade; }
}
