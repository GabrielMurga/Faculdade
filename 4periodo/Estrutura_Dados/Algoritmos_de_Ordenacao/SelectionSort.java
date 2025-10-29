public class SelectionSort {
    public static void selectionSort(int[]vetor){
        int tamanho = vetor.length;

        for(int i =0; i<tamanho-1;i++){
            int menor = vetor[i];
            int indexMenor =i;
            for(int j =i+1;j< tamanho;j++){
                if(vetor[j]< menor){
                    menor = vetor[j];
                    indexMenor = j;
                }
            }

            int temp = vetor [i];
            vetor[i] = vetor[indexMenor];
            vetor[indexMenor] = temp;
        }

    }
}