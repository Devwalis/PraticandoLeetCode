# 🧠 Praticando LeetCode em Java

Este repositório contém resoluções de problemas clássicos de lógica de programação, frequentemente cobrados em **entrevistas técnicas**.  
Todos os algoritmos estão implementados em **Java**, com explicações passo a passo e comentários detalhados.

---

## 📌 Lista de Exercícios

1. [Palíndromo](#1-palíndromo)  
2. [Fatorial Recursivo](#2-fatorial-recursivo)  
3. [Inverter Array](#3-inverter-array)  
4. [Soma de Pares](#4-soma-de-pares)  
5. [Fibonacci (Iterativo e Recursivo)](#5-fibonacci-iterativo-e-recursivo) 
6. [Anagrama](#6-anagrama)
7. [Maior Número em um Array](#7-maior-número-em-um-array)
8. [Número Primo](#-8-número-primo)
9. [Remover Duplicados de um Array](#-9-remover-duplicatas-de-um-array)
10. [TwoSum](#10-two-sum)
11. [SomaDePares](#-11-soma-de-pares)
12. [Contar Ocorrências](#-12-Contar-Ocorrências)
13. [Inverter String](#-13-Inverter-String)
14. [Fatorial de um Número](#-14-Fatorial-de-um-Número)
15. [Soma Máxima Contígua (Kadane's Algorithm)](#-Soma-Máxima-Contígua)
16. [Produto de Todos Menos o Atual](#-16-Produto-de-Todos-Menos-o-Atual)
17. [Interseção de Arrays](#17-interseção-de-arrays)  
18. [Primeiro Caractere Não Repetido](#18-primeiro-caractere-não-repetido)  
19. [Número Único](#19-número-único)  
20. [Maskify](#20-maskify)  
21. [Próximo Quadrado Perfeito](#21-próximo-quadrado-perfeito)
22. [Converter String para Número](#22-Converter-String-para-Número)
23. [Total de Gols do Messi](#23-Total-de-Gols-do-Messi)





---

## 🧪 1. Palíndromo

### ✅ Enunciado:
Verifique se uma string é um palíndromo, ou seja, se pode ser lida da mesma forma da esquerda para a direita e vice-versa.  
**Exemplos:** `"radar"`, `"ana"`, `"12321"`

### 💡 Lógica do Algoritmo:
- Remove espaços e converte a string para minúsculas.
- Compara os caracteres da frente e do final da string até o meio.
- Se todos os pares forem iguais, é um palíndromo.

### 📘 Explicação dos métodos usados:

| Método                          | O que faz                                                                                   | Exemplo de uso                             |
|--------------------------------|----------------------------------------------------------------------------------------------|--------------------------------------------|
| `replaceAll("\\s+", "")`       | Substitui todos os espaços da string por nada (`""`). A expressão `\\s+` representa qualquer espaço em branco. | `"A B C".replaceAll("\\s+", "") → "ABC"`  |
| `toLowerCase()`                | Converte todos os caracteres da string para letras minúsculas.                              | `"Radar".toLowerCase() → "radar"`         |
| `length()`                     | Retorna o número de caracteres da string.                                                    | `"radar".length() → 5`                     |
| `charAt(index)`                | Retorna o caractere na posição indicada pelo índice. O índice começa do zero.               | `"radar".charAt(0) → 'r'"`                 |
| `while (condição)`             | Executa um bloco de código **enquanto** a condição for verdadeira.                          | `while (esquerda < direita) { ... }`       |
| `if (condição) return false`   | Se a condição for verdadeira, o algoritmo para e retorna `false`.                           | `if (texto.charAt(e) != texto.charAt(d))`  |

---

## 🧪 2. Fatorial Recursivo

### ✅ Enunciado:
Implemente uma função recursiva que calcule o fatorial de um número.  
**Exemplo:** `fatorial(5) = 120`

### 💡 Lógica do Algoritmo:
- Se `n == 0`, retorna 1 (caso base).
- Caso contrário, retorna `n * fatorial(n - 1)`.
- A função se chama novamente (recursão) até atingir o caso base.

### 📘 Explicação dos métodos usados:

| Método / Conceito               | O que faz                                                                                     | Exemplo de uso                  |
|--------------------------------|------------------------------------------------------------------------------------------------|---------------------------------|
| `if (n == 0)`                  | Verifica se o número é zero. O fatorial de 0 é 1 por definição matemática.                    | `if (0 == 0) → true`            |
| `return 1`                     | Retorna 1 quando o caso base da recursão é atingido.                                          | Base da recursão                |
| `return n * fatorial(n - 1)`  | Chamada recursiva: a função se chama com `n - 1` até chegar a zero.                          | `fatorial(5) → 5 * fatorial(4)` |

---

## 🧪 3. Inverter Array

### ✅ Enunciado:
Escreva uma função que receba um array de inteiros e retorne o array invertido.  
**Exemplo:**  
Entrada: `[1, 2, 3, 4]`  
Saída: `[4, 3, 2, 1]`

### 💡 Lógica do Algoritmo:
- Utiliza dois ponteiros (índices): um no início e outro no final do array.
- Troca os elementos dessas posições até que os ponteiros se encontrem no meio.
- A operação é feita **in-place** (sem criar um novo array).

### 📘 Explicação dos métodos usados:

| Método / Conceito              | O que faz                                                                                      | Exemplo de uso                              |
|-------------------------------|-----------------------------------------------------------------------------------------------|---------------------------------------------|
| `int[] array = {...}`         | Cria e inicializa um array de inteiros.                                                       | `int[] arr = {1, 2, 3, 4};`                  |
| `int temp`                    | Cria uma variável temporária usada para armazenar valores durante a troca.                   | `int temp = array[i];`                      |
| `array[i] = array[j]`         | Atribui ao índice `i` o valor que está no índice `j`.                                         | `array[0] = array[3];`                      |
| `array[j] = temp`             | Atribui ao índice `j` o valor que estava no índice `i`, armazenado em `temp`.                | `array[3] = temp;`                          |
| `while (i < j)`               | Estrutura de repetição que troca os valores enquanto o índice inicial for menor que o final. | `while (start < end)`                       |



## 🧪 4. Soma de Pares

### ✅ Enunciado:
Dado um array de inteiros, retorne a soma dos números pares.  
**Exemplo:**  
Entrada: `[1, 2, 3, 4, 5, 6]`  
Saída: `12`

### 💡 Lógica do Algoritmo:
- Inicializa uma variável `soma` com zero.
- Percorre cada número do array.
- Se o número for par (divisível por 2), adiciona à `soma`.
- Retorna a soma total ao final do laço.

### 📘 Explicação dos métodos usados:

| Método / Conceito           | O que faz                                                                 | Exemplo de uso                       |
|----------------------------|---------------------------------------------------------------------------|--------------------------------------|
| `int[] array = {...}`      | Declaração e inicialização de um array de inteiros.                       | `int[] nums = {1, 2, 3};`            |
| `for (int numero : array)` | Laço **foreach** que percorre todos os elementos do array.                | `for (int n : numeros)`              |
| `numero % 2 == 0`          | Verifica se o número é par (divisão com resto igual a zero).              | `if (n % 2 == 0)`                    |
| `soma += numero`           | Soma o valor do número atual à variável `soma`.                           | `soma += n;`                         |
| `System.out.println()`     | Exibe mensagens ou resultados no terminal.                                | `System.out.println("Resultado")`    |




## 🧪 5. Fibonacci (Iterativo e Recursivo)

### ✅ Enunciado:
Implemente uma função que retorne o n-ésimo número da sequência de Fibonacci.  
**Exemplo:**  
Entrada: `n = 6`  
Saída: `8` (Sequência: `0, 1, 1, 2, 3, 5, 8`)

### 💡 Lógica do Algoritmo:

- **Recursivo:**  
  - Base da recursão: se `n` for 0 ou 1, retorna `n`.
  - Caso contrário, chama a função novamente para `n - 1` e `n - 2` e soma os resultados.
  
- **Iterativo:**  
  - Usa duas variáveis (`a` e `b`) para armazenar os dois últimos valores.
  - Itera até `n`, atualizando os valores e armazenando o último resultado.

### 📘 Explicação dos métodos usados:

| Método / Conceito                  | O que faz                                                                 |
|-----------------------------------|---------------------------------------------------------------------------|
| `if (n <= 1)`                     | Condição base para evitar recursões infinitas (casos simples de Fibonacci). |
| `return fibonacci(n-1) + ...`     | Chamada recursiva para resolver subproblemas menores.                    |
| `int a = 0, b = 1;`               | Define os dois primeiros elementos da sequência de Fibonacci.            |
| `for (int i = 2; i <= n; i++)`    | Laço que avança a sequência somando os dois números anteriores.         |
| `System.out.println()`            | Imprime os resultados no console.                                        |

---

## 🧩 6. Anagrama

### ✅ Enunciado:
Verifique se duas strings são anagramas.  
**Exemplo:** `"roma"` e `"amor"` → `true`

### 💡 Lógica do Algoritmo:
- Remove espaços e coloca tudo em minúsculo.
- Compara se os tamanhos das palavras são iguais.
- Transforma as strings em arrays de caracteres.
- Ordena ambos os arrays.
- Verifica se os arrays ordenados são iguais.

---

### 🔍 Explicação dos métodos usados:
| Método                          | Explicação                                                                 |
|----------------------------------|---------------------------------------------------------------------------|
| `replaceAll("\\s+", "")`         | Remove todos os espaços em branco.                                        |
| `toLowerCase()`                  | Transforma todos os caracteres em minúsculo.                              |
| `length()`                       | Retorna o comprimento da string.                                          |
| `toCharArray()`                  | Converte a string para um array de caracteres.                            |
| `Arrays.sort(array)`             | Ordena os elementos do array.                                             |
| `Arrays.equals(arr1, arr2)`      | Compara se dois arrays são exatamente iguais.                             |

---



## 🔢 7. Maior Número em um Array

### ✅ Enunciado:
Encontre o maior número em um array de inteiros.  
**Exemplo:** `[1, 9, 4, 7]` → `9`

### 💡 Lógica do Algoritmo:
- Inicializa uma variável `maior` com o primeiro valor.
- Percorre o array comparando os valores.
- Retorna o maior valor encontrado.

### 🔍 Explicação dos métodos usados:

| Método                  | Explicação                                                                 |
|-------------------------|----------------------------------------------------------------------------|
| `array.length`          | Retorna o número de elementos no array.                                   |
| `for`                   | Laço de repetição para percorrer o array.                                 |
| `if (elemento > maior)` | Verifica se o valor atual é maior que o maior já encontrado.              |


## 🔢 8. Número Primo

### ✅ Enunciado:

Verifique se um número inteiro é primo.

**Exemplo:**

Entrada: `7` → Saída: `true`

Entrada: `4` → Saída: `false`

### 💡 Lógica do Algoritmo:

- Números ≤ 1 não são primos.

- Verifica divisores de 2 até a raiz quadrada do número.

- Se encontrar algum divisor, retorna `false`.

- Caso contrário, retorna `true`.

### 📘 Explicação dos métodos usados:

| Método / Conceito                   | O que faz                                                                 |
|------------------------------------|---------------------------------------------------------------------------|
| `Math.sqrt(n)`                     | Retorna a raiz quadrada de `n` (tipo `double`).                           |
| `for (int i = 2; i <= raiz; i++)`  | Loop que testa possíveis divisores de `n`.                                |
| `n % i == 0`                       | Verifica se `i` divide `n` sem deixar resto.                              |
| `return false`                     | Retorna imediatamente se encontrar divisor (portanto, não é primo).       |
| `return true`                      | Retorna verdadeiro se nenhum divisor for encontrado (número é primo).     |

# 🔢 9. Remover Duplicatas de um Array

## ✅ Enunciado

Receba um array de inteiros e retorne um novo array sem elementos duplicados, mantendo a ordem original dos elementos.

**Exemplo:**

Entrada: `[1, 2, 2, 3, 4, 4]`
Saída: `[1, 2, 3, 4]`

---

## 💡 Lógica do Algoritmo

* **Contagem de elementos únicos:** Percorre o array verificando quantos elementos aparecem pela primeira vez.
* **Criação de array temporário:** Armazena elementos únicos na ordem de aparição usando um array temporário.
* **Compactação do resultado:** Copia os elementos únicos para um novo array do tamanho exato.
* **Manutenção da ordem:** Preserva a sequência original dos elementos não duplicados.

---

## 📘 Explicação dos métodos usados

| Método / Conceito     | O que faz                                                    |
| :-------------------- | :----------------------------------------------------------- |
| `Scanner`             | Recebe entrada do usuário via terminal.                     |
| `nextInt()`           | Lê números inteiros digitados pelo usuário.                 |
| `for` aninhado        | Compara elementos com anteriores para detectar duplicatas.   |
| `boolean isDuplicate` | Flag que indica se elemento já foi encontrado anteriormente. |
| `System.arraycopy()`  | Copia elementos entre arrays de forma eficiente.             |
| `index++`             | Incrementa índice após adicionar elemento único (pós-incremento). |


## 🧪 10. Duas somas em um array

### ✅ Enunciado:

Dado um array de inteiros e um valor alvo, retorne os índices de dois números cuja soma seja igual ao valor alvo.  
Você deve assumir que cada entrada terá exatamente uma solução, e não pode usar o mesmo elemento duas vezes.


### 📘 Explicação dos métodos usados:

| Método                          | O que faz                                                                                      | Exemplo de uso                                  |
|--------------------------------|-------------------------------------------------------------------------------------------------|-------------------------------------------------|
| `Map<Integer, Integer>`        | Cria um dicionário (`HashMap`) que associa um número ao seu índice.                           | `Map<Integer, Integer> map = new HashMap<>();`  |
| `for (int i = 0; i < nums.length; i++)` | Percorre todos os elementos do array.                                                  | -                                               |
| `int complemento = alvo - nums[i]` | Calcula o número que somado ao atual resultará no valor alvo.                             | Se `alvo = 9` e `nums[i] = 2`, então `complemento = 7` |
| `map.containsKey(complemento)` | Verifica se o complemento já foi adicionado anteriormente ao mapa.                            | `map.containsKey(7)`                            |
| `map.get(complemento)`         | Retorna o índice correspondente ao valor do complemento armazenado no mapa.                   | `map.get(7)`                                    |
| `map.put(nums[i], i)`          | Adiciona o valor atual e seu índice ao mapa para futuras comparações.                         | `map.put(2, 0)` 


# 📊 Complexidade de Algoritmos – Análise com Exemplos em Java

## ✨ O que é Complexidade de Algoritmos?

A complexidade de um algoritmo descreve o **tempo de execução** e/ou **uso de memória** em função do tamanho da entrada. Essa análise permite prever o desempenho do algoritmo à medida que os dados aumentam.

> A notação mais comum é a **notação Big-O** (O-grande), que expressa o pior caso possível para o tempo de execução.

---

## 📐 Como Analisar a Complexidade de um Algoritmo?

### ✅ Etapas principais:

1. **Foque nas repetições (laços e chamadas recursivas)**: são elas que fazem o tempo crescer.
2. **Considere a complexidade dos métodos internos utilizados** (como `Arrays.sort()`).
3. **Ignore constantes e mantenha apenas o termo de maior crescimento**.
4. **Analise separadamente blocos que não dependem uns dos outros** e depois combine as complexidades.

---

## 🧠 Exemplos de Complexidade com Java

### 🔁 Exemplo 1 – Duplicados com Duplo For


 ## 🧪 11. Soma de Pares

### ✅ Enunciado

Dado um array de inteiros, retorne a soma de todos os números pares.

---

### 💡 Lógica do Algoritmo

1. Criar uma variável `soma` iniciada em `0`.  
2. Percorrer cada elemento do array.  
3. Verificar se o número é par: `numero % 2 == 0`.  
4. Se for par, somar à variável `soma`.  
5. Retornar o valor final da soma.

---

### 🔍 Complexidade

- **Tempo:** `O(n)` — percorre o array uma única vez.  
- **Espaço:** `O(1)` — usa apenas uma variável para a soma.

---

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito                        | O que faz                                                                     |
|-----------------------------------------|--------------------------------------------------------------------------------|
| `int soma = 0`                          | Inicializa a variável que acumula a soma dos números pares                    |
| `for (int i = 0; i < array.length; i++)`| Percorre todos os elementos do array                                          |
| `array[i] % 2 == 0`                     | Verifica se o número atual é par (resto da divisão por 2 igual a 0)          |
| `soma += array[i]`                      | Adiciona o número par à variável de soma                                      |
| `return soma`                           | Retorna a soma total dos números pares                                        |
                               |
## 🧪 12. Contar Ocorrências

### ✅ Enunciado

Conte quantas vezes um determinado número aparece em um array.

---

### 💡 Lógica do Algoritmo

1. Inicializar uma variável `contador` com valor 0.
2. Percorrer todos os elementos do array.
3. Para cada elemento, verificar se é igual ao número desejado.
4. Se for igual, incrementar o `contador`.
5. Retornar o valor final de `contador`.

---

### 🔍 Complexidade

- **Tempo:** `O(n)` — percorre todos os elementos do array.
- **Espaço:** `O(1)` — utiliza apenas uma variável adicional.

---

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito               | O que faz                                                                  |
|----------------------------------|-----------------------------------------------------------------------------|
| `int contador = 0`               | Inicializa o contador de ocorrências                                       |
| `for (int i = 0; i < array.length; i++)` | Percorre todos os elementos do array                            |
| `if (array[i] == numeroDesejado)` | Verifica se o número atual é igual ao número procurado                     |
| `contador++`                     | Incrementa o contador se houver uma ocorrência                             |
| `return contador`                | Retorna o número total de ocorrências encontradas                          |

---


## 🧪 13. Inverter String

### ✅ Enunciado

Dada uma string, retorne sua inversa.

---

### 💡 Lógica do Algoritmo

1. Criar uma variável para armazenar a string invertida.
2. Iterar do final até o início da string original.
3. Concatenar os caracteres nessa nova string.
4. Retornar a string invertida.

---

### 🔍 Complexidade

- **Tempo:** `O(n)` — percorre cada caractere da string uma vez.
- **Espaço:** `O(n)` — cria uma nova string com todos os caracteres invertidos.

---

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito                    | O que faz                                                              |
|-------------------------------------|------------------------------------------------------------------------|
| `charAt(i)`                         | Retorna o caractere na posição `i` da string original                  |
| `for (int i = str.length() - 1; i >= 0; i--)` | Percorre a string de trás pra frente                          |
| `StringBuilder`                     | Classe usada para construir strings de forma eficiente                 |
| `append()`                          | Adiciona um caractere ao final da `StringBuilder`                      |
| `toString()`                        | Converte o `StringBuilder` de volta para uma `String`                  |

---


## 🧪 14. Fatorial de um Número

### ✅ Enunciado

Calcule o fatorial de um número `n`.

---

### 💡 Lógica do Algoritmo

1. Criar uma variável `fatorial` iniciada em 1.
2. Usar um laço `for` para multiplicar os números de `n` até 1.
3. Retornar o valor final da multiplicação.

---

### 🔍 Complexidade

- **Tempo:** `O(n)` — uma iteração por número até `n`.
- **Espaço:** `O(1)` — usa apenas uma variável auxiliar.

---

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito            | O que faz                                                              |
|-----------------------------|-------------------------------------------------------------------------|
| `int fatorial = 1`          | Inicializa a variável com o valor neutro da multiplicação               |
| `for (int i = n; i >= 1; i--)` | Laço que percorre de `n` até `1`                                      |
| `fatorial *= i`             | Multiplica o valor atual da variável `fatorial` pelo valor de `i`       |
| `return fatorial`           | Retorna o resultado final após o laço                                   |

---



## 🧪 15. Soma Máxima Contígua (Kadane's Algorithm)

### ✅ Enunciado

Dado um array, encontre a subarray de soma máxima.

---

### 💡 Lógica do Algoritmo

- Inicializar duas variáveis:
  - `somaAtual` com o primeiro valor do array.
  - `somaMaxima` com o primeiro valor do array.
- Percorrer o array a partir do segundo elemento.
- Em cada iteração:
  - Atualizar `somaAtual` com o maior valor entre o número atual ou a soma do número atual com `somaAtual` anterior.
  - Atualizar `somaMaxima` com o maior valor entre `somaMaxima` e `somaAtual`.

---

### 🔍 Complexidade

- **Tempo:** `O(n)` — percorre o array uma única vez.
- **Espaço:** `O(1)` — não utiliza estruturas adicionais além de variáveis de controle.

---

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito                     | O que faz                                                                  |
|--------------------------------------|----------------------------------------------------------------------------|
| `Math.max(a, b)`                     | Retorna o maior valor entre `a` e `b`                                      |
| `int somaAtual = nums[0]`            | Inicializa a soma atual com o primeiro elemento do array                   |
| `int somaMaxima = nums[0]`           | Armazena a maior soma encontrada até o momento                             |
| `for (int i = 1; i < nums.length; i++)` | Percorre o array a partir do segundo elemento                         |
| `somaAtual + nums[i]`                | Soma o valor atual com o elemento do array                                 |
| `somaMaxima = Math.max(...)`         | Atualiza a soma máxima se a nova soma for maior que a anterior             |

---

### 🧪 16. Produto de Todos Menos o Atual

#### ✅ Enunciado

Dado um array de números, retorne um novo array onde cada posição contém o produto de todos os elementos, **exceto o atual**.

---

#### 💡 Lógica do Algoritmo

- Criar dois arrays auxiliares: `prefixo` e `sufixo`.
- `prefixo[i]`: produto de todos os elementos antes do índice `i`.
- `sufixo[i]`: produto de todos os elementos após o índice `i`.
- O valor final de cada posição será `prefixo[i] * sufixo[i]`.

**Exemplo:**

Entrada: [1, 2, 3, 4]  
Saída:   [24, 12, 8, 6]



#### 🔍 Complexidade

| Tipo   | Valor |
|--------|-------|
| Tempo  | O(n)  |
| Espaço | O(n)  |

---

#### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito                            | O que faz                                                     |
|----------------------------------------------|----------------------------------------------------------------|
| `int[] prefixo = new int[n];`                | Cria um array para armazenar os produtos à esquerda de cada elemento |
| `int[] sufixo = new int[n];`                 | Cria um array para armazenar os produtos à direita de cada elemento |
| `prefixo[i] = prefixo[i - 1] * nums[i - 1];` | Calcula o produto acumulado antes do índice atual             |
| `sufixo[i] = sufixo[i + 1] * nums[i + 1];`   | Calcula o produto acumulado depois do índice atual            |
| `resultado[i] = prefixo[i] * sufixo[i];`     | Produto de todos os elementos, exceto o atual  






### 🧪 17. Interseção de Arrays

✅ **Enunciado**  
Dado dois arrays, retorne os elementos em comum entre eles.

---

💡 **Lógica do Algoritmo**

- Criar um `Set` para armazenar os elementos únicos do primeiro array.
- Percorrer o segundo array e verificar quais elementos também estão no `Set`.
- Armazenar os elementos em comum em outro `Set`.
- Converter o conjunto final em um array de inteiros.

---

🔍 **Complexidade**

| Tipo   | Valor     |
|--------|-----------|
| Tempo  | O(n + m)  |
| Espaço | O(n)      |

> n = tamanho do primeiro array  
> m = tamanho do segundo array

---

📘 **Tabela de Métodos / Conceitos Utilizados**

| Método / Conceito                             | O que faz                                             |
|----------------------------------------------|--------------------------------------------------------|
| `Set<Integer> conjunto = new HashSet<>()`     | Armazena elementos únicos do primeiro array            |
| `conjunto.contains(num)`                      | Verifica se o número já existe no conjunto             |
| `Set<Integer> resultado = new HashSet<>()`    | Armazena os elementos que estão nos dois arrays        |
| `resultado.toArray(new int[resultado.size()])`| Converte o Set em um array de inteiros                 |


### 🧪 18. Primeiro Caractere Não Repetido

✅ **Enunciado**  
Dada uma string, encontre o primeiro caractere que não se repete.

💡 **Lógica do Algoritmo**  
Utilize um `Map` para contar a frequência de cada caractere.  
Em seguida, percorra a string novamente para encontrar o primeiro com frequência 1.

🔍 **Complexidade**

| Tipo   | Valor |
|--------|-------|
| Tempo  | O(n)  |
| Espaço | O(1) – limitado ao alfabeto ASCII |

📘 **Tabela de Métodos / Conceitos Utilizados**

| Método / Conceito                          | O que faz                                                                 |
|-------------------------------------------|---------------------------------------------------------------------------|
| `Map<Character, Integer>`                 | Armazena cada caractere com sua contagem de ocorrências                  |
| `getOrDefault(c, 0) + 1`                  | Incrementa a frequência de cada caractere                                |
| `LinkedHashMap`                           | Mantém a ordem de inserção dos caracteres                                |
| `mapaFrequencia.get(c) == 1`              | Verifica qual caractere aparece exatamente uma vez                       |
| `'\0'`                                    | Representa caractere nulo caso não haja caractere único                  |

---
### 🧪 19. Número Único

✅ **Enunciado**  
Dado um array onde todos os números aparecem duas vezes, exceto um, encontre o número único.

💡 **Lógica do Algoritmo**  
Utilizamos a operação XOR. O XOR possui as seguintes propriedades importantes:
- `a ^ a = 0` → Um número XOR com ele mesmo resulta em zero.
- `a ^ 0 = a` → Um número XOR com zero permanece o mesmo.

Ao aplicar XOR em todos os elementos do array, os números duplicados se anulam e resta apenas o número único.

---

🔍 **Complexidade**

| Tipo   | Valor  |
|--------|--------|
| Tempo  | O(n)   |
| Espaço | O(1)   |

---

📘 **Tabela de Métodos / Conceitos Utilizados**

| Método / Conceito      | O que faz                                                                 |
|------------------------|---------------------------------------------------------------------------|
| `int resultado = 0;`   | Inicializa a variável acumuladora do XOR                                  |
| `resultado ^= num;`    | Aplica a operação XOR entre o resultado atual e o número do array         |
| `for (int num : nums)` | Percorre todos os elementos do array                                      |
| `System.out.println()` | Exibe o número único encontrado no console                                |

---


### 🧪 20. Maskify

✅ **Enunciado**  
Implemente uma função `maskify` que oculte todos os caracteres de uma string com `#`, exceto os quatro últimos. Isso é útil para esconder dados sensíveis como números de cartão de crédito.

📥 **Entrada**  
Uma `String` com qualquer número de caracteres.

📤 **Saída**  
A mesma `String`, porém com todos os caracteres mascarados com `#`, exceto os últimos 4.

📌 **Exemplos**
| Entrada                              | Saída                         |
|--------------------------------------|-------------------------------|
| `"4556364607935616"`                 | `"############5616"`          |
| `"64607935616"`                      | `"#######5616"`               |
| `"1"`                                | `"1"`                         |
| `""`                                 | `""`                          |
| `"Skippy"`                           | `"##ippy"`                    |
| `"Nananananananananananananananana Batman!"` | `"#########################man!"` |

---

💡 **Lógica do Algoritmo**  
1. Verifique se a string tem 4 ou menos caracteres. Se sim, retorne a string original.  
2. Calcule o número de caracteres que precisam ser mascarados (tamanho da string - 4).  
3. Crie um `StringBuilder` com esse número de `#`.  
4. Adicione os últimos 4 caracteres da string original.  
5. Retorne o resultado como string.

---

🔍 **Complexidade**
| Tipo   | Valor |
|--------|-------|
| Tempo  | O(n)  |
| Espaço | O(n)  |

---

📘 **Tabela de Métodos / Conceitos Utilizados**

| Método / Conceito                  | O que faz                                                                 |
|-----------------------------------|--------------------------------------------------------------------------|
| `str.length()`                    | Retorna o tamanho da string                                              |
| `StringBuilder masked = new ...`  | Cria um objeto mutável para construir strings                            |
| `masked.append('#')`              | Adiciona um caractere `#` no final da string                             |
| `str.substring(maskLength)`       | Retorna os 4 últimos caracteres da string                                |
| `masked.toString()`               | Converte o `StringBuilder` para uma `String`                             |

---

### 🧪 21. Próximo Quadrado Perfeito

✅ **Enunciado**  
Implemente a função `findNextSquare` que retorna o próximo **quadrado perfeito** de um número dado.  
Um quadrado perfeito é um número cujo valor da raiz quadrada é um número inteiro.

- Se o número de entrada **não for** um quadrado perfeito, retorne `-1`.

📥 **Entrada**  
Um número inteiro não negativo.

📤 **Saída**  
O próximo quadrado perfeito (inteiro) ou `-1`, caso a entrada não seja um quadrado perfeito.

📌 **Exemplos**
| Entrada | Saída |
|---------|-------|
| 121     | 144   |
| 625     | 676   |
| 114     | -1    |

---

💡 **Lógica do Algoritmo**  
1. Calcule a raiz quadrada do número com `Math.sqrt()`.
2. Verifique se o número é um quadrado perfeito: ou seja, se a raiz quadrada for um número inteiro.
3. Se **não for**, retorne `-1`.
4. Se **for**, incremente a raiz em 1 e retorne o quadrado dessa nova raiz.

---

🔍 **Complexidade**
| Tipo   | Valor |
|--------|-------|
| Tempo  | O(1)  |
| Espaço | O(1)  |

---

📘 **Tabela de Métodos / Conceitos Utilizados**

| Método / Conceito          | O que faz                                                    |
|----------------------------|--------------------------------------------------------------|
| `Math.sqrt(n)`             | Calcula a raiz quadrada de `n`                               |
| `(int) Math.sqrt(n)`       | Converte a raiz quadrada para inteiro (truncate)             |
| `Math.pow(base, expoente)` | Eleva um número à potência                                   |
| `==`                       | Verifica se o quadrado do inteiro raiz é igual ao número     |

---

## 🧪 22. Converter String para Número

### ✅ Enunciado

Dada uma **string numérica válida**, converta-a para um número inteiro (`int`).  
Você pode assumir que todas as entradas são representações válidas de números inteiros.

**Exemplos:**



### 💡 Lógica do Algoritmo

- Como a string é uma representação válida de um número inteiro, podemos usar a função `Integer.parseInt()` do Java.
- Esse método analisa o conteúdo da string e retorna seu valor numérico.
- A conversão é direta, sem necessidade de iteração manual sobre os caracteres.

---

### 🔍 Complexidade

| Tipo   | Valor                                      |
|--------|--------------------------------------------|
| Tempo  | O(n) — onde n é o número de dígitos        |
| Espaço | O(1) — constante, sem uso adicional de memória |

---

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito         | O que faz                                         | Exemplo de uso                    |
|---------------------------|--------------------------------------------------|-----------------------------------|
| `Integer.parseInt(str)`   | Converte uma string numérica para inteiro        | `Integer.parseInt("123") → 123`   |
| `System.out.println()`    | Exibe o valor no console                         | `System.out.println(123)`         |


## 🧪 23. Total de Gols do Messi

### ✅ Enunciado:

Messi é um jogador de futebol com gols em três campeonatos:

- LaLiga  
- Copa do Rey  
- Champions League  

Crie uma função que **receba os gols marcados** em cada uma dessas ligas e **retorne o total de gols**.

### 💡 Lógica do Algoritmo:

- Receber os três valores como parâmetros.
- Somar os três valores.
- Retornar o total.

---

### 🔍 Complexidade

| Tipo   | Valor  |
|--------|--------|
| Tempo  | O(1)   |
| Espaço | O(1)   |

---

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito        | O que faz                                                      |
|--------------------------|-----------------------------------------------------------------|
| `int total = a + b + c`  | Soma os gols de LaLiga, Copa do Rey e Champions League.         |
| `return total`           | Retorna a soma total de gols.                                   |
| `System.out.println()`   | Exibe o resultado no terminal.                                  |




## 📂 Organização

Cada exercício está dentro de sua própria classe Java, com o nome da questão em portugês no padrão camelCase.  
Exemplo: `Palindromo.java`, `Fatorial.java`, `InverterArray`, `SomarDePares`, `Fibonacci` etc.

---

## 🚀 Como executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/Devwalis/PraticandoLeetCode.git
   cd PraticandoLeetCode
