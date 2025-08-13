import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Menu {
    public Scanner scanner;


    public Menu(){
        this.scanner=new Scanner(System.in);
    }
    public void inicializar(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Animal> listaAnimais = new ArrayList<>();

        int opcao = 0;

        while (opcao != 9) {
            System.out.println("\n*** Clínica Veterinária ***");
            System.out.println("Escolha o animal para atendimento:");
            System.out.println("(1) Cachorro");
            System.out.println("(2) Gato");
            System.out.println("(3) Pássaro");
            System.out.println("(4) Cavalo");
            System.out.println("(5) Vaca");
            System.out.println("(6) Listar Animais");
            System.out.println("(9) Sair");
            System.out.print("    Opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();
            Animal animal = null;

            if(opcao == 1) {
                System.out.println("Qual o nome do animal? ");
                String nome= scanner.nextLine();
                animal = new Cachorro(nome);
            } else if(opcao == 2) {
                System.out.println("Qual o nome do animal? ");
                String nome= scanner.nextLine();
                animal = new Gato(nome);
            } else if(opcao == 3) {
                System.out.println("Qual o nome do animal? ");
                String nome= scanner.nextLine();
                animal = new Passaro(nome);
            } else if(opcao == 4) {
                System.out.println("Qual o nome do animal? ");
                String nome= scanner.nextLine();
                animal = new Cavalo(nome);
            } else if(opcao == 5) {
                System.out.println("Qual o nome do animal? ");
                String nome= scanner.nextLine();
                animal = new Vaca(nome);

            }else if (opcao==6){
                for(int i=0;i<listaAnimais.size();i++){
                    System.out.println(listaAnimais.get(i).getNome());
                }
            }
            else if(opcao == 9) {
                System.out.println("Encerrando o programa...");
                opcao=9;
            } else {
                System.out.println("Opção inválida.");
                continue;
            }

            listaAnimais.add(animal);

            int vezes = random.nextInt(10) + 1; // número aleatório entre 1 e 5

            System.out.print("\nSom do animal: ");
            animal.som();

            System.out.println("Emitindo o som " + vezes + " vezes:");
            animal.som(vezes);
        }

        scanner.close();
    }
    }

