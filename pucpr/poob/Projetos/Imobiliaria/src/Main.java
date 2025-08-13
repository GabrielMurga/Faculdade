public class Main {
    public static void main(String[] args) {
        Imovel i1 = new Imovel("Rua Manguito", 100000.00F);
        Imovel_Velho i2 =new Imovel_Velho("Rua Chafariz",100000.00F,0.20F);
        Imovel_Novo i3 =new Imovel_Novo("Rua Girafa",100000.00F,0.10F);

        System.out.println("Imovel normal: ");
        i1.exibirInfo();
        System.out.println("\n");
        System.out.println("Imovel novo");
        i3.exibirInfoAdd();
        System.out.println("Imovel Velho");
        i2.exibirInfoAdd();
    }
}