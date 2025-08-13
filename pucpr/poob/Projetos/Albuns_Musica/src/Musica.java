public class Musica {
        private String duracao;
        private String nome;
        private Pessoa artista;


        public Musica( String nome, String duracao,Pessoa artista){
            this.nome = nome;
            this.duracao = duracao;
            this.artista = artista;
        }

        public String getNome(){
            return this.nome;
        }
        public void setNome(String nome){
            this.nome = nome;
        }
        public String getDuracao(){
            return this.duracao;
        }


        public void setDuracao(String duracao){
            this.duracao = duracao;
        }

    public Pessoa getArtista() {
        return artista;
    }

    public void setArtista(Pessoa artista) {
        this.artista = artista;
    }
}

