package exercicio1.br.com.gft.model;

public class Veiculo {

    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private float km;
    private boolean isLigado;
    private int litrosCombustivel;
    private int velocidade;
    private Double preco;

    public Veiculo(String marca, String modelo, String placa, String cor, float km, Double preco, int litrosCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.km = km;
        this.litrosCombustivel = litrosCombustivel;
        this.preco = preco;
        this.isLigado = false;
        this.velocidade = 0;
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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }



    public void acelerar() {
        if(this.isLigado == false){
            System.out.println("ligar o carro antes de acelerar!");
        } else {
            this.velocidade += 20;
        }
    }

    public void abastecer(int combustivel) {
        int quantidadeDeCombustivelPermitido;
        quantidadeDeCombustivelPermitido = 60 - (this.litrosCombustivel + combustivel);
        if(this.litrosCombustivel == 60){
            System.out.println("O tanque de combustível está no cheio.");
        }else {
            if(quantidadeDeCombustivelPermitido < 0) {
                quantidadeDeCombustivelPermitido = combustivel + quantidadeDeCombustivelPermitido;
                System.out.println(
                        "Foi possivel colocar apenas " +
                        quantidadeDeCombustivelPermitido +
                        " litros, é suficiente para encher o tanque.");

                this.litrosCombustivel += quantidadeDeCombustivelPermitido;
            }else {
                this.litrosCombustivel += combustivel;
            }
        }
    }

    public void frear() {

        if(velocidade == 0 ){
            System.out.println("Veiculo está parado, não é possivel freiar.");
        } else {
            this.velocidade -= 20;
        }

    }

    public void pintar(String cor) {
        this.cor = cor;
    }

    public void ligar() {
        if(this.isLigado == true){
            System.out.println("Carro já está ligado!");
        }else {
            this.isLigado = true;
        }
    }

    public void desligar() {
        if(this.isLigado == false){
            System.out.println("Carro já está desligado!");
        }else {
            if(this.velocidade > 0){
                System.out.println("Velocidade maior que zero, veiculo não será desligado!");
            }else {
                this.isLigado = false;
            }

        }
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", km=" + km +
                ", Está ligado=" + isLigado +
                ", litrosCombustivel=" + litrosCombustivel +
                ", velocidade=" + velocidade +
                ", preco=" + preco +
                '}';
    }
}
