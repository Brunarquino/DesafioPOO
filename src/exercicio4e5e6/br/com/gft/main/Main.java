package exercicio4e5e6.br.com.gft.main;

import exercicio4e5e6.br.com.gft.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("========== EXERCICIO 4 ===========");
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("João", 15));
        pessoas.add(new Pessoa("Leandro", 21));
        pessoas.add(new Pessoa("Paulo", 17));
        pessoas.add(new Pessoa("Jessica", 18));

        System.out.println("\n\t TABELA DE PESSOAS \t");
        for (Pessoa pessoa:pessoas){
            System.out.println("------------------------------");
            System.out.println(pessoa);
        }
        System.out.println("------------------------------");
        System.out.println();

        System.out.println("========== EXERCICIO 5 ===========");
        System.out.println("Quantidade de Pessoas na lista: " + pessoas.size());
        System.out.println("Excluindo menores de 18...");


        for (int indice = pessoas.size() - 1; indice >= 0 ; indice--){
            if(pessoas.get(indice).getIdade() < 18){
                pessoas.remove(indice);
                indice = pessoas.size() - 1;
            }
        }
        System.out.println("Quantidade de Pessoas na lista: " + pessoas.size());
        System.out.println();

        System.out.println("========== EXERCICIO 6 ===========");
        System.out.println("Verificando se existe Jessica e exibindo sua idade");
        for (Pessoa pessoa:pessoas){
            if(pessoa.getNome().equals("Jessica")){
                System.out.println("Jessica tem " + pessoa.getIdade() + " anos.");
            }
        }

    }
}
