public class Orc extends Combatente {
    public Orc(String nome, String cargo, String classe,Integer forca, Integer vida,Integer inteligencia, Integer agilidade){
        super(nome,cargo,classe,forca,inteligencia,agilidade,vida);
        setForca(getForca() + 10);
        setInteligencia(getInteligencia() - 5);
        setAgilidade(getAgilidade() - 3);
        setVida(getVida() + 5);
    }

    @Override
    void acao(){System.out.println("O Orc parte pra cima e amendronta todos os inimigos \n");}
}
