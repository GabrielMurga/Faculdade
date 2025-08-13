public class Album
{
  private String genero;
  private String ano;
  private  String nome;
  private Pessoa artista;
  private Musica musica;

  public Album(String genero,String ano, String nome){
      this.genero = genero;
      this.ano = ano;
      this.nome = nome;
  }

  public String getNome(){
      return this.nome;
  }
  public void setNome(String nome){
      this.nome = nome;
  }
  public String getGenero(){
      return this.genero;
  }
  public void setGenero(String genero){
      this.genero = genero;
  }
  public String getAno(){
      return this.ano;
  }
  public void setAno(){
      this.ano = ano;
  }
  public Pessoa getArtista(){
      return this.artista;
  }
  public void setArtista(Pessoa artista){
      this.artista = artista;
  }
  public Musica getMusica(){
      return this.musica;
  }
  public void setMusica( Musica musica){
      this.musica = musica;
  }
  public void Retorna(){
      System.out.println("Dados do album :");
      System.out.print("\nNome: " + this.nome + "\nGenero: " + this.genero + "\nAno: " + this.ano + "\nArtista: " + this.artista.getNome() + "\nMusica:  " + this.musica.getNome());

  }


}
