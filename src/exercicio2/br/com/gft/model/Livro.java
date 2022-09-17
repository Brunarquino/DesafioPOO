package exercicio2.br.com.gft.model;
import exercicio2.br.com.gft.interfaces.Imposto;

public class Livro extends Produto implements Imposto {

    private String autor;
    private String tema;
    private int qtdPag;

    public Livro() {
    }

    public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
        super(nome, preco, qtd);
        this.autor = autor;
        this.tema = tema;
        this.qtdPag = qtdPag;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getQtdPag() {
        return qtdPag;
    }

    public void setQtdPag(int qtdPag) {
        this.qtdPag = qtdPag;
    }


    @Override
    public double calcularImposto() {
        if(this.tema == "educativo"){
            return 0d;
        }else {
            return 0.1 * getPreco();
        }
    }

    @Override
    public String toString() {
        return "Livro: " +
                super.getNome() +
                ", " + super.getPreco() +
                ", " + super.getQtd() +
                ", " + autor +
                ", " + tema +
                ", " + qtdPag;
    }
}
