## 4️⃣ Plataforma Java: JVM, JRE e JDK

### 📌 Visão Geral da Plataforma Java

A plataforma Java é composta por um conjunto de tecnologias que permitem o **desenvolvimento**, **execução** e **gerenciamento** de aplicações Java.

Os principais componentes da plataforma Java são:

- **JVM (Java Virtual Machine)**
- **JRE (Java Runtime Environment)**
- **JDK (Java Development Kit)**

Cada um desses elementos possui uma função específica dentro do ecossistema Java.

---

### ⚙️ JVM – Java Virtual Machine

A **Java Virtual Machine (JVM)** é responsável por **executar os programas Java**.

Ela funciona como uma camada intermediária entre o sistema operacional e o código Java, permitindo que o mesmo programa seja executado em diferentes plataformas.

Principais responsabilidades da JVM:

- Executar o **bytecode**
- Gerenciar a memória da aplicação
- Controlar a execução dos programas
- Garantir segurança durante a execução

A JVM é específica para cada sistema operacional, mas o **bytecode Java é o mesmo em todas as plataformas**.

---

### 📦 JRE – Java Runtime Environment

O **Java Runtime Environment (JRE)** é o ambiente necessário para **executar aplicações Java**.

Ele é composto por:

- JVM
- Bibliotecas padrão da linguagem Java
- Arquivos de suporte à execução

O JRE **não contém ferramentas de desenvolvimento**, sendo destinado apenas à execução de aplicações já prontas.

---

### 🛠️ JDK – Java Development Kit

O **Java Development Kit (JDK)** é o conjunto de ferramentas necessário para **desenvolver aplicações Java**.

Ele inclui:

- JRE
- Compilador Java (`javac`)
- Ferramentas de depuração
- Ferramentas de documentação
- Utilitários de desenvolvimento

Para programar em Java, é obrigatório ter o **JDK instalado**.

---

### 🔄 Relação entre JVM, JRE e JDK

A relação entre os componentes da plataforma Java pode ser resumida da seguinte forma:

- **JDK** contém o **JRE**
- **JRE** contém a **JVM**
- **JVM** executa o bytecode

Essa hierarquia garante que o desenvolvedor tenha todas as ferramentas necessárias para criar aplicações, enquanto o usuário final precisa apenas do ambiente de execução.

---

### 🔁 Processo de Compilação e Execução

O funcionamento de um programa Java segue os seguintes passos:

1. O código-fonte é escrito em arquivos `.java`
2. O compilador (`javac`) transforma o código em **bytecode**
3. O bytecode é armazenado em arquivos `.class`
4. A JVM carrega e executa o bytecode
5. A aplicação é executada no sistema operacional

Esse processo é fundamental para a portabilidade da linguagem Java.

---

### 📎 Conclusão do Tópico

A compreensão da plataforma Java é essencial para entender como a linguagem funciona internamente.

Saber a diferença entre **JVM**, **JRE** e **JDK** ajuda o programador a configurar corretamente o ambiente de desenvolvimento e a compreender o conceito de **independência de plataforma**.
