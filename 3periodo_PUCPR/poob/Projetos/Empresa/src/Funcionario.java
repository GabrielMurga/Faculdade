public class Funcionario extends Pessoa {
    private Double salario;
    private Cargo cargo;



    public Funcionario(String nome, String numero, String cpf, Double salario, Cargo cargo){
        super(nome,numero,cpf);
        this.cargo = cargo;
        this.salario = salario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void exibirDadosAdd(){
        exibirDados();
        System.out.println("Salario :" + salario + "Cargo"+cargo.getNome());
    }
}
