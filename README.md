# DIO - Trilha Java Básico: Desafio de POO

## Desafio: Modelagem e Diagramação de um Componente iPhone

Este repositório contém a solução para o desafio de Programação Orientada a Objetos (POO) da trilha Java Básico da DIO. O objetivo é modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como **Reprodutor Musical**, **Aparelho Telefônico** e **Navegador na Internet**, com base no vídeo de lançamento do iPhone de 2007. Além disso, foi implementado o código Java correspondente.

### Contexto

O desafio consiste em:
1. Criar um diagrama UML que represente as funcionalidades do iPhone:
   - **Reprodutor Musical**: Métodos `tocarMusica()`, `pausarMusica()`, `selecionarMusica(String musica)`.
   - **Aparelho Telefônico**: Métodos `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`.
   - **Navegador na Internet**: Métodos `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`.
2. Implementar as classes e interfaces correspondentes em Java (opcional, mas realizado neste projeto).

### Diagrama UML

O diagrama UML foi criado no formato Draw.io e também representado em sintaxe Mermaid para visualização direta no GitHub.

#### Visualização em Mermaid

```mermaid
classDiagram
    class iPhone {
        -String modelo
        +tocarMusica()
        +pausarMusica()
        +selecionarMusica(String musica)
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class ReprodutorMusical {
        <<interface>>
        +tocarMusica()
        +pausarMusica()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        <<interface>>
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        <<interface>>
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    iPhone ..|> ReprodutorMusical
    iPhone ..|> AparelhoTelefonico
    iPhone ..|> NavegadorInternet