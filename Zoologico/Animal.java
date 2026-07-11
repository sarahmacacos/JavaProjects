package Zoologico;

public class Animal {
    private String a;               // nome
    private int e;                  // idade
    private String i;               // especie
    protected static final String nomeZoologico = "Zoológico Macacada"; // nome do zoológico
    private Zelador u;              // Zelador

    public Animal(String a, int e, String i, Zelador u) {
        this.a = a;
        this.e = e;
        this.i = i;
        this.u = u;
    }

    public Animal(String a, String i, Zelador u) {
        this(a, 0, i, u);
    }

    public String getA() { return a; }
    public void setA(String a) { this.a = a; }
    public int getE() { return e; }
    public void setE(int e) { this.e = e; }
    public String getI() { return i; }
    public void setI(String i) { this.i = i; }
    public Zelador getU() { return u; }
    public void setU(Zelador u) { this.u = u; }

    @Override
    public String toString() {
        return "sobrescrita de método Animal{nome='" + a + "', idade=" + e +
                ", especie='" + i + "', zelador=" + (u != null ? u.getA() : "nenhum") + "}";
    }

    public String s() {
        String z = (u != null ? u.getA() : "nenhum");
        String c = (u != null ? u.getE() : "sem CPF");
        return getI() + " - \n" +
                "Nome: " + getA() + " \n" +
                "Idade: " + getE() + " \n" +
                "Zelador: " + z + " \n" +
                "CPF: " + c + "\n" +
                "Zoológico: " + nomeZoologico;
    }
}
