# MovieVerse

MovieVerse é uma API RESTful para gerenciamento de um catálogo de filmes. O sistema permite cadastrar, listar, atualizar e remover filmes, além de gerenciar categorias.

## Funcionalidades
- Cadastro de filmes
- Listagem de filmes
- Atualização de informações de filmes
- Remoção de filmes
- Gerenciamento de categorias

## Tecnologias Utilizadas
- Java
- Spring Boot
- Spring Data JPA
- Banco de dados relacional (ex: PostgreSQL)
- Flyway (migração de banco)

## Como executar o projeto

1. Clone o repositório:
   ```bash
   git clone <url-do-repositorio>
   ```
2. Acesse a pasta do projeto:
   ```bash
   cd movieflix
   ```
3. Configure o banco de dados em `src/main/resources/application.yaml`.
4. Execute o projeto:
   ```bash
   ./mvnw spring-boot:run
   ```

## Endpoints principais
- `GET /filmes` — Lista todos os filmes
- `POST /filmes` — Adiciona um novo filme
- `PUT /filmes/{id}` — Atualiza um filme existente
- `DELETE /filmes/{id}` — Remove um filme
- `GET /categorias` — Lista todas as categorias

## Estrutura do Projeto
- `controller/` — Controllers da API
- `service/` — Regras de negócio
- `repository/` — Acesso a dados
- `entity/` — Entidades JPA

## Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests.

## Licença
Este projeto está sob licença MIT.

