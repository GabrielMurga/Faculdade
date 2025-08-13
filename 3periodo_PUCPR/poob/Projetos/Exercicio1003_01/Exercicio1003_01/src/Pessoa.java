public class Pessoa {
    private String nome;
    private String dataNascimento;
    private String cpf;

    public Pessoa(String nome, String dataNascimento, String cpf){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(){
        this.nome = nome;
    }

    public String getDataNascimento(){
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
}
