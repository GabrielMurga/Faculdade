public class Atendimento{
    String nome;
    String motivo;
    String id;
    Atendimento next;

    public Atendimento(String id, String nome,String motivo){
        this.id = id;
        this.motivo = motivo;
        this.nome = nome;
        this.next = null;
    }
}