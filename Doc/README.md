```markdown
# 🍷 WinerySys - Sistema de Gestão para Loja de Vinhos

WinerySys é um sistema distribuído que simula a operação de uma loja de vinhos utilizando arquitetura orientada a serviços. O sistema é composto por três módulos principais:

- **WinerySys (Servidor Principal)**
- **WineOrderClient (Cliente de Pedidos)**
- **WineStockClient (Cliente de Estoque)**

Cada módulo é desenvolvido em Java com Jakarta EE e se comunica por meio de chamadas RMI (Remote Method Invocation). 

---

## 👤 Autores

* Guilherme Catelli Bichaco - RM 97989
* Vinicius SObreira Borges - RM 97767

---

## 📦 Estrutura do Projeto

```

WinerySys/           → Servidor que gerencia o sistema
WineOrderClient/     → Cliente para registrar e listar pedidos de vinho
WineStockClient/     → Cliente para gerenciar e consultar o estoque

````

---

## 🚀 Funcionalidades

### 🧠 WinerySys (Servidor)
- Registro de pedidos de vinho recebidos
- Atualização e consulta de estoque
- Armazenamento de dados simulados em memória
- Serviço RMI para expor métodos aos clientes

### 📦 WineOrderClient
- Interface de terminal para:
  - Criar novos pedidos
  - Listar pedidos realizados
- Comunicação via RMI com WinerySys

### 🛒 WineStockClient
- Interface de terminal para:
  - Adicionar vinhos ao estoque
  - Consultar quantidade de vinhos disponíveis
- Comunicação via RMI com WinerySys

---

## 💻 Como rodar o projeto no IntelliJ IDEA

### Pré-requisitos

- Java JDK 17 ou superior (Preferencialmente 21)
- IntelliJ IDEA (Community ou Ultimate)
- Maven configurado (ou usar o embutido no IntelliJ)

### Passo a passo

1. **Clone o repositório:**

```bash
git clone https://github.com/GuiBichaco/API_SOAP_Client_And_Server.git
````

2. **Abra o IntelliJ:**

   * Clique em **"Open"**
   * Selecione a pasta raiz do projeto que contém as três subpastas

3. **Importe como projeto Maven:**

   * O IntelliJ detectará os arquivos `pom.xml`
   * Caso não detecte, clique com o botão direito no `pom.xml` de cada módulo e selecione **"Add as Maven Project"**

4. **Configure os módulos:**

   * Vá em `File > Project Structure > Modules`
   * Certifique-se de que cada pasta (`WinerySys`, `WineOrderClient`, `WineStockClient`) está marcada como um módulo
   * Verifique se o SDK está como Java 17 ou superior

5. **Compile o projeto:**

   * Use `Build > Rebuild Project`

6. **Execute os módulos na ordem:**

   * **Passo 1**: Execute o `WinerySys` (Servidor)

     * Vá até a classe `Loader`, clique com o botão direito e selecione "Run"

   * **Passo 2**: Execute o `WineStockClient` para cadastrar vinhos no estoque

   * **Passo 3**: Execute o `WineOrderClient` para registrar pedidos

   **Importante:** O servidor deve estar em execução antes dos clientes.

---

## 🔧 Tecnologias Utilizadas

* Java 21+
* Maven
* Jakarta EE (substituindo javax)
* RMI (Remote Method Invocation)
* IntelliJ IDEA

---

## 📖 Explicações Técnicas

* **RMI Registry:** O servidor registra objetos remotos com nomes que os clientes usam para localizar e invocar métodos remotamente.
* **Serialização:** Os objetos trafegados entre cliente e servidor precisam ser `Serializable`.
* **Separação de Interfaces:** As interfaces RMI são compartilhadas entre servidor e cliente. É ideal colocá-las em um módulo comum ou copiar o mesmo pacote de interface em todos os módulos.
* **Execução Local:** Tudo roda localmente (`localhost`), sem dependência de rede externa.

---

## 🛠️ Futuras Melhorias (Ideias)

* Persistência com banco de dados (JPA/Hibernate)
* Interface gráfica (JavaFX ou Web)
* Autenticação de usuários
* Suporte REST usando Jakarta RESTful Web Services

---

```
