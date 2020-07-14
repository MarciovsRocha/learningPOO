# Aprendendo Programação Orientada a Objetos com Java

IDE's utilizadas: 

* IntelliJ Community Edition 2020 

* Netbeans IDE8.2

by: Marcio Vinicius de Souza da Rocha


## Conceitos

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

