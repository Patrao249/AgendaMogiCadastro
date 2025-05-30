# Projeto de Cadastro de Usuários

Este é um projeto simples feito com *Spring Boot* e *Thymeleaf* para cadastro,listagem,exclusão e Pesquisa de usuário.

## Funcionalidades

- Cadastro de usuários (id,nome email,telefone e endereço )
- Listagem de usuários salvos no banco de dados
- Exclusão de usuários salvos no banco de dados

##  Como executar o projeto

### Pré-requisitos

- Java 17 ou superior
- Maven
- Banco de dados H2(ajustar no application.properties)
- IDE (IntelliJ, Eclipse, VS Code)

### Passo a passo

1. Clone o repositório:
   bash
   git clone https://github.com/Patrao249/AgendaMogiCadastro.git
   cd AgendaMogiCadastro



2. Compile o projeto com Maven:
   bash
   mvn clean install

3. Rode a aplicação:
   bash
   mvn spring-boot:run

### ⚙️ Configuração do banco de dados

No arquivo application.properties, configure o banco de dados. Exemplo usando H2:


spring.datasource.url=jdbc:h2:mem:usuariosdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true

Acesse o console do H2:

http://localhost:8080/h2-console
```

### ✍️ Autor
Feito por Wellington de Castro - 11232101354<br>
Feito por Gabriel da Silva Pereira - 11232101101
