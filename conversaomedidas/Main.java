import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a medida em metros: ");
        double metros = scanner.nextDouble();

        double centimetros = metros * 100;
        double milimetros = metros * 1000;
        double quilometros = metros / 1000;

        System.out.println();
        System.out.println("Metros: " + metros + " m");
        System.out.println("Centímetros: " + centimetros + " cm");
        System.out.println("Milímetros: " + milimetros + " mm");
        System.out.println("Quilômetros: " + quilometros + " km");

    }
}