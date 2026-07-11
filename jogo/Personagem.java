package jogo;

abstract class Personagem {
    protected String nome;
    protected int nivel;

    public Personagem(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }
    public abstract void atacar();

    public void exibirStatus() {
        System.out.println("Nome: " + nome + " // Nível: " + nivel);
    }
}
