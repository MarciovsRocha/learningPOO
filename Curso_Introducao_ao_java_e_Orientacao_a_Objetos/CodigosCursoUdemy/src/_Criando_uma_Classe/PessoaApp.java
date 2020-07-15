package _Criando_uma_Classe;

// tudo o que tiver {..}App significa que é uma classe executável

public class PessoaApp {
    // toda classe executável deve conter o método main(String[] args){}
    public static void main(String[] args){
// contruindo um objeto
        // utilizo a classe Pessoa para criar um novo objeto
        // chamado pessoa1 utilizando o construtor Pessoa, passando como argumentos o código e o nome
        
        // estrutura para se criar um objeto: 
            // Classe nomeObjt = new NomeContrutor(argumentos necessários)
        Pessoa pessoa1 = new Pessoa(1,"Marcio");
        Pessoa pessoa2 = new Pessoa(2,"Dória");
        
        System.out.println("o nome do objeto pessoa é: "+pessoa1.getNome());
        
        // utilizo o método setNome() para alterar o valor do atributo nome do objeto pessoa1
        pessoa1.setNome("Marcio Vinicius de Souza da Rocha");
        
        System.out.println("o nome do objeto pessoa é: "+pessoa1.getNome());
    }
}
