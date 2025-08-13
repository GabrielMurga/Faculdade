
public class Main {
    public static void main(String[] args) {

        Restaurante r1 = new Restaurante("Au Au da tia Sonia", "9999", "Rua X");
        r1.setAvaliacao("5");

        Pessoa chef = new Pessoa("Tia Sonia", "99/99/9999", "99999");
        r1.setChef(chef);

        System.out.println("*** RESTAURANTE ***");
        System.out.println("Nome: " + r1.getNome());
        System.out.println("CPNJ: " + r1.getCnpj());
        System.out.println("Avaliação: " + r1.getAvaliacao());
        System.out.println("Endereço: " + r1.getEndereco());
        System.out.println("** CHEF **");
        System.out.println("Nome da Chef: " + r1.getChef().getNome());
        System.out.println("CPF: " + r1.getChef().getCpf());
        System.out.println("Data Nascimento: " + r1.getChef().getDataNascimento());


    }
}