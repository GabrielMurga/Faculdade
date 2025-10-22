public class ArvoreMorse {
    private No raiz;

    public ArvoreMorse() {
        this.raiz = new No();
    } 


    public void inserir(char letra, String morse) {
    No atual = raiz;

    for (int i = 0; i < morse.length(); i++) {
        char simbolo = morse.charAt(i);

        if (simbolo == '.') {
            if (atual.esq == null) {
                atual.esq = new No();
            }
            atual = atual.esq;
        } 
        else if (simbolo == '-') {
            if (atual.dir == null) {
                atual.dir = new No();
            }
            atual = atual.dir;
        }
    }

    atual.letra = letra;
}
public void construirArvore() {
    // Letras

    inserir('A', ".-");
    inserir('B', "-...");
    inserir('C', "-.-.");
    inserir('D', "-..");
    inserir('E', ".");
    inserir('F', "..-.");
    inserir('G', "--.");
    inserir('H', "....");
    inserir('I', "..");
    inserir('J', ".---");
    inserir('K', "-.-");
    inserir('L', ".-..");
    inserir('M', "--");
    inserir('N', "-.");
    inserir('O', "---");
    inserir('P', ".--.");
    inserir('Q', "--.-");
    inserir('R', ".-.");
    inserir('S', "...");
    inserir('T', "-");
    inserir('U', "..-");
    inserir('V', "...-");
    inserir('W', ".--");
    inserir('X', "-..-");
    inserir('Y', "-.--");
    inserir('Z', "--..");

    // Números
    inserir('1', ".----");
    inserir('2', "..---");
    inserir('3', "...--");
    inserir('4', "....-");
    inserir('5', ".....");
    inserir('6', "-....");
    inserir('7', "--...");
    inserir('8', "---..");
    inserir('9', "----.");
    inserir('0', "-----");
}


public char buscarCodigo(String morse) {
    No atual = raiz;

    for (int i = 0; i < morse.length(); i++) {
        char simbolo = morse.charAt(i);

        if (simbolo == '.') {
            if (atual.esq == null) {
                return '?'; 
            }
            atual = atual.esq;
        } else if (simbolo == '-') {
            if (atual.dir == null) {
                return '?'; 
            }
            atual = atual.dir;
        }
    }

    return atual.letra; 
}

public String buscarLetra(char letra) {
    return buscarLetraRec(raiz, letra, "");
}

private String buscarLetraRec(No atual, char letra, String caminho) {
    if (atual == null) {
        return "";
    }

    if (atual.letra == letra) {
        return caminho; 
    }

    
    String esq = buscarLetraRec(atual.esq, letra, caminho + ".");
    if (esq.length() > 0) {
        return esq; 
    }

    
    String dir = buscarLetraRec(atual.dir, letra, caminho + "-");
    if (dir.length() > 0) {
        return dir; 
    }

    
    return "";
}
// REMOCAO
public void remover(char letra) {
    removerRec(raiz, letra);
}

private void removerRec(No atual, char letra) {
    if (atual == null) {
        return;
    }

    if (atual.letra == letra) {
        atual.letra = '\0'; // limpa o valor
        return;
    }

    removerRec(atual.esq, letra);
    removerRec(atual.dir, letra);
}

public void exibir() {
    exibirRec(raiz, "", 0);
}

private void exibirRec(No atual, String caminho, int nivel) {
    if (atual == null) {
        return;
    }

    // imprime recuo proporcional ao nível
    for (int i = 0; i < nivel; i++) {
        System.out.print("   ");
    }

    // mostra o nó
    if (atual.letra != '\0') {
        System.out.println(caminho + " -> " + atual.letra);
    } else {
        System.out.println(caminho + " -> (vazio)");
    }

    // continua recursivamente
    exibirRec(atual.esq, caminho + ".", nivel + 1);
    exibirRec(atual.dir, caminho + "-", nivel + 1);
}


}