//Trabalho de Bryan Strey, Victor Luis

class FilaEncadeada {
    private Node primeiro;
    private Node ultimo;
    private int tamanho;

    public FilaEncadeada() {
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    public void enfileirar(int valor) {
        Node novoNo = new Node(valor); 
        if (ultimo != null) {
            ultimo.proximo = novoNo; 
        }
        ultimo = novoNo; 
        if (primeiro == null) {
            primeiro = novoNo; 
        }

        tamanho++;
        System.out.println("Valor " + valor + " inserido na fila.");
    }

    public void desenfileirar() {
        if (primeiro == null) {
            System.out.println("Fila vazia!");
            return;
        }

        System.out.println("Valor removido: " + primeiro.valor);
        primeiro = primeiro.proximo; 

        if (primeiro == null) {
            ultimo = null; 
        }

        tamanho--;
    }

    public int primeiro() {
        if (primeiro != null) {
            return primeiro.valor;
        }
        System.out.println("Fila vazia!");
        return -1;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }
}
