package exercicio7.br.com.gft.main;

import exercicio7.br.com.gft.model.Gerente;
import exercicio7.br.com.gft.model.Supervisor;
import exercicio7.br.com.gft.model.Vendedor;

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Maria Fernandes", 41, 12000);
        Supervisor supervisor = new Supervisor("Aparecida Silva", 38, 8000);
        Vendedor vendedor = new Vendedor("Paulo Henrique", 21, 3000);

        System.out.println(gerente);
        System.out.println(supervisor);
        System.out.println(vendedor);

    }
}
