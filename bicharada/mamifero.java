package bicharada;

public class mamifero extends animal {
    private String tipoPelagem;

    public mamifero(String nome, int idade, String tipoPelagem) {
        super(nome, idade);
        this.tipoPelagem = tipoPelagem;
    }
    public mamifero(String nome, String tipoPelagem) {
        super(nome);
        this.tipoPelagem = tipoPelagem;
    }
    public String getTipoPelagem() {
        return tipoPelagem;
    }
    public void setTipoPelagem(String tipoPelagem) {
        this.tipoPelagem = tipoPelagem;
    }
    @Override
    public void falar() {
        System.out.println(getNome() + " diz: Som de mamífero");
    }
    @Override
    public String toString() {
        return "Mamífero -> " + infoBasica() + " // Pelagem: " + tipoPelagem;
    }
}
