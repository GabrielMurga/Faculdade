import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Filmes>filmes = new ArrayList<>();
        filmes.add(new Filmes("Operacao Baba","Acao",2002));
        filmes.add(new Filmes("007","Acao",2007));
        filmes.add(new Filmes("Django","Acao",2010));
        System.out.println("\n    Filmes em Cartaz   \n");
        for(int i=0;i<filmes.size();i++){
            System.out.println("Filme :"+filmes.get(i).getTitulo());
            System.out.println("Genero :"+filmes.get(i).getGenero());
            System.out.println("Ano :"+filmes.get(i).getAno()+"\n");
        }
    }
}