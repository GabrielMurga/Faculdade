public class Solicitacao {
    String Id;
    String descricao;
    Solicitacao next;
    String data;
    String hora;




    public Solicitacao(String Id, String descricao,String data){
        this.next = null;
        this.Id = Id;
        this.descricao = descricao;
        this.data = data;
    
    }



    
}
