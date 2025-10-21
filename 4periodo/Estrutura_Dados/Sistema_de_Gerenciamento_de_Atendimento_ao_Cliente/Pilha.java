public class Pilha {
    Solicitacao topo;
    
    public Pilha(){
        this.topo = null;
    }

    public void removerSolicitacao(){
        if(this.topo == null){
            System.out.println(" Pilha vazia n'ao foi possivel remover a solicitacao");
            return;
        }else{
             topo = topo.next;

        }}



    public void adicionarSolicitacao(Solicitacao solicitacao)
        {
            if (this.topo == null){
                this.topo = solicitacao;
            }
            else{
                solicitacao.next = this.topo; 
                this.topo = solicitacao;
            }

        }


    public void mostrarHistoricoDeSolicitacoes(){
        if (this.topo == null){
            System.out.println("Nao ha solicitacoes no momento");
        }
        else{
            Solicitacao atual = topo;
            while(atual != null){
                System.out.print("\nID: "+ atual.Id +".DESCRICAO: "+ atual.descricao+ ".DATA: "+ atual.data+",");
                atual= atual.next;
            }
        }
    }


    }


