package exercicio7.br.com.gft.model;

public class Vendedor extends Funcionario{
    public Vendedor(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    public double bonificacao() {
        return  getSalario() + 3000.00;
    }

    @Override
    public String toString() {
        return "Vendedor: " +
                getNome() + ", " +
                getIdade() + " anos, " +
                " Bonificação => " + bonificacao();
    }
}
