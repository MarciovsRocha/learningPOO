package aulapratica1;

// defino a classe pessoa
public class Pessoa {
    // defino os atributos que cada pessoa deve term, 
    // neste caso toda pessoa possui um código e um nome
    
    // encapsulamento dos dados:
        // somente a classe Pessoas.java pode ver estes dados
    private int codigo;
    private String nome;
  
// todo método deve ser public
    
    // crio o método construtor com os atributos declarados acima sendo
    // passados como parâmetros
    public Pessoa(int codigo, String nome){
        // this.codigo faz referência ao atributo codigo declarado acima
        // e este recebe o codigo passado como parametro
        this.codigo = codigo; 
        
        // this.nome faz referência ao atributo nome declarado acima
        // e este recebe o nome passado como parâmetro
        this.nome = nome;
    }
    
    // método para visualização do atributo codigo
    // tipo de retorno é int
    public int getCodigo(){
        return codigo;
    }
    
    // método para visualização do atributo nome
    // tipo de retorno é String
    public String getNome(){
        return nome;
    }
 
    // método modificador do  atributo nome
    // tipo void não retorna nada
    public void setNome(String nome){
        this.nome = nome;
    }
    
    // método modificador do atributo código
    // do tipo void pois não retorna valor
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
}
