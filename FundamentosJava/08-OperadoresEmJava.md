## 8️⃣ Operadores em Java

### 📌 Visão Geral
Operadores são símbolos utilizados para realizar **operações sobre valores e variáveis**. Em Java, permitem executar cálculos, comparações, atribuições e operações lógicas.

### ➕ Operadores Aritméticos
| Operador | Descrição | Exemplo |
|---|---|---|
| + | Adição | a + b |
| - | Subtração | a - b |
| * | Multiplicação | a * b |
| / | Divisão | a / b |
| % | Módulo (resto) | a % b |

### 🧮 Operadores de Atribuição
- `=`: Atribuição simples
- `+=`: Adição e atribuição (`a = a + b`)
- `-=`: Subtração e atribuição
- `*=`: Multiplicação e atribuição

### 🔍 Operadores Relacionais
Retornam sempre um valor **boolean** (true ou false).
- `==`: Igual a
- `!=`: Diferente de
- `>`: Maior que
- `<`: Menor que
- `>=`: Maior ou igual
- `<=`: Menor ou igual

### 🔗 Operadores Lógicos
- `&&`: AND (E) - Ambas devem ser verdadeiras.
- `||`: OR (OU) - Pelo menos uma deve ser verdadeira.
- `!`: NOT (NÃO) - Inverte o valor lógico.

### ➕➖ Operadores Unários
- `++`: Incremento (soma 1)
- `--`: Decremento (subtrai 1)

### 🔀 Operador Ternário
Uma forma simplificada de `if-else`.
Sintaxe: `condicao ? valorVerdadeiro : valorFalso;`

Exemplo:
```java
String status = (idade >= 18) ? "Adulto" : "Menor";
```

### 📐 Precedência
A ordem padrão é: parênteses, unários, multiplicação/divisão, adição/subtração, relacionais, lógicos e, por fim, atribuição.