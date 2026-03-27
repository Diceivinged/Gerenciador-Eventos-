# 📅 Gerenciador de Eventos Fullstack

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=for-the-badge&logo=javascript&logoColor=%23F7DF1E)
![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)

Este é um sistema completo de gerenciamento de eventos desenvolvido para consolidar conhecimentos em **Java Spring Boot** e **JavaScript Assíncrono**. A aplicação permite o controle total (CRUD) de compromissos com uma interface fluida e intuitiva.

## 🚀 Funcionalidades

- **CRUD Completo**: Cadastro, listagem, edição e exclusão de eventos.
- **Validação Inteligente**: Filtro no frontend que impede o envio de dados vazios.
- **Interface Dinâmica**: Atualização da tabela em tempo real usando `Fetch API`.
- **Estilização por Categoria**: Cores diferenciadas para eventos de Lazer, Trabalho e Outros.
- **Histórico Visual**: Eventos com data passada ganham um destaque visual (opacidade reduzida).
- **Busca em Tempo Real**: Filtro de pesquisa por nome diretamente na tabela.

## 🛠️ Tecnologias

- **Backend:** Java 17, Spring Boot, Spring Data JPA.
- **Banco de Dados:** H2 Database (In-memory para desenvolvimento rápido).
- **Frontend:** HTML5, CSS3 (Flexbox/Grid), JavaScript Vanilla (ES6+).
- **Ícones:** Font Awesome.

## 📁 Estrutura do Projeto

```text
├── src/main/java        # Regras de negócio e Controllers API
├── src/main/resources   # Configurações e Banco H2
│   └── static           # Frontend (index.html, scripts, styles)
└── pom.xml              # Gerenciador de dependências Maven