public class Teste{
    public static void main (String[] args){
        Data dataNascimento = new Data(12, 5, 1990);
        Pessoa pessoa = new Pessoa("Ivan", dataNascimento);
        pessoa.exibirInformacoes();
    }
}