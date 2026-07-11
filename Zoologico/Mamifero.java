package Zoologico;

public class Mamifero extends Animal {
    private boolean a;              // pelo

    public Mamifero(String a, int e, String i, Zelador u, boolean aa) {
        super(a, e, i, u);
        this.a = aa;
    }

    public boolean isA() { return a; }
    public void setA(boolean a) { this.a = a; }

    @Override
    public String toString() {
        return "sobrescrita de método Mamifero{nome='" + getA() + "', idade=" + getE() +
                ", especie='" + getI() + "', possuiPelo=" + a + "}";
    }

    @Override
        public String s() {
            String z = (getU() != null ? getU().getA() : "nenhum");
            String c = (getU() != null ? getU().getE() : "sem CPF");
        return getI() + " \n" +
                "Nome: " + getA() + "\n" +
                "Idade: " + getE() + "\n" +
                "Zelador: " + z + "\n" +
                "CPF: " + c + "\n" +
                "Possui pelo? " + (a ? "Sim" : "Não") + "\n" +
                "Zoológico: " + nomeZoologico;


    }
}
