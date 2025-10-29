public class GnomeSort{

    public static void gnomeSort(int [] vetor){
        int gnomo = 1;// comeca no segundo elemento
        int tamanho = vetor.length;
        int comparacoes = 0;
        int trocas = 0;



        while(gnomo < tamanho){ // vai ate o penultimo
            comparacoes++;
            if ( vetor[gnomo]> vetor[gnomo-1]){
                gnomo++;
            }
            else{
                
            int temp = vetor[gnomo];            
            vetor[gnomo] = vetor[gnomo - 1];    
            vetor[gnomo - 1] = temp;            
            trocas++;                           
            gnomo--; 
            }

        }
        System.out.println("Comparações: " + comparacoes);
        System.out.println("Trocas: " + trocas);
    }

}