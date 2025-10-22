public class Main {
    public static void main(String[] args) {
        
        ArvoreMorse arvore = new ArvoreMorse();
        arvore.construirArvore();

        System.out.println("\n---- EXIBIÇÃO DA ÁRVORE ---- \n");
        arvore.exibir(); 
        System.out.println();

        System.out.println("\n---TESTE DE BUSCA (CÓDIGO --> LETRA) ---\n");
        System.out.println("... -> " + arvore.buscarCodigo("...")); // S
        System.out.println("--- -> " + arvore.buscarCodigo("---")); // O
        System.out.println(".- -> " + arvore.buscarCodigo(".-"));   // A
        System.out.println();

        System.out.println("\n---TESTE DE BUSCA (LETRA --> CÓDIGO)---\n");
        System.out.println("S -> " + arvore.buscarLetra('S')); // ...
        System.out.println("O -> " + arvore.buscarLetra('O')); // ---
        System.out.println("A -> " + arvore.buscarLetra('A')); // .-
        System.out.println();

        System.out.println("\n---- TESTE DE REMOÇÃO----\n");
        arvore.remover('S');
        System.out.println("Após remover 'S':");
        System.out.println("... -> " + arvore.buscarCodigo("...")); 
        System.out.println();

        System.out.println("=== ÁRVORE APÓS REMOÇÃO ===");
        arvore.exibir();
    }
}
