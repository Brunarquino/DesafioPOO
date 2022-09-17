package exercicio2.br.com.gft.model;
import exercicio2.br.com.gft.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto {

    private String marca;
    private String modelo;
    private boolean isUsado;

    public VideoGame() {
    }

    public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
        super(nome, preco, qtd);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isUsado() {
        return isUsado;
    }

    public void setUsado(boolean usado) {
        isUsado = usado;
    }

    @Override
    public double calcularImposto() {
        if(isUsado == true){
            return 0.25 * getPreco();
        }else {
            return 0.45 * getPreco();
        }
    }

    @Override
    public String toString() {
        return "VideoGame: " +
                super.getNome() +
                ", " + super.getPreco() +
                ", " + super.getQtd() +
                ", " + this.marca +
                ", " + this.modelo +
                ", " + this.isUsado;
    }
}
