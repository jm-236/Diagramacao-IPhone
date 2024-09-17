# Projeto iPhone

Este projeto foi desenvolvido durante o bootcamp da DIO **Backend com Java** e envolve a diagramação e implementação das classes de um iPhone em Java.

## Diagrama do Projeto

O diagrama do projeto pode ser visualizado clicando na imagem abaixo:

[![Diagrama](https://mermaid.ink/img/pako:eNptU01vozAQ_SvIp6yWRiaUhqBeou5lpW5V9WMPK6TVBE_JqOBBBkdt0vz3OoRUNOAD4Dczz28e453IWKFIRFZAXf8iyA2UqfbcOj5b3HvAyrCyDZs_tqYMit0xelg_HxtDOvfKNrJsLBS94Iq58LBu4Ikz0Ip7oQ2T8hoHm8mPc7gCW4_gNRaYEWvodEy-nd1l71Pd176swGCx5idX-8KaMt4N9JW3lEMGfXWFQ8yJX9sSDQ9UQoNa4Yh8hXVb39F-SyAngcDcsDFI_Je3k3Hdd7DBHBSbEa-fH27_w5nT7cH4Risy95CT_jLHmmKoXNHRxzvewHIFk5HeHD1t4UR2LnJoq3f9cXHh_a7WrPGY89XCMDSYqH6K8IXzuwRSbjLb9lPRrLHEVCTuU4F5TUWq9y4PHMXju85E0hiLvjBs8_VpYyvlflE31SewAv2Pub8VyU68iSSQ4TSO5CxYyMvFPJz74v0ARtM4ni2kDGQcRlfhbO-LbVsvp1dxKINQxkEUyWgRB75ARYeWujt1eO0_AWuNDhI?type=png)](https://mermaid.live/edit#pako:eNptU01vozAQ_SvIp6yWRiaUhqBeou5lpW5V9WMPK6TVBE_JqOBBBkdt0vz3OoRUNOAD4Dczz28e453IWKFIRFZAXf8iyA2UqfbcOj5b3HvAyrCyDZs_tqYMit0xelg_HxtDOvfKNrJsLBS94Iq58LBu4Ikz0Ip7oQ2T8hoHm8mPc7gCW4_gNRaYEWvodEy-nd1l71Pd176swGCx5idX-8KaMt4N9JW3lEMGfXWFQ8yJX9sSDQ9UQoNa4Yh8hXVb39F-SyAngcDcsDFI_Je3k3Hdd7DBHBSbEa-fH27_w5nT7cH4Risy95CT_jLHmmKoXNHRxzvewHIFk5HeHD1t4UR2LnJoq3f9cXHh_a7WrPGY89XCMDSYqH6K8IXzuwRSbjLb9lPRrLHEVCTuU4F5TUWq9y4PHMXju85E0hiLvjBs8_VpYyvlflE31SewAv2Pub8VyU68iSSQ4TSO5CxYyMvFPJz74v0ARtM4ni2kDGQcRlfhbO-LbVsvp1dxKINQxkEUyWgRB75ARYeWujt1eO0_AWuNDhI)

## Estrutura do Projeto

O projeto está organizado em pacotes, cada um representando uma funcionalidade específica do iPhone:

- `com.celular`: Contém a classe principal `Iphone` que implementa as interfaces `Navegador`, `Telefone` e `ReprodutorMusical`.
- `com.navegador`: Contém a interface `Navegador` com métodos para navegação na web.
- `com.telefone`: Contém a interface `Telefone` com métodos para funcionalidades de telefone.
- `com.reprodutormusical`: Contém a interface `ReprodutorMusical` com métodos para reprodução de música.

## Funcionalidades

### Navegador

- `exibirPagina(String url)`: Exibe a página da URL fornecida.
- `adicionarNovaAba()`: Adiciona uma nova aba no navegador.
- `atualizarPagina()`: Atualiza a página atual.

### Telefone

- `ligar(String numero)`: Realiza uma ligação para o número fornecido.
- `atender()`: Atende uma ligação.
- `desligarLigacao()`: Desliga a ligação atual.
- `iniciarCorreioDeVoz()`: Inicia o correio de voz.

### Reprodutor Musical

- `tocar()`: Toca a música atual.
- `pausar()`: Pausa a música atual.
- `selecionarMusica(String musica)`: Seleciona a música fornecida.

## Execução

Para executar o projeto, compile e execute a classe `Iphone` que contém o método `main`. Exemplo de execução:

```sh
javac com/celular/Iphone.java
java com.celular.Iphone
```

## Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.
