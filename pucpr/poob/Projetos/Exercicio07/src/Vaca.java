class Vaca extends Animal {
    @Override
    void som() {
        System.out.print("Muuuu\n");
    }
    public Vaca (String nome){
        super(nome);
    }
}