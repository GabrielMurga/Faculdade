public class Area {
    public int base;
    public int altura;

    public int Triangulo (int base, int altura){
        this.base= base;
        this.altura= altura;
        return base * altura;
    }
    public int Quadrado (int base){
        this.base = base;
        return base * base;
    }
}
