package atvpilha;

public class Main {
    public static void main(String[] args) {

        PilhaEstatica p1 = new PilhaEstatica();
        p1.inicializar(5);
        p1.push(10);
        p1.push(20);
        p1.push(30);

        System.out.println("Pilha Estática:");
        p1.mostrar();
        System.out.println();
        System.out.println("Topo: " + p1.topo());
        System.out.println("Removido: " + p1.pop());
        p1.mostrar();
        System.out.println();

        System.out.println("--------------------");

        PilhaDinamica p2 = new PilhaDinamica();
        p2.inicializar();
        p2.push(100);
        p2.push(200);
        p2.push(300);

        System.out.println("\nPilha Dinâmica:");
        p2.mostrar();
        System.out.println("Topo: " + p2.topo());
        System.out.println("Removido: " + p2.pop());
        p2.mostrar();
        System.out.println();

    }
}