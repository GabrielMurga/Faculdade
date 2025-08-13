class Passaro extends Animal {
    @Override
    void som() {
        System.out.print("Piu Piu\n");
    }
    public Passaro(String nome){
        super(nome);
    }
}