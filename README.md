# Garagem com POO - JAVA Básico
___
# Sistema de Veículos

Este projeto simula diferentes tipos de veículos utilizando conceitos de Orientação a Objetos em Java. Através da herança, polimorfismo e sobrescrita de métodos, diferentes tipos de veículos são representados, incluindo carros, motos, bicicletas e transportes públicos.

## Estrutura do Projeto

- **Veiculo.java**: Classe base para todos os veículos. Contém atributos e métodos comuns a todos os veículos, como `montadora`, `modelo`, `ano`, e um método `ligar()`.

- **Carro.java**: Classe que representa um carro, estendendo a classe `Veiculo`. Possui atributos adicionais como `qtdPortas` e `combustivel`.

- **TransportePublico.java**: Representa veículos de transporte público (ex: ônibus), que herdam de `Veiculo`. Sobrescreve os métodos de `ligar()`, `getModelo()` e `getMontadora()` para refletir características desse tipo de transporte.

- **Moto.java**: Representa uma moto, que herda de `Veiculo` e adiciona o atributo `comBau` para indicar se a moto possui baú.

- **Bicicleta.java**: Representa uma bicicleta, que também herda de `Veiculo`, mas sobrescreve o método `ligar()` para refletir que uma bicicleta não possui motor.

## Funcionalidades

1. **Herança e Sobrescrita de Métodos**: Todos os veículos herdam a classe `Veiculo`, mas podem sobrescrever métodos como `ligar()` para modificar o comportamento de acordo com o tipo de veículo.

2. **Lógica de Transporte Público**: A classe `TransportePublico` sobrescreve os getters e setters para ajustar os valores padrão de `modelo` e `montadora`, refletindo a realidade dos transportes públicos.

3. **Personalização de Atributos**: Algumas classes, como `Carro` e `Moto`, têm atributos exclusivos, como quantidade de portas ou a presença de um baú para a moto.

## Exemplo de Execução

Ao rodar o código, a saída será algo como:

```text
Modelo: Lancer
Montadora: Mitsubishi
Ano: 2024
Ligando o veículo: O veículo está ligando
___________________________________________________________________
Modelo: Millenium V - O que realmente importa é se ele está vazio ou cheio.
Montadora: Volvo - Realmente a gente não repara nesse detalhe.
Ano: 2024
Ligando o veículo: Pague a passagem ao cobrador.
```

## Instruções de Execução

1. Clone o repositório ou baixe os arquivos.
2. Abra o projeto no seu ambiente de desenvolvimento Java (como IntelliJ IDEA, Eclipse, ou Visual Studio Code).
3. Compile e execute a classe `Main.java`.

## Código Explicado

### `Veiculo.java` - Classe Base

```java
public class Veiculo {
    private String montadora;
    private String modelo;
    private int ano;

    public String getMontadora() { return montadora; }
    public void setMontadora(String montadora) { this.montadora = montadora; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }

    void ligar() {
        System.out.println("O veículo está ligando");
    }
}
```

**Descrição**: A classe `Veiculo` define os atributos comuns a todos os veículos, como `montadora`, `modelo`, `ano` e o método `ligar()`, que imprime uma mensagem padrão.

### `Carro.java` - Subclasse de `Veiculo`

```java
public class Carro extends Veiculo {
    private int qtdPortas;
    private String combustivel;
}
```

**Descrição**: A classe `Carro` herda de `Veiculo` e adiciona atributos específicos para carros, como `qtdPortas` e `combustivel`.

### `TransportePublico.java` - Subclasse de `Veiculo`

```java
public class TransportePublico extends Veiculo {
    @Override
    public String getMontadora() {
        return super.getMontadora() + " - Realmente a gente não repara nesse detalhe.";
    }

    @Override
    public void setMontadora(String montadora) {
        if (montadora == null || montadora.isEmpty()) {
            montadora = "Montadora de onibus padrão.";
        }
        super.setMontadora(montadora);
    }

    @Override
    public String getModelo() {
        return super.getModelo() + " - O que realmente importa é se ele está vazio ou cheio.";
    }

    @Override
    public void setModelo(String modelo) {
        if (modelo == null || modelo.isEmpty()) {
            modelo = "Modelo de ônibus comum.";
        }
        super.setModelo(modelo);
    }

    @Override
    void ligar() {
        System.out.println("Pague a passagem ao cobrador.");
    }
}
```

**Descrição**: A classe `TransportePublico` sobrescreve os métodos `getMontadora()`, `getModelo()`, e `ligar()` para refletir a realidade dos transportes públicos, como ônibus.

### `Moto.java` - Subclasse de `Veiculo`

```java
public class Moto extends Veiculo {
    private boolean comBau;

    public boolean isComBau() { return comBau; }
    public void setComBau(boolean comBau) { this.comBau = comBau; }
}
```

**Descrição**: A classe `Moto` herda de `Veiculo` e adiciona o atributo `comBau` para indicar se a moto tem um baú para transporte.

### `Bicicleta.java` - Subclasse de `Veiculo`

```java
public class Bicicleta extends Veiculo {
    @Override
    void ligar() {
        System.out.println("Bicicleta não possui motor, portanto não é possível ligar! Bora pedalar!");
    }
}
```

**Descrição**: A classe `Bicicleta` sobrescreve o método `ligar()` para informar que bicicletas não têm motor e não podem ser ligadas.

## Contribuindo

1. Fork este repositório.
2. Crie uma branch para suas modificações (`git checkout -b feature/nome-da-feature`).
3. Commit suas mudanças (`git commit -m 'Adicionando nova funcionalidade'`).
4. Envie para o repositório remoto (`git push origin feature/nome-da-feature`).
5. Abra um Pull Request.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
```

### Explicação do que faz cada parte:

1. **Introdução do Projeto**: Apresenta o objetivo do código, que é simular uma hierarquia de veículos utilizando Orientação a Objetos em Java.

2. **Estrutura do Projeto**: Explica a organização do código, descrevendo brevemente as classes e o que cada uma faz.

3. **Exemplo de Execução**: Mostra como a execução do código aparecerá no terminal, oferecendo ao usuário uma visão prática do que esperar.

4. **Instruções de Execução**: Passos simples de como rodar o projeto em qualquer IDE Java.

5. **Descrição das Classes**: Detalha o que cada classe faz, como a classe base `Veiculo`, e como as subclasses sobrescrevem métodos para implementar comportamentos específicos.

6. **Como Contribuir**: Guia para quem deseja colaborar com o projeto, explicando como criar um fork, adicionar novas funcionalidades e submeter um pull request.

7. **Licença**: Indica que o projeto está sob a Licença MIT, permitindo o uso e a modificação do código com restrições mínimas.
