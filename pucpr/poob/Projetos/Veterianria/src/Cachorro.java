public class Cachorro extends Animais {
    private String porte;


    public Cachorro(String nome, String raca,Integer idade, Integer peso, String porte){
        super(nome, idade, peso, raca);
        this.porte =porte;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public void latir(){
        System.out.println("roof roof");
    }
    public void exibirInfoADD(){
        exibirInfo();
        System.out.println("Porte: "+ getPorte());
    }
}
