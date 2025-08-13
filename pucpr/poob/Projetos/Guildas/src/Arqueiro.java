public class Arqueiro extends Combatente {
    public Arqueiro(String nome, String cargo, String classe,Integer forca, Integer vida,Integer inteligencia, Integer agilidade){
        super(nome,cargo,classe,forca,inteligencia,agilidade,vida);
        setForca(getForca() -5);
        setInteligencia(getInteligencia() +5);
        setAgilidade(getAgilidade() +10);
        setVida(getVida() -3 );
    }

    @Override
    void acao(){System.out.println("O arqueiro atira uma flecha em direcao aos inimigos  \n");}
}
