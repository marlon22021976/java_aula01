

public class Data
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int dia;
    private int mes;
    private int ano;

    /**
     * Construtor para objetos da classe Data
     */
    public Data(int dia, int mes, int ano)
    {
        // inicializa variáveis de instância
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia(){
        return dia;
    }
    
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    
   
    public void exibirData()
    {
        // escreva seu código aqui
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}