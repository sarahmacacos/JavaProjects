package produto;
public class main {
    public static void main(String[] args) {

        produto caneta = new produto("Lápis", 2.50, 1000);
        produto caderno = new produto("Caderno", 15.00, 500);

        System.out.println("Relatório dos Produtos:");
        System.out.println();

        System.out.println("Produto: " + caneta.getNome());
        System.out.println("Preço: R$ " + caneta.getPreco());
        System.out.println("Total em estoque: R$ " + caneta.valorTotal());
        System.out.println();
        System.out.println("Produto: " + caderno.getNome());
        System.out.println("Preço: R$ " + caderno.getPreco());
        System.out.println("Total em estoque: R$ " + caderno.valorTotal());
    }

}