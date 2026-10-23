# Programação Orientada a Objetos

<!-- badges -->
![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white) ![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=flat-square&logo=html5&logoColor=white) ![CSS3](https://img.shields.io/badge/CSS3-663399?style=flat-square&logo=css&logoColor=white) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=flat-square&logo=springboot&logoColor=white) ![Thymeleaf](https://img.shields.io/badge/Thymeleaf-005F0F?style=flat-square&logo=thymeleaf&logoColor=white) ![H2](https://img.shields.io/badge/H2-1F5C99?style=flat-square) ![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat-square&logo=apachemaven&logoColor=white)

[Read in English](README.en.md)

Exercícios e projetos da disciplina de Programação Orientada a Objetos, em Java 17 e Spring Boot.

## Sobre

O repositório acompanha a evolução da disciplina: começa com Java puro, passa por modelagem de classes e herança e chega a aplicações web com Spring Boot, Thymeleaf e persistência com JPA.

## Projetos

| Pasta | Tipo | O que pratica |
| --- | --- | --- |
| `Aula08_09` | Java puro | Primeiro programa, compilação e execução pela linha de comando |
| `primeiroexemplo` | Spring Boot | Controller REST simples (`GET /hello`) |
| `demo` | Spring Boot | Classe `Produto` com encapsulamento, construtor e `toString`, base para o exercício de herança (`Livro extends Produto`) |
| `projetos_springs/conversortemperaturas` | Spring Boot + Thymeleaf | Conversor entre Celsius, Fahrenheit e Kelvin em camadas (controller, service, DTO), com validação de zero absoluto |
| `projetos_springs/cadastroclientes` | Spring Boot + Thymeleaf + JPA + H2 | CRUD de clientes com listagem, cadastro, edição, remoção, validação e console H2 |
| `projetos_springs/triangulo` | Spring Boot | Estrutura inicial do exercício de cálculo de triângulos |

## Tecnologias

- Java 17
- Spring Boot 4 (Web MVC, Thymeleaf, Validation, Data JPA)
- Banco H2 em arquivo
- Maven (via Maven Wrapper incluído em cada projeto)

## Como executar

Pré-requisito: JDK 17 ou superior. Não é preciso instalar o Maven, cada projeto traz o `mvnw`.

```bash
git clone https://github.com/Luisr-nunes/POO.git
cd POO/projetos_springs/cadastroclientes

./mvnw spring-boot:run        # Linux/macOS
mvnw.cmd spring-boot:run      # Windows
```

A aplicação sobe em `http://localhost:8080`. No `cadastroclientes`, o console do banco fica em `http://localhost:8080/h2-console` (JDBC URL `jdbc:h2:file:./data/clientes-db`, usuário `sa`, sem senha).

Para o exercício em Java puro:

```bash
cd Aula08_09
javac app.java
java app
```

## Autor

Luís Nunes — [GitHub](https://github.com/Luisr-nunes) · [LinkedIn](https://www.linkedin.com/in/luis-nunes-dev/)

Projeto acadêmico do curso de Análise e Desenvolvimento de Sistemas da Cesar School.
