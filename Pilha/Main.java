//Trabalho de Bryan Strey, Victor Luis

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.insere(10);
        pilha.insere(20);
        pilha.insere(30);

        System.out.println("Topo da pilha: " + pilha.topo());

        pilha.remover();
        pilha.remover();

        System.out.println("Topo da pilha: " + pilha.topo());

        System.out.println("Pilha está vazia? " + pilha.estaVazia());

        pilha.remover();
        System.out.println("Pilha está vazia? " + pilha.estaVazia());
    }
}
