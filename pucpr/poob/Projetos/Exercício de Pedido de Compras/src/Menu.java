import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        Restaurante restaurante = criarRestaurante();
        Cliente cliente = cadastrarCliente();
        Pedido pedido = new Pedido(cliente);
        restaurante.listarPratos();

        boolean continuar = true;
        while (continuar) {
            System.out.print("\nDigite o código do prato desejado: ");
            int codigoPrato = scanner.nextInt();
            scanner.nextLine(); // limpar buffer
            escolherPrato(pedido, restaurante, codigoPrato);
            pedido.exibirPedido();

            System.out.print("Deseja remover algum prato? (s/n): ");
            String resposta = scanner.nextLine();
            removerPrato(pedido, resposta);

            System.out.print("Deseja encerrar? (s/n): ");
            String respostaEncerrar = scanner.nextLine();
            continuar = !respostaEncerrar.equalsIgnoreCase("s");
        }

        pedido.exibirPedido();
        scanner.close();
    }

    public Restaurante criarRestaurante() {
        Restaurante restaurante = new Restaurante("Restaurante BCC");

        restaurante.adicionarPratoAoMenu(new Prato(1, "Lasanha", 35.0));
        restaurante.adicionarPratoAoMenu(new Prato(2, "Feijoada", 50.0));
        restaurante.adicionarPratoAoMenu(new Prato(3, "Pizza", 60.0));
        restaurante.adicionarPratoAoMenu(new Prato(4, "Hambúrguer", 25.0));
        restaurante.adicionarPratoAoMenu(new Prato(5, "Arroz", 20.0));
        restaurante.adicionarPratoAoMenu(new Prato(6, "Salada", 15.0));

        return restaurante;
    }

    public Cliente cadastrarCliente() {
        System.out.println("*** CADASTRAR CLIENTE ***");
        System.out.print("Nome: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefoneCliente = scanner.nextLine();

        System.out.print("CPF: ");
        String cpfCliente = scanner.nextLine();
        while (validarCPF(cpfCliente) == 0) {
            System.out.print("CPF: ");
            cpfCliente = scanner.nextLine();
        }

        System.out.print("CEP: ");
        String cepCliente = scanner.nextLine();
        while (validarCEP(cepCliente) == 0) {
            System.out.print("CEP: ");
            cepCliente = scanner.nextLine();
        }

        return new Cliente(nomeCliente, telefoneCliente, cpfCliente, cepCliente);
    }

    public int validarCPF(String cpf) {
        if (Validador.validarCPF(cpf)) {
            return 1;
        } else {
            System.out.println("O CPF inserido é inválido! Tente novamente.");
            return 0;
        }
    }

    public int validarCEP(String cep) {
        if (Validador.validarCEP(cep)) {
            return 1;
        } else {
            System.out.println("O CEP inserido é inválido! Tente novamente.");
            return 0;
        }
    }

    public void escolherPrato(Pedido pedido, Restaurante restaurante, int codigoPrato) {
        Prato prato = restaurante.buscarPrato(codigoPrato);
        if (prato != null) {
            pedido.adicionarPrato(prato);
        } else {
            System.out.println("\nPrato não encontrado, tente novamente.");
        }
    }

    public void removerPrato(Pedido pedido, String resposta) {
        if (resposta.equalsIgnoreCase("s")) {
            System.out.print("Digite o código do prato a remover: ");
            int codigoPratoRemover = scanner.nextInt();
            scanner.nextLine(); // limpar buffer
            pedido.removerPrato(codigoPratoRemover);
            System.out.println("Pedido atualizado:");
            pedido.exibirPedido();
        }
    }
}
