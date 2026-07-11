package caixa;

public class Caixa<T> {
    private T item;

    public void guardar(T item) {
        this.item = item;
    }
    public T obter() {
        return item;
    }
    public boolean estaVazia() {
        return item == null;
    }
}
