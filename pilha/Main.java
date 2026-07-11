package pilha;

public class Main {
    public static void main(String[] args) {
        System.out.println("PILHA ESTÁTICA");
        PilhaEstatica p1 = new PilhaEstatica();
        p1.inicializar(5);

        p1.push(10);
        p1.push(20);
        p1.push(30);
        p1.print();

        System.out.println("Topo: " + p1.top());
        System.out.println("Removido: " + p1.pop());
        System.out.println();
        p1.print();

        System.out.println("\nPILHA DINÂMICA");

        PilhaDinamica p2 = new PilhaDinamica();
        p2.inicializar();

        p2.push(100);
        p2.push(200);
        p2.push(300);
        p2.print();

        System.out.println("Topo: " + p2.top());
        System.out.println("Removido: " + p2.pop());
        System.out.println();


        p2.print();
    }
}