

public class Pessoa
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private Data dataNascimento;

    /**
     * Construtor para objetos da classe pessoa
     */
    public Pessoa(String nome, Data dataNascimento)
    {
        // inicializa variáveis de instância
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Data getDataNascimento(){
        return dataNascimento;
    }
    
    public void setDataNascimento(Data dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    

    
    public void exibirInformacoes()
    {
        // escreva seu código aqui
        System.out.println("nome" + nome);
        System.out.println("data nascimento");
        dataNascimento.exibirData();
    }
   
}


    
    

    