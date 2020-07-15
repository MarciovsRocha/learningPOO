# Aprendendo Programação Orientada a Objetos com Java

IDE's utilizadas: 

* IntelliJ Community Edition 2020 

* Netbeans IDE8.2

by: Marcio Vinicius de Souza da Rocha

## Conceitos de Programação Orientada a Objetos

Orientação a Objetos é uma forma de implementação de sistemas, sendo um método relativamente novo na concepção e implementação de software. Tem como objetivos aumentar a produtividade através de reuso dos códigos, controlar a complexidade e o custo de manutenção dos códigos.

### Tipos abstratos de Dados

Um tipo abstrato de dados é um modelo formado por propriedades (atributos) e operações (métodos).

#### Classe

Uma classe é a representação da implementação de um tipo de dado abstrato.

#### Objeto

Um objeto é a instância de uma classe possuindo valores próprios para os atributos definidos na classe. 

Para melhor compreendermos irei descrever o objeto carro, para isso teremos que criar uma classe "Carro".

* class Carro

  * Atributos (características de um carro)
    * Cor
    * Marca
    * Modelo
  * Métodos (comportamento de um carro)
    * Ligar
    * Desligar

	Porém é necessário um método construtor para criar o objeto descrito na classe, ou seja, na classe nós possuimos a estrutura expandida de um objeto porém para podermos juntar todas as caracteríscas e construirmos um carro é necessário termos um método construtor.

#### Método Construtor
Os construtores são um tipo especial de método, estes são chamados sempre que faz-se necessária a criação de um novo objeto. O objetivo de um construtor é permitir a inicialização/junção dos atributos descritos na classe.
* Características de um Construtor:
	* O construtor tem o mesmo nome da Classe em questão;
	* O construtor é sempre invocado pela palavra new


```java
public class Carro{
    // atributos da classe Carro
    private String cor;
    private String marca;
    private String Modelo;    
    
    // método construtor da classe Carro
    public Carro(String marca, String modelo, String cor){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }
}
```



### Encapsulamento

​	Uma classe deve ofertar apenas o que ela pode fazer e não necessariamente como ela faz, uma classe deve impedir o acesso direto ao seus atributos e métodos internos e disponibilizar somente métodos públicos.

​	Atributos devem ser privados para que somente suas classes o vejam, caso seja necessário visualização externa de algum atributo deve-se criar um método getNomeAtributo() e este retorne o mesmo;

```java
public class Pessoa{
    //atributos da classe Pessoa
    private int codigo;
    private String nome;
    
    // método construtor
    public Pessoa(int codigo,String nome){
        this.codigo = codigo;
        this.nome = nome;
    }//Pessoa
    
    // método para visualização do atributo nome
    public String getNome(){
        return nome;
    }//getNome()
    
    // método para visualização do atributo codigo
    public int getCodigo(){
        return codigo;
    }// getCodigo()
    
}// class Pessoa
```



### Mensagem 

​	Mensagem é a forma como um método interage com outro objeto, ou seja, é correspondente a chamada de um método do objeto, podendo ou não exigir a passada de parâmetros.

