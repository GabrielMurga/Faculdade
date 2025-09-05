public class No {

    public int valor;
    public No proximo;
    
    public No( int valor){
        this.valor = valor;
        this.proximo = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
