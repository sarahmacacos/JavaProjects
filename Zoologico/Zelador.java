package Zoologico;

public class Zelador {
    private String a;               // nome
    private String e;               // cpf

    public Zelador(String a, String e) {
        this.a = a;
        this.e = e;
    }

    public String getA() { return a; }   // nome
    public String getE() { return e; }   // cpf

    @Override
    public String toString() {
        return "Zelador{nome='" + a + "', cpf='" + e + "'}";
    }
}
