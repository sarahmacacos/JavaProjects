package Prova;
import java.util.ArrayList;
import java.util.List;

public class Frota<T extends Veiculo> {
    private List<T> veiculos = new ArrayList<>();
    public void adicionar(T veiculo) {
        veiculos.add(veiculo);
    }
    public List<T> getVeiculos() {
        return veiculos;
    }
    public void exibirTodos() {
        veiculos.forEach(v -> System.out.println(v));
    }
    public T buscarMaisCaro() {
        if (veiculos.isEmpty())
            return null;

        T maisCaro = veiculos.get(0);

        for (T v : veiculos) {
            if (v.getValorDiaria() > maisCaro.getValorDiaria()) {
                maisCaro = v;
            }
        }
        return maisCaro;
    }
    public T buscarMaisBarato() {
        if (veiculos.isEmpty())
            return null;

        T maisBarato = veiculos.get(0);

        for (T v : veiculos) {
            if (v.getValorDiaria() < maisBarato.getValorDiaria()) {
                maisBarato = v;
            }
        }
        return maisBarato;
    }
}
