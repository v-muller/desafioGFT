package questao4;

public class Gerente extends Funcionario{
	
	public Gerente(String nome, Integer idade, Double salario) {
		super(nome, idade, salario);
	}

	@Override
	public Double bonificacao() {
		return super.getSalario() + 10000.0;
	}

	@Override
	public String toString() {
		return super.toString() + "Gerente [bonificacao()=" + bonificacao() + "]";
	}
	
	
}
