import java.util.Scanner;

public class Main {
public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Pilha_com_Lista p = new Pilha_com_Lista();

     int continuar = 999;
     while(continuar != 9){
     System.out.println("\n");
     System.out.println("1 - Inserir");
     System.out.println("2 - Remover");
     System.out.println("3 - Imprimir");
     System.out.println("9 - Sair");
     System.out.print("Escolha: ");
     continuar = sc.nextInt();
     sc.nextLine();
     if(continuar == 1){
          System.out.println("Diga o numero que quer inserir: ");
          int valor = sc.nextInt();
          sc.nextLine();
          p.insere(valor);
     }
     else if(continuar == 2){
          p.remove();

     }
     else if(continuar == 3){
          System.out.println("Segue impressao do estado atual da pilha: ");
          p.imprimir();
     }

     else if (continuar == 9){
          System.out.println("Encerrando programa!");
          continuar = 9;
     }
     else{
          System.out.println(" Opçaão invalida tente novamente");
     }

     }
     sc.close();

}
};
