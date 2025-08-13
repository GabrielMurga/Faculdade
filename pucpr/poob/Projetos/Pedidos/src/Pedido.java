import java.util.ArrayList;

public class Pedido {
    private Cliente cliente;
    private ArrayList<Prato>pratos;



    public Pedido (Cliente cliente, ArrayList pratos){
        this.cliente = cliente;
        this.pratos = pratos;
    }

    public ArrayList<Prato> getPratos() {
        return pratos;
    }

    public void setPratos(ArrayList<Prato> pratos) {
        this.pratos = pratos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void mostraTodosOsDados(){
        System.out.println("Nome do Cliente: "+ this.cliente.getNome());
        System.out.println("Pratos do Pedido: ");
        int soma = 0;
        for(int i = 0; i<pratos.size();i++){
            int preco = pratos.get(i).getPreco();
            soma += preco;
        }
        for( int i =0 ;i<pratos.size();i++){
            System.out.println("Prato :"+ pratos.get(i).getNome());
            System.out.println("Preco :"+ pratos.get(i).getPreco()+ "\n");
        }
        System.out.println("Total a pagar :"+ soma );
    }
}
