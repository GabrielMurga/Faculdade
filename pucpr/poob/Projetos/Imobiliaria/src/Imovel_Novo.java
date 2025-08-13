public class Imovel_Novo extends Imovel{
    private Float acrescimo;

    public Imovel_Novo(String endereco, Float preco, Float acrescimo){
        super(endereco,preco);
        this.acrescimo = acrescimo;
    }

    public Float getAcrescimo() {
        return acrescimo;
    }

    public void setAcrescimo(Float acrescimo) {
        this.acrescimo = acrescimo;
    }

    public Float calcularPrecoFinal(){
        return getPreco()*acrescimo + getPreco();
    }


    public void exibirInfoAdd(){
        exibirInfo();
        System.out.println("Novo preco :"+ calcularPrecoFinal()+"\n");
    }
}
