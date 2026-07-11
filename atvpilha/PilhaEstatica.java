package atvpilha;

public class PilhaEstatica {

    int topo;
    int vetor[];

    public void inicializar(int tamanho) {
        vetor = new int[tamanho];
        topo = -1;
    }
    // verifica se está vazia
    public boolean vazia() {
        if (topo == -1) {
            return true;
        }
        return false;
    }
    // verifica se está cheia
    public boolean cheia() {
        if (topo == vetor.length - 1) {
            return true;
        }
        return false;
    }
    // empilhar
    public void push(int valor) {
        if (cheia()) {
            System.out.println("Pilha cheia!");
        } else {
            topo = topo + 1;
            vetor[topo] = valor;
        }
    }
    // desempilhar
    public int pop() {
        if (vazia()) {
            System.out.println("Pilha vazia!");
            return -1;
        } else {
            int valor = vetor[topo];
            topo = topo - 1;
            return valor;
        }
    }
    // ver topo
    public int topo() {
        if (vazia()) {
            System.out.println("Pilha vazia!");
            return -1;
        }
        return vetor[topo];
    }
    // mostrar
    public void mostrar() {
        for (int i = topo; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }
}
