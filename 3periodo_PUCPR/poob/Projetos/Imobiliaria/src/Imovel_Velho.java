public class Imovel_Velho extends Imovel {

    private Float desconto;

    public Imovel_Velho(String endereco, Float preco, Float desconto){
        super(endereco,preco);
        this.desconto = desconto;
    }

    public Float getDesconto() {
        return desconto;
    }

    public void setDesconto(Float acrescimo) {
        this.desconto= acrescimo;
    }

    public Float calcularPrecodesconto(){
        return getPreco()- getPreco()*desconto;
    }


    public void exibirInfoAdd(){
        exibirInfo();
        System.out.println("Novo preco :"+ calcularPrecodesconto()+"\n");
    }
}
