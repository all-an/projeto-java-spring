<p align="center">
        <a href="https://www.linkedin.com/in/all-an/">
        <img align="center" width="453" height="125"  src="/img/springrmbg2.png" />
</a>
</p>


 Projeto Java Web / Spring Boot
>  API REST com banco de dados usando Java e Spring Boot 

## Detalhes do Projeto:
 [Allan Pereira Abrahão](https://www.linkedin.com/in/all-an/)

<a href="https://www.linkedin.com/in/all-an/" rel="nofollow"><img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white" alt="Linkedin Badge" data-canonical-src="https://img.shields.io/badge/-Allan-blue?style=flat-square&amp;logo=Linkedin&amp;logoColor=white&amp;link=https://www.linkedin.com/in/all-an/%C3%A3o-7b72b5202/" style="max-width: 100%;"></a>

[![allan8tech@gmail.com](https://img.shields.io/badge/-allan8tech@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:allan8tech@gmail.com)](mailto:allan8tech@gmail.com)


 ##### Créditos e Agradecimentos ao Professor [Nélio Alves](https://devsuperior.com.br)
### Conhecimentos Reforçados:

- Lógica de programação 
- Programação orientada a objetos
- Ferramentas:
  - Spring Tool Suite (STS)
  - Postman

### Objetivos:

- Reforçar Fundamentos de programação
- Colocar em prática esses fundamentos
- Criar um pequeno sistema com ferramentas e práticas de mercado

### Visão geral do sistema:

Sistema (API REST) de usuários e departamentos, com os seguintes casos de uso:

- Buscar todos usuários
- Buscar um usuário pelo seu id
- Inserir um novo usuário

![Image](https://raw.githubusercontent.com/devsuperior/java-web-spring-2022/main/img/dominio.png "Modelo conceitual")

### Desenvolvimento moderno: relacional -> objeto -> json

![Image](https://raw.githubusercontent.com/devsuperior/java-web-spring-2022/main/img/objetos.png "Objetos")

### Passos:

- Criar o projeto
- Implementar o modelo de domínio
- Mapeamento objeto-relacional com JPA
- Configurar o banco de dados H2
- Criar os endpoints da API REST

### Endpoints:

- /users 
- /users/<id>
- /h2-console  <acesso ao banco de dados H2 pelo navegador>
  - username=sa
  - password=

#### Configuração do Maven Resources Plugin

```xml
<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-resources-plugin</artifactId>
	<version>3.1.0</version>
</plugin>
```

#### Configurações do banco de dados

```
# Dados de conexão com o banco H2
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

# Configuração do cliente web do banco H2
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# Configuração para mostrar o SQL no console
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

#### Script SQL

```sql
INSERT INTO tb_department(name) VALUES ('Gestão');
INSERT INTO tb_department(name) VALUES ('Informática');

INSERT INTO tb_user(department_id, name, email) VALUES (1, 'Maria', 'maria@gmail.com');
INSERT INTO tb_user(department_id, name, email) VALUES (1, 'Bob', 'bob@gmail.com');
INSERT INTO tb_user(department_id, name, email) VALUES (2, 'Alex', 'alex@gmail.com');
INSERT INTO tb_user(department_id, name, email) VALUES (2, 'Ana', 'ana@gmail.com');
```
##### Obrigado Professor Nélio Alves [DevSuperior - Escola de programação](https://devsuperior.com.br)
###### Material de Apoio, autoria: [Nélio Alves](https://devsuperior.com.br)