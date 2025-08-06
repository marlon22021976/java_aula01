public class Pessoa {
    private String nome; // Declaração do atributo nome do tipo String
    private Data dataNascimento; // Associação com a classe Data, onde dataNascimento é do tipo Data

    // Construtor da classe Pessoa
    public Pessoa(String nome, Data dataNascimento) {
        this.nome = nome; // Inicializa o atributo nome com o valor passado como argumento
        this.dataNascimento = dataNascimento; // Inicializa o atributo dataNascimento com o valor passado como argumento
    }

    // Getter para obter o nome da pessoa
    public String getNome() {
        return nome; // Retorna o valor do atributo nome
    }

    // Setter para definir o nome da pessoa
    public void setNome(String nome) {
        this.nome = nome; // Define o valor do atributo nome com o valor passado como argumento
    }

    // Getter para obter a data de nascimento da pessoa
    public Data getDataNascimento() {
        return dataNascimento; // Retorna o valor do atributo dataNascimento
    }

    // Setter para definir a data de nascimento da pessoa
    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento; // Define o valor do atributo dataNascimento com o valor passado como argumento
    }

    // Método para exibir informações da pessoa, incluindo seu nome e data de nascimento
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome); // Exibe o nome da pessoa
        System.out.print("Data de Nascimento: "); // Exibe a mensagem “Data de Nascimento”
        dataNascimento.exibirData(); // Chama o método exibirData() da classe Data para exibir a data de nascimento da pessoa
    }
}
