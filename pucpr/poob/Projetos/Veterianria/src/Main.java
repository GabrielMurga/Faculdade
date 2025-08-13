public class Main {
    public static void main(String[] args) {

        Gato g1 = new Gato("Garfield","Persa",5,15,"laranja");
        Cachorro c1 = new Cachorro("Fenix","Beagle",8,12,"Medio");
        g1.arranhar();
        g1.miar();
        g1.dormir();
        c1.latir();
        g1.exibirInfoADD();
        c1.exibirInfoADD();
    }
}