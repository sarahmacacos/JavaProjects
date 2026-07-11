package lambda1;

public class Main2 {
    public static void main(String[] args) {

        int[] v = {1, 2, 3, 4, 5};
        try {
            int x = v[5];
            System.out.println(x);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Acesso ao vetor finalizado.");
        }
    }
}
