public class Main {
    public static void main(String[] args) {
        Arv arvore = new Arv();

        int[] valores = {14, 15, 4, 9, 7, 18, 3, 5, 16, 20, 17, 9, 5};

        // 1-Inserção
        for (int v : valores) {
            arvore.inserir(v);
        }
        // 2 - Percorrendo 
        System.out.println("Pré-Ordem:");
        arvore.preOrdem(arvore.getRaiz());
        System.out.println();

        System.out.println("In-Ordem:");
        arvore.inOrdem(arvore.getRaiz());
        System.out.println();

        System.out.println("Pós-Ordem:");
        arvore.posOrdem(arvore.getRaiz());
        System.out.println();

        //  3 - Remover maior
        arvore.setRaiz(arvore.remover_Maior_Valor(arvore.getRaiz()));
        System.out.println("Após remover maior:");
        arvore.inOrdem(arvore.getRaiz());
        System.out.println();

        //  4 - Remover menor
        arvore.setRaiz(arvore.remover_Menor_valor(arvore.getRaiz()));
        System.out.println("Após remover menor :");
        arvore.inOrdem(arvore.getRaiz());
        System.out.println();

        //  5 - Remover valor específico
        arvore.remover(14);
        System.out.println("Após remover o 14:");
        arvore.inOrdem(arvore.getRaiz());
        System.out.println();
    }
}
