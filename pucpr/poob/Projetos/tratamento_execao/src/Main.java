public class Main {
    public static void main(String[] args) {
        int[] numeros = {4, 5, 8, 9, 20, 3, 4, 5};
        int[] div = {2, 4, 0, 8, 3, 0};

        int minLength = Math.min(numeros.length, div.length);

        for (int i = 0; i < minLength; i++) {
            try {
                if (div[i] == 0) {
                    System.out.println(numeros[i] + " / " + div[i] + " = Erro: divisão por zero");
                } else {
                    System.out.println(numeros[i] + " / " + div[i] + " = " + (numeros[i] / div[i]));
                }
            } catch (ArithmeticException e) {
                System.out.println("Erro de divisão por zero no índice " + i);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Erro de índice fora do vetor no índice " + i);
            }
        }
    }
}
