import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int exit = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao programa!");
            while (exit == 0)
            {
                System.out.println("Escolha a figura que deseja trabalhar : \n(1) Triangulo \n(2) Quadrado \n(3) Sair");
                int Escolha = Integer.parseInt(sc.nextLine());

                if(Escolha == 1){
                    System.out.print("Escolha a base do seu triangulo: ");
                    int base = Integer.parseInt(sc.nextLine());

                    System.out.print("Escolha a altura do seu triangulo: ");
                    int altura = Integer.parseInt(sc.nextLine());
                    Area a1 = new Area();
                   int resultado = a1.Triangulo(base,altura);
                    System.out.println("Sua area e " + resultado);
                    System.out.println("Desejas continuar?[Y/N]");
                    String continua = sc.nextLine();
                    if (Objects.equals(continua,"N")|| Objects.equals(continua,"n")){
                        System.out.print("Fim do programa!");
                        exit = 1;

                    }
                }

                else if (Escolha ==2) {
                    System.out.print("Escolha o  lado do seu quadrado: ");
                    int base = Integer.parseInt(sc.nextLine());
                    Area a1 = new Area();
                    int resultado = a1.Quadrado(base);
                    System.out.println("Sua area e " + resultado);
                    System.out.println("Desejas continuar?[Y/N]");
                    String continua = sc.nextLine();
                    if (Objects.equals(continua,"N")|| Objects.equals(continua,"n")){
                        System.out.print("Fim do programa!");
                        exit = 1;
                    }
                }

                else if (Escolha ==3){
                    System.out.print("Fim do programa!");
                    exit = 1;
                }
                else{
                    System.out.println("Caractere invalido, tente novamente!");
                }

            }
    }
}