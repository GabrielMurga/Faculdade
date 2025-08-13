
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

    struct paciente {
    int ordem;
    char cor[51];
    struct paciente* next;
};
typedef struct paciente Paciente;


Paciente* lst_paciente_prioridade_insere(Paciente* lista, int ordem, char* cor) {
    Paciente* novo = (Paciente*)malloc(sizeof(Paciente));
    if (novo != NULL) {
        novo->ordem = ordem;
        strcpy(novo->cor, cor);
        novo->next = NULL;
    }

    if (lista == NULL) {
        return novo;
    }

    else {
        Paciente* ultimo = NULL;
        Paciente* atual = lista;
        while (atual != NULL) {

            if ((strcmp(novo->cor, "R") == 0 && strcmp(atual->cor, "Y") == 0) ||
                (strcmp(novo->cor, "Y") == 0 && strcmp(atual->cor, "G") == 0) ||
                (strcmp(novo->cor, "R") == 0 && strcmp(atual->cor, "G") == 0)) {

                novo->next = atual;
                if (ultimo == NULL) {
                    return novo;
                }
                ultimo->next = novo;
                return lista;
            }
            ultimo = atual;
            atual = atual->next;
        }
        ultimo->next = novo;
        return lista;
    }
}
Paciente* remove_paciente(Paciente* lista, int ordem) {
    if (lista == NULL) {
        return NULL;
    }
    if (lista->ordem == ordem) {
        Paciente* temp = lista;
        lista = lista->next;
        free(temp);
        return lista;
    }
    Paciente* atual = lista;
    while (atual->next != NULL) {
        if (atual->next->ordem == ordem) {
            Paciente* temp = atual->next;
            atual->next = temp->next;
            free(temp);
            return lista;
        }
        atual = atual->next;
    }
    return lista;
}
void qntd_cores(Paciente* lst){
    int verde=0;
    int amarelo=0;
    int vermelho=0;
    Paciente* p;
    for(p=lst; p!=NULL; p=p->next ){
        if (strcmp(p->cor, "G") == 0){
            verde++;
        }
        else if (strcmp(p->cor, "Y") == 0){
            amarelo++;
        }
        else{
            vermelho++;
        }
    }
    printf("Situacao atual da fila: ");
    printf("Verdes %d | Amarelos %d | Vermelhos %d\n",verde,amarelo,vermelho);
}
void libera_lst(Paciente* lst){
    Paciente* p= lst;
    while(p!=NULL){
        Paciente* a = p->next;
        free(p);
        p=a;
    }}


void lst_imprime(Paciente* lst) {
    Paciente* p;
    for (p = lst; p != NULL; p = p->next) {
        printf("Posicao: %d Urgencia: %s\n", p->ordem, p->cor);
    }
}

int main(void) {
    FILE* arq;
    arq = fopen("pacientes.txt", "r");
    if (arq == NULL) {
        printf("Problemas na abertura do arquivo\n");
        exit(1);
    }

    char tipo[100];
    char cor[100];
    int ordem;
    char lastTipo='S';
    Paciente* lista_prioridade = NULL;
    while (fscanf(arq, "%[^-]-%d%[^\n]\n", tipo, &ordem, cor) != EOF) {
        if (tipo[0] == 'E') {
            lista_prioridade = lst_paciente_prioridade_insere(lista_prioridade, ordem, cor);
            lastTipo='E';
        }
        else {
            if(lastTipo=='E'){
            printf("\nLista de pacientes apos entrada\n");
            lst_imprime(lista_prioridade);
            qntd_cores(lista_prioridade);
            }
            lista_prioridade = remove_paciente(lista_prioridade, ordem);
            printf("\nAtualizacao de pacientes apos saida:\n");
            lst_imprime(lista_prioridade);
            qntd_cores(lista_prioridade);
            lastTipo='S';
        }
    }

    libera_lst(lista_prioridade);
    fclose(arq);
    return 0;
}


