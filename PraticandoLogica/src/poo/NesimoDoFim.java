
public class NesimoDoFim{
    public static int encontrarNEmesimoDoFim(Node cabeca, int n){
        Node avancado = cabeca;
        Node atual = cabeca;


        for(int i = 0; i< n; i++){
            if(avancado == null){
                throw new IllegalArgumentException("n é maior que o tamanho da lista.");
            }
            avancado = avancado.proximo;
        }
        // Move os dois ponteiros juntos até 'avancado' chegar ao final
        while(avancado != null){
            avancado = avancado.proximo;
            atual = atual.proximo;
        }
        return atual.valor;
    }
    public static void main(String[] args) {
        Node cabeca = new Node(10);
        cabeca.proximo = new Node(20);
        cabeca.proximo.proximo = new Node(30);
        cabeca.proximo.proximo.proximo = new Node(40);
        cabeca.proximo.proximo.proximo.proximo = new Node(50);

        int n = 2;
        System.out.println("O" + n + "º elemento a partir do fim é " + encontrarNEmesimoDoFim(cabeca, n));
        
    }
}