package exercicio2.br.com.gft.model;

import java.util.List;

public class Loja {

    private String nome;
    private String cnpj;
    private List<Livro> livros;
    private List<VideoGame> videoGames;

    public Loja() {
    }

    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGames = videoGames;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<VideoGame> getVideoGames() {
        return videoGames;
    }

    public void setVideoGames(List<VideoGame> videoGames) {
        this.videoGames = videoGames;
    }

    public void  listarLivros(){
        if(livros.isEmpty()){
            System.out.println("A loja não tem livros no seu estoque.");
        }else {
            for (Livro livro: livros) {
                System.out.println(livro);
            }
        }
    }

    public void  listarVideoGames(){
        if(videoGames.isEmpty()){
            System.out.println("A loja não tem video-games no seu estoque.");
        }else {
            for (VideoGame game :videoGames) {
                System.out.println(game);
            }
        }
    }

    public  double calcularPatrimonio() {
        double somaDosPrecos = 0.0;
        if(!livros.isEmpty()){
            for (Livro livro: livros) {
                somaDosPrecos += ( livro.getPreco() * livro.getQtd() );
            }
            for (VideoGame videoGame: videoGames) {
                somaDosPrecos += (videoGame.getPreco() * videoGame.getQtd() );
            }
        }
        return somaDosPrecos;
    }

}
