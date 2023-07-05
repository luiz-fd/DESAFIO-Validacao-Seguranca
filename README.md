# TDD Validação e Segurança

# Sobre o projeto

Aplicação backend construída durante o treinamento java spring, organizado pela [DevSuperior](https://devsuperior.com.br "Site da DevSuperior").

Consiste na implementação das funcionalidades necessárias para que os testes do projeto fornecido passem,
além de obedecer as regras definidas abaixo


## Modelo conceitual
![modelo](https://github.com/luiz-fd/DESAFIO-Validacao-Seguranca/assets/58195921/d6c790d0-a12a-4374-99cf-29feaefca039)


## Regras
### Regras de controle de acesso:
 - Somente rotas de leitura (GET) de eventos e cidades são públicas (não requer login).
 - Usuários CLIENT e/ou ADMIN podem inserir novos eventos (POST).
 - Os demais acessos são permitidos apenas a usuários ADMIN.

### Regras de validação de City:
 - Nome não pode ser vazio

### Regras de validação de Event:
 - Nome não pode ser vazio
 - Data não pode ser passada
 - Cidade não pode ser nula



# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA
- Maven
- H2
