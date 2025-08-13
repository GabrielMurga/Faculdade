import java.util.ArrayList;

public class Guilda
{
    private String nome;
    private ArrayList<Combatente> combatentes;


    public Guilda(String nome, ArrayList<Combatente> combatentes){
        this.nome = nome;
        this.combatentes= new ArrayList<>();
    }

    public void mostrarCombatentes(){
        for(int i =0;i< combatentes.size();i++){
            System.out.println("Nome: "+combatentes.get(i).getNome());
            System.out.println("Cargo: "+combatentes.get(i).getCargo());
            System.out.println("Classe: "+combatentes.get(i).getClasse());
        }
    }

    public void guildaStatus(){
        int soma =0;
        for( int i =0;i< combatentes.size();i++){
            soma+= combatentes.get(i).getStatus();
        }

        if (soma>=90){
            System.out.println("O ranque da Guilda eh S");
        }
        else if (soma>=80){
            System.out.println(" O ranque da guilda e A");
        }
        else if (soma>=70){
            System.out.println(" O ranque da Guilda e B");
        }
        else if (soma>=60){
            System.out.println(" O ranque da Guilda e C");
        }
        else{
            System.out.println("O ranque da guilda e D");
        }
    }
}
