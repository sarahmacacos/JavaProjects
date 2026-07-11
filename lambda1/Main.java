package lambda1;
interface OperacaoMatematica {
    int calcular(int a, int b);
}
public class Main {
    public static void main(String[] args) {
        OperacaoMatematica somar = new OperacaoMatematica() {
            @Override
            public int calcular(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Sem função lambda: "+somar.calcular(5, 3));
        /*---------------------------------------------*/
        //FL: função lambda - reduz a escrita de código
        OperacaoMatematica somarFL = (a, b) -> a + b;
        System.out.println("Com função lambda: "+somarFL.calcular(5,  3));
        OperacaoMatematica multiplicarFL = (a, b) -> a * b;
        System.out.println("Com função lambda: "+multiplicarFL.calcular(5,  3));


    }
}
