# Workshop Spring Boot JPA

Projeto de estudo desenvolvido em **Java 17** com **Spring Boot 3**, focado no aprendizado de **Spring Data JPA**, **Hibernate** e **H2 Database**.

## 🛠 Tecnologias Utilizadas

- **Java 17** - Linguagem de programação
- **Spring Boot 3.5.5** - Framework principal
- **Spring Data JPA** - Abstração para acesso a dados
- **Hibernate** - Implementação JPA
- **H2 Database** - Banco de dados em memória
- **Maven** - Gerenciador de dependências

## 📂 Estrutura do Projeto

```
workshop-springboot-jpa/
├── src/
│   ├── main/
│   │   ├── java/curso/java/workshopjava/
│   │   │   ├── controller/    # Controladores REST
│   │   │   ├── model/  # Entidades JPA
│   │   │   │  ├── Enums/ # 
│   │   │   │  ├── PK/     
│   │   │   ├── repository/    # Repositórios de dados
│   │   │   ├── service/       # Camada de serviço
│   │   │   └── WorkshopjavaApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── application-test.properties
├── target/
├── pom.xml
└── README.md
```

##  Configuração e Execução

### Pré-requisitos
- Java 17 ou superior
- Maven 3.6+

 **Acesse a aplicação:**
   - Aplicação: http://localhost:8080
   - Console H2: http://localhost:8080/h2-console

### Configuração do H2 Database

**Credenciais para acesso ao console H2:**
- **JDBC URL:** `jdbc:h2:mem:testdb`
- **Username:** `sa`
- **Password:** *(deixar em branco)*


##  Endpoints da API

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/api/entities` | Lista todas as entidades |
| GET | `/api/entities/{id}` | Busca entidade por ID |
