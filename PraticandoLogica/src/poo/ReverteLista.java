public class ReverteLista {
    public static Node reverterLista(Node cabeca){
        Node anterior = null;
        Node atual = cabeca;

        while (atual != null){
            Node  proximo = atual.proximo;
            atual.proximo = anterior;
            anterior = atual;
            atual = proximo;

        }
        return anterior;

        
    }

    public static void imprimirLista(Node cabeca){
        while (cabeca != null){
            System.out.println(cabeca.valor + "->");
            cabeca = cabeca.proximo;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        Node cabeca = new Node(1);
        cabeca.proximo = new Node(2);
        cabeca.proximo.proximo= new Node(3);
        cabeca.proximo.proximo.proximo = new Node(4);

        System.out.println("Lista original: ");
        imprimirLista(cabeca);

        Node novaCabeca = reverterLista(cabeca);

        System.out.println("Lista revertida: ");
        imprimirLista(novaCabeca);

    }
}
