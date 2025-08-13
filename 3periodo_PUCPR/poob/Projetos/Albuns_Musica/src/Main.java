import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Musica>musics = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int exit = 0;
        System.out.println("Faca seu album de musicas!");
        System.out.println("Escolha o nome do seu album: ");
        String album_nome = scanner.nextLine();
        System.out.println("Escolha o genero do seu album: ");
        String album_gen = scanner.nextLine();
        Album album = new Album(album_gen,album_nome,musics);
        while(exit == 0){
            System.out.println("Escolha uma opcao :\n (1) Add Musica\n (2) Mostrar Musicas\n (3) Sair");
            int opcao = Integer.parseInt(scanner.nextLine());
            if (opcao == 1){
                System.out.println("Diga o nome da musica :");
                String musica_nome = scanner.nextLine();
                System.out.println("Diga o nome do artista :");
                String artista_nome = scanner.nextLine();
                Pessoa artista = new Pessoa(artista_nome);
                System.out.println("Diga a duracao da musica :");
                String duracao_musica = scanner.nextLine();
                Musica musica = new Musica(musica_nome, duracao_musica, artista);
                album.getMusica().add(musica);

            }
            else if (opcao == 2){
                album.mostraTodosOsDados();
            }
            else{
                System.out.println("Fim do programa!");
                exit = 1;
            }
        }

}}