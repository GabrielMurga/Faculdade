public class BubbleSort {
    
    public static void bubbleSort(int [] vetor){
        int tamanho = vetor.length;
        boolean trocou = true;
        while(trocou){ 
            trocou = false;
            for(int i =0; i < tamanho -1;i++){// Aqui o -1 eh pq eu sempre vou fazer a comparacao em dois e com o proximo, nao faz sentido eu avancar ate o ultimo
                if(vetor[i] > vetor[i+1]){
                    int temp = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = temp;
                    trocou = true;               
                }
    
            }
        }
    }
}
