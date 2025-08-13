public class Animais {
    private String nome;
    private Integer idade;
    private Integer peso;
    private String raca;

    public Animais(String nome,Integer idade,Integer peso,String raca){
        this.nome = nome;
        this.idade =idade;
        this.peso = peso;
        this.raca =raca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Integer getPeso() {
        return peso;
    }

    public String getRaca() {
        return raca;
    }
    public void comer(){
        System.out.println("O animal "+getNome()+" esta comendo ");
    }
    public void dormir(){
        System.out.println("O animal " + getNome()+ " esta a dormir");
    }

    public void exibirInfo(){
        System.out.println("Nome: "+ getNome() + "Idade: "+getIdade() +" Raca: "+getRaca()+" Peso: "+ getPeso());
    }
}
