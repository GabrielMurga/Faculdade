

public class Expressao {

    public int verificarExpressao(Pilha pilha){
        /// Esses prints eu coloquei com o auxilio do CHAT GPT para melhor entendimento do que ta acontencedo.
        
        Pilha auxiliar = new Pilha(pilha.getTopo()); // to criando aqui uma pilha auxiliar do tamanho da minha pilha original 

        System.out.println("A expressao que vou analisar eh :");
        pilha.imprime();

        for( int i = 0;i<= pilha.getTopo();i++){
            String caractere =pilha.getElemento(i);

            if(caractere.equals("(") || caractere.equals("{") || caractere.equals("[")){
                auxiliar.insere(caractere);
                System.out.println("Empilhei o "+ caractere);
            }

            else if(caractere.equals(")") || caractere.equals("}") || caractere.equals("]"))
            {
                if(auxiliar.vazia()){
                    System.out.println("Erro apareceu caractere de fechamento mas nao tem o de abertura");
                    return 0; // Aqu_da_auxiliari se eu tiver um ) antes de um ( ja ta errado ja
                }
                /// Essa parte aqui eu tenho que pegar o topo da minha auxiliar , pois o ultimo a abir vai sar o primeiro a fechar 
                else
                {
                String topo_da_auxiliar = auxiliar.getElemento(auxiliar.getTopo());
                System.out.println("Topo atual da pilha auxiliar: " + topo_da_auxiliar);
                if(caractere.equals(")") && !topo_da_auxiliar.equals("(")){
                    System.out.println("ERRO: Esperava '(' para fechar, mas encontrou '" + topo_da_auxiliar + "'");
                    return 0;
                }
                if(caractere.equals("}") && !topo_da_auxiliar.equals("{")){
                    System.out.println("ERRO: Esperava '{' para fechar, mas encontrou '" + topo_da_auxiliar + "'");
                    return 0;
                }
                if(caractere.equals("]") && !topo_da_auxiliar.equals("[")){
                    System.out.println("ERRO: Esperava '[' para fechar, mas encontrou '" + topo_da_auxiliar + "'");

                    return 0;
                }
                auxiliar.remove();
                System.out.println("Removeu: " + topo_da_auxiliar);
            }

            }
            else{continue;} 
        }

        if (auxiliar.vazia()){
            System.out.println("Expressão válida: pilha auxiliar ficou vazia no final.");
            return 1;
        }
        else{
            System.out.println("Expressão inválida: sobrou coisa na pilha auxiliar.");
            return 0; // sbrou alguma parada que nao fechou
        }

}
}
