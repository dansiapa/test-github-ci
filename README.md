# Java 8 Web App with CI/CD

![CI Status](https://github.com/USERNAME/java-webapp-ci/actions/workflows/build-war.yml/badge.svg)

Simple Java 8 web application with **GitHub Actions CI** that automatically builds a `.war` file on every push.

## Tech Stack

- Java 8
- Servlet 4.0
- Maven
- JUnit 4
- GitHub Actions (CI)

## Project Structure

```
java-webapp-ci/
├── .github/workflows/
│   └── build-war.yml       ← CI workflow
├── src/
│   ├── main/
│   │   ├── java/com/example/
│   │   │   ├── HelloServlet.java
│   │   │   └── AppInfo.java
│   │   └── webapp/
│   │       ├── WEB-INF/web.xml
│   │       └── index.jsp
│   └── test/java/com/example/
│       ├── HelloServletTest.java
│       └── AppInfoTest.java
├── pom.xml
├── .gitignore
└── README.md
```

## Quick Start

### Build locally
```bash
mvn clean package
```

### Run tests
```bash
mvn test
```

### Deploy WAR
Copy `target/java-webapp-ci.war` to your Tomcat `webapps/` folder.

## CI/CD

Workflow otomatis berjalan setiap kali:
- Push ke branch `main` atau `develop`
- Pull Request ke `main`
- Trigger manual via GitHub Actions UI

### Cara download WAR dari CI:
1. Buka tab **Actions** di repository
2. Klik workflow run yang berhasil (✅)
3. Scroll ke **Artifacts**
4. Download `java-webapp-ci-war`

## Endpoints

| Method | Path | Description |
|--------|------|-------------|
| GET | `/` | Home page (JSP) |
| GET | `/hello` | Hello World |
| GET | `/hello?name=xxx` | Custom greeting |
