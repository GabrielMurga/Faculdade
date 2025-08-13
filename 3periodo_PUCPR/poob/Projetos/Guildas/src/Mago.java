public class Mago extends Combatente{
    public Mago(String nome, String cargo, String classe,Integer forca, Integer vida,Integer inteligencia, Integer agilidade){
        super(nome,cargo,classe,forca,inteligencia,agilidade,vida);
        setForca(getForca() -3);
        setInteligencia(getInteligencia() +10);
        setAgilidade(getAgilidade() +5);
        setVida(getVida() -5 );
    }

    @Override
    void acao(){System.out.println("O Mago lanca feiticos em seus inimigos!\n");}
}
