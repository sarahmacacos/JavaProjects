package caixa;

public class Main {
    public static void main(String[] args) {

        Caixa<String> caixaTexto = new Caixa<>();
        Caixa<Integer> caixaNumero = new Caixa<>();

        System.out.println("Caixa-Texto vazia? " + caixaTexto.estaVazia());
        System.out.println("Caixa-Numero vazia? " + caixaNumero.estaVazia());

        caixaTexto.guardar("Sarah Macacos");
        caixaNumero.guardar(100);

        System.out.println("Agora, Caixa-Texto vazia? " + caixaTexto.estaVazia());
        System.out.println("Agora, Caixa-Numero vazia? " + caixaNumero.estaVazia());

        System.out.println("Texto: " + caixaTexto.obter());
        System.out.println("Número: " + caixaNumero.obter());
    }
}
