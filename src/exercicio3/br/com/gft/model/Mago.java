package exercicio3.br.com.gft.model;

import java.util.List;
import java.util.Random;

public class Mago extends Personagem{

    private List<String> magia;

    public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> magia) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        this.magia = magia;
    }

    public void lvlUp() {

        setLevel(getLevel()+1);
        setXp(getXp()+100);

        setMana(getMana()+2);
        setInteligencia(getInteligencia()+3);

        setVida(getVida()+1);
        setForca(getForca()+1);

    }

    public int attack() {
        Random randomNumber = new Random();
        return ( getInteligencia() * getLevel()) + randomNumber.nextInt(300);
    }

    public void aprenderMagia(String magia){
        getMagia().add(magia);
    }


    public List<String> getMagia() {
        return magia;
    }

    public void setMagia(List<String> magia) {
        this.magia = magia;
    }




}
