# SalesPersistence-JPA: Sistema de Gestão de Vendas com JPA/Hibernate

Este projeto é um back-end robusto desenvolvido em Java para o gerenciamento de ecossistemas comerciais (vendas, clientes e produtos). Ele demonstra o domínio técnico sobre **Arquitetura em Camadas**, **Padrões de Projeto (Design Patterns)** e a especificação **JPA (Java Persistence API)** com o provedor **Hibernate**.

---

## 🏗️ Arquitetura do Sistema

O projeto segue uma **arquitetura em 3 camadas**, garantindo a separação de responsabilidades e alta testabilidade:

1.  **Camada de Serviço (Service Layer):** Orquestra a lógica de negócio e as regras do domínio.
2.  **Camada de Acesso a Dados (DAO):** Isola a persistência utilizando o padrão **Generic DAO** com Java Generics.
3.  **Camada de Domínio (Entities):** Modelagem rica do negócio utilizando anotações JPA para mapeamento objeto-relacional (ORM).

---

## 🛠️ Stack Tecnológica

*   **Java SE 17+:** Versão estável e moderna da linguagem.
*   **JPA / Hibernate:** Mapeamento objeto-relacional e gestão de persistência.
*   **PostgreSQL:** Banco de dados relacional para ambiente de produção.
*   **H2 Database:** Banco de dados em memória utilizado para isolamento total nos testes de integração.
*   **JUnit 4/5:** Framework para automação de testes unitários e de integração.
*   **Maven:** Gestão de dependências e automação de build.

---

## 🧪 Estratégia de Qualidade

O projeto destaca-se pela sua robusta suíte de testes:

*   **Testes de Integração (DAO):** Validam a persistência real no banco H2, garantindo que as queries e mapeamentos `@Entity` estejam corretos.
*   **Testes Unitários (Service):** Utilizam **Mocks** para validar a lógica de negócio em isolamento total da infraestrutura.
*   **Regras de Status:** Testes específicos para garantir o ciclo de vida da venda (`INICIADA` -> `CONCLUIDA` | `CANCELADA`).

---

## 🧩 Modelo de Domínio (JPA Entities)

As entidades utilizam anotações avançadas para refletir o banco de dados:
*   `@OneToMany` com `CascadeType.ALL` para gerenciar itens de venda de forma automática.
*   `@ManyToOne` com `@JoinColumn` para relacionamentos resilientes.
*   Uso de `BigDecimal` para garantir precisão absoluta em cálculos financeiros.

---

## 🚀 Como Executar

### Pré-requisitos
*   Java JDK 17+ instalado.
*   Maven 3+ configurado.
*   PostgreSQL (opcional, necessário apenas para rodar fora dos testes).

### Passos
1.  **Build Completo:** Execute `mvn clean install` para compilar e rodar todos os testes.
2.  **Executar Testes:** Use `mvn test` para validar as camadas de Service e DAO.
3.  **Configuração de Produção:** Edite o arquivo `src/main/resources/META-INF/persistence.xml` com suas credenciais do PostgreSQL.

---

## 📌 Evolução Técnica
Este projeto representa o quarto estágio da trilha de formação, consolidando o conhecimento de **Frameworks Industriais**. A transição do JDBC nativo para o JPA/Hibernate demonstra a capacidade de lidar com sistemas complexos e escaláveis, preparando o terreno para a arquitetura de Microserviços.

---
*Desenvolvido por Renan Queiroz Eliziario como parte do portfólio profissional de arquitetura Java.*
