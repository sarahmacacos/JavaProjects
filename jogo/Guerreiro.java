package jogo;

class Guerreiro extends Personagem {
    public Guerreiro(String nome, int nivel) {
        super(nome, nivel);
    }
    @Override
    public void atacar() {
        System.out.println("Golpe de espada!");
    }
}
