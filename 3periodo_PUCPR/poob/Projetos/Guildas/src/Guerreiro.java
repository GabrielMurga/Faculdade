public class Guerreiro extends Combatente{


    public Guerreiro(String nome, String cargo, String classe,Integer forca, Integer vida,Integer inteligencia, Integer agilidade){
        super(nome,cargo,classe,forca,inteligencia,agilidade,vida);
    }

    @Override
    void acao(){System.out.println("O guerreiro ataca com sua espada! \n");}
}
