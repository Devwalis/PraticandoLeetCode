import java.util.Arrays;

public class Complexidade {

    /**
     * Complexidade de algoritmos:
     * A complexidade define o quanto um algoritmo cresce em tempo (ou memória) com base no tamanho da entrada.
     * Imagine um gráfico em forma de "L":
     *  - O eixo vertical (Y) representa o tempo de execução
     *  - O eixo horizontal (X) representa o tamanho da entrada (n)
     *
     * Para medir a complexidade, devemos seguir três passos:
     *
     * 1. Analisar repetições (laços e recursão) — geralmente o principal fator de crescimento.
     * 2. Observar funções/métodos usados da linguagem — por exemplo, `Arrays.sort()` é O(N log N).
     * 3. Ignorar constantes e considerar apenas o termo de maior ordem (ou seja, o que mais cresce).
     */

    public static boolean exemplo1(int[] v) {
        int tamanho = v.length; // O(1)

        for (int i = 0; i < tamanho; i++) { // O(N)
            for (int j = 0; j < tamanho; j++) { // O(N)
                if (i != j && v[i] == v[j]) { // O(1)
                    return true;
                }
            }
        }

        // Temos um laço dentro de outro: O(N) * O(N) = O(N^2)
        return false;
    }

    public static boolean exemplo2(int[] v, int x) {
        int tamanho = v.length; // O(1)

        for (int i = 0; i < tamanho; i++) { // O(N)
            if (v[i] == x) return true; // O(1)
        }

        // Um único laço linear: O(N)
        return false;
    }

    public static long exemplo3(int[] v) {
        int tamanho = v.length;
        int bla = 0;

        // Duplo laço aninhado
        for (int i = 0; i < tamanho; i++) { // O(N)
            for (int j = 0; j < tamanho; j++) { // O(N)
                if (v[i] == v[j]) return bla++;
            }
        }

        int ble = 0;
        for (int i = 0; i < tamanho; i++) { // O(N)
            if (v[i] == 10) {
                ble = 2 * ble;
            }
        }

        int bli = 0;
        for (int i = 0; i < tamanho; i++) { // O(N)
            if (v[i] == 5) {
                bli += 5;
            }
        }

        // Temos: O(N^2) + O(N) + O(N) = O(N^2)
        return bla + ble + bli;
    }

    public static boolean exemplo4(int[] v, int[] w) {
        int tamanho1 = v.length;
        int tamanho2 = w.length;

        for (int i = 0; i < tamanho1; i++) { // O(N)
            for (int j = 0; j < tamanho2; j++) { // O(M)
                if (v[i] == w[j]) return true; // O(1)
            }
        }

        // Como os tamanhos são diferentes, a complexidade é O(N*M)
        return false;
    }

    public static boolean exemplo5(int[] idades) {
        int tamanho = idades.length;
        int menor_idade = Integer.MAX_VALUE;

        // Primeira passagem para encontrar o menor valor
        for (int i = 0; i < tamanho; i++) { // O(N)
            if (idades[i] < menor_idade) {
                menor_idade = idades[i];
            }
        }

        int cont = 0;
        // Segunda passagem para contar quantas vezes o menor aparece
        for (int i = 0; i < tamanho; i++) { // O(N)
            if (idades[i] == menor_idade) {
                cont++;
            }
        }

        // Temos dois laços separados: O(N) + O(N) = O(N)
        return cont > 1;
    }

    public static boolean exemplo6(int[] idades) {
        Arrays.sort(idades); // O(N log N) — algoritmo de ordenação eficiente

        return idades[0] == idades[idades.length - 1]; // O(1)

        // Como o sort domina, a complexidade total é O(N log N)
    }

    public static String exemplo7(int[] s, int[] v) {
        Arrays.sort(v); // O(M log M), onde M = v.length

        for (int i = 0; i < v.length; i++) { // O(M)
            for (int j = 0; j < s.length; j++) { // O(N)
                if (s[j] == v[i]) {
                    return "Sim";
                }
            }
        }

        // Complexidade: O(M log M) + O(M * N)
        return "Não";
    }
}
