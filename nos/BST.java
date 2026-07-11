package nos;

class BST {
    Node root;

    // insere valor na árvore
    void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null) return new Node(value);

        if (value < node.value)
            node.left  = insert(node.left,  value);
        else if (value > node.value)
            node.right = insert(node.right, value);
        // igual: ignora duplicata

        return node;
    }

    // remove valor da árvore
    void remove(int value) {
        root = remove(root, value);
    }

    private Node remove(Node node, int value) {
        // nó não existe
        if (node == null) return null;

        // desce até achar o nó
        if (value < node.value) {
            node.left = remove(node.left, value);
            return node;
        }
        if (value > node.value) {
            node.right = remove(node.right, value);
            return node;
        }

        // achou o nó — aplica os 4 casos:

        // caso 1: sem filhos (folha)
        if (node.left == null && node.right == null)
            return null;

        // caso 2: só filho à esquerda
        if (node.right == null)
            return node.left;

        // caso 3: só filho à direita
        if (node.left == null)
            return node.right;

        // caso 4: dois filhos
        // acha o menor da subárvore direita (sucessor)
        Node successor = node.right;
        while (successor.left != null)
            successor = successor.left;

        // copia valor do sucessor pro nó atual
        node.value = successor.value;

        // remove o sucessor da subárvore direita
        node.right = remove(node.right, successor.value);
        return node;
    }

    // percurso em ordem: esq → raiz → dir (sai ordenado)
    void inOrder(Node node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }
}