import java.util.Scanner;

public class Menu {
    private Scanner scanner;



    public Menu(){
        this.scanner = new Scanner(System.in);
    }

    public Empresa cadastrarEmpresa(){
        System.out.println("***Cadastro da Empresa!***");
        System.out.println(" Nome da Empresa: ");
        String nomeEmpresa = scanner.nextLine();
        System.out.println("CNPJ");
        String cnpjEmpresa = scanner.nextLine();
        Empresa empresa = new Empresa(nomeEmpresa,cnpjEmpresa);
        return empresa;
    }

    public Cargo cadastrarCargo(){
        System.out.println("***Cadastro do Cargo!***");
        System.out.println(" Nome do cargo: ");
        String nomeCargo = scanner.nextLine();
        System.out.println("Descricao");
        String cargoDesc = scanner.nextLine();
        Cargo cargo = new Cargo(nomeCargo,cargoDesc);
        return cargo;
    }
    public Funcionario cadastrarFuncionario(){

    }

}
