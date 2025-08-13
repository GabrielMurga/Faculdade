import java.util.ArrayList;

public class Empresa {
    private String nome;
    private String cnpj;
    private ArrayList<Funcionario> funcionarios;


    public Empresa(String nome, String cnpj){
        this.cnpj =cnpj;
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }


    public void addFuncionario (Funcionario f){
        funcionarios.add(f);
    }

    public void listarFuncionario(){
        for(int i =0;i< funcionarios.size();i++){
            System.out.println("Funcionario :"+funcionarios.get(i).getNome());
            System.out.println("Cargo :"+funcionarios.get(i).getCargo());
            System.out.println("Salario :"+funcionarios.get(i).getSalario());
        }
    }

    public Funcionario buscaFuncionario(String cpf){
        for(int i =0;i< funcionarios.size();i++){
            if (funcionarios.get(i).getCpf() == cpf){
                return funcionarios.get(i);
            }
        }
        System.out.println("Funcionario nao encontrado!");
        return null;
    }


}
