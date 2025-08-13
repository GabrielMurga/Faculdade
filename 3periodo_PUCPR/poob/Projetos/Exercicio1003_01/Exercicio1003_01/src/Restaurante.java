public class Restaurante {
    private String nome;
    private Pessoa chef;
    private String cnpj;
    private String avaliacao;
    private String endereco;

    public Restaurante(String nome, String cnpj, String endereco){
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Pessoa getChef(){
        return this.chef;
    }
    public void setChef(Pessoa chef){
        this.chef = chef;
    }
    public String getCnpj(){
        return this.cnpj;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    public String getAvaliacao(){
        return this.avaliacao;
    }
    public void setAvaliacao(String avaliacao){
        this.avaliacao = avaliacao;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
}
