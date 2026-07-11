package implementacao;

import java.util.*;

public class GerenciarVetor {
    Integer vetor[] = new Integer[5];

    // mantém o método de entrada por teclado sem fechar System.in
    public void preencherVetor() {
        preencherVetor(new Scanner(System.in));
    }

    // sobrecarga que aceita Scanner externo (evita fechar System.in)
    public void preencherVetor(Scanner scanner) {
        for (int i = 0; i < this.vetor.length; i++) {
            System.out.print("vetorr.Vetor[" + i + "] = ");
            this.vetor[i] = scanner.nextInt();
        }
    }

    // preencher com valores aleatórios no intervalo [min, max]
    public void preencherAleatorio(int min, int max) {
        Random rnd = new Random();
        for (int i = 0; i < this.vetor.length; i++) {
            this.vetor[i] = rnd.nextInt(max - min + 1) + min;
        }
    }

    // ordena em ordem crescente (bubble sort existente)
    public void ordenarCrescente() {
        int aux;
        boolean trocas;
        for (int j = 1; j < this.vetor.length; j++) {
            trocas = false;
            for (int i = 0; i < this.vetor.length - j; i++) {
                if (this.vetor[i] != null && this.vetor[i + 1] != null &&
                        this.vetor[i] > this.vetor[i + 1]) {
                    aux = this.vetor[i];
                    this.vetor[i] = this.vetor[i + 1];
                    this.vetor[i + 1] = aux;
                    trocas = true;
                }
            }
            if (!trocas) {
                break;
            }
        }
    }

    // ordena em ordem decrescente reutilizando ordenarCrescente e invertendo
    public void ordenarDecrescente() {
        ordenarCrescente();
        for (int i = 0, j = this.vetor.length - 1; i < j; i++, j--) {
            Integer tmp = this.vetor[i];
            this.vetor[i] = this.vetor[j];
            this.vetor[j] = tmp;
        }
    }

    // busca linear, retorna índice ou -1
    public int buscarLinear(int valor) {
        for (int i = 0; i < this.vetor.length; i++) {
            if (this.vetor[i] != null && this.vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    // calcula média ignorando nulls
    public double calcularMedia() {
        int soma = 0;
        int cont = 0;
        for (Integer v : this.vetor) {
            if (v != null) {
                soma += v;
                cont++;
            }
        }
        return cont == 0 ? 0.0 : (double) soma / cont;
    }

    public Integer obterMinimo() {
        Integer min = null;
        for (Integer v : this.vetor) {
            if (v != null && (min == null || v < min)) {
                min = v;
            }
        }
        return min;
    }

    public Integer obterMaximo() {
        Integer max = null;
        for (Integer v : this.vetor) {
            if (v != null && (max == null || v > max)) {
                max = v;
            }
        }
        return max;
    }

    // remove duplicatas mantendo ordem; preenche o resto com null
    public void removerDuplicatas() {
        Set<Integer> seen = new LinkedHashSet<>();
        List<Integer> uniques = new ArrayList<>();
        for (Integer v : this.vetor) {
            if (v != null && seen.add(v)) {
                uniques.add(v);
            }
        }
        for (int i = 0; i < this.vetor.length; i++) {
            this.vetor[i] = i < uniques.size() ? uniques.get(i) : null;
        }
    }

    public void limparVetor() {
        Arrays.fill(this.vetor, null);
    }

    // exibe cada elemento em sua linha
    public void exibirVetor() {
        System.out.println("Exibindo vetores.vetor:");
        for (int i = 0; i < this.vetor.length; i++) {
            System.out.println("vetorr.Vetor[" + i + "] = " + this.vetor[i]);
        }
    }

    // exibe em uma única linha
    public void exibirVetorInline() {
        System.out.print("vetorr.Vetor = [");
        for (int i = 0; i < this.vetor.length; i++) {
            System.out.print(this.vetor[i] + (i < this.vetor.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}