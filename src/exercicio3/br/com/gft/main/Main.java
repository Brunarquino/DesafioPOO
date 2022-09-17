package exercicio3.br.com.gft.main;

import exercicio3.br.com.gft.model.Guerreiro;
import exercicio3.br.com.gft.model.Mago;
import exercicio3.br.com.gft.model.Personagem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> magias = new ArrayList<>();
        magias.add("Magia 1");
        magias.add("Magia 2");
        magias.add("Magia 3");


        Mago mago1 = new Mago("Mago 1", 100, 5, 0, 10, 7, 0, magias);
        Mago mago2 = new Mago("Mago 2", 100, 4, 0, 8, 6, 0, magias);
        Mago mago3 = new Mago("Mago 3", 100, 10, 0, 9, 3, 0, magias);


        List<String> habilidades = new ArrayList<>();
        habilidades.add("Habilidade 1");
        habilidades.add("Habilidade 2");
        habilidades.add("Habilidade 3");
        Guerreiro guerreiro1 = new Guerreiro("Guerreiro 1", 100, 10, 0, 4, 10, 0, habilidades);
        Guerreiro guerreiro2 = new Guerreiro("Guerreiro 2", 100, 8, 0, 5, 9, 0, habilidades);
        Guerreiro guerreiro3 = new Guerreiro("Guerreiro 3", 100, 5, 0, 4, 8, 0, habilidades);

        System.out.println("Quantidade de personagens: " + Personagem.getTotalDePersonagens());

    }
}
