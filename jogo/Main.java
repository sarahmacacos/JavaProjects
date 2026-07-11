package jogo;


public class Main {
    public static void main(String[] args) {
        Personagem guerreiro = new Guerreiro("Zed", 10);
        Personagem mago = new Mago("Vladimir", 12);


        System.out.println("=== STATUS DOS PERSONAGENS ===");
        guerreiro.exibirStatus();
        guerreiro.atacar();

        System.out.println();
        mago.exibirStatus();
        mago.atacar();
    }
}
