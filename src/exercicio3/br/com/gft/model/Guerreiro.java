package exercicio3.br.com.gft.model;

import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem{

    private List<String> habilidade;

    public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> habilidade) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        this.habilidade = habilidade;
    }

    public void lvlUp() {

        setLevel(getLevel()+1);
        setXp(getXp()+100);

        setVida(getVida()+2);
        setForca(getForca()+3);

        setMana(getMana()+1);
        setInteligencia(getInteligencia()+1);

    }

    public int attack() {

        Random randomNumber = new Random();
        return ( getForca() * getLevel()) + randomNumber.nextInt(300);

    }

    public void aprenderHabilidade(String habilidade){
        getHabilidade().add(habilidade);
    }

    public List<String> getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(List<String> habilidade) {
        this.habilidade = habilidade;
    }
}
