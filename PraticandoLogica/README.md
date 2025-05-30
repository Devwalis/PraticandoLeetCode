# 🧠 Praticando LeetCode em Java

Este repositório contém resoluções de problemas clássicos de lógica de programação, frequentemente cobrados em **entrevistas técnicas**.  
Todos os algoritmos estão implementados em **Java**, com explicações passo a passo e comentários detalhados.

---

## 📌 Lista de Exercícios

1. [Palíndromo](#1-palíndromo)  
2. [Fatorial Recursivo](#2-fatorial-recursivo)  
*(mais serão adicionados...)*

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

## 📂 Organização

Cada exercício está dentro de sua própria classe Java, com o nome da questão em portugês no padrão camelCase.  
Exemplo: `Polindromo.java`, `Fatorial.java`, etc.

---

## 🚀 Como executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/Devwalis/PraticandoLeetCode.git
   cd PraticandoLeetCode
