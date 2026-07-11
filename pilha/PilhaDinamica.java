package pilha;

class PilhaDinamica {
    No topo;

    // Inicializar
    void inicializar() {
        topo = null;
    }

    // Verificar vazia
    boolean isEmpty() {
        return topo == null;
    }

    // Empilhar
    void push(int valor) {
        No novo = new No();
        novo.valor = valor;

        novo.prox = topo;
        topo = novo;
    }

    // Desempilhar
    int pop() {
        if (isEmpty()) {
            System.out.println("Erro: Pilha vazia!");
            return -1;
        }

        int valor = topo.valor;
        topo = topo.prox;

        return valor;
    }

    // Ver topo
    int top() {
        if (isEmpty()) {
            System.out.println("Erro: Pilha vazia!");
            return -1;
        }

        return topo.valor;
    }

    // Mostrar pilha
    void print() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
            return;
        }

        System.out.println("Pilha (topo → base):");

        No atual = topo;
        while (atual != null) {
            System.out.println(atual.valor);
            atual = atual.prox;
        }
    }
}