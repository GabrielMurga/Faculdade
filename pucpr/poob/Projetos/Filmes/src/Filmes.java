public class Filmes {
    private String titulo;
    private String genero;
    private Integer ano;

    public  Filmes (String titulo, String genero, Integer ano){
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;

    }
    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
}
