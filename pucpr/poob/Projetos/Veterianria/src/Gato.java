public class Gato extends Animais {
    private String cor;

    public Gato(String nome, String raca, Integer idade, Integer peso, String cor){
        super(nome, idade, peso, raca);
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void arranhar(){
        System.out.println(" O gato"+ getNome()+" esta arranhando");
    }
    public void miar(){
        System.out.println("Miau!");
    }
    public void exibirInfoADD(){
        exibirInfo();
        System.out.println("Cor: "+ getCor());
    }
}
