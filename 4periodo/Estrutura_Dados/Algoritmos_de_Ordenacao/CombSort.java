public class CombSort {


    public static void combSort(int[] vetor) {
        int tamanho = vetor.length;
        int gap = tamanho;
        boolean trocou = true;
        int comparacoes = 0;
        int trocas = 0;

        while (gap > 1 || trocou) {
            gap = (gap * 10) / 13;
            if (gap < 1) {gap = 1;}
            trocou = false;
            for (int i = 0; i < tamanho - gap; i++) {
                comparacoes++;
                if (vetor[i] > vetor[i + gap]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[i + gap];
                    vetor[i + gap] = temp;
                    trocas++;
                    trocou = true;
                }
            }
        }
        System.out.println("Comparações: " + comparacoes);
        System.out.println("Trocas: " + trocas);
    }
}

    
