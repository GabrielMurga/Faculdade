import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos símbolos você vai digitar? ");
        int tamanho = sc.nextInt();
        sc.nextLine(); 

        Pilha pilha = new Pilha(tamanho);

        System.out.println("Digite os símbolos um por um: ");

        for (int i = 0; i < tamanho; i++) {
            String simbolo = sc.nextLine();
            pilha.insere(simbolo);
        }

        Expressao verificador = new Expressao();
        int resultado = verificador.verificarExpressao(pilha);

        if (resultado == 1) {
            System.out.println("Expressão válida!");
        } else {
            System.out.println("Expressão inválida!");
        }
        sc.close();
    }
}
