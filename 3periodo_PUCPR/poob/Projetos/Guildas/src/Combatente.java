abstract class Combatente
{
    private String nome;
    private String cargo;
    private String classe;
    private Integer forca;
    private Integer inteligencia;
    private Integer agilidade;
    private Integer vida;
    private Integer status;

    abstract void  acao();

    public Combatente(String nome, String cargo, String classe, Integer forca, Integer inteligencia, Integer agilidade, Integer vida) {
        this.nome = nome;
        this.cargo = cargo;
        this.classe = classe;
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.agilidade = agilidade;
        this.vida = vida;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;

    }

    public Integer getAgilidade() {
        return agilidade;
    }

    public Integer getForca() {
        return forca;
    }

    public Integer getInteligencia() {
        return inteligencia;
    }

    public Integer getVida() {
        return vida;
    }

    public String getCargo() {
        return cargo;
    }

    public String getClasse() {
        return classe;
    }

    public void setAgilidade(Integer agilidade) {
        this.agilidade = agilidade;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setForca(Integer forca) {
        this.forca = forca;
    }

    public void setInteligencia(Integer inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return agilidade+vida+forca+inteligencia;
    }

    public void mostrarDados(){
        System.out.println("Dados do combatente :");
        System.out.println("Nome :"+ nome);
        System.out.println("Cargo :"+ cargo);
        System.out.println("Classe :"+ classe);
        System.out.println("Forca :"+ forca);
        System.out.println("Inteligencia :"+ inteligencia);
        System.out.println("Agilidade :"+ agilidade);
        System.out.println("Vida :"+ vida);
        System.out.println("Status :"+ status);
    }
}
