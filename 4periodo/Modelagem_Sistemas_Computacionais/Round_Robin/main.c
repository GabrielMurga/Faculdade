#include <stdio.h>
#include <stdlib.h>
#include <string.h>


struct processo{
    int id;
    int tempo_execucao;
    int terminou;
};
typedef struct processo Processo;

Processo inicializar_processo( int id , int tempo_execucao){
    int terminou = 0;
    return Processo p(id,tempo_execucao,terminou);
}

void implementar_round_robin(int quantum, Processo vetor_de_processos, ){
    int fila = []; 
    quero criar um vetor para ir colocando na fila
    percorrer vetor de processos
    diminuir de tempo de execucao o quantum
    adicionar processo na fila 
    ir para proximo processo
    sair printando

}


main()