package bicharada;
public class animal {
    private String nome;
    private int idade;

    public animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public animal(String nome) {
        this.nome = nome;
        this.idade = 0;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if (idade >= 0)
            this.idade = idade;
    }
    public void falar() {
        System.out.println("O animal emite um som genérico.");
    }
    public void falar(String som) {
        System.out.println(nome + " diz: " + som);
    }
    protected String infoBasica() {
        return "Nome: " + nome + " // Idade: " + idade + " anos";
    }
    @Override
    public String toString() {
        return "Animal -> " + infoBasica();
    }
}
