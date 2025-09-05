public class Pilha_com_Lista {
    public No topo;

    public Pilha_com_Lista(){
        this.topo = null;
    }


    public void insere (int item){
        No novo_no = new No(item);
        novo_no.proximo = this.topo;
        this.topo = novo_no;

    }


    public void remove(){
        if (this.topo == null){System.out.println("A pilha se encontra vazia");
         return;
        }
        else{ 
            System.out.println("Você esta removendo: " + this.topo.valor);
            this.topo =this.topo.proximo; }
    }

    public void imprimir(){
        if(this.topo == null){
            System.out.println("A pilha se encontra vazia!");
             return;
        }
        else{
            No atual = this.topo;
            while(atual != null){
                System.out.println(atual.valor);
                atual = atual.proximo;
            }
        }

    }
}




