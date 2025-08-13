import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>();
        cores.add("Azul");
        cores.add("Vermelho");
        cores.add("Verde");
        cores.add("Amarelo");
        int exit = 0;
        Scanner scanner = new Scanner(System.in);
        while(exit == 0){
            System.out.println("Escolha uma opcao!\n (1) Ordenado\n (2) Nao Ordenado\n (3) Sair");
            int opcao = Integer.parseInt(scanner.nextLine());
            if (opcao == 1){
                ArrayList<String>cores2 =new ArrayList<>(cores);

                Collections.sort(cores2);
                for(int i =0; i<cores2.size();i++)
                {
                    System.out.println(cores2.get(i));
                }
            } else if (opcao==2) {

                for(int i =0; i<cores.size();i++)
                {
                    System.out.println(cores.get(i));
                }
            }
            else{
                System.out.println("Programa finalizado!");
                exit = 1;
            }
        }


    }
}