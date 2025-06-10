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
10. [TwoSum](#two-sum)
11. [SomaDePares](#-4-soma-de-pares)

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
## 🧪 13. Contar Ocorrências

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


## 🧪 15. Inverter String

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


## 🧪 16. Fatorial de um Número

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







## 📂 Organização

Cada exercício está dentro de sua própria classe Java, com o nome da questão em portugês no padrão camelCase.  
Exemplo: `Palindromo.java`, `Fatorial.java`, `InverterArray`, `SomarDePares`, `Fibonacci` etc.

---

## 🚀 Como executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/Devwalis/PraticandoLeetCode.git
   cd PraticandoLeetCode
