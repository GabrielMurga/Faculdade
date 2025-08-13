
abstract class Animal {
    private String nome;




    public Animal(String nome) { // <- Isso é ESSENCIAL!
        this.nome = nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    abstract void som(); // Cada animal implementa seu som
    void som(int vezes) {
        for (int i = 0; i < vezes; i++) {
            som(); // chama o som() normal da classe filha
        }
    }
}
