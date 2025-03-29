//Trabalho de Bryan Strey, Victor Luis

public class Pilha {
    private Node topo;

    public Pilha() {
        this.topo = null;
    }

    public void insere(int valor) {
        Node novoNo = new Node(valor);
        novoNo.proximo = topo;
        topo = novoNo;
        System.out.println("Valor inserido: " + valor);
    }

    public int remover() {
        if (topo == null) {
            System.out.println("Pilha vazia!");
            return -1;
        }
        int valorRemovido = topo.valor;
        topo = topo.proximo;
        System.out.println("Valor removido: " + valorRemovido);
        return valorRemovido;
    }

    public int topo() {
        if (topo == null) {
            System.out.println("Pilha vazia");
            return -1;
        }
        return topo.valor;
    }

    public boolean estaVazia() {
        return topo == null;
    }
}
