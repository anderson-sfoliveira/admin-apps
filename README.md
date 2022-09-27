<h1 align="center">
  Library API
</h1>

[![Heroku Deployment](https://github.com/anderson-sfoliveira/admin-apps/actions/workflows/deployment.yml/badge.svg)](https://github.com/anderson-sfoliveira/admin-apps/actions/workflows/deployment.yml)

Tabela de conteúdos
=================
<!--ts-->
* [Sobre o projeto](#-sobre-o-projeto)
* [Como executar o projeto](#-como-executar-o-projeto)
    * [Pré-requisitos](#pré-requisitos)
    * [Rodando a api](#-rodando-a-api)
* [Tecnologias](#-tecnologias)
* [Autor](#-autor)
* [Licença](#user-content--licença)
<!--te-->


## 💻 Sobre o projeto
**[URL da API](https://admin-apps.herokuapp.com/applications)**
Desenvolvido durante o curso **Design de API's RestFul com Spring Boot, TDD e o novo JUnit5** oferecido pela [Udemy](https://www.udemy.com/course/design-de-apis-restful-com-tdd-spring-boot-e-junit-5/).

Esta API realiza o controle de uma biblioteca.
Utilizamos o Spring Boot Starter Actuator para monitorar as informações e status da aplicação.

A biblioteca Spring Boot Admin foi utilizada para fazer a integração com a aplicação [admin-apps](https://github.com/anderson-sfoliveira/admin-apps) que criamos para fornecer uma interface administrativa para monitorar aplicativos Spring Boot.
Neste outro aplicativo são demonstradas as informações coletadas pelo Spring Boot Starter Actuator.

## 🚀 Como executar o projeto

### Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina o Java 11 e o [Maven](https://maven.apache.org/).

Além disto é bom ter um editor de código, como o: [Intellij](https://www.jetbrains.com/pt-br/idea/).

#### 🎲 Rodando a API

```bash

# Clone este repositório
$ git clone https://github.com/anderson-sfoliveira/admin-apps.git

# Importe o projeto para dentro do Intellij.

# Inicie a aplicação.

# O servidor inciará na porta:8081

#http://localhost:8081/applications

```


## 🛠 Tecnologias


#### **Bibliotecas utilizadas na API**

-   **Java 11**
-   **Spring Boot 2.7.4**
-   **Spring Boot Starter Web**
-   **[Spring Boot Admin (version 2.7.5)](https://github.com/codecentric/spring-boot-admin)**

> Veja o arquivo [pom.xml](https://github.com/anderson-sfoliveira/admin-apps/blob/main/pom.xml)


## 🦸🏾 Autor

<a href="https://www.linkedin.com/in/anderson-sfoliveira/">
 <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/2175235?s=400&u=432d3456eb62f2df111abdccd667976321f6f74a&v=4" width="100px;" alt=""/>
 <br />
 <sub><b>Anderson Oliveira</b></sub></a> <a href="https://www.linkedin.com/in/anderson-sfoliveira/" title="Anderson Oliveira"></a>
 <br />

[![Linkedin Badge](https://img.shields.io/badge/-Anderson-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/anderson-sfoliveira/)](https://www.linkedin.com/in/anderson-sfoliveira/)
[![Gmail Badge](https://img.shields.io/badge/-anderson.sfoliveira@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:anderson.sfoliveira@gmail.com)](mailto:anderson.sfoliveira@gmail.com)

Feito com ❤️ por Anderson Oliveira 👋🏽 Entre em contato!


## 📝 Licença

Este projeto esta sobe a licença [MIT](./LICENSE).

Feito com ❤️ por Anderson Oliveira 👋🏽 Entre em contato!
