public class Imovel {
     private String endereco;
     private Float preco;

     public Imovel(String endereco, Float preco){
         this.endereco = endereco;
         this.preco = preco;
     }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public void setEdereco(String edereco) {
        this.endereco = edereco;
    }

    public Float getPreco() {
        return preco;
    }

    public String getEdereco() {
        return endereco;
    }

    public void exibirInfo(){
         System.out.println("Informacoes do Imovel");
         System.out.println("Preco: "+getPreco()+" Endereco: "+getPreco());
    }
}
