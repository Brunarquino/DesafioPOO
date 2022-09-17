package exercicio7.br.com.gft.model;

public class Gerente extends Funcionario{


    public Gerente(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    public double bonificacao() {
        return  getSalario() + 10000.00;
    }

    @Override
    public String toString() {
        return "Gerente: " +
                getNome() + ", " +
                getIdade() + " anos, " +
                " Bonificação => " + bonificacao();
    }
}
