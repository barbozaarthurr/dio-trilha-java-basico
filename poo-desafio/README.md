## Desafio POO - Modelagem UML (Iphone)

Diagram UML do Desafio de POO (Iphone) da DIO.

## Diagrama


classDiagram
    class ReprodutorMusical {
        +tocar(): void
        +pausar(): void 
        +selecionarMusica(String musica): void
    }

    class AparelhoTelefonico {
        +ligar(String numero): void
        +atender(): void
        +iniciarCorreioVoz(): void
    }

    class NavegadorInternet {
        +exibirPagina(String url): void
        +adicionarNovaAba(): void
        +atualizarPagina(): void
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
