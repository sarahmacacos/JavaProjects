package pilha;

class PilhaEstatica {
    int topo;
    int capacidade;
    int[] dados;

    // Inicializar
    void inicializar(int tamanho) {
        topo = -1;
        capacidade = tamanho;
        dados = new int[tamanho];
    }

    // Verificar se vazia
    boolean isEmpty() {
        return topo == -1;
    }

    // Verificar se cheia
    boolean isFull() {
        return topo == capacidade - 1;
    }

    // Empilhar
    boolean push(int valor) {
        if (isFull()) {
            System.out.println("Erro: Pilha cheia!");
            return false;
        }

        topo++;
        dados[topo] = valor;
        return true;
    }

    // Desempilhar
    int pop() {
        if (isEmpty()) {
            System.out.println("Erro: Pilha vazia!");
            return -1;
        }

        int valor = dados[topo];
        topo--;
        return valor;
    }

    // Ver topo
    int top() {
        if (isEmpty()) {
            System.out.println("Erro: Pilha vazia!");
            return -1;
        }

        return dados[topo];
    }

    // Mostrar pilha
    void print() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
            return;
        }

        System.out.println("Pilha (topo → base):");
        for (int i = topo; i >= 0; i--) {
            System.out.println(dados[i]);
        }
    }
}