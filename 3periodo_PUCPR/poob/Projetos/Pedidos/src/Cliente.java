public class Cliente {
    private String nome;
    private String telefone;

    public Cliente (String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void exibirDados(){
        System.out.println("Dados do cliente:");
        System.out.println("Nome: " + this.nome + "Telefone" + this.telefone);

    }

}
