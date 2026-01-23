## 7️⃣ Sintaxe Básica da Linguagem Java

### 📌 Visão Geral
A sintaxe de uma linguagem de programação define as **regras de escrita do código**. Em Java, a sintaxe é rigorosa e bem definida, o que contribui para a **clareza**, **organização** e **segurança** dos programas.

---

### 🔤 Case Sensitive
Java é uma linguagem **case sensitive**, ou seja, diferencia letras maiúsculas de minúsculas.
Exemplo:
```java
int idade;
int Idade; // variável diferente
```
Isso significa que nomes de variáveis, métodos e classes devem ser escritos sempre de forma consistente.

### 🧩 Tipos de Dados Primitivos
Java possui tipos de dados primitivos para valores simples:
- **int**: números inteiros
- **double**: números reais
- **float**: números reais (menor precisão)
- **char**: caracteres
- **boolean**: valores lógicos (true/false)
- **byte, short, long**: variações de inteiros

Exemplo:
```java
int idade = 25;
double salario = 2500.50;
boolean ativo = true;
char sexo = 'M';
```

### 🏷️ Variáveis
Variáveis armazenam dados temporariamente.
Regras:
- Devem ser declaradas com um tipo.
- Devem possuir um nome válido.
- Podem ser inicializadas no momento da declaração.

Exemplo:
```java
int quantidade;
quantidade = 10;
```

### 🔒 Constantes
Valores que não mudam. Usa-se a palavra-chave `final`.
Exemplo:
```java
final double PI = 3.14159;
```
Por convenção, constantes são escritas em MAIÚSCULAS.

### 🔄 Conversão de Tipos (Casting)
- **Implícito**: Sem perda de dados (ex: int para double).
- **Explícito**: Requer intervenção (ex: double para int).

Exemplo:
```java
double valor = 9.8;
int resultado = (int) valor;
```

### 📝 Estrutura das Instruções
Instruções terminam com ponto e vírgula (`;`). Blocos são delimitados por chaves (`{ }`).

### 📦 Pacotes (Packages)
Organizam classes e evitam conflitos de nomes.
Exemplo:
```java
package br.com.meuprojeto;
```

### 📥 Importação de Classes
Usa-se `import` para classes de outros pacotes.
Exemplo:
```java
import java.util.Scanner;
```

### 🖨️ Entrada e Saída Básica
Saída: `System.out.println("Mensagem");`
Entrada: `Scanner sc = new Scanner(System.in);`

### 📎 Conclusão
Dominar a sintaxe é essencial para evitar erros de compilação e avançar em POO.