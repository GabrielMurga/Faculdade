public class Musica {
   private String duracao;
   private String nome;



   public Musica( String nome, String duracao){
       this.nome = nome;
       this.duracao = duracao;
   }

   public String getNome(){
       return this.nome;
   }
   public void setNome(String nome){
       this.nome = nome;
   }
   public String getDuracao(){
        return this.duracao;
    }


    public void setDuracao(String duracao){
            this.duracao = duracao;
   }

}
