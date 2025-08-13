public class Restaurante {
    private String nome;
    private String cnpj;
    private String avaliacao;
    private Pessoa chef;
    private String endereco;
    private String especialidade;

    public Restaurante(String nome, String cnpj, String endereco, String especialidade){
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.especialidade = especialidade;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getAvaliacao(){
        return this.avaliacao;
    }
    public void setAvaliacao(String avaliacao){
        this.avaliacao = avaliacao;
    }

    public String getCnpj(){
        return this.cnpj;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj; // Correção do erro de atribuição
    }

    public Pessoa getChef(){
        return this.chef;
    }
    public void setChef(Pessoa chef){
        this.chef = chef;
    }

    public String getEspecialidade(){
        return this.especialidade;
    }
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public String getEndereco(){
        return this.endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
}
