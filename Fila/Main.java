//Trabalho de Bryan Strey, Victor Luis

public class Main {
    public static void main(String[] args) {

        FilaEncadeada fila = new FilaEncadeada(); // Criando a fila

        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);

        System.out.println("Primeiro da fila: " + fila.primeiro());

        fila.desenfileirar();
        fila.desenfileirar();

        System.out.println("Primeiro da fila: " + fila.primeiro());

        System.out.println("Fila está vazia? " + fila.estaVazia());

        fila.desenfileirar();
        System.out.println("Fila está vazia? " + fila.estaVazia());
    }
}
