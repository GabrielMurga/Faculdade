public class Arv {

    private No raiz;
    public Arv(){
        this.raiz = null;
    }
    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }
    // 1 - Algoritmo de insercao
    public void inserir(int valor){
        this.raiz = inserirRec(this.raiz,valor);
    }

    public No inserirRec(No no_atual, int valor) {
        if (no_atual == null) {
            return new No(valor);
        }

        if (valor < no_atual.getValor()) {
            no_atual.setEsq(inserirRec(no_atual.getEsq(), valor));
        } 
        else if (valor > no_atual.getValor()) {
            no_atual.setDir(inserirRec(no_atual.getDir(), valor));
        }

        return no_atual;

        }
    // 2 Algoritmo para percorrer
    
    // Pre-Ordem 
    public void preOrdem(No no_atual){
        if(no_atual != null){
            System.out.print(no_atual.getValor()+",");
            preOrdem(no_atual.getEsq());
            preOrdem(no_atual.getDir());
        }
    }
    // inOrdem
    public void inOrdem(No no_atual) {
        if (no_atual != null) {
            inOrdem(no_atual.getEsq());
            System.out.print(no_atual.getValor() + ",");
            inOrdem(no_atual.getDir());
        }
    }
    // posOrdem
    public void posOrdem(No no_atual){
        if(no_atual != null){
            inOrdem(no_atual.getEsq());
            inOrdem(no_atual.getDir());
            System.out.print(no_atual.getValor()+ ",");
        }
    }


    // 3 Remover maior valor 

    public No remover_Maior_Valor(No no_atual){
        if(no_atual.getDir() == null){
            return no_atual.getEsq();
        }
        else{
            no_atual.setDir(remover_Maior_Valor(no_atual.getDir()));
            return no_atual; // pra ir subindo
        }
    }

    // 4 remover menor valor

    public No remover_Menor_valor(No no_atual){
        if(no_atual.getEsq() == null){
            return no_atual.getDir();
        }
        else{
            no_atual.setEsq(remover_Menor_valor(no_atual.getEsq()));
            return no_atual;
        }
    }

    // 5 Remover valor. 


public No encontrarMaior(No no) {
    while (no.getDir() != null) {
        no = no.getDir();
    }
    return no;
}


public No remover_Valor(No no_atual, int valor) {
    if (no_atual == null) 
        return null;

    if (valor < no_atual.getValor()) {
        no_atual.setEsq(remover_Valor(no_atual.getEsq(), valor));
    } else if (valor > no_atual.getValor()) {
        no_atual.setDir(remover_Valor(no_atual.getDir(), valor));
    } else {
        // achou o nó a remover
        if (no_atual.getEsq() == null && no_atual.getDir() == null) {
            return null;
        } else if (no_atual.getEsq() == null) {
            return no_atual.getDir();
        } else if (no_atual.getDir() == null) {
            return no_atual.getEsq();
        } else {
            // dois filhos
            No maior = encontrarMaior(no_atual.getEsq());
            no_atual.setValor(maior.getValor());
            no_atual.setEsq(remover_Valor(no_atual.getEsq(), maior.getValor()));
        }
    }

    return no_atual;
}


    public void remover(int valor) {
        this.raiz = remover_Valor(this.raiz, valor);
    }

    
}
