public class Data {
    private int dia; // Declaração do atributo dia do tipo int
    private int mes; // Declaração do atributo mes do tipo int
    private int ano; // Declaração do atributo ano do tipo int

    // Construtor da classe Data
    public Data(int dia, int mes, int ano) {
        this.dia = dia; // Inicializa o atributo dia com o valor passado como argumento
        this.mes = mes; // Inicializa o atributo mes com o valor passado como argumento
        this.ano = ano; // Inicializa o atributo ano com o valor passado como argumento
    }

    // Getter para obter o dia
    public int getDia() {
        return dia; // Retorna o valor do atributo dia
    }

    // Setter para definir o dia
    public void setDia(int dia) {
        this.dia = dia; // Define o valor do atributo dia com o valor passado como argumento
    }

    // Getter para obter o mês
    public int getMes() {
        return mes; // Retorna o valor do atributo mes
    }

    // Setter para definir o mês
    public void setMes(int mes) {
        this.mes = mes; // Define o valor do atributo mes com o valor passado como argumento
    }

    // Getter para obter o ano
    public int getAno() {
        return ano; // Retorna o valor do atributo ano
    }

    // Setter para definir o ano
    public void setAno(int ano) {
        this.ano = ano; // Define o valor do atributo ano com o valor passado como argumento
    }

    // Método para exibir a data no formato dia/mês/ano
    public void exibirData() {
        System.out.println(dia + "/" + mes + "/" + ano); // Exibe a data no formato dia/mês/ano
    }
}
