
/**
 * Escreva uma descrição da classe Computador aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Computador
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String marca;
    private String modelo;
    private int memoriaRam;

    /**
     * Construtor para objetos da classe Computador
     */
    public Computador(String marca, String modelo, int memoriaRam)
    {
        // inicializa variáveis de instância
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
    }
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public int getmemoriaRam(){
        return memoriaRam;
    }
    public void setmemoriaRam(int memoriaRam){
        this.memoriaRam = memoriaRam;
    }
    
    public void exibeDados()
    {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("MemoriaRam: " + memoriaRam);
    }
        
    }
    
   