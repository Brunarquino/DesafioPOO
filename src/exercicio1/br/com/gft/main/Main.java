package exercicio1.br.com.gft.main;

import exercicio1.br.com.gft.model.Veiculo;

public class Main {
    public static void main(String[] args) {

        Veiculo
                veiculo = new Veiculo(
                        "Fiat", "Fiat Mobi", "HQW-5678", "Vermelho", 0f, 67.680, 10);

        System.out.println("=== TESTES DOS MÉTODOS ===");
        System.out.println(veiculo.toString());
        System.out.println();

        System.out.println("=== Ligar ===");
        veiculo.ligar();
        System.out.println(veiculo.toString());
        System.out.println("Ligando veiculo já ligado...");
        veiculo.ligar();
        System.out.println();

        System.out.println("=== Acelerar ===");
        System.out.println("Acelerando Veiculo desligado");
        veiculo.desligar();
        veiculo.acelerar();

        System.out.println("\nAcelerando Carro");
        veiculo.ligar();
        veiculo.acelerar();
        veiculo.acelerar();
        veiculo.acelerar();
        System.out.println(veiculo.toString());
        System.out.println();

        System.out.println("=== Abastecer ===");
        System.out.println("Tentando abastecer um carro com mais gasolina do que necessario");
        veiculo.abastecer(60);
        System.out.println(veiculo.toString());

        System.out.println();
        System.out.println("Abastecendo um carro já com o tanque cheio");
        veiculo.abastecer(60);
        System.out.println(veiculo.toString());
        System.out.println();


        System.out.println("=== Frear ===");
        veiculo.frear();
        veiculo.frear();
        veiculo.frear();
        System.out.println(veiculo.toString());
        System.out.println();

        System.out.println("\nTentando freiar veiculo parado");
        System.out.println();

        System.out.println("=== Pintar ===");
        veiculo.pintar("Azul");
        System.out.println(veiculo.toString());
        System.out.println();

        System.out.println("=== Desligar ===");
        System.out.println("Tentando desligar veiculo em velocidade");
        veiculo.acelerar();
        veiculo.desligar();
        veiculo.frear();

        System.out.println("\nDesligando veiculo normalmente");
        veiculo.desligar();
        System.out.println(veiculo.toString());

    }
}
