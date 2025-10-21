public class Fila {
    Atendimento fim;
    Atendimento inicio;

    public Fila(){
        this.fim = null;
        this.inicio = null;
    }


    public int verificar_Fila_vazia(){
        if(this.inicio == null){
            return 1;
        }
        else return 0;
    }


    public void InserirAtendimento(Atendimento atendimento){
        if(this.inicio == null){
            this.inicio = atendimento;
            this.fim = atendimento;
        }
        else{
            this.fim.next = atendimento;
            fim = atendimento;
        }
    }

    public void AtenderCliente(){
        if(this.inicio == null){
            System.out.println("Nao ha clientes na fila de espera");
            return;         
        }
        else{
            this.inicio = inicio.next;
        }
    }


    public void mostrarClienteNaFila(){
        if(this.inicio == null){
            System.out.println(" Nao ha clientes na fila de atendimento");
        }
        else{
            Atendimento atual = this.inicio;
            while(atual!= null){
                System.out.print("ID: "+ atual.id +". NOME: "+ atual.nome+ ".MOTIVO: "+ atual.motivo+",");
                 atual = atual.next;   
            } 
        }
    }
    
}
