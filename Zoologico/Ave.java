package Zoologico;

public class Ave extends Animal {
    private String e;               // Bico

    public Ave(String a, int e, String i, Zelador u, String ee) {
        super(a, e, i, u);
        this.e = ee;
    }
    public String getE2() { return e; }
    public void setE2(String e) { this.e = e; }

    @Override
    public String toString() {
        return "sobrescrita de método | Ave{nome='" + getA() + "', idade=" + getE() +
                ", especie='" + getI() + "', tipoBico='" + e + "'}";
    }
    @Override
    public String s() {
        String z = (getU() != null ? getU().getA() : "nenhum");
        String c = (getU() != null ? getU().getE() : "sem CPF");
        return getI() + " - \n" +
                "Nome: " + getA() + ", \n" +
                "Idade: " + getE() + ", \n" +
                "Zelador: " + z + " \n" +
                "CPF: " + c + ", \n" +
                "Tipo de bico: " + e + "\n" +
                "Zoológico: " + nomeZoologico;
    }
}
