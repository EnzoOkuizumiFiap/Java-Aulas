# Java-Aulas - FIAP

Este repositório contém uma coleção abrangente de projetos e exercícios desenvolvidos durante o curso de Java na FIAP, organizados por semestres e cobrindo desde conceitos básicos até tópicos avançados de programação orientada a objetos e Domain Driven Design.

## 📚 Estrutura do Projeto

### 📖 Semestre 01 - Fundamentos de Java

#### Checkpoints
- **Checkpoint01** - DespesaFamiliar (Classes e Objetos)
- **Checkpoint02** - Aluno e DespesaFamiliar (Herança)

#### Projetos Progressivos
1. **Projeto01** - Primeiro Programa (Hello World)
2. **Projeto02** - Constantes e Tipos Primitivos
3. **Projeto03** - Entrada de Dados (Scanner e JOptionPane)
4. **Projeto04** - Orientação a Objetos (TV, Ar Condicionado, Carro, Radio)
5. **Projeto05** - Classes e Objetos Avançados
6. **Projeto06** - Folha de Pagamento com Interface Gráfica
7. **Projeto07** - Herança (Radio e Televisor)
8. **Projeto08** - Encapsulamento
9. **Projeto09** - Herança e Polimorfismo (Pessoa e Funcionario)
10. **Projeto10** - Manipulação de Strings e Datas
11. **Projeto11** - Herança Específica (Gestante)
12. **Projeto12** - Interfaces e Abstração
13. **Projeto13** - Sistema de Pagamento
14. **Projeto14** - Sistema Bancário
15. **Projeto15** - Aplicações Avançadas
16. **Projeto16** - Projeto Final do Semestre

---

### 📖 Semestre 02 - Tópicos Avançados

#### Checkpoints
- **Checkpoint 4** - Aplicações Avançadas
- **Checkpoint 5** - Sistema de Filmes com JDBC

#### Projetos Progressivos
1. **Projeto 01** - Conceitos Avançados
2. **Projeto 02** - Aplicações Práticas
3. **Projeto 03** - Programação Orientada a Objetos
4. **Projeto 04** - Estruturas de Dados
5. **Projeto 05** - Tratamento de Exceções (<- SaldoInsuficienteException | ContaBancaria com validações)
6. **Projeto 06** - Sistema de Cadastro com Persistência

#### Estacionamento - Focado em DDD (Domain Driven Design) com integração a banco de dados Oracle:

7. **estacionamento_07** - Implementação inicial do sistema de estacionamento.
8. **estacionamento_08** - Versão aprimorada com operações CRUD completas (Com DTO, DAO e Conexão com BD).
9. **estacionamento_09** - Refatoração e otimização do código, consolidando o padrão DAO.
10. **estacionamento_10** - Adição da entidade `Cliente`, expandindo o sistema com um novo CRUD.
11. **estacionamento_11** - Implementação de classes de teste para validar os CRUDs de `Carro` e `Cliente`.


#### Parking (MVC e Swing) Sistema de gerenciamento de estacionamento.

12. **parking_01**: Estruturação inicial do projeto no padrão MVC, com foco na entidade `Carro`.  
13. **parking_02**: Expansão do sistema para incluir o MVC da entidade `Cliente` e uma tela principal de navegação.  
14. **parking_03**: Implementação de uma interface gráfica (GUI) com Swing.
15. **parking_04**: Praticando - Incluindo novo item de menu miCliente.

#### Checkpoint 05
16. **Checkpoint 5** - Sistema de Filmes com JDBC

#### MegaFarma (API com Quarkus) API REST para um sistema de farmácia.

17. **megafarma_01**: Criação da API REST com endpoints para o CRUD de `Remedio`, utilizando o padrão BO (Business Object) Sem integração com BD.  
18. **megafarma_02**: Integração da API com banco de dados Oracle, adicionando persistência de dados ao sistema.

---

## 🏗️ Conceitos Abordados

### Fundamentos
- Sintaxe básica do Java
- Tipos de dados primitivos e wrappers
- Estruturas de controle (if, for, while)
- Arrays e Collections

### Orientação a Objetos
- Classes e Objetos
- Encapsulamento (getters/setters)
- Herança e Polimorfismo
- Interfaces e Classes Abstratas
- Sobrescrita e Sobrecarga de métodos

### Tópicos Avançados
- Tratamento de Exceções
- Manipulação de Strings e Datas
- Entrada e Saída de Dados
- Persistência com JDBC
- Domain Driven Design (DDD)

### Padrões de Projeto
- DTO (Data Transfer Object)
- DAO (Data Access Object)
- Factory Pattern (ConnectionFactory)

## 📊 Progressão de Aprendizado

O projeto segue uma progressão didática:

1. **Básico** - Sintaxe e conceitos fundamentais
2. **Intermediário** - Orientação a Objetos e Collections
3. **Avançado** - Exceções, Persistência e DDD
4. **Aplicado** - Projetos práticos e sistemas reais

## 🎯 Objetivos de Aprendizado

- Dominar a sintaxe e semântica do Java
- Compreender os pilares da Orientação a Objetos
- Aplicar padrões de projeto em Java
- Desenvolver aplicações com persistência de dados
- Implementar Domain Driven Design
- Criar interfaces gráficas simples
- Gerenciar exceções e tratamento de erros

## 🚀 Como Executar

### Pré-requisitos
- Java JDK 8 ou superior
- Oracle Database (para projetos de estacionamento)
- IntelliJ IDEA ou IDE compatível

### Execução
1. Clone o repositório
2. Abra o projeto desejado no IntelliJ IDEA
3. Configure as dependências (JDBC para Oracle)
4. Execute a classe `Main` do projeto escolhido

### Configuração do Banco (Estacionamento)
1. Configure a conexão Oracle no `ConnectionFactory`
2. Execute o script `ddd_carro.sql` para criar as tabelas
3. Ajuste as credenciais de conexão conforme necessário