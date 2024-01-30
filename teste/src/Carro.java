class Carro {

    private String Marca;
    private String Modelo;
    private int AnoDeFabricacao;
    private String Cor;
    private int VelocidadeAtual;

    Carro(String Marca, String Modelo, int AnoDeFabricacao, String Cor, int VelocidadeAtual){
        this.Marca=Marca;
        this.Modelo=Modelo;
        this.AnoDeFabricacao=AnoDeFabricacao;
        this.Cor=Cor;
        this.VelocidadeAtual=VelocidadeAtual;
    }

    public String getMarca(){
        return Marca;
    }
    public String getModelo(){
        return Modelo;
    }
    public int getAnoDeFabricacao(){
        return AnoDeFabricacao;
    }
    public String getCor(){
        return Cor;
    }
    public int getVelocidadeAtual(){
        return VelocidadeAtual;
    }
}