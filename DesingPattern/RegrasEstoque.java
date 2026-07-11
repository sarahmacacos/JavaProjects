package DesingPatern;

public interface RegrasEstoque {

    void adicionarProduto(String produto, int quantidade);

    void retirarProduto(String id, int quantidade);

    void buscarPorNomeDeProduto(String produto);

    double TotalEstoque();

    boolean verificarDisponibilidade(String id,int quantidade);
}