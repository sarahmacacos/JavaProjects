package jogo;

class Mago extends Personagem {
    public Mago(String nome, int nivel) {
        super(nome, nivel);
    }

    @Override
    public void atacar() {
        System.out.println("Lança feitiço!");
    }
}