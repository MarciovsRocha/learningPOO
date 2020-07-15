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
	* O construtor é sempre invocado pela palavra **new**


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

### Sobrecarga de Métodos

​	Em Java é possível que uma classe possua métodos com  o mesmo nome, desde que os parâmetros sejam diferentes em quantidade, tipo ou ordem.

​	Mas para entendermos ***Sobrecarga de Métodos*** é necessário entendermos antes o conceito de ***Assinatura de Método***.

#### Assinatura de Método

​	Uma assinatura de método é composta pelo nome do método somado de seus argumentos, exemplo

```java
public void inserir(String nome)
```

​	A assinatura do método acima é ***inserir(String*** nome***)***. Sendo assim possível criar métodos com nomes idênticos porém com argumentos ou tipo de argumentos diferentes. É importante deixar claro que ***tipos de retorno*** não influenciam na assinatura do método, ou seja, não é possível definir métodos com noms iguais e parâmetros iguais mesmo que o tipo de retorno seja diferente. 

*Agora que entendemos o que é uma **Assinatura de Método** podemos continuar.*

```java
public class ContaCorrente{
    // assinatura do método abaixo ContaCorrente(int,int)
    public ContaCorrente(int agencia, int codigo){
        this.agencia = agencia;
        this.codigo = codigo;
    }
    
    // assinatura do método abaixo ContaCorrente(int,int,double)
    public ContaCorrente(int agencia, int codigo, double limite){
        this.agencia = agencia;
        this.codigo = codigo;
        this.limite = limite;
    }
    
} // class ContaCorrente
```

###  Polimorfismo

​	Polimorfismos é uma característica essencial de uma linguagem orientada a objetos. Polimorfismo é o princípio pelo qual duas ou mais classes derivadas de uma ***superclasse*** podem invocar métodos que têm a mesma ***assinatura*** mas comportamentos distintos.  

​	Polimorfismo pode ser definido também como a criação de ***métodos*** com um mesmo nome porém com códigos diferentes.

**Exemplo**: A redefinição de um método para uma ***sublcasse***, ou seja, o método da ***subclasse*** terá a mesma assinatura da ***superclasse*** mas com implementação diferente.

```java
// superclasse Cliente
public class Cliente {
    
    private String nome, sobrenome, endereco;
    private int codigo;
    
    public Cliente(int codigo, String nome, String sobrenome,String endereco){
        this.codigo = codigo;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getSobrenome(){
        return sobrenome;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setNome(String nomeNovo){
        this.nome = nomeNovo;
    }

    public void setSobreNome(String sobrenomeNovo){
        this.sobrenome = sobrenomeNovo;
    }
    
    public void setEndereco(String enderecoNovo){
        this.endereco = enderecoNovo;
    }
    
    public String getCliente(){
        return "Cliente: "+codigo+" - "+nome+" "+sobrenome+" residente em: "+endereco;
    }
    
}// Class Cliente

```

```java
// subclasseClientePJ
public class ClientePJ extends Cliente{
    private String cnpj;
    
    public ClientePJ(int codigo, String nome, String sobrenome, String endereco, String cnpj){
        super(codigo,nome,sobrenome,endereco);
        this.cnpj = cnpj;
    }

    public String getCnpj(){
        return cnpj;
    }
    
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
    public String getCliente(){
        return super.getCliente()+" CNPJ: "+cnpj;
    }
    
}// Class ClientePJ
```

```java
// subclasse ClientePF
public class ClientePF extends Cliente{
    private String cpf;
    
    public ClientePF(int codigo, String nome, String sobrenome, String endereco, String cpf){
        super(codigo,nome,sobrenome,endereco);
        this.cpf = cpf;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getCliente(){
        return super.getCliente()+" CPF: "+cpf;
    }
    
}// class ClientePF
```

```java
public class ClienteApp {
    public static void main(String[] args){
        ClientePF clientepf1 = new ClientePF(1,"nome","sobrenome","mora na rua tal","15487");
        
        ClientePJ clientepj1 = new ClientePJ(2,"nome Fantasia","Razao Social","Endereco da Empresa","5454151");
        
        System.out.println(clientepf1.getCliente());
        System.out.println(clientepj1.getCliente());
    }
}
```
*Ao término da execução do nosso progama obtemos:*

~~~
Cliente: 1 - nome sobrenome residente em: mora na rua tal CPF: 15487
Cliente: 2 - nome Fantasia Razao Social residente em: Endereco da Empresa CNPJ: 5454151
~~~

### Interfaces

​	O objetivo de uma interface é **definir **um modelo de **comportamento** para as classes, assim como uma classe abstrata ***uma interface não pode ser instanciada***, todos os métodos da interface são implicitamente ***abstract*** e ***public***, os métodos ***Não podem ser implementados na Interface***, a classe implementa uma interface através do identificador **implements**, uma classe pode implementar diversas interfaces.

​	As interfaces ***não possuem atributos de dados, não possuem construtores***, todos os métodos são ***abstratos***, ou seja, possuem somente a assinatura, e as interfaces são declaradas como **interface**.

​	Quando uma classe implementa uma interface, ela é obrigada a implementar todos os métodos definidos na interface, e pela interface ter constantes publicas a classe que a implementa possui acesso a todas as constatntes definidas na interface;  

```java
public interface SituacaoAcademica{
    public void CalcularMedia(float nota1, float nota2);
    public String VerificarAprovacao();
}
```

```java
public class Aluno extends Pessoa implements SituacaoAcademica{}
```