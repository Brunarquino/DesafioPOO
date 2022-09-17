package exercicio7.br.com.gft.model;

public class Supervisor extends Funcionario{

    public Supervisor(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    public double bonificacao() {
        return  getSalario() + 5000.00;
    }

    public String toString() {
        return "Supervisor: " +
                getNome() + ", " +
                getIdade() + " anos, " +
                " Bonificação => " + bonificacao();
    }
}
