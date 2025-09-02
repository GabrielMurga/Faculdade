public class Pilha{
    private int capacidade;
    private String dados[];
    private int topo;



    public Pilha (int capacidade){
        this.capacidade = capacidade;
        this.dados = new String [capacidade];
        this.topo = -1;
    }

    public boolean vazia(){
        if (this.topo == -1){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean cheia(){
        if(this.topo == capacidade - 1){
            return true;
        }
        else{
            return false;
        }
    }

    public void insere(String valor ){
        if(this.cheia() == true){
            System.out.println("Erro, a pilha esta cheia");
            return;
        }
        else{

            this.topo++;
            this.dados[topo] = valor;
            System.out.println("Foi inserido o char "+ valor +" na pilha: ");

        }
    }

    public void remove(){

        if(this.vazia()== true){
            System.out.println("A pilha esta vazia, impossivel realizar remocao");
            return;
        }
        else{
           String valor_removido = this.dados[topo];
           this.topo--;
           System.out.println(" Char  removido" + valor_removido);
           return;

        }

    }

    public void imprime(){
        if(this.vazia() == true){
            System.out.println("Essa pilha esta vazia");
        }
        else{
            for(int i= 0; i<=this.topo;i++){

                System.out.println(this.dados[i]);
            }
        }
    }

    public int getTopo() {
        return this.topo;
    }

    public String getElemento(int i) {
        return this.dados[i];
    }

}