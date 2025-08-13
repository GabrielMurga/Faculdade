public class Cargo {
    private String nome;
    private String descricao;


    public Cargo(String nome, String descricao){
        this.descricao = descricao;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
