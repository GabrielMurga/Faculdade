public class Pessoa {
    private String nome;
    private String cpf;


    public Pessoa(String nome, String cpf){
       this.nome = nome;
       this.cpf = cpf;
    }


    public String getNome(){
        return this.nome;
    }
    public void setnome(String nome){
        this.nome = nome;
    }
    public String getcpf(){
        return this.cpf;
    }
    public void setcpf(String cpf){
        this.cpf = cpf;
    }
}
