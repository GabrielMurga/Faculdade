public class Prato {

    private String nome;
    private Integer preco;



    public Prato(String nome, Integer preco){
        this.nome = nome;
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(Integer preco) {
        this.preco = preco;
    }

    public Integer getPreco() {
        return preco;
    }

    public void exibirDetalhes(){
        System.out.println("Dados do prato:");
        System.out.println("Nome: " + this.nome + "Preco" + this.preco);
    }

}
