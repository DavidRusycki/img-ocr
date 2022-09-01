# img-ocr
> Microsserviço para OCR de imagens

## Disponibiliza um microsserviço para OCR de imagens utilizando:
    - Java Spring Boot
    - Tesseract OCR
    - Maven
    - Docker

## Colocando em funcionamento:

1. Rodar o comando para build da aplicação Spring.
```bash
    mvn clean package
```
> Esse comando faz todo o procedimento de build da API em SpringBoot

2. Rodar o comando para subir o container docker.
```bash
    docker compose up -d
```
> Esse comando necessita que o docker esteja instalado, caso estiver tudo correto ele irá realizar a montagem da imagem e do container Docker.

3. Assim estará rodando a aplicação na porta 8181 da máquina host aceitando requisições e dando retornos.

> OBS: o arquivo Insomnia_requests.json possui as request para os endpoints disponíveis da aplicação.

## EndPoints

### Para imagens em português

```bash
    http://localhost/ocr/pt
```
### Para imagens em inglês

```bash
    http://localhost/ocr/eng
```
### Para imagens no geral

```bash
    http://localhost/ocr
```

> OBS: Todos recebem um arquivo pela request.