import java.util.ArrayList;

public class Album
{
    private String genero;
    private Integer ano;
    private String nome;
    private ArrayList<Musica> musica;


    public Album(String genero,String nome,ArrayList musica ){
        this.genero =genero;
        this.nome = nome;
        this.musica = musica;
    }

    public ArrayList<Musica> getMusica() {
        return musica;
    }

    public void mostraTodosOsDados(){
        System.out.println("Nome do Album: "+ this.nome);
        System.out.println("Musicas do Album: ");
        for( int i =0 ;i<musica.size();i++){
            System.out.println("Musica :"+ musica.get(i).getNome());
            System.out.println("Duracao :"+ musica.get(i).getDuracao());
            System.out.println("Artista :"+ musica.get(i).getArtista().getNome()+"\n");

        }
    }
}
