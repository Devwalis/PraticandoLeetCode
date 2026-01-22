## 6️⃣ Estrutura Básica de um Programa Java

### 📌 Visão Geral

Todo programa em Java segue uma **estrutura bem definida**, baseada em classes e métodos.  
Compreender essa estrutura é essencial para escrever, ler e manter código Java corretamente.

Mesmo programas simples obedecem a esse padrão, que prepara o desenvolvedor para trabalhar com **Orientação a Objetos**.

---

### 📄 Arquivo `.java`

Um programa Java é escrito em um arquivo com extensão:

text
.java

Esse arquivo contém o código-fonte da aplicação e deve seguir algumas regras importantes:

*   O nome do arquivo deve ser **exatamente igual** ao nome da classe principal.
*   Java diferencia letras maiúsculas e minúsculas (**Case Sensitive**).

---


### 🧱 Classe

Em Java, todo programa é definido dentro de uma classe. A classe funciona como um molde que define o comportamento e a estrutura do programa.

**Características importantes:**

*   Java é uma linguagem baseada em classes.
*   Não existe código solto fora de classes (diferente de Python ou JS).
*   Uma aplicação pode conter várias classes.

---

### ▶️ Método main

O método `main` é o **ponto de entrada** de um programa Java. É a partir dele que a **JVM** (Java Virtual Machine) inicia a execução da aplicação.

**Principais características:**

*   Deve ser declarado corretamente (`public static void main`).
*   É **obrigatório** em aplicações executáveis.
*   Recebe argumentos da linha de comando (`String[] args`).

> ⚠️ **Atenção:** Sem o método `main`, a aplicação não pode ser executada diretamente.

---

### 🧩 Estrutura Geral de um Programa Java

De forma simplificada, um programa Java contém a declaração da classe, o método main e as instruções.

**Exemplo visual da estrutura:**




### 📝 Comentários em Java

Comentários são utilizados para explicar o código e facilitar a manutenção. O compilador ignora essas linhas.

Java possui três tipos de comentários:

*   **Comentário de linha:** `// Comentário aqui`

---

### 📐 Convenções de Nomenclatura

Java segue convenções estritas que ajudam na padronização e leitura do código:

| Tipo | Regra | Exemplo |
| :--- | :--- | :--- |
| **Classes** | Letra inicial Maiúscula (PascalCase) | `MinhaClasse`, `Usuario` |
| **Métodos** | Letra inicial minúscula (camelCase) | `calcularSoma`, `imprimir` |
| **Variáveis** | Letra inicial minúscula (camelCase) | `nomeCompleto`, `idade` |
| **Constantes** | Tudo maiúsculo (SCREAMING_SNAKE_CASE) | `VALOR_MAXIMO`, `PI` |

---

### 📎 Importância da Estrutura Básica

Entender a estrutura básica de um programa Java é fundamental para:

*   ✅ Compreender códigos existentes.
*   ✅ Evitar erros comuns de compilação.
*   ✅ Avançar para conceitos mais complexos da linguagem.

Essa base é essencial para o estudo da sintaxe, controle de fluxo e orientação a objetos.

---

### 📎 Conclusão do Tópico

A estrutura básica de um programa Java define como a aplicação é organizada e executada.

Dominar esse conceito é o primeiro passo prático para programar em Java e compreender sua forte ligação com a **Orientação a Objetos**.