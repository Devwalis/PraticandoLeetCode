# 🧠 Praticando LeetCode em Java

Este repositório contém resoluções de problemas clássicos de lógica de programação, frequentemente cobrados em **entrevistas técnicas**.  
Todos os algoritmos estão implementados em **Java**, com explicações passo a passo e comentários detalhados.

---

## 📌 Lista de Exercícios

1. [Palíndromo](#-1-palíndromo)  
2. [Fatorial Recursivo](#-2-fatorial-recursivo)  
3. [Inverter Array](#-3-inverter-array)  
4. [Soma de Pares](#-4-soma-de-pares)  
5. [Fibonacci (Iterativo e Recursivo)](#-5-fibonacci-iterativo-e-recursivo)  
6. [Anagrama](#-6-anagrama)  
7. [Maior Número em um Array](#-7-maior-número-em-um-array)  
8. [Número Primo](#-8-número-primo)  
9. [Remover Duplicados de um Array](#9-remover-duplicados-de-um-array)  
10. [TwoSum](#-10-twosum)  
11. [SomaDePares](#-11-somadepares)  
12. [Contar Ocorrências](#-12-contar-ocorrências)  
13. [Inverter String](#-13-inverter-string)  
14. [Fatorial de um Número](#-14-fatorial-de-um-número)  
15. [Soma Máxima Contígua (Kadane's Algorithm)](#-15-soma-máxima-contígua-kadanes-algorithm)  
16. [Produto de Todos Menos o Atual](#-16-produto-de-todos-menos-o-atual)  
17. [Interseção de Arrays](#-17-interseção-de-arrays)  
18. [Primeiro Caractere Não Repetido](#-18-primeiro-caractere-não-repetido)  
19. [Número Único](#-19-número-único)  
20. [Maskify](#-20-maskify)  
21. [Próximo Quadrado Perfeito](#-21-próximo-quadrado-perfeito)
22. [Converter String para Número](#-22-Converter-String-para-Número)
23. [Total de Gols do Messi](#-23-Total-de-Gols-do-Messi)
24. [Primeiro Nome Ordenado com Asteriscos](#-24-Primeiro-Nome-Ordenado-com-Asteriscos)
25. [Combat - Vida após Dano](#-25-Combat-Vida-após-Dano)
26. [Reverter uma Lista Ligada](#-26-Reverter-uma-Lista-Ligada)
27. [O que Eles Bebem](#-27-O-que-Eles-Bebem)
28. [N-ésimo Elemento a Partir do Fim](#-28-N-ésimo-Elemento-a-Partir-do-Fim)
29. [Multiples of n up to limit](#-29-Multiples-of-n-up-to-limit)
30. [Bem-vindo com Nome, Cidade e Estado](#-30-Bem-vindo-nome-cidade-estado)
31. [Dígitos em Ordem Reversa](#-31-Dígitos-em-Ordem-Reversa)
32. [Perguntar Idade de uma criança](#-32-Perguntar-idade-de-uma-criança)
33. [Saudação Multigingue](#-33-saudação-multigingue)
34. [Soma entre Dois Números](#-34-soma-entre-dois-números)
35. [Soma de uma Sequência de Inteiros](#-35-soma-de-uma-sequência-de-inteiros)
36. [Peças Máximas de Pizza](#-36-Peças-Máximas-de-Pizza)
37. [Acumular Caracteres](#-37-Acumular-Caracteres)
38. [Soma dos Quadrados](#-38-Soma-Dos-Quadrado)
39. [Quadrado dos Dígitos](#-39-Quadrado-dos-Dígitos)
40. [É um Isograma](#-40-É-um-Isograma)
41. [Verificar Ordenação de um array](#-41-verificar-ordenação-de-array)
42. [Arredondar para Duas Casas Decimais](#-41-Arredondar-para-Duas-Casas-Decimais)
43. [Verificar se é Fator](#-43-Verificar-se-é-fator)
44. [Tornar Negativo](#-44-tornar-negativo)
45. [Substituir Letras por posições](#-45-substituir-letras-por-posição)
46. [Remover menor valor](#-46-Remover-menor-valor)
47. [Caracter Do Meio](#-47-caracteres-do-meio)
48. [Velocidade da barata](#-48-Velocidade-da-barata)
49. [Soma da Linha De Impares](#-49-Soma-da-linha-de-impares)
50. [O problema dos canos de Lario e Muigi](#-50-O-problema-dos-canos-de-Lario-e-Muigi)
51. [Converter Boolean para String](#-51-converter-booleano-para-string)
52. [Contando Ovelhas](#-52-contando-ovelhas)
53. [Definir Alarme](#-53-Definir-Alarme)
54. [Remover Espaços Da String](#-54-remover-espaços-da-string)
55. [Binario-falso](#-55-binário-falso-fake-binary)
56. [Remover Âcora Da URL](#-56-remover-âncora-da-url)
57. [Você estar tocando banjo](#-57-voce-estar-tocando-banjo)
58. [Remover Exclmaçoes](#-58-Remover-Exclmações)
59. [Número por Extenso (Switch)](#-59-número-por-extenso-switch)




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
| `replaceAll("\\s+", "")`       | Substitui todos os espaços da string por nada (`" "`). A expressão `\\s+` representa qualquer espaço em branco. | `"A B C".replaceAll("\\s+", "") → "ABC"`  |
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






## 🧪 24. Primeiro Nome Ordenado com Asteriscos

### ✅ Enunciado:

Você receberá uma **lista de strings**.  
Sua tarefa é:

- Ordenar alfabeticamente (sensível a maiúsculas/minúsculas e baseado nos valores ASCII).
- Retornar a **primeira string** da lista após a ordenação.
- Inserir `"***"` entre cada caractere dessa string.

### 💡 Lógica do Algoritmo:

- Ordena o array de strings com `Arrays.sort()`.
- Pega o primeiro elemento do array (menor em ordem ASCII).
- Percorre a string adicionando `"***"` entre os caracteres usando `StringBuilder`.

---

### 🔍 Complexidade

| Tipo   | Valor      |
|--------|------------|
| Tempo  | O(n log n) |
| Espaço | O(n)       |

---

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito       | O que faz                                                                  |
|-------------------------|-----------------------------------------------------------------------------|
| `Arrays.sort(array)`    | Ordena os elementos do array em ordem crescente (baseado no valor ASCII).  |
| `StringBuilder`         | Objeto usado para concatenar strings de forma eficiente.                   |
| `charAt(i)`             | Retorna o caractere no índice `i` da string.                               |
| `append()`              | Adiciona um caractere ou string ao final do `StringBuilder`.               |
| `toString()`            | Converte o `StringBuilder` para uma `String`.                              |


## 25. 🧪 Combat - Vida após Dano

### ✅ Enunciado:

Crie uma função `combat` que receba dois parâmetros:

- `health`: a vida atual do jogador.  
- `damage`: a quantidade de dano recebido.

A função deve retornar a nova vida do jogador após o dano, garantindo que a vida **nunca fique abaixo de 0**.

---

### 💡 Lógica do Algoritmo:

- Subtrai o `damage` da `health`.
- Se o resultado for menor que 0, retorna 0.
- Caso contrário, retorna o valor resultante.

---

### 🔍 Complexidade

| Tipo   | Valor |
|--------|-------|
| Tempo  | O(1)  |
| Espaço | O(1)  |

---

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito   | O que faz                                         |
|---------------------|--------------------------------------------------|
| `Math.max(a, b)`    | Retorna o maior valor entre `a` e `b`.           |
| `int`               | Tipo primitivo que armazena números inteiros.    |
| `return`            | Retorna o valor final da função.                 |



## 🧪 26. Reverter uma Lista Ligada

### ✅ Enunciado:

Dada a cabeça de uma lista ligada, reverta a lista e retorne a nova cabeça.

### 💡 Lógica do Algoritmo:

- Usamos três ponteiros: `anterior`, `atual` e `proximo`.
- A cada iteração, invertemos o ponteiro `next` do nó atual para apontar para o anterior.
- Avançamos os ponteiros até o final da lista.
- Retornamos o novo início da lista (`anterior`).

### 🔍 Complexidade:

| Tipo   | Valor |
|--------|-------|
| Tempo  | O(n)  |
| Espaço | O(1)  |

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito              | O que faz                                                      |
|-------------------------------|-----------------------------------------------------------------|
| `Node`                        | Classe que representa um nó da lista ligada.                   |
| `while (atual != null)`       | Percorre cada nó da lista até o final.                         |
| `Node proximo = atual.proximo`| Armazena o próximo nó antes de inverter o ponteiro.            |
| `atual.proximo = anterior`    | Inverte a direção do ponteiro `next`.                          |
| `anterior = atual`            | Avança o ponteiro para o nó atual.                             |
| `atual = proximo`             | Move para o próximo nó na iteração.                            |

## 🧪 27. 3X. O que Eles Bebem

### ✅ Enunciado:

Crie uma função que receba a **idade** de uma pessoa e retorne o que ela pode beber, seguindo as regras abaixo:

| Faixa Etária        | Bebida   |
|---------------------|----------|
| Menores de 14 anos  | toddy    |
| Menores de 18 anos  | coke     |
| Menores de 21 anos  | beer     |
| 21 anos ou mais     | whisky   |

---

### 💡 Lógica do Algoritmo:

- Verifica a idade em ordem crescente usando `if-else`.
- Retorna a string correspondente à bebida conforme a faixa etária.
- A primeira condição verdadeira determina o retorno.

---

### 🔍 Complexidade

| Tipo   | Valor |
|--------|-------|
| Tempo  | O(1)  |
| Espaço | O(1)  |

---

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito       | O que faz                                                              |
|--------------------------|------------------------------------------------------------------------|
| `if-else`                | Estrutura condicional para determinar qual faixa etária se aplica.     |
| `return`                 | Retorna a bebida correspondente como string.                          |
| `System.out.println()`   | Exibe o resultado no console para testes manuais.                      |

---


## 🧪 28. N-ésimo Elemento a Partir do Fim

### ✅ Enunciado:

Dada uma lista ligada, retorne o valor do **n-ésimo nó a partir do final** da lista.

---

### 💡 Lógica do Algoritmo:

- Utilizamos dois ponteiros (`avancado` e `atual`).
- Avançamos o ponteiro `avancado` **n posições** à frente.
- Em seguida, movemos os dois ponteiros **simultaneamente** até que `avancado` chegue ao final da lista.
- Quando isso acontecer, o ponteiro `atual` estará no **n-ésimo nó a partir do fim**.

---

### 🔍 Complexidade

| Tipo   | Valor |
|--------|-------|
| Tempo  | O(n)  |
| Espaço | O(1)  |

---

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito                | O que faz                                                              |
|----------------------------------|-------------------------------------------------------------------------|
| `Node`                           | Classe que representa cada nó da lista ligada.                         |
| `for (int i = 0; i < n; i++)`    | Avança o ponteiro `avancado` n posições à frente.                      |
| `while (avancado != null)`       | Move ambos ponteiros até o final da lista.                             |
| `atual.valor`                    | Contém o valor desejado no final da execução.                          |



## 🧪29 Dígitos em Ordem Reversa

### ✅ Enunciado

Dado um número inteiro **não negativo**, retorne os **dígitos desse número** em um array, mas em **ordem reversa**.


### 💡 Lógica do Algoritmo

- Converter o número para uma `String`.
- Criar um array de inteiros com o tamanho da string.
- Percorrer a string de trás para frente.
- Converter cada caractere para número inteiro.
- Armazenar no array.
- Retornar o array com os dígitos em ordem reversa.

---

### 🔍 Complexidade

| Tipo   | Valor |
|--------|-------|
| Tempo  | O(n)  |
| Espaço | O(n)  |

---

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito                  | O que faz                                               |
|-----------------------------------|----------------------------------------------------------|
| `String.valueOf(number)`          | Converte o número para uma `String`.                    |
| `charAt(i)`                       | Acessa o caractere na posição `i` da string.            |
| `Character.getNumericValue(char)`| Converte um caractere numérico em valor inteiro.        |
| `int[] array = new int[n]`        | Cria um array de inteiros com `n` posições.             |

## 🧪 30. Idade da Menina

### ✅ Enunciado:
Você pergunta a uma garotinha "Quantos anos você tem?" Ela sempre responde "x years old", onde x é um número aleatório entre 0 e 9.

Escreva um programa que retorne a idade da menina (0-9) como um inteiro.

Assuma que a string de entrada do teste é sempre uma string válida. Por exemplo, a entrada pode ser "1 year old" ou "5 years old". O primeiro caractere na string é sempre um número.

### 💡 Lógica do Algoritmo:
- Como o enunciado garante que o primeiro caractere da string é sempre um dígito numérico, a lógica é simples.
- Basta acessar o primeiro caractere da string.
- Converter esse caractere para seu valor numérico inteiro.

### 🔍 Complexidade

| Tipo   | Valor |
|--------|-------|
| Tempo  | O(1)  |
| Espaço | O(1)  |

---

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito                  | O que faz                                                    |
|-----------------------------------|--------------------------------------------------------------|
| `frase.charAt(0)`                 | Retorna o caractere na posição 0 da string.                  |
| `Character.getNumericValue(char)` | Converte um caractere que representa um dígito em seu valor numérico inteiro. |
| `return`                          | Retorna o valor inteiro encontrado.                          |


## 🧪 31. Validador de PIN do Caixa Eletrônico

### ✅ Enunciado:
Caixas eletrônicos aceitam códigos PIN de 4 ou 6 dígitos e códigos PIN não podem conter nada além de exatamente 4 dígitos ou exatamente 6 dígitos.

Se a função receber uma string de PIN válida, retorne `true`, caso contrário, retorne `false`.

**Exemplos (Entrada --> Saída)**

| Entrada   | Saída |
|-----------|-------|
| `"1234"`  | `true`  |
| `"12345"` | `false` |
| `"a234"`  | `false` |

### 💡 Lógica do Algoritmo:
1.  **Verificar o comprimento:** O PIN deve ter exatamente 4 ou 6 caracteres. Se não tiver, é inválido.
2.  **Verificar o conteúdo:** Todos os caracteres do PIN devem ser dígitos numéricos. Percorrer a string e verificar cada caractere. Se algum não for um dígito, o PIN é inválido.
3.  Se ambas as condições forem satisfeitas, o PIN é válido.

### 🔍 Complexidade

| Tipo   | Valor |
|--------|-------|
| Tempo  | O(n)  |
| Espaço | O(1)  |

> Onde `n` é o comprimento da string de entrada (4 ou 6).

---

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito                 | O que faz                                                    |
|----------------------------------|--------------------------------------------------------------|
| `pin.length()`                   | Retorna o número de caracteres na string `pin`.              |
| `for (char c : pin.toCharArray())` | Itera sobre cada caractere da string `pin`.                 |
| `Character.isDigit(c)`           | Verifica se o caractere `c` é um dígito numérico.            |
| `return true / false`            | Retorna o resultado booleano da validação.                   |


## 🧪 32. Saudação Personalizada

### ✅ Enunciado:
Crie uma função que forneça uma saudação personalizada. Esta função recebe dois parâmetros: `name` (nome) e `owner` (proprietário).

Use condicionais para retornar a mensagem apropriada:

| Caso                  | Retorno        |
|-----------------------|----------------|
| `name` igual a `owner` | `'Hello boss'` |
| Caso contrário        | `'Hello guest'`|

### 💡 Lógica do Algoritmo:
- A lógica é direta e envolve uma única condição.
- Compare as duas strings (`name` e `owner`).
- Se forem iguais, retorne a saudação para o "chefe".
- Caso contrário, retorne a saudação para o "convidado".

### 🔍 Complexidade

| Tipo   | Valor |
|--------|-------|
| Tempo  | O(1)  |
| Espaço | O(1)  |

> A comparação de strings (`equals`) em Java tem uma complexidade que depende do menor comprimento das strings, mas para strings de tamanho "normal" e no contexto de desafios simples, é frequentemente considerada O(1) ou O(min(len1, len2)).

---

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito                 | O que faz                                                    |
|----------------------------------|--------------------------------------------------------------|
| `name.equals(owner)`             | Compara duas strings para verificar se são iguais em conteúdo (case-sensitive). |
| `if-else`                        | Estrutura condicional para executar blocos de código diferentes com base em uma condição. |
| `return`                         | Retorna o valor (string de saudação) da função.   


## 🧪 33. Saudação Multigingue

         *Possíveis entradas inválidas incluem:**
- `IP_ADDRESS_INVALID` - não é um endereço IPV4 ou IPV6 válido
- `IP_ADDRESS_NOT_FOUND` - endereço IP não encontrado no banco de dados
- `IP_ADDRESS_REQUIRED` - nenhum endereço IP foi fornecido

### 💡 Lógica do Algoritmo:
1.  **Armazenamento dos idiomas:** A melhor estrutura de dados para armazenar pares de chave-valor (idioma-saudação) para buscas rápidas é um `Map` (especificamente um `HashMap` em Java).
2.  **Inicialização:** O `Map` deve ser preenchido uma única vez com todas as saudações conhecidas. Pode ser um `Map` estático e final para evitar recriá-lo.
3.  **Função de boas-vindas:**
    *   Recebe a `String language` como parâmetro.
    *   Verifica se o `Map` contém a chave (`language`).
    *   Se contiver, retorna o valor (saudação) associado.
    *   Se não contiver (incluindo entradas inválidas como os "IP_ADDRESS_..." ou idiomas não listados), retorna a saudação padrão em Inglês ("Welcome").

### 🔍 Complexidade

| Tipo   | Valor |
|--------|-------|
| Tempo  | O(1)  |
| Espaço | O(L)  |

> Onde `L` é o número de idiomas no "banco de dados". A busca em um `HashMap` é, em média, O(1). O espaço é proporcional ao número de idiomas armazenados.

---

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito                       | O que faz                                                    |
|----------------------------------------|--------------------------------------------------------------|
| `Map<String, String>`                  | Interface que representa um mapeamento de chaves para valores. `HashMap` é uma implementação comum. |
| `static final Map<String, String> ...` | Declara um mapa que é inicializado uma vez e não pode ser alterado (constante). |
| `new HashMap<>()`                      | Cria uma nova instância de um `HashMap`.                     |
| `put("chave", "valor")`                | Adiciona um par chave-valor ao mapa.                         |
| `idiomas.get(language)`                | Retorna o valor associado à `language` no mapa, ou `null` se a chave não existir. |
| `idiomas.containsKey(language)`        | Verifica se o mapa contém a `language` como chave.           |
| `return`                               | Retorna a string de saudação.                                |  |



## 🧪 34. Soma entre Dois Números

### ✅ Enunciado:
Dados dois inteiros `a` e `b`, que podem ser positivos ou negativos, encontre a soma de todos os inteiros entre eles (inclusive) e retorne-a. Se os dois números forem iguais, retorne `a` ou `b`.

**Observação:** `a` e `b` não estão ordenados!

**Exemplos (a, b) --> saída (explicação)**

| Entrada (a, b) | Saída | Explicação          |
|----------------|-------|---------------------|
| `(1, 0)`       | `1`   | `(1 + 0 = 1)`       |
| `(1, 2)`       | `3`   | `(1 + 2 = 3)`       |
| `(0, 1)`       | `1`   | `(0 + 1 = 1)`       |
| `(1, 1)`       | `1`   | `(1 since both are same)` |
| `(-1, 0)`      | `-1`  | `(-1 + 0 = -1)`     |
| `(-1, 2)`      | `2`   | `(-1 + 0 + 1 + 2 = 2)` |

Sua função deve retornar apenas um número, sem a explicação sobre como você chegou a esse número.

### 💡 Lógica do Algoritmo:
1.  **Verificar igualdade:** Primeiro, verifique se `a` e `b` são iguais. Se forem, retorne `a` (ou `b`).
2.  **Determinar o menor e o maior:** Como `a` e `b` não estão ordenados, precisamos descobrir qual é o menor (`min`) e qual é o maior (`max`) para iterar corretamente.
3.  **Somar os números:** Use um laço de repetição (`for`) que começa no `min` e vai até o `max` (inclusive), somando cada número a uma variável acumuladora.
4.  **Retornar a soma:** Após o laço, a variável acumuladora conterá a soma total.

**Alternativa (Fórmula Matemática - Soma de uma PA):**
Para uma solução mais eficiente em casos com intervalos muito grandes, pode-se usar a fórmula da soma de uma progressão aritmética: `(n * (primeiro + ultimo)) / 2`, onde `n` é o número de termos.
`n = (max - min) + 1`

### 🔍 Complexidade

| Tipo   | Valor |
|--------|-------|
| Tempo  | O(|a-b|) |
| Espaço | O(1)  |

> A complexidade de tempo depende da distância entre `a` e `b`, pois precisamos iterar sobre todos os números nesse intervalo. Usando a fórmula matemática, a complexidade seria O(1).

---

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito                  | O que faz                                                    |
|-----------------------------------|--------------------------------------------------------------|
| `if (a == b)`                     | Verifica se `a` e `b` são iguais.                            |
| `Math.min(a, b)`                  | Retorna o menor valor entre `a` e `b`.                       |
| `Math.max(a, b)`                  | Retorna o maior valor entre `a` e `b`.                       |
| `int soma = 0;`                   | Inicializa uma variável para acumular a soma.                |
| `for (int i = min; i <= max; i++)`| Laço que itera do menor ao maior número.                     |
| `soma += i;`                      | Adiciona o número atual `i` à soma.                          |
| `return soma;`                    | Retorna o resultado final.                                   |



    
## 🧪 35. Soma de uma Sequência de Inteiros

### ✅ Enunciado:
Sua tarefa é escrever uma função que retorne a soma de uma sequência de inteiros.

A sequência é definida por 3 valores não negativos: `begin` (início), `end` (fim), `step` (passo).

Se o valor de `inicio` for maior que o `fim`, sua função deve retornar `0`. Se o `end` não for o resultado de um número inteiro de passos, então não o adicione à soma. Veja o 4º exemplo abaixo.

**Exemplos:**

| Entrada (begin, end, step) | Saída | Explicação          |
|----------------------------|-------|---------------------|
| `(2, 2, 2)`                | `2`   | `(2)`               |
| `(2, 6, 2)`                | `12`  | `(2 + 4 + 6)`       |
| `(1, 5, 1)`                | `15`  | `(1 + 2 + 3 + 4 + 5)` |
| `(1, 5, 3)`                | `5`   | `(1 + 4)`           |

Esta é a primeira kata da série:
- Sum of a sequence (esta kata)
- Sum of a Sequence [Hard-Core Version]

### 💡 Lógica do Algoritmo:
1.  **Condição de Saída Inicial:** Verifique se `begin` é maior que `end`. Se for, a sequência é "vazia" ou inválida para soma crescente, então retorne `0`.
2.  **Inicializar Soma:** Crie uma variável `sum` e inicialize-a com 0.
3.  **Iteração:** Use um laço `for` que começa em `begin`.
    *   A condição de parada do laço deve ser `i <= end`.
    *   O incremento do laço deve ser `i += step`.
4.  **Acumular Soma:** Dentro do laço, adicione o valor atual de `i` à variável `sum`.
5.  **Retornar Soma:** Após o laço ter terminado, retorne o valor final de `sum`. A regra de "não adicionar se `end` não for resultado de um passo" é naturalmente tratada pela condição `i <= end` e o incremento `i += step`.

### 🔍 Complexidade

| Tipo   | Valor |
|--------|-------|
| Tempo  | O((end - begin) / step) |
| Espaço | O(1)  |

> A complexidade de tempo é proporcional ao número de elementos na sequência gerada, que é determinada pela diferença entre `fim` e `inicio` dividida pelo `passo`. O espaço é constante, pois usamos apenas algumas variáveis.

---

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito                  | O que faz                                                    |
|-----------------------------------|--------------------------------------------------------------|
| `if (inicio > fim)`                | Verifica a condição para retornar 0 imediatamente.           |
| `long sum = 0;`                   | Declara e inicializa uma variável `long` para a soma, para evitar overflow caso a soma seja muito grande. |
| `for (long i = inicio; i <= fim; i += step)` | Laço que itera desde `inicio` até `fim`, incrementando por `passo` a cada vez. |
| `sum += i;`                       | Adiciona o valor atual `i` à soma acumulada.                 |
| `return sum;`                     | Retorna o resultado final da soma.                           |

  ## 🧪 36. Peças Máximas de Pizza

### ✅ Enunciado:
Em sua viagem à Itália, Elizabeth Gilbert fez questão de comer a pizza perfeita. Um dia ela pediu uma para o jantar, e então alguns amigos italianos apareceram em seu quarto. O problema é que muitas pessoas pediram um pedaço de pizza naquele momento, e ela tinha uma faca que só faz cortes retos.

Dado o número de cortes de pizza, encontre a quantidade máxima de pedaços de pizza que você pode obter (não necessariamente de tamanho igual). Se o número de cortes for negativo, retorne `-1` em vez disso.

**Exemplos:**

| Cortes | Peças Máximas |
|--------|---------------|
| `0`    | `1`           |
| `1`    | `2`           |
| `2`    | `4`           |
| `3`    | `7`           |
| `4`    | `11`          |
| `5`    | `16`          |
| `-1`   | `-1`          |

### 💡 Lógica do Algoritmo:

A relação entre o número de cortes (`n`) e o número máximo de pedaços (`P`) é um problema clássico de geometria combinatória. Cada novo corte deve cruzar todos os cortes anteriores sem passar por uma interseção existente, para maximizar o número de novas regiões.

-   **0 cortes:** 1 pedaço (a pizza inteira).
-   **1 corte:** Divide a pizza em 2 pedaços.
-   **2 cortes:** O segundo corte cruza o primeiro, adicionando 2 novos pedaços. Total: 1 + 1 + 2 = 4 pedaços.
-   **3 cortes:** O terceiro corte cruza os dois anteriores, adicionando 3 novos pedaços. Total: 4 + 3 = 7 pedaços.
-   **`n` cortes:** O `n`-ésimo corte adiciona `n` novos pedaços.

Portanto, o número máximo de pedaços é `P(n) = P(n-1) + n`.
Com `P(0) = 1`.

Isso forma uma progressão:
`P(n) = 1 + 1 + 2 + 3 + ... + n`
`P(n) = 1 + (Soma dos inteiros de 1 a n)` 

A soma dos inteiros de 1 a `n` é dada pela fórmula `n * (n + 1) / 2`.
Então, a fórmula para o número máximo de pedaços é:
`P(n) = 1 + n * (n + 1) / 2`

**Passos do Algoritmo:**
1.  Verifique se o número de cortes (`n`) é negativo. Se for, retorne `-1`.
2.  Aplique a fórmula `1 + n * (n + 1) / 2` para calcular o número máximo de pedaços.
3.  Retorne o resultado.

### 🔍 Complexidade

| Tipo   | Valor |
|--------|-------|
| Tempo  | O(1)  |
| Espaço | O(1)  |

> A complexidade é constante, pois envolve apenas algumas operações aritméticas, independentemente do número de cortes (desde que não seja um número excessivamente grande que cause overflow de tipo de dados).

---

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito                  | O que faz                                                    |
|-----------------------------------|--------------------------------------------------------------|
| `if (cuts < 0)`                   | Verifica se a entrada é negativa para retornar `-1`.         |
| `long`                            | Tipo de dado para garantir que o resultado da soma não exceda o limite de `int` para valores grandes de `n`. |
| `n * (n + 1) / 2`                 | Fórmula para a soma dos primeiros `n` inteiros.              |
| `return`                          | Retorna o resultado calculado.                               |


    
# 🧪 37. Acumular Caracteres (Accum)

✅ **Enunciado:**

Crie uma função `accum` que recebe uma string e transforma cada caractere em uma sequência repetida, separada por hífens. O primeiro caractere de cada sequência deve ser maiúsculo e os restantes minúsculos. O número de repetições é o índice do caractere + 1.

**Exemplos:**

  

accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"
code Code

    
💡 **Lógica do Algoritmo:**

1.  Inicialize um `StringBuilder` para construir a string resultante.
2.  Percorra a string de entrada usando um laço `for` e o índice `i`.
3.  Para cada caractere na posição `i`:
    *   Converta o caractere para maiúsculo e adicione-o ao `StringBuilder`.
    *   Converta o caractere para minúsculo e adicione-o `i` vezes (total de `i + 1` repetições para o caractere atual).
    *   Se não for o último caractere, adicione um hífen (`-`) ao `StringBuilder`.
4.  Retorne a string final do `StringBuilder`.

🔍 **Complexidade:**

| Tipo   | Valor |
| :----- | :---- |
| Tempo  | O(n^2) |
| Espaço | O(n^2) |

*   **Tempo**: O laço externo percorre `n` caracteres. O laço interno para repetir os caracteres executa `i` vezes. No pior caso, o último caractere será repetido `n-1` vezes. A soma das repetições é aproximadamente `1 + 2 + ... + n`, que é `n*(n+1)/2`, resultando em O(n^2).
*   **Espaço**: O `StringBuilder` pode crescer até um tamanho que é a soma dos caracteres repetidos e dos hífens. No pior caso, o tamanho da string resultante é também aproximadamente `n^2`.

📘 **Tabela de Métodos / Conceitos Utilizados:**

| Método / Conceito         | O que faz                                                    | Exemplo de uso                                         |
| :------------------------ | :----------------------------------------------------------- | :----------------------------------------------------- |
| `StringBuilder`           | Classe mutável e eficiente para construção de strings.       | `StringBuilder result = new StringBuilder();`          |
| `append(char/String)`     | Adiciona um caractere ou string ao final do `StringBuilder`. | `result.append(c);`                                    |
| `charAt(index)`           | Retorna o caractere na posição especificada da string.       | `char c = s.charAt(i);`                                |
| `Character.toUpperCase(c)`| Converte um caractere para sua versão maiúscula.             | `result.append(Character.toUpperCase(c));`             |
| `Character.toLowerCase(c)`| Converte um caractere para sua versão minúscula.             | `result.append(Character.toLowerCase(c));`             |
| `for`                     | Laço de repetição para iterar sobre os caracteres da string. | `for (int i = 0; i < s.length(); i++) { ... }`        |
| `s.length()`              | Retorna o comprimento da string.                             | `s.length()`                                           |
| `toString()`              | Converte o `StringBuilder` de volta para uma `String`.       | `return result.toString();`                            |


# 🧪 38. Soma dos Quadrados

✅ **Enunciado:**

Complete a função `squareSum` para que ela eleve cada número ao quadrado e, em seguida, some os resultados.

**Exemplo:**

Para `[1, 2, 2]` deve retornar `9` porque `1^2 + 2^2 + 2^2 = 9`.

💡 **Lógica do Algoritmo:**

1.  Inicialize uma variável `soma` com `0`.
2.  Percorra cada número no array de entrada.
3.  Para cada número, eleve-o ao quadrado (`numero * numero`).
4.  Adicione o resultado do quadrado à variável `soma`.
5.  Após percorrer todos os números, retorne o valor final de `soma`.

🔍 **Complexidade:**

| Tipo   | Valor |
| :----- | :---- |
| Tempo  | O(n)  |
| Espaço | O(1)  |

*   **Tempo**: O algoritmo percorre o array de entrada uma única vez. A quantidade de operações (multiplicação e soma) é diretamente proporcional ao número de elementos (`n`) no array.
*   **Espaço**: O algoritmo utiliza apenas uma variável adicional (`soma`) para armazenar o resultado, independentemente do tamanho do array de entrada. Portanto, o uso de espaço é constante.

📘 **Tabela de Métodos / Conceitos Utilizados:**

| Método / Conceito         | O que faz                                                               | Exemplo de uso                  |
| :------------------------ | :---------------------------------------------------------------------- | :------------------------------ |
| `int soma = 0;`           | Declara e inicializa uma variável para acumular a soma dos quadrados.   | `int totalSum = 0;`             |
| `for (int num : numeros)` | Laço `for-each` para iterar sobre cada elemento de um array.            | `for (int n : array) { ... }`   |
| `num * num`               | Operação de elevação ao quadrado de um número.                          | `int square = 5 * 5;`           |
| `soma += (num * num);`    | Adiciona o quadrado do número atual à variável `soma`.                  | `totalSum += (n * n);`          |
| `return soma;`            | Retorna o valor acumulado da soma dos quadrados.                        | `return totalSum;`              |



# 🧪 39. Quadrado dos Dígitos

✅ **Enunciado:**

Neste exercício, você deve elevar cada dígito de um número ao quadrado e concatenar os resultados.

**Exemplos:**

*   Se o número for `9119`, o resultado será `811181`, porque `9^2` é `81` e `1^2` é `1`. (81-1-1-81)
*   Para um input de `765`, o resultado será `493625`, porque `7^2` é `49`, `6^2` é `36`, e `5^2` é `25`. (49-36-25)

**Observação:** A função aceita um número inteiro e retorna um número inteiro.

💡 **Lógica do Algoritmo:**

1.  Converta o número inteiro de entrada para uma string para poder acessar seus dígitos individualmente.
2.  Crie um `StringBuilder` para concatenar os quadrados dos dígitos.
3.  Percorra cada caractere da string (que representa um dígito).
4.  Para cada caractere:
    *   Converta o caractere de volta para um número inteiro.
    *   Eleve esse número ao quadrado.
    *   Converta o resultado do quadrado de volta para uma string e adicione-o ao `StringBuilder`.
5.  Após processar todos os dígitos, converta a string final do `StringBuilder` de volta para um número inteiro.
6.  Retorne esse número inteiro.

🔍 **Complexidade:**

| Tipo   | Valor               |
| :----- | :------------------ |
| Tempo  | O(log10(n) \* D)    |
| Espaço | O(log10(n) \* D)    |

*   **Tempo**: O tempo é proporcional ao número de dígitos no número de entrada (`log10(n)`). Para cada dígito, realizamos operações de conversão e quadratura, além da concatenação. A concatenação de strings no `StringBuilder` é eficiente, mas cada dígito quadrado pode ter até `D` dígitos (onde `D` é o número máximo de dígitos de `9^2 = 81`, ou seja, 2). Portanto, o tempo é aproximadamente `log10(n)` (número de iterações) \* `D` (operações por iteração, como conversão de int para string).
*   **Espaço**: O `StringBuilder` armazena a string resultante. O tamanho dessa string é proporcional ao número de dígitos no número original multiplicado pelo número máximo de dígitos de um dígito ao quadrado. Portanto, o espaço é aproximadamente `log10(n)` \* `D`.

📘 **Tabela de Métodos / Conceitos Utilizados:**

| Método / Conceito                  | O que faz                                                            | Exemplo de uso                                       |
| :--------------------------------- | :------------------------------------------------------------------- | :--------------------------------------------------- |
| `String.valueOf(num)`              | Converte um número inteiro para sua representação em string.         | `String s = String.valueOf(9119);`                   |
| `StringBuilder`                    | Classe mutável e eficiente para construção de strings.               | `StringBuilder result = new StringBuilder();`        |
| `charAt(index)`                    | Retorna o caractere na posição especificada da string.               | `char digitChar = s.charAt(i);`                      |
| `Character.getNumericValue(char)`  | Converte um caractere que representa um dígito para seu valor inteiro. | `int digit = Character.getNumericValue('9');`        |
| `Math.pow(base, expoente)`         | Eleva um número à potência. Retorna um `double`. (Alternativa: `digit * digit`) | `double squared = Math.pow(9, 2);`                   |
| `(int) valor`                      | Converte um `double` para `int`, truncando a parte decimal.          | `int val = (int) squared;`                           |
| `result.append(valor)`             | Adiciona a representação em string do `valor` ao `StringBuilder`.    | `result.append(81);`                                 |
| `Integer.parseInt(str)`            | Converte uma string numérica para um número inteiro.                 | `int finalNum = Integer.parseInt("811181");`         |
| `for`                              | Laço de repetição para iterar sobre os caracteres da string.         | `for (int i = 0; i < s.length(); i++) { ... }`      |
| `s.length()`                       | Retorna o comprimento da string.                                     | `s.length()`                                         |



  

# 🧪 40. É um Isograma?

✅ **Enunciado:**

Um isograma é uma palavra que não possui letras repetidas, sejam elas consecutivas ou não. Implemente uma função que determine se uma string, que contém apenas letras, é um isograma. Assuma que a string vazia é um isograma. Ignore a diferença entre maiúsculas e minúsculas.

**Exemplos:**

*   `"Dermatoglyphics"` --> `true`
*   `"aba"` --> `false`
*   `"moOse"` --> `false` (ignorar maiúsculas/minúsculas)

💡 **Lógica do Algoritmo:**

1.  **Tratamento da String:** Converta a string de entrada para letras minúsculas para ignorar a distinção entre maiúsculas e minúsculas.
2.  **Verificação da String Vazia:** Se a string resultante estiver vazia, ela é um isograma por definição, então retorne `true`.
3.  **Uso de um Conjunto (Set):** Utilize um `HashSet<Character>` para armazenar as letras que já foram encontradas. `Set` é ideal porque não permite elementos duplicados.
4.  **Iteração:** Percorra cada caractere da string (agora em minúsculas).
5.  **Verificação de Duplicatas:** Para cada caractere:
    *   Tente adicioná-lo ao `HashSet`.
    *   Se o método `add()` retornar `false`, significa que o caractere já estava no `Set`, ou seja, é uma letra repetida. Nesse caso, a string não é um isograma, então retorne `false`.
6.  **Conclusão:** Se o laço for concluído sem encontrar letras repetidas, significa que a string é um isograma. Retorne `true`.

🔍 **Complexidade:**

| Tipo   | Valor |
| :----- | :---- |
| Tempo  | O(n)  |
| Espaço | O(k)  |

*   **Tempo**: O algoritmo percorre a string de entrada uma única vez (após a conversão para minúsculas, que também é O(n)). As operações de `add()` e verificação em um `HashSet` têm complexidade média O(1). Portanto, o tempo total é dominado pelo percurso da string, resultando em O(n), onde `n` é o comprimento da string.
*   **Espaço**: O `HashSet` armazena no máximo `k` caracteres únicos, onde `k` é o número de letras distintas no alfabeto (26 para o alfabeto inglês). Este `k` é uma constante, portanto, o uso de espaço é considerado O(1) na prática, ou O(k) se considerarmos o limite do alfabeto.

📘 **Tabela de Métodos / Conceitos Utilizados:**

| Método / Conceito                 | O que faz                                                                    | Exemplo de uso                                                 |
| :-------------------------------- | :--------------------------------------------------------------------------- | :------------------------------------------------------------- |
| `String.toLowerCase()`            | Converte todos os caracteres da string para letras minúsculas.               | `"Moose".toLowerCase()` → `"moose"`                            |
| `String.isEmpty()`                | Verifica se a string está vazia.                                             | `"".isEmpty()` → `true`                                        |
| `Set<Character>`                  | Uma interface que representa uma coleção de elementos únicos.                | `Set<Character> seen = new HashSet<>();`                       |
| `HashSet<Character>`              | Uma implementação concreta de `Set` que armazena elementos em uma tabela hash. | `Set<Character> chars = new HashSet<>();`                      |
| `set.add(elemento)`               | Tenta adicionar um elemento ao `Set`. Retorna `true` se adicionado com sucesso, `false` se o elemento já existia. | `seen.add('a')` → `true`; `seen.add('a')` → `false`            |
| `for (char c : string.toCharArray())` | Laço `for-each` para iterar sobre cada caractere de uma string convertida em array de caracteres. | `for (char ch : "abc".toCharArray()) { ... }`                  |
| `return boolean;`                 | Retorna um valor booleano (`true` ou `false`).                              | `return true;`                                                 |



# 🧪 41. Verificar Ordenação de Array

✅ **Enunciado:**

Complete o método que aceita um array de inteiros e retorna um dos seguintes:

*   `"yes, ascending"` - se os números no array estiverem ordenados em ordem crescente.
*   `"yes, descending"` - se os números no array estiverem ordenados em ordem decrescente.
*   `"no"` - caso contrário.

A ordem não precisa ser estrita: um array ordenado pode conter duplicatas consecutivas, por exemplo, `[1, 1, 2, 3]` está ordenado em ordem crescente.

É garantido que sempre haverá uma única resposta válida. Mais precisamente:

*   Não haverá arrays com menos de 2 elementos.
*   Não haverá arrays onde todos os elementos são iguais.

💡 **Lógica do Algoritmo:**

1.  **Verificar Ordem Crescente:**
    *   Percorra o array do segundo elemento até o final.
    *   Se, em algum momento, `array[i] < array[i-1]`, significa que a ordem crescente foi quebrada. Interrompa a verificação para ordem crescente.
    *   Se o laço terminar sem quebrar a ordem crescente, então o array está em ordem crescente.
2.  **Verificar Ordem Decrescente:**
    *   Percorra o array do segundo elemento até o final.
    *   Se, em algum momento, `array[i] > array[i-1]`, significa que a ordem decrescente foi quebrada. Interrompa a verificação para ordem decrescente.
    *   Se o laço terminar sem quebrar a ordem decrescente, então o array está em ordem decrescente.
3.  **Retorno:**
    *   Se o array passou na verificação de ordem crescente, retorne `"yes, ascending"`.
    *   Caso contrário, se passou na verificação de ordem decrescente, retorne `"yes, descending"`.
    *   Se não passou em nenhuma das verificações, retorne `"no"`.

**Observação da garantia:** As garantias de que "não haverá arrays com menos de 2 elementos" e "não haverá arrays onde todos os elementos são iguais" simplificam o problema, pois eliminam casos de borda ambíguos ou que precisariam de tratamento especial. Isso significa que podemos ter certeza de que uma das três respostas será sempre a correta e única.

🔍 **Complexidade:**

| Tipo   | Valor |
| :----- | :---- |
| Tempo  | O(n)  |
| Espaço | O(1)  |

*   **Tempo**: O algoritmo percorre o array no máximo duas vezes (uma para tentar a ordem crescente e outra para tentar a ordem decrescente). Cada percurso é linear (O(n)). As operações dentro do loop são constantes. Portanto, a complexidade de tempo é O(n).
*   **Espaço**: O algoritmo utiliza apenas algumas variáveis booleanas e de índice, independentemente do tamanho do array de entrada. Portanto, o uso de espaço é constante (O(1)).

📘 **Tabela de Métodos / Conceitos Utilizados:**

| Método / Conceito                 | O que faz                                                               | Exemplo de uso                                               |
| :-------------------------------- | :---------------------------------------------------------------------- | :----------------------------------------------------------- |
| `boolean isAscending = true;`     | Declara e inicializa uma flag para verificar a ordem crescente.         | `boolean asc = true;`                                        |
| `boolean isDescending = true;`    | Declara e inicializa uma flag para verificar a ordem decrescente.       | `boolean desc = true;`                                       |
| `for (int i = 1; i < array.length; i++)` | Laço `for` para iterar sobre o array a partir do segundo elemento, comparando com o anterior. | `for (int i = 1; i < arr.length; i++) { ... }`              |
| `array[i] < array[i-1]`           | Compara o elemento atual com o elemento anterior para verificar a ordem crescente. | `if (arr[i] < arr[i-1])`                                    |
| `array[i] > array[i-1]`           | Compara o elemento atual com o elemento anterior para verificar a ordem decrescente. | `if (arr[i] > arr[i-1])`                                    |
| `isAscending = false;`            | Define a flag como `false` quando a condição de ordem crescente é quebrada. | `asc = false;`                                               |
| `isDescending = false;`           | Define a flag como `false` quando a condição de ordem decrescente é quebrada. | `desc = false;`                                              |
| `if (condicao) return "string";`  | Estrutura condicional para retornar o resultado apropriado.             | `if (isAscending) return "yes, ascending";`                  |
| `return "string";`                | Retorna a string final com a classificação da ordenação.                | `return "no";`                                               |
# 🧪 42. Arredondar para Duas Casas Decimais

✅ **Enunciado:**

Como existem muitos exercícios que exigem arredondar números para duas casas decimais, você decidiu extrair o método para facilitar o processo.

Mas você nem consegue acertar isso!

Rápido, corrija o bug antes que todos no CodeWars percebam que você não consegue nem arredondar um número corretamente!

**Exemplos (esperados):**

*   `roundToTwoDecimalPlaces(3.14159)` --> `3.14`
*   `roundToTwoDecimalPlaces(10.00000)` --> `10.00`
*   `roundToTwoDecimalPlaces(5.6789)` --> `5.68`
*   `roundToTwoDecimalPlaces(1.2)` --> `1.20`
*   `roundToTwoDecimalPlaces(0.005)` --> `0.01`

💡 **Lógica do Algoritmo:**

O problema de arredondamento de `double` ou `float` para um número específico de casas decimais não é trivial devido à forma como os números de ponto flutuante são representados internamente no computador (podem ter imprecisões). Multiplicar por 100, arredondar e depois dividir por 100 nem sempre funciona para todos os casos (especialmente os `0.005`).

A abordagem mais robusta e recomendada em Java é usar a classe `BigDecimal` para garantir precisão no arredondamento:

1.  Crie um objeto `BigDecimal` a partir do `double` de entrada.
    *   *Nota de segurança*: É mais seguro converter o `double` para `String` primeiro (`String.valueOf(number)`) e depois criar o `BigDecimal` a partir da `String` para evitar pequenas imprecisões de ponto flutuante na construção do `BigDecimal` direto de um `double`.
2.  Use o método `setScale()` de `BigDecimal` para definir o número desejado de casas decimais (2, neste caso) e o modo de arredondamento.
    *   `RoundingMode.HALF_UP` é um modo de arredondamento comum que arredonda para cima se o dígito a ser descartado for 5 ou maior.
3.  Converta o `BigDecimal` resultante de volta para um `double`.

**Alternativa (menos robusta para todos os casos, mas funciona para muitos):**

1.  Multiplique o número por 100.
2.  Arredonde o número para o inteiro mais próximo usando `Math.round()`.
3.  Divida o resultado por `100.0` (usando um `double` para garantir divisão de ponto flutuante).
    *   Esta abordagem pode ter problemas com números como `0.005` ou outros valores que, devido a imprecisões de ponto flutuante, podem não ser representados exatamente como esperado antes do `Math.round()`. A solução com `BigDecimal` é superior para precisão.

🔍 **Complexidade:**

| Tipo   | Valor |
| :----- | :---- |
| Tempo  | O(1)  |
| Espaço | O(1)  |

*   **Tempo**: As operações de conversão para `BigDecimal`, definição de escala e conversão de volta para `double` são operações de tempo constante, independentemente do valor do número.
*   **Espaço**: O uso de `BigDecimal` e outras variáveis auxiliares é constante, pois não depende do "tamanho" do número de entrada.

📘 **Tabela de Métodos / Conceitos Utilizados:**

| Método / Conceito                 | O que faz                                                                                              | Exemplo de uso                                                                                                 |
| :-------------------------------- | :----------------------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------------------------------------- |
| `BigDecimal(String val)`          | Construtor que cria um `BigDecimal` a partir da representação de uma `String` de um número. **Recomendado para doubles.** | `new BigDecimal(String.valueOf(3.14159))`                                                                      |
| `BigDecimal(double val)`          | Construtor que cria um `BigDecimal` a partir de um `double`. Pode ter problemas de precisão inerentes ao `double`. | `new BigDecimal(3.14159)` (usado com cautela)                                                                  |
| `setScale(int newScale, RoundingMode roundingMode)` | Retorna um `BigDecimal` arredondado para o número especificado de casas decimais (`newScale`) usando o modo de arredondamento fornecido. | `bd.setScale(2, RoundingMode.HALF_UP)`                                                                         |
| `RoundingMode.HALF_UP`            | Uma enumeração que define o modo de arredondamento. `HALF_UP` arredonda para cima se o dígito a ser descartado for `>= 5`. | `RoundingMode.HALF_UP`                                                                                         |
| `BigDecimal.doubleValue()`        | Converte este `BigDecimal` em um `double`.                                                             | `bigDecimalResult.doubleValue()`                                                                               |
| `double numero`                   | Parâmetro de entrada da função, um número de ponto flutuante.                                          | `double val = 3.14159;`                                                                                        |
| `import java.math.BigDecimal;`    | Importa a classe `BigDecimal` do pacote `java.math`.                                                   | `import java.math.BigDecimal;`                                                                                 |
| `import java.math.RoundingMode;`  | Importa a enumeração `RoundingMode` do pacote `java.math`.                                             | `import java.math.RoundingMode;`                                                                               |


# 🧪 43. Verificar se é Fator

## ✅ Enunciado

Esta função deve testar se o `factor` é um fator de `base`.

Retorne `true` se for um fator ou `false` se não for.

### Sobre fatores:

Fatores são números que você pode multiplicar para obter outro número.

- 2 e 3 são fatores de 6 porque: 2 * 3 = 6
- Você pode encontrar um fator dividindo números. Se o resto for 0, então o número é um fator
- Você pode usar o operador de módulo (`%`) na maioria das linguagens para verificar o resto

**Exemplo:** 2 não é um fator de 7 porque: 7 % 2 = 1

**Nota:** `base` é um número não negativo, `factor` é um número positivo.

## 💡 Lógica do Algoritmo

O problema define claramente que um `factor` de `base` é um número que, quando `base` é dividido por ele, o resto é 0.

Em Java (e na maioria das linguagens de programação), o operador de módulo (`%`) retorna o resto de uma divisão.

Portanto, a lógica é simplesmente calcular `base % factor`:

- Se o resultado dessa operação for 0, o `factor` é um fator de `base`, e a função deve retornar `true`
- Caso contrário (se o resto não for 0), o `factor` não é um fator, e a função deve retornar `false`

As restrições (`base` não negativo, `factor` positivo) garantem que não precisamos nos preocupar com divisão por zero ou outros casos especiais.

## 🔍 Complexidade

| Tipo   | Valor |
|--------|-------|
| Tempo  | O(1)  |
| Espaço | O(1)  |

- **Tempo:** A função executa uma única operação de módulo (`%`). Esta é uma operação de tempo constante, independentemente dos valores de `base` e `factor` (dentro dos limites dos tipos de dados)

- **Espaço:** A função utiliza apenas algumas variáveis para armazenar os parâmetros e o resultado temporário da operação. Isso é um uso de espaço constante

## 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito | O que faz | Exemplo de uso |
|-------------------|-----------|----------------|
| `int base` | Primeiro parâmetro da função, o número a ser verificado | `int dividend = 10;` |
| `int factor` | Segundo parâmetro da função, o possível fator | `int divisor = 2;` |
| `base % factor` | Operador de módulo. Retorna o resto da divisão de `base` por `factor` | `10 % 2 → 0; 7 % 2 → 1` |
| `== 0` | Operador de comparação para verificar se o resto é zero | `(10 % 2) == 0 → true` |
| `return boolean;` | Retorna um valor booleano (`true` ou `false`) | `return true;` |



## 🧪 44. Tornar Negativo

### ✅ Enunciado
Nesta tarefa simples, você recebe um número e deve torná-lo negativo. Mas talvez o número já seja negativo?

**Exemplos:**

| Entrada | Saída |
|---------|-------|
| `1`     | `-1`  |
| `-5`    | `-5`  |
| `0`     | `0`   |

### 💡 Lógica do Algoritmo
1.  **Verificação Condicional:**
    - Verifica se o número recebido é maior que zero (`x > 0`).
    - Se for verdadeiro (positivo), retorna o valor negativo (`-x`).
    - Se for falso (já é negativo ou zero), retorna o próprio número (`x`).

2.  **Alternativa com Matemática:**
    - Utiliza a função de valor absoluto para garantir que o número seja positivo e aplica o sinal negativo na frente: `-Math.abs(x)`.

### 🔍 Complexidade

| Tipo   | Valor |
|--------|-------|
| Tempo  | O(1)  |
| Espaço | O(1)  |

- **Tempo:** A operação envolve apenas uma verificação e uma inversão de sinal, ou uma chamada matemática simples.
- **Espaço:** Nenhuma estrutura de dados adicional é utilizada.

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito       | O que faz                                                      | Exemplo de uso                |
|-------------------------|----------------------------------------------------------------|-------------------------------|
| `if (x > 0)`            | Estrutura condicional para verificar se o número é positivo.   | `if (num > 0) { ... }`        |
| `-x` (Operador Unário)  | Inverte o sinal do número (positivo vira negativo).            | `return -num;`                |
| `Math.abs(x)`           | Retorna o valor absoluto (sempre positivo) de um número.       | `Math.abs(-5) // retorna 5`   |
| `condição ? true : false` | Operador ternário para simplificar o `if/else` em uma linha. | `return (x > 0) ? -x : x;`    |



## 🧪 45. Substituir Letras por Posição

### ✅ Enunciado
Neste exercício, você deve receber uma string e substituir cada letra pela sua posição no alfabeto.

Se houver algo no texto que não seja uma letra, ignore-o e não o inclua no retorno.

**Regra:** `"a" = 1`, `"b" = 2`, etc.

**Exemplo:**
Entrada: `"The sunset sets at twelve o' clock."`
Saída: `"20 8 5 19 21 14 19 5 20 19 5 20 19 1 20 20 23 5 12 22 5 15 3 12 15 3 11"`

### 💡 Lógica do Algoritmo
O computador enxerga caracteres como números (Tabela ASCII).
- A letra `'a'` minúscula tem o valor **97**. Para transformá-la em **1**, subtraímos **96**.
- A letra `'A'` maiúscula tem o valor **65**. Para transformá-la em **1**, subtraímos **64**.

**Passo a passo:**
1. Criar um construtor de texto (`StringBuilder`) para montar o resultado.
2. Percorrer a string caractere por caractere.
3. Verificar manualmente se o caractere está entre `'a'` e `'z'` ou entre `'A'` e `'Z'`.
4. Se for letra, aplicar a subtração matemática correspondente para achar a posição (1-26).
5. Adicionar o número encontrado ao resultado, seguido de um espaço.
6. Ignorar qualquer símbolo que não entre nas condições acima.
7. Ao final, remover o espaço extra que ficou no final da string.

### 🔍 Complexidade

| Tipo   | Valor |
|--------|-------|
| Tempo  | O(n)  |
| Espaço | O(n)  |

- **Tempo:** O algoritmo percorre a string apenas uma vez.
- **Espaço:** O espaço utilizado cresce proporcionalmente ao tamanho da string de entrada para formar o resultado.

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito       | O que faz                                                           | Exemplo de uso                               |
|-------------------------|---------------------------------------------------------------------|----------------------------------------------|
| `charAt(i)`             | Pega o caractere na posição `i`.                                    | `text.charAt(0)`                             |
| `c >= 'a' && c <= 'z'`  | Verifica se o caractere está no intervalo de letras minúsculas ASCII.| `if (c >= 'a' && c <= 'z')`                  |
| `c - 96`                | Matemática ASCII: converte o código da letra ('a'=97) para índice (1).| `int pos = 'a' - 96; // 1`                   |
| `StringBuilder`         | Classe eficiente para concatenar muitas strings/números.            | `sb.append(numero)`                          |
| `trim()`                | Remove espaços em branco do início e do fim da string final.        | `"1 2 3 ".trim() -> "1 



## 🧪 46. Remover o Menor Valor

### ✅ Enunciado
O "Museu das Coisas Incrivelmente Chatas" quer se livrar de algumas exposições. Miriam, a arquiteta, decidiu remover a exposição mais chata (a que tem a menor avaliação).

Sua tarefa é escrever um programa que remova o **menor valor** de um array de inteiros.
- **Não altere** o array original (imutabilidade).
- Se houver múltiplos elementos com o mesmo menor valor, remova o que tiver o **menor índice** (o que aparece primeiro).
- Se o array for vazio, retorne um array vazio.
- A ordem dos elementos restantes deve ser mantida.

**Exemplos:**
*   Entrada: `[1, 2, 3, 4, 5]` → Saída: `[2, 3, 4, 5]`
*   Entrada: `[5, 3, 2, 1, 4]` → Saída: `[5, 3, 2, 4]`
*   Entrada: `[2, 2, 1, 2, 1]` → Saída: `[2, 2, 2, 1]`

### 💡 Lógica do Algoritmo
Como não podemos usar métodos prontos de remoção (pois arrays em Java têm tamanho fixo), a lógica deve ser feita em duas etapas manuais:

1.  **Encontrar o Alvo:** Primeiro, precisamos descobrir **qual** é o índice do menor número. Percorremos o array comparando os valores.
    *   *Detalhe importante:* Se encontrarmos um número igual ao menor atual, **não** atualizamos o índice. Isso garante que, em caso de empate, removeremos sempre o primeiro que apareceu (menor índice).
    
2.  **Copiar e Pular:** Criamos um **novo array** com tamanho `N-1`. Percorremos o array original novamente e copiamos todos os números para o novo, **exceto** quando o índice for igual ao índice do menor valor que encontramos no passo 1.

### 🔍 Complexidade

| Tipo   | Valor |
|--------|-------|
| Tempo  | O(n)  |
| Espaço | O(n)  |

- **Tempo:** Percorremos o array duas vezes (uma para achar o menor, outra para copiar). `2N` ainda é considerado `O(n)`.
- **Espaço:** Criamos um novo array quase do mesmo tamanho do original para retornar o resultado.

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito        | O que faz                                                                 | Exemplo de uso                         |
|--------------------------|---------------------------------------------------------------------------|----------------------------------------|
| `numbers.length`         | Retorna o tamanho total do array.                                         | `int tamanho = array.length;`          |
| `new int[tamanho - 1]`   | Cria um novo array de inteiros com uma posição a menos.                   | `int[] resultado = new int[4];`        |
| `continue`               | Pula a iteração atual do laço `for` e vai para a próxima.                 | `if (i == alvo) continue;`             |
| `if (numeros == null)`   | Verificação de segurança para evitar erros se a entrada não existir.      | `if (arr == null) return ...`          |


## 🧪 47. Caracteres do Meio

### ✅ Enunciado
Você receberá uma string não vazia. Seu trabalho é retornar o(s) caractere(s) do meio da string.

*   Se o tamanho da string for **ímpar**, retorne o caractere do meio.
*   Se o tamanho da string for **par**, retorne os 2 caracteres do meio.

**Exemplos:**

| Entrada | Saída | Explicação |
|---------|-------|------------|
| `"test"` | `"es"` | Tamanho 4 (par). Meio: índices 1 e 2. |
| `"testing"` | `"t"` | Tamanho 7 (ímpar). Meio: índice 3. |
| `"middle"` | `"dd"` | Tamanho 6 (par). Meio: índices 2 e 3. |
| `"A"` | `"A"` | Tamanho 1 (ímpar). Meio: índice 0. |

### 💡 Lógica do Algoritmo
O segredo está em como a divisão de inteiros funciona e como manipular os índices da string (começando em 0).

1.  Calculamos a metade: `tamanho / 2`.
2.  Verificamos se é **Par** ou **Ímpar** usando o resto da divisão (`% 2`).
3.  **Se for PAR:** O "meio" cai exatamente no primeiro caractere da segunda metade. Precisamos dele e do anterior.
    *   Usamos `substring(metade - 1, metade + 1)`.
4.  **Se for ÍMPAR:** O resultado da divisão aponta exatamente para o índice central.
    *   Usamos `substring(metade, metade + 1)`.

### 🔍 Complexidade

| Tipo   | Valor |
|--------|-------|
| Tempo  | O(1)  |
| Espaço | O(1)  |

- **Tempo:** O acesso a caracteres de uma string e operações matemáticas básicas são instantâneos, independente do tamanho da string (a string é acessada diretamente pelo índice).
- **Espaço:** Retornamos apenas uma string minúscula (1 ou 2 caracteres).

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito         | O que faz                                                                 | Exemplo de uso                  |
|---------------------------|---------------------------------------------------------------------------|---------------------------------|
| `word.length()`           | Retorna o número de caracteres na string.                                 | `"abc".length() // 3`           |
| `tamanho % 2 == 0`        | Verifica se um número é par (resto da divisão por 2 é zero).              | `4 % 2 // 0 (true)`             |
| `substring(inicio, fim)`  | Extrai uma parte da string. **Atenção:** O índice `fim` não é incluído.   | `"Java".substring(0, 2) // "Ja"`|


## 🧪 48. Velocidade da Barata

### ✅ Enunciado
A barata é um dos insetos mais rápidos. Escreva uma função que receba sua velocidade em **km por hora** e retorne em **cm por segundo**.

O resultado deve ser um número inteiro, arredondado para baixo (piso/floor).

**Exemplo:**
`1.08` km/h --> `30` cm/s

**Nota:** A entrada é um número Real (`double`) >= 0. O resultado deve ser um Inteiro (`int`).

### 💡 Lógica do Algoritmo
O problema é uma questão de física simples (conversão de unidades).

1.  **Quilômetros para Centímetros:**
    Sabemos que `1 km = 1000 m` e `1 m = 100 cm`.
    Logo, `1 km = 100.000 cm`.
2.  **Horas para Segundos:**
    Sabemos que `1 h = 60 min` e `1 min = 60 s`.
    Logo, `1 h = 3.600 s`.

**Fórmula:**
Para transformar a velocidade `X`, fazemos:
`Resultado = (X * 100.000) / 3.600`

**Arredondamento:**
Como precisamos retornar um inteiro arredondado para baixo, o Java facilita isso. Ao converter um número decimal positivo (`double`) para inteiro (`int`), a linguagem simplesmente "corta" tudo que vem depois da vírgula (truncamento), o que equivale matematicamente à função *floor*.

### 🔍 Complexidade

| Tipo   | Valor |
|--------|-------|
| Tempo  | O(1)  |
| Espaço | O(1)  |

- **Tempo:** Apenas uma operação matemática simples de multiplicação e divisão.
- **Espaço:** Uso apenas de variáveis primitivas temporárias.

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito       | O que faz                                                                 | Exemplo de uso                  |
|-------------------------|---------------------------------------------------------------------------|---------------------------------|
| `double`                | Tipo primitivo para números com ponto flutuante (decimais).               | `double vel = 1.08;`            |
| `(int) variavel`        | Casting explícito. Força a conversão de double para int, removendo decimais.| `(int) 29.9` resulta em `29`    |
| `*` e `/`               | Operadores aritméticos básicos.                                           | `val * 100000 / 3600`           |

## 🧪 49. Soma da Linha de Ímpares

### ✅ Enunciado
Dado um triângulo de números ímpares consecutivos:

             1
          3     5
       7     9    11
   13    15    17    19
21    23    25    27    29
...

Calcule a soma dos números na **n-ésima** linha deste triângulo (começando no índice 1).

**Exemplos:**
*   `1` --> `1`
*   `2` --> `3 + 5 = 8`

### 💡 Lógica do Algoritmo
Podemos tentar resolver isso somando número por número ("Força Bruta") ou encontrando o padrão matemático ("Pensamento Crítico").

Analisando as saídas:
1.  Linha 1: Soma = 1
2.  Linha 2: Soma = 8
3.  Linha 3: Soma = 27 (`7 + 9 + 11`)
4.  Linha 4: Soma = 64 (`13 + 15 + 17 + 19`)

Os resultados (`1, 8, 27, 64...`) são exatamente o **cubo** do número da linha:
*   $1^3 = 1$
*   $2^3 = 8$
*   $3^3 = 27$
*   $4^3 = 64$

Portanto, a solução mais eficiente não requer loops nem arrays, apenas multiplicar o número de entrada por ele mesmo 3 vezes (`n * n * n`).

### 🔍 Complexidade

| Tipo   | Valor |
|--------|-------|
| Tempo  | O(1)  |
| Espaço | O(1)  |

- **Tempo:** A operação matemática de multiplicação é instantânea e constante, não importa o tamanho de `n`.
- **Espaço:** Não armazenamos nada na memória.

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito       | O que faz                                                                 | Exemplo de uso                  |
|-------------------------|---------------------------------------------------------------------------|---------------------------------|
| `n * n * n`             | Calcula o cubo de um número (exponenciação simples).                      | `2 * 2 * 2 = 8`                 |
| `return`                | Devolve o resultado imediato da operação matemática.                      | `return n * n * n;
`             |



## 🧪 50. O Problema dos Canos de Lario e Muigi

### ✅ Enunciado
Parece que um encanador arruaceiro e seu irmão andaram correndo por aí e danificando suas fases novamente. Os canos que conectam as fases do seu nível precisam ser consertados.

Os canos estão corretos quando cada cano após o primeiro é exatamente **1 a mais** que o anterior (uma sequência perfeita).

**Tarefa:**
Dada uma lista de números únicos ordenados em ordem crescente, retorne uma nova lista para que os valores incrementem de 1 em 1, indo do valor mínimo ao valor máximo da lista original (ambos inclusos).

**Exemplo:**
Entrada: `1, 3, 5, 6, 7, 8`
Saída: `1, 2, 3, 4, 5, 6, 7, 8`

### 💡 Lógica do Algoritmo
O problema pede para recriar uma sequência completa (1, 2, 3...) baseada apenas nos limites da entrada.

1.  **Limites:** Como a entrada já é ordenada, o **Mínimo** é o primeiro elemento (`arr[0]`) e o **Máximo** é o último elemento (`arr[length-1]`).
2.  **Tamanho:** Para saber quantos números existem entre X e Y (inclusos), usamos a matemática: `Tamanho = Max - Min + 1`.
3.  **Preenchimento:** Criamos um novo array com esse tamanho e usamos um laço `for`. Em cada posição `i`, o valor será o valor inicial (`Min`) somado a `i`.

Exemplo mental com entrada `[4, 7]`:
*   Min = 4, Max = 7.
*   Tamanho = 7 - 4 + 1 = 4.
*   Array[0] = 4 + 0 = 4
*   Array[1] = 4 + 1 = 5
*   Array[2] = 4 + 2 = 6
*   Array[3] = 4 + 3 = 7
*   Resultado: `[4, 5, 6, 7]`.

### 🔍 Complexidade

| Tipo   | Valor |
|--------|-------|
| Tempo  | O(k)  |
| Espaço | O(k)  |

> Onde `k` é a diferença entre o maior e o menor número (o tamanho do intervalo).

- **Tempo:** O algoritmo itera exatamente o número de vezes necessário para preencher a nova sequência.
- **Espaço:** Aloca memória proporcional ao tamanho do intervalo de números.

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito         | O que faz                                                                 | Exemplo de uso                  |
|---------------------------|---------------------------------------------------------------------------|---------------------------------|
| `arr[arr.length - 1]`     | Acessa o último elemento de um array.                                     | `int max = nums[nums.length-1];`|
| `max - min + 1`           | Fórmula para calcular a quantidade de inteiros em um intervalo fechado.   | `10 - 5 + 1 = 6` itens.         |
| `min + i`                 | Lógica aritmética para gerar uma sequência crescente a partir de uma base.| `base + 0, base + 1...`         |

## 🧪 51. Converter Booleano para String

### ✅ Enunciado
Implemente uma função que converta um valor booleano (`true` ou `false`) em sua representação como **String** (texto).

**Nota:** Apenas entradas válidas serão fornecidas.

### 💡 Lógica do Algoritmo
O problema pede o mapeamento de um tipo de dado lógico (boolean) para um tipo de dado textual (String).

Embora a linguagem Java tenha métodos prontos para isso (`String.valueOf(b)`), a lógica interna é simples:
1.  Verificamos o valor de entrada.
2.  Se for verdadeiro (`true`), retornamos o texto literal `"true"`.
3.  Se não for verdadeiro (ou seja, `false`), retornamos o texto literal `"false"`.

É uma estrutura de decisão binária simples (`if / else`).

### 🔍 Complexidade

| Tipo   | Valor |
|--------|-------|
| Tempo  | O(1)  |
| Espaço | O(1)  |

- **Tempo:** A verificação condicional é instantânea.
- **Espaço:** Não há alocação de memória dinâmica, apenas o retorno de constantes de string.

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito       | O que faz                                                                 | Exemplo de uso                  |
|-------------------------|---------------------------------------------------------------------------|---------------------------------|
| `if (b)`                | Verifica se a condição booleana é verdadeira.                             | `if (ligado) { ... }`           |
| `return "texto"`        | Devolve uma string literal como resultado da função.                      | `return "true";`                |



## 🧪 52. Contando Ovelhas

### ✅ Enunciado
Considere um array/lista de ovelhas onde algumas podem estar faltando em seus lugares. Precisamos de uma função que conte o número de ovelhas presentes no array (onde `true` significa presente).

**Dica:** Não se esqueça de verificar por valores ruins como `null` ou `undefined`.

**Exemplo:**
Entrada: `[true, true, true, false, true, true, true, true, true, false, true, false, true, false, false, true, true, true, true, true, false, false, true, true]`
Saída: `17`

### 💡 Lógica do Algoritmo
O desafio principal é lidar com a possibilidade de valores `null` dentro do array de objetos `Boolean`.

1.  **Iteração:** Percorremos o array item a item.
2.  **Verificação de Nulo:** Antes de verificar se é verdadeiro, **devemos** verificar se o valor é diferente de `null`. Tentar ler o valor booleano de um nulo causa erro (`NullPointerException` em Java).
3.  **Contagem:** Se o valor não for nulo e for igual a `true`, incrementamos o contador.

### 🔍 Complexidade

| Tipo   | Valor |
|--------|-------|
| Tempo  | O(n)  |
| Espaço | O(1)  |

- **Tempo:** Percorremos o array uma única vez.
- **Espaço:** Usamos apenas uma variável inteira para o contador.

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito       | O que faz                                                                 | Exemplo de uso                  |
|-------------------------|---------------------------------------------------------------------------|---------------------------------|
| `Boolean[]`             | Array de objetos Wrapper (aceita `true`, `false` e `null`).               | `Boolean[] arr = {true, null};` |
| `sheep != null`         | Verificação defensiva obrigatória para evitar quebra do programa.         | `if (obj != null) { ... }`      |
| `sheep == true`         | Verifica se o valor booleano é verdadeiro.                                | `if (sheep) { ... }`            |


## 🧪 53. Definir Alarme (Lógica Booleana)

### ✅ Enunciado
Escreva uma função chamada `setAlarm` que recebe dois parâmetros. O primeiro parâmetro, `employed` (empregado), é verdadeiro quando você está empregado, e o segundo parâmetro, `vacation` (férias), é verdadeiro quando você está de férias.

A função deve retornar `true` se você estiver empregado e **não** estiver de férias (pois essas são as circunstâncias em que você precisa definir um alarme). Caso contrário, deve retornar `false`.

**Tabela Verdade:**

| Employed | Vacation | Saída (Alarme?) |
| :--- | :--- | :--- |
| `true` | `true` | `false` |
| `true` | `false` | `true` |
| `false` | `true` | `false` |
| `false` | `false` | `false` |

### 💡 Lógica do Algoritmo
Este é um exercício clássico de operadores lógicos.
Para o alarme tocar, duas condições precisam ser satisfeitas simultaneamente:
1.  A pessoa precisa ter um emprego (`employed == true`).
2.  A pessoa **NÃO** pode estar de férias (`vacation == false`).

Em lógica de programação, "E" é representado por `&&` e "NÃO" é representado por `!`.
Portanto, a fórmula é: `employed && !vacation`.

### 🔍 Complexidade

| Tipo   | Valor |
|--------|-------|
| Tempo  | O(1)  |
| Espaço | O(1)  |

- **Tempo:** Apenas uma operação lógica básica, instantânea.
- **Espaço:** Não usa memória adicional.

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito       | O que faz                                                                 | Exemplo de uso                  |
|-------------------------|---------------------------------------------------------------------------|---------------------------------|
| `&&` (AND)              | Operador lógico "E". Retorna true só se ambos os lados forem true.        | `true && false` -> `false`      |
| `!` (NOT)               | Operador lógico de negação. Inverte o valor booleano.                     | `!true` -> `false`              |


## 🧪 54. Remover Espaços da String

### ✅ Enunciado
Escreva uma função que remova os espaços de uma string e retorne a string resultante.

**Exemplos:**

| Entrada | Saída |
|---------|-------|
| `"8 j 8   mBliB8g  imjB8B8  jl  B"` | `"8j8mBliB8gimjB8B8jlB"` |
| `"8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"` | `"88Bifk8hB8BB8BBBB888chl8BhBfd"` |
| `"8aaaaa dddd r     "` | `"8aaaaaddddr"` |

### 💡 Lógica do Algoritmo
Embora a linguagem Java possua métodos poderosos como `.replace()`, a lógica estrutural para resolver isso manualmente é um algoritmo de **filtragem**:

1.  Criamos um acumulador (uma nova string ou `StringBuilder`) vazio.
2.  Percorremos a string original do início ao fim, caractere por caractere.
3.  Para cada caractere, fazemos uma pergunta: **"Este caractere é um espaço?"**
    *   Se **NÃO** for um espaço (`!= ' '`), nós o adicionamos ao acumulador.
    *   Se **FOR** um espaço, nós o ignoramos (não fazemos nada).
4.  Ao final do laço, o acumulador conterá apenas os caracteres válidos.

### 🔍 Complexidade

| Tipo   | Valor |
|--------|-------|
| Tempo  | O(n)  |
| Espaço | O(n)  |

- **Tempo:** É necessário visitar cada caractere da string uma vez para verificar se é espaço ou não.
- **Espaço:** No pior caso (uma string sem espaços), criaremos uma nova string do mesmo tamanho da original.

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito       | O que faz                                                                 | Exemplo de uso                  |
|-------------------------|---------------------------------------------------------------------------|---------------------------------|
| `StringBuilder`         | Classe para construir strings de forma dinâmica sem criar lixo na memória.| `sb.append('a');`               |
| `charAt(i)`             | Acessa o caractere em uma posição específica.                             | `str.charAt(0);`                |
| `!= ' '`                | Comparação de diferença. Verifica se o caractere não é um espaço vazio.   | `if (c != ' ')`                 |
| `append()`              | Adiciona um caractere ao final da string que está sendo construída.       | `resultado.append(c);`          |

## 🧪 55. Binário Falso (Fake Binary)

### ✅ Enunciado
Dada uma string de dígitos, você deve substituir qualquer dígito **abaixo** de 5 por `'0'` e qualquer dígito 5 ou **acima** por `'1'`. Retorne a string resultante.

**Nota:** A entrada nunca será uma string vazia.

**Exemplos:**
Entrada: `"45385593107843568"`
Saída: `"01011110001100111"`

### 💡 Lógica do Algoritmo
O objetivo é transformar uma string numérica em uma representação binária falsa baseada em um limiar (threshold) de 5.

A abordagem mais eficiente evita converter caracteres em números inteiros (`int`).
1.  Percorremos a string caractere por caractere.
2.  Utilizamos a comparação direta de caracteres ASCII.
    *   Na computação, os caracteres numéricos são sequenciais (`'0'` vem antes de `'1'`, que vem antes de `'2'`, etc.).
    *   Portanto, comparar se `caractere < '5'` é computacionalmente mais rápido e logicamente equivalente a converter para inteiro e comparar se `numero < 5`.
3.  Se for menor, adicionamos `'0'` ao resultado. Caso contrário, adicionamos `'1'`.

### 🔍 Complexidade

| Tipo   | Valor |
|--------|-------|
| Tempo  | O(n)  |
| Espaço | O(n)  |

- **Tempo:** Percorremos a string uma única vez (`n` é o número de dígitos).
- **Espaço:** Criamos uma nova string de tamanho idêntico à original.

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito       | O que faz                                                                 | Exemplo de uso                  |
|-------------------------|---------------------------------------------------------------------------|---------------------------------|
| `charAt(i)`             | Acessa o caractere em uma posição específica da string.                   | `str.charAt(0);`                |
| `c < '5'`               | Comparação direta de caracteres usando a tabela ASCII.                    | `if (c < '5') ...`              |
| `StringBuilder`         | Classe para construir strings de forma eficiente dentro de laços.         | `sb.append('0');`               |



## 🧪 56. Remover Âncora da URL

### ✅ Enunciado
Complete a função para que ela retorne a URL com tudo que estiver após a âncora (`#`) removido.

**Exemplos:**

| Entrada | Saída |
|---------|-------|
| `"www.codewars.com#about"` | `"www.codewars.com"` |
| `"www.codewars.com?page=1"` | `"www.codewars.com?page=1"` |

### 💡 Lógica do Algoritmo
O problema se resume a "cortar" uma string a partir de um caractere específico.

1.  **Localizar:** Perguntamos à string: "Em qual índice está o caractere `#`?".
2.  **Decidir:**
    *   Se a resposta for `-1` (não encontrado), a URL já está limpa. Retornamos ela inteira.
    *   Se a resposta for um número (ex: 16), sabemos que a âncora começa ali.
3.  **Cortar:** Usamos a operação de `substring` para pegar os caracteres do índice `0` até o índice encontrado. O resto é descartado.

### 🔍 Complexidade

| Tipo   | Valor |
|--------|-------|
| Tempo  | O(n)  |
| Espaço | O(n)  |

- **Tempo:** O método `indexOf` precisa percorrer a string até achar o caractere (pior caso: percorre tudo).
- **Espaço:** O método `substring` cria uma nova string na memória com o conteúdo recortado.

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito       | O que faz                                                                 | Exemplo de uso                  |
|-------------------------|---------------------------------------------------------------------------|---------------------------------|
| `url.indexOf('#')`      | Retorna o índice da primeira ocorrência do caractere. Retorna -1 se não achar. | `"abc#d".indexOf('#') // 3`     |
| `url.substring(0, fim)` | Cria uma nova string começando no índice 0 até o índice `fim` (não incluso). | `"abc#d".substring(0, 3) // "abc"`|
| `!= -1`                 | Verificação padrão para saber se algo foi encontrado dentro de uma string.| `if (pos != -1) ...`            |



## 🧪 57. Você está tocando banjo?

### ✅ Enunciado
Crie uma função que responda à pergunta "Você está tocando banjo?".
Se o seu nome começar com a letra "R" ou "r" minúsculo, você está tocando banjo!

A função recebe um nome como único argumento e retorna uma das seguintes strings:
- `nome + " plays banjo"`
- `nome + " does not play banjo"`

Os nomes fornecidos são sempre strings válidas.

### 💡 Lógica do Algoritmo
O problema exige a verificação apenas da **primeira letra** da string.
1.  Acessamos o caractere no índice `0` da string (`name.charAt(0)`).
2.  Verificamos se esse caractere é igual a `'R'` **OU** (`||`) se é igual a `'r'`.
3.  Baseado nisso, concatenamos o nome original com a frase correspondente.

Essa abordagem é mais eficiente do que métodos que analisam a string inteira (como regex), pois olhamos apenas para um único local na memória.

### 🔍 Complexidade

| Tipo   | Valor |
|--------|-------|
| Tempo  | O(1)  |
| Espaço | O(1)  |

- **Tempo:** Acessar um índice específico de um array/string é uma operação constante.
- **Espaço:** Criamos apenas uma nova string para o retorno.

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito       | O que faz                                                                 | Exemplo de uso                  |
|-------------------------|---------------------------------------------------------------------------|---------------------------------|
| `name.charAt(0)`        | Retorna o caractere na posição 0 (início) da string.                      | `"Ana".charAt(0)` retorna `'A'` |
| `||` (OU Lógico)        | Verifica se pelo menos uma das condições é verdadeira.                    | `if (x == 'A' || x == 'a')`     |
| `+` (Concatenação)      | Junta duas strings ou uma string e uma variável.                          | `name + " plays banjo"`         |




## 🧪 58. Remover Exclamações

### ✅ Enunciado
Escreva uma função `removeExclamationMarks` que remove todos os pontos de exclamação de uma determinada string.

**Exemplos:**
`"Hello World!"` --> `"Hello World"`
`"Hi! Hello!"` --> `"Hi Hello"`

### 💡 Lógica do Algoritmo
O problema é um clássico filtro de caracteres.

1.  Criamos um acumulador (como um `StringBuilder`).
2.  Percorremos a string de entrada do início ao fim.
3.  Para cada caractere, fazemos a verificação: **"Este caractere é diferente de `!`?"**
    *   Se for diferente, adicionamos ao acumulador.
    *   Se for igual a `!`, ignoramos e passamos para o próximo.
4.  Retornamos o conteúdo acumulado.

Essa abordagem manual é equivalente ao funcionamento interno do método `replace()`.

### 🔍 Complexidade

| Tipo   | Valor |
|--------|-------|
| Tempo  | O(n)  |
| Espaço | O(n)  |

- **Tempo:** Percorremos cada caractere da string uma única vez.
- **Espaço:** No pior caso (string sem exclamações), criamos uma cópia do mesmo tamanho da original.

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito       | O que faz                                                                 | Exemplo de uso                  |
|-------------------------|---------------------------------------------------------------------------|---------------------------------|
| `!= '!'`                | Verifica se o caractere é diferente de ponto de exclamação.               | `if (c != '!')`                 |
| `StringBuilder`         | Classe utilitária para montar strings dentro de loops sem desperdício de memória.| `sb.append(c);`           |
| `toString()`            | Converte o objeto StringBuilder para uma String final.                    | `return sb.toString();`         |


## 🧪 59. Número por Extenso (Switch)

### ✅ Enunciado
Quando fornecido um número entre 0-9, retorne-o por extenso (em palavras).
**Nota:** A entrada é garantida estar dentro do intervalo de 0-9.

**Exemplo:**
Entrada: `1`
Saída: `"One"`

Se a sua linguagem suportar, tente usar uma declaração `switch`.

### 💡 Lógica do Algoritmo
O problema é um mapeamento simples de **1 para 1**. Para cada entrada numérica, existe exatamente uma saída de texto correspondente.

Em vez de usar vários `if (numero == 1) ... else if (numero == 2)...`, utilizamos o `switch case`.
1.  O `switch` avalia a variável passada.
2.  Ele compara o valor com cada `case`.
3.  Quando encontra o correspondente, executa o código e retorna o valor imediatamente.

Isso torna o código extremamente legível e organizado para listas de valores discretos.

### 🔍 Complexidade

| Tipo   | Valor |
|--------|-------|
| Tempo  | O(1)  |
| Espaço | O(1)  |

- **Tempo:** O computador pula diretamente para o caso correto (tabela de salto), não precisando testar todas as condições anteriores sequencialmente como no `if-else`.
- **Espaço:** Não há alocação de memória dinâmica.

### 📘 Tabela de Métodos / Conceitos Utilizados

| Método / Conceito       | O que faz                                                                 | Exemplo de uso                  |
|-------------------------|---------------------------------------------------------------------------|---------------------------------|
| `switch (var)`          | Inicia a estrutura de controle de fluxo baseada no valor de `var`.        | `switch(numero) { ... }`        |
| `case X:`               | Define um bloco de código a ser executado se o valor for igual a `X`.     | `case 1: return "One";`         |
| `default:`              | Define o comportamento padrão se nenhum `case` for atendido.              | `default: return "";`           |








## 📂 Organização

Cada exercício está dentro de sua própria classe Java e os exercícios Com complexidade de POO estão na pasta `poo`, com o nome da questão em portugês no padrão camelCase.  
Exemplo: `Palindromo.java`, `Fatorial.java`, `InverterArray`, `SomarDePares`, `Fibonacci` etc.

---

## 🚀 Como executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/Devwalis/PraticandoLeetCode.git
   cd PraticandoLeetCode
