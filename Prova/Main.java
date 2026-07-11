package Prova;
import produto.Carro;

public class Main {
    public static void main(String[] args) {
        Frota<Veiculo> frota = new Frota<>();

        // info dos carros
        frota.adicionar(new Carro("AAA-1111", "Gol", 120, false, 2018, 4));
        frota.adicionar(new Carro("BBB-2222", "Onix", 150, true, 2020, 4));
        frota.adicionar(new Carro("CCC-3333", "Corolla", 220, false, 2019, 4));
        frota.adicionar(new Carro("DDD-4444", "HB20", 130, false, 2021, 4));
        frota.adicionar(new Carro("EEE-5555", "Civic", 230, true, 2022, 4));
        frota.adicionar(new Carro("FFF-6666", "Fiesta", 110, false, 2017, 4));
        frota.adicionar(new Carro("GGG-7777", "Sandero", 125, false, 2018, 4));
        frota.adicionar(new Carro("HHH-8888", "Argo", 140, true, 2021, 4));

        // motos
        frota.adicionar(new Moto("III-9999", "CG 160", 80, false, 2019, 160));
        frota.adicionar(new Moto("JJJ-0001", "Fazer 250", 100, true, 2020, 250));
        frota.adicionar(new Moto("KKK-0002", "XRE 300", 130, false, 2021, 300));

        frota.adicionar(new Caminhao("LLL-0003", "Cargo 2429", 400, false, 2018, 13));
        frota.adicionar(new Caminhao("MMM-0004", "Atego 2428", 420, true, 2019, 14));
        frota.adicionar(new Caminhao("NNN-0005", "VM 270", 450, false, 2020, 15));
        frota.adicionar(new Caminhao("OOO-0006", "Constellation 24.280", 470, false, 2021, 16));

        // carros
        try {
            System.out.println("=== Carros ===");
            frota.getVeiculos().stream()
                    .filter(v -> v instanceof Carro)
                    .forEach(v -> System.out.println(v));

            System.out.println("\nMais caro: " + frota.buscarMaisCaro());
            System.out.println("Mais Barato: " + frota.buscarMaisBarato());

            // todos
            System.out.println("\n=== Todos ===");
            frota.exibirTodos();

            // caminhões
            frota.getVeiculos().forEach(v -> {
                if (v instanceof Caminhao) {
                    v.reajustarDiaria(20);
                }
            });

            // caminhão depois do aumento
            System.out.println("\n=== Caminhões depois do aumento ===");
            frota.getVeiculos().stream()
                    .filter(v -> v instanceof Caminhao)
                    .forEach(v -> System.out.println(v));

            // não foram locados
            System.out.println("\n=== Não foram locados ===");
            frota.getVeiculos().stream()
                    .filter(v -> !v.isLocado())
                    .forEach(v -> System.out.println(v));

            // motos locadas
            System.out.println("\n=== Motos locadas ===");
            frota.getVeiculos().stream()
                    .filter(v -> v instanceof Moto && v.isLocado())
                    .forEach(v -> System.out.println(v));

            Veiculo teste = frota.getVeiculos().get(0);

            System.out.println("\n=== Testes ===");

            System.out.println("Valor do aluguel de 3 dias: " + teste.calcularValorAluguel(3));

            try {
                teste.alugar();
                teste.alugar();
            } catch (Exception e) {
                System.out.println("Erro ao alugar: " + e.getMessage());
            }

            try {
                teste.devolver();
                teste.devolver();
            } catch (Exception e) {
                System.out.println("Erro ao devolver: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
