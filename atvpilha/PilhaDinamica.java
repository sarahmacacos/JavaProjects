package atvpilha;

public class PilhaDinamica {
    No topo;
    public void inicializar() {
        topo = null;
    }
    public boolean vazia() {
        if (topo == null) {
            return true;
        }
        return false;
    }
    public void push(int valor) {
        No novo = new No();
        novo.valor = valor;
        novo.prox = topo;
        topo = novo;
    }
    public int pop() {
        if (vazia()) {
            System.out.println("Pilha vazia!");
            return -1;
        } else {
            int valor = topo.valor;
            topo = topo.prox;
            return valor;
        }
    }
    public int topo() {
        if (vazia()) {
            System.out.println("Pilha vazia!");
            return -1;
        }
        return topo.valor;
    }
    public void mostrar() {
        No aux = topo;
        while (aux != null) {
            System.out.println(aux.valor);
            aux = aux.prox;
        }
    }
}
