# Object-Oriented Programming

[Ler em Português](README.md)

Exercises and projects from the Object-Oriented Programming course, in Java 17 and Spring Boot.

## About

The repository follows the course progression: plain Java first, then class modeling and inheritance, then web applications with Spring Boot, Thymeleaf and JPA persistence.

## Projects

| Folder | Type | What it practices |
| --- | --- | --- |
| `Aula08_09` | Plain Java | First program, compiling and running from the command line |
| `primeiroexemplo` | Spring Boot | Simple REST controller (`GET /hello`) |
| `demo` | Spring Boot | `Produto` class with encapsulation, constructor and `toString`, the base for the inheritance exercise (`Livro extends Produto`) |
| `projetos_springs/conversortemperaturas` | Spring Boot + Thymeleaf | Celsius, Fahrenheit and Kelvin converter in layers (controller, service, DTO), with absolute-zero validation |
| `projetos_springs/cadastroclientes` | Spring Boot + Thymeleaf + JPA + H2 | Customer CRUD with list, create, edit, delete, validation and the H2 console |
| `projetos_springs/triangulo` | Spring Boot | Initial scaffold for the triangle calculation exercise |

## Tech stack

- Java 17
- Spring Boot 4 (Web MVC, Thymeleaf, Validation, Data JPA)
- File-based H2 database
- Maven (through the Maven Wrapper shipped with each project)

## Running

Requirement: JDK 17 or newer. Maven does not need to be installed; every project ships `mvnw`.

```bash
git clone https://github.com/Luisr-nunes/POO.git
cd POO/projetos_springs/cadastroclientes

./mvnw spring-boot:run        # Linux/macOS
mvnw.cmd spring-boot:run      # Windows
```

The app starts on `http://localhost:8080`. In `cadastroclientes`, the database console is at `http://localhost:8080/h2-console` (JDBC URL `jdbc:h2:file:./data/clientes-db`, user `sa`, no password).

For the plain Java exercise:

```bash
cd Aula08_09
javac app.java
java app
```

## Author

Luís Nunes — [GitHub](https://github.com/Luisr-nunes) · [LinkedIn](https://www.linkedin.com/in/luis-nunes-dev/)

Academic project from the Systems Analysis and Development program at Cesar School.
