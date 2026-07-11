public class maain {
    public class ListaSimples implements ListaOperacoes{
        String[] lista;

        public ListaSimples(int tamanho) {
            this.lista = new String[tamanho];
        }
        public void exibirElementos() {
            for (int i = 0; i < this.lista.length; i++) {
                System.out.println("Lista[" + i + "] = " + this.lista[i]);
            }
        }
        public void adicionarElemento(String elemento) {
            if (!estaCheia()) {
                this.lista[encontrarPosicaoVazia()] = elemento;
                System.out.println("Elemento " + elemento + " adicionado com sucesso!");
            }
        }
        private boolean estaCheia() {
            for (int i = 0; i < this.lista.length; i++) {
                if (this.lista[i] == null) {
                    return false;
                }
            }
            System.out.println("A lista está cheia!");
            return true;
        }
        private boolean estaVazio() {
            for (int i = 0; i < this.lista.length; i++) {
                if (this.lista[i] != null) {
                    return false;
                }
            }
            System.out.println("A lista está vazia!");
            return true;
        }
        private int encontrarPosicaoVazia() {
            int i;
            for (i = 0; i < this.lista.length; i++) {
                if (this.lista[i] == null) {
                    return i;
                }
            }
            return i;
        }
        public void removerElemento(String elemento) {
            if (!estaVazio()) {
                if (this.buscarElemento(elemento) >= 0) {
                    this.lista[this.buscarElemento(elemento)] = null;
                    System.out.println("Elemento " + elemento + " removido com sucesso!");
                }
            }
        }
        public int buscarElemento(String elemento){
            int i;
            if (!estaVazio()) {
                for (i = 0; i < this.lista.length; i++) {
                    if (this.lista[i].equals(elemento)) {
                        return i;
                    }
                }
            }
            System.out.println("Elemento não encontrado na lista.");
            return -1;
        }
        public void alterarElemento(String elementoASerAlterado, String alteracao) {
            if(buscarElemento(elementoASerAlterado) >= 0) {
                this.lista[buscarElemento(elementoASerAlterado)] = alteracao;
                System.out.println("Elemento " + elementoASerAlterado + " alterado com sucesso para " + alteracao);
            }
        }
        public void quantidadeElementos() {
            int cont = 0;
            if(!estaVazio()) {
                for (int i = 0; i < this.lista.length; i++) {
                    if(this.lista[i] != null) {
                        cont++;
                    }
                }
            }
            System.out.println("A lista possui " + cont + " elementos!");
        }
        @Override
        public int removerTodas(String elemento) {
            int contador = 0;
            for (int i=0; i<this.lista.length; i++){
                if(this.lista[i].equals(elemento)){
                    this.lista[i] = null;
                    contador++;
                }
            }
            System.out.println(contador + " elementos foram removidos!");
            return contador;
        }
        @Override
        public int contar() {
            int contador = 0;
            for (String valor : this.lista){
                if(valor != null) contador++;
            }
            System.out.println("Foram encontrados "+contador+" elementos!");
            return contador;
        }
        @Override
        public int adicionarVarios(String[] elementos) {
            int contador = 0;
            while(!estaCheia() || contador==elementos.length){
                for (int i=0; i<this.lista.length; i++){
                    if (this.lista[i] == null){
                        this.lista[i] = elementos[contador];
                        contador++;
                    }
                }
            }
            System.out.println("Foram adicionados "+contador+" elementos!");
            return contador;
        }

        @Override
        public String obter(int indice) {
            if (indice>=0 && indice<this.lista.length) return this.lista[indice];
            else return null;
        }
        @Override
        public boolean inserir(int indice, String elemento) {
            return false;
        }
        @Override
        public String removerPorIndice(int indice) {
            return "";
        }
        @Override
        public void limpar() {
            for (int i=0; i<this.lista.length; i++){
                this.lista[i] = null;
            }
        }
        @Override
        public int ultimoIndiceDe(String elemento) {
            int ultimoIndice = -1;
            for (int i=0; i<this.lista.length; i++){
                if (this.lista[i] == elemento){
                    ultimoIndice = i;
                }
            }
            return ultimoIndice;
        }
        @Override
        public int contarOcorrencias(String elemento) {
            int contador = 0;
            for (int i=0; i<this.lista.length; i++){
                if (this.lista[i] == elemento){
                    contador++;
                }
            }
            return contador;
        }
        @Override
        public int substituir(String antigo, String novo) {
            return 0;
        }
    }
}
