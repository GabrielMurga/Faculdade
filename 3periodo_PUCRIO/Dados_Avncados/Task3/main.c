#include <stdio.h>
#include <stdlib.h>
struct tree{
    int key;
    int level;
    int height;
    struct tree* left;
    struct tree* right;
    struct tree* parent;
};typedef struct tree Tree;

Tree* newNode(int key,int level,Tree* parent){
    Tree* newNode= (Tree*)malloc(sizeof(Tree));
    newNode->key=key;
    newNode->level=level;
    newNode->parent=parent;
    newNode->left=NULL;
    newNode->right=NULL;
    newNode->height=0; //Inicialmente a altura e 0
    return newNode;
}
int calculateHeight(Tree* node){
    if(node==NULL)
        return -1;
    int leftSide = calculateHeight(node->left);
    int rightSide = calculateHeight(node->right);
    if(leftSide>rightSide){
        node->height= leftSide +1;
    }else{
        node->height = rightSide +1;
    }

    return node->height;
}
void insertByLevel(Tree** root, int key){
    if(*root == NULL){
        *root = newNode(key,0,NULL);
        return;
    }
    Tree* queue[100];
    int exit=0, arrival=0;
    queue[arrival++]=*root;

    while(arrival>exit){
        Tree* currentNode=queue[exit++];// received the value of root 
        int nextLevel= currentNode->level+1; // aqui crio a incrementacao dos leveis
        if(currentNode->left==NULL){
            currentNode->left=newNode(key,nextLevel,currentNode);// aqui coloco como argumento o no atual como pai para o proximo no
            return;
        }else{
            queue[arrival++]=currentNode->left;
        }
        if(currentNode->right==NULL){
            currentNode->right=newNode(key,nextLevel,currentNode);
            return;
        }else{
            queue[arrival++]=currentNode->right;
        }
    }
}
void printPerOrd(Tree* root) {
    if (root != NULL) {
        printf("Chave :%d || Level:%d || ALtura:%d \n", root->key,root->level,root->height);  // altura ta dando errado
        printPerOrd(root->left);  
        printPerOrd(root->right);   
    }
}


int main(void){
    int v[]={ 10, 5, 15, 3, 7, 13, 20, 1, 4, 6 };
    Tree* root=NULL;
    int size= sizeof(v)/sizeof(v[0]);
    for(int i=0; i<size;i++){
        insertByLevel(&root,v[i]);
    }
    calculateHeight(root);
    printf("Pre-order tree: \n");
    printPerOrd(root);
    return 0;

}