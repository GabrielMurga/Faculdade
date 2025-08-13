import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Prato>pratos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int exit = 0;
        System.out.println("Faca um pedido!");
        System.out.println("Qual o seu nome?");
        String cliente_nome = scanner.nextLine();
        System.out.println("Qual o seu telefone?");
        String cliente_telefone = scanner.nextLine();
        Cliente cliente = new Cliente(cliente_nome,cliente_telefone);
        Pedido pedido = new Pedido(cliente,pratos);
        while(exit == 0){
            System.out.println("Escolha uma opcao :\n (1) Adicionar Prato\n (2) Remover Prato\n (3) Mostrar Pedido\n (4) Sair \n");
            int opcao = Integer.parseInt(scanner.nextLine());
            if (opcao ==1){
                System.out.println("Diga o nome do prato");
                String prato_Nome = scanner.nextLine();
                System.out.println("Qual o preco do seu prato?");
                Integer prato_Preco = Integer.parseInt(scanner.nextLine());
                Prato prato = new Prato(prato_Nome,prato_Preco);
                pratos.add(prato);
            }
            else if (opcao == 2){
                System.out.println("Digite o nome do prato que quer remover: ");
                String prato_Remover = scanner.nextLine();
                for(int i = 0; i < pratos.size(); i++)
                {
                    Prato p = pratos.get(i);

                    if(p.getNome().equals(prato_Remover))
                    {
                        pratos.remove(p);
                        break;
                    }

                }
            }
           else if (opcao == 3){
                pedido.mostraTodosOsDados();
            }

           else if( opcao == 4){
               System.out.println(" Fim do programa!");
               exit = 1;
            }
        }
    }
}