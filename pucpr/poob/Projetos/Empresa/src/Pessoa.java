public class Pessoa {
    private String nome;
    private String numero;
    private  String cpf;

    public Pessoa(String nome,String numero,String cpf){
        this.nome = nome;
        this.numero = numero;
        this.cpf =  cpf;
    }
    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void exibirDados(){
        System.out.println("Nome: "+getNome()+"Telefone :"+getNumero()+ "CPF :"+getCpf());
    }
}
