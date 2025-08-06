public class Teste {
    public static void main(String[] args) {
        // Criando um objeto Data
        Data dataNascimento = new Data(12, 5, 1990);

        // Criando um objeto Pessoa associado à data de nascimento
        Pessoa pessoa = new Pessoa("João", dataNascimento);

        // Exibindo informações da pessoa
        pessoa.exibirInformacoes();
    }
}
