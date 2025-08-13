import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Musica m1 = new Musica("Zombie", "5:14");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Diga o nome do artista: ");
        String artNome = scanner.nextLine();
        System.out.println("Diga a idade do artista: ");
        String artIdade = scanner.nextLine();
        Pessoa p1 = new Pessoa(artNome,artIdade);
        Album a1 = new Album("Rock","2010","After Life");
        a1.setArtista(p1);
        a1.setMusica(m1);
        a1.Retorna();
    }
}