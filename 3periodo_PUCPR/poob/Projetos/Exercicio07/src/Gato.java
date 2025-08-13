public class Gato extends Animal{

    @Override
    void som() {
        System.out.println("Miau Miau");
    }
    public Gato(String nome){
        super(nome);
    }
}