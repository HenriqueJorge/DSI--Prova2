# DSI--Prova2

Configuração de arquitetura microservice, utilizando Eureka e Spring Cloud.
![SpringClound](https://github.com/HenriqueJorge/DSI--Prova2/blob/master/Imagen/ReadMe.jpg)

### Eureka server

Projeto que registra os microserviços e monitora o status de cada. Aqui sendo representado pelo serviço ServiceDiscovery.

### Config server

Serviço de configuração dos outros serviços. Tem o objetivo de buscar as configurações de cada serviço no github::
e aplicá-los em seus respectivos lugares.

#### Zuul

Projeto de proxy para os serviços rest do projeto em questão.

### Microservices projects

Microservices que retonam um json como resposta.

### Executando

Para executar o projeto, é necessário subir alguns serviços antes. <br />
Seguindo nessa ordem:<br />
1 - my-config-server .<br />
2 - my-eureka .<br />
3 - my-zuul .<br />
4 - Qualquer outro serviço.<br />
