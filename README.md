

# Sistema de Gerenciamento de Carros

Este projeto consiste em um sistema de gerenciamento de carros utilizando Java e conceitos de programação orientada a objetos, incluindo herança e generics.

## Estrutura do Projeto

O projeto possui os seguintes arquivos:

- `Main.java`: Contém o ponto de entrada do programa, onde são criadas e manipuladas listas de carros do tipo Argo e Onix.
- `Carro.java`: Define a classe abstrata Carro, que serve como superclasse para os tipos específicos de carros.
- `Onix.java`: Implementa a classe Onix, que representa um tipo específico de carro.
- `Argo.java`: Implementa a classe Argo, que também representa um tipo específico de carro.

## Utilização

Para executar o projeto, basta compilar todos os arquivos `.java` e executar o arquivo `Main.class` gerado. Isso pode ser feito com o seguinte comando no terminal:

```bash
javac *.java
java Main
```

O programa criará instâncias de carros do tipo Argo e Onix, adicionará essas instâncias a listas específicas e, em seguida, imprimirá essas listas.

## Classes

### `Carro`

- **Atributos:**
  - `modelo: String`
  - `ano: Integer`
  - `cor: String`
  - `velocidade: Integer`

- **Métodos:**
  - `ligar()`
  - `desligar()`
  - `frear()`

### `Onix`

- **Atributos Adicionais:**
  - `tipoDeFarol: String`
  - `cambio: String`

- **Métodos Adicionais:**
  - `getTipoDeFarol()`
  - `setTipoDeFarol()`
  - `getCambio()`
  - `setCambio()`

### `Argo`

- **Atributos Adicionais:**
  - `tracao: String`

- **Métodos Adicionais:**
  - `controleEstabilidade()`
  - `getTracao()`
  - `setTracao()`

