public class Cachorro extends Animal{


    public Cachorro(String nome){
        super(nome);
    }
    @Override
    void som() {
        System.out.print("Au Au\n");
    }
}
