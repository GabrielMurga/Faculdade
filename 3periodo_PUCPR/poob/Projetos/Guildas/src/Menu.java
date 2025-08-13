import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        Combatente combatente = null;
        Guilda guilda;
        ArrayList<Combatente> combatentes = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma opcao: ");
            System.out.println("(1) Criar Combatente");
            System.out.println("(2) Mostrar Combatente");
            System.out.println("(3) Criar Guilda");
            System.out.println("(4) Adicionar Combatente");
            System.out.println("(5) Mostrar Guilda");
            System.out.println("(6) Status da Guilda");
            System.out.println("(7) Sair");

            int opcao = Integer.valueOf(scanner.nextLine());
            if (opcao == 1) {
                combatente = criarCombatente();
            } else if (opcao == 2) {
                if (combatente != null) {
                    combatente.mostrarDados();
                } else {
                    System.out.println("Nenhum combatente criado ainda.");
                }
            } else if (opcao == 3) {
                guilda = criarGuilda(combatentes);
            } else if (opcao==4) {

            }
        }
    }

    public Combatente criarCombatente() {
        Combatente combatente = null;
        String classeCombatente = "";
        boolean opcaoValida = false;

        while (!opcaoValida) {
            Integer escolha;
            System.out.println("Escolha a classe do personagem");
            System.out.println("(1) Guerreiro ");
            System.out.println("(2) Arqueiro ");
            System.out.println("(3) Mago ");
            System.out.println("(4) Orc ");

            escolha = Integer.valueOf(scanner.nextLine());

            if (escolha == 1) {
                classeCombatente = "Guerreiro";
                opcaoValida = true;
            } else if (escolha == 2) {
                classeCombatente = "Arqueiro";
                opcaoValida = true;
            } else if (escolha == 3) {
                classeCombatente = "Mago";
                opcaoValida = true;
            } else if (escolha == 4) {
                classeCombatente = "Orc";
                opcaoValida = true;
            } else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }

        System.out.println("Digite o nome do personagem:");
        String nome = scanner.nextLine();

        System.out.println("Digite o cargo:");
        String cargo = scanner.nextLine();

        System.out.println("Digite a força:");
        int forca = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite a vida:");
        int vida = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite a inteligência:");
        int inteligencia = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite a agilidade:");
        int agilidade = Integer.parseInt(scanner.nextLine());

        if (classeCombatente.equals("Guerreiro")) {
            combatente = new Guerreiro(nome, cargo, classeCombatente, forca, vida, inteligencia, agilidade);
        } else if (classeCombatente.equals("Arqueiro")) {
            combatente = new Arqueiro(nome, cargo, classeCombatente, forca, vida, inteligencia, agilidade);
        } else if (classeCombatente.equals("Mago")) {
            combatente = new Mago(nome, cargo, classeCombatente, forca, vida, inteligencia, agilidade);
        } else if (classeCombatente.equals("Orc")) {
            combatente = new Orc(nome, cargo, classeCombatente, forca, vida, inteligencia, agilidade);
        }

        return combatente;
    }

    public Guilda criarGuilda(ArrayList<Combatente> combatentes) {
        System.out.println("Escolha um nome para a sua Guilda:");
        String guildaNome = scanner.nextLine();
        Guilda guilda = new Guilda(guildaNome,combatentes);
        return guilda;
    }
}
